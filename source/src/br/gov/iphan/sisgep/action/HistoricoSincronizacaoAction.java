package br.gov.iphan.sisgep.action;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.faces.Renderer;
import org.jboss.seam.security.Credentials;
import org.richfaces.event.UploadEvent;
import org.richfaces.model.UploadItem;

import br.gov.iphan.sisgep.entity.HistoricoSincronizacao;
import br.gov.iphan.sisgep.entity.Sincronizacao;
import br.gov.iphan.sisgep.entity.corp.PessoaFisica;
import br.gov.iphan.sisgep.entity.enums.StatusHistoricoSincronizacaoEnum;
import br.gov.iphan.sisgep.manager.HistoricoSincronizacaoManager;
import br.gov.iphan.sisgep.manager.SincronizacaoManager;
import br.gov.iphan.sisgep.util.Mensagens;
import br.gov.iphan.sisgep.util.Tarefa;

@Name("historicoSincronizacaoAction")
@Scope(ScopeType.CONVERSATION)
public class HistoricoSincronizacaoAction extends BaseAction {

	private static final long serialVersionUID = -7210132007260663109L;

	public boolean statusIncluido;

	public boolean statusAlterado;

	@In
	Credentials credentials;

	@In(required = false, create = true)
	private SincronizacaoManager sincronizacaoManager;

	@In(required = false, create = true)
	private HistoricoSincronizacaoManager historicoSincronizacaoManager;

	@In(required = false, create = true)
	@Out(required = false)
	public List<HistoricoSincronizacao> listHistorico;

	@In(required = false, create = true)
	@Out(required = false)
	public List<Sincronizacao> listSincronizacao;

	@In(required = false, create = true)
	@Out(required = false)
	public Sincronizacao sincronizacao;

	@In(required = false, create = true)
	@Out(required = false)
	public HistoricoSincronizacao historicoSincronizacao;

	@In(required = false, create = true)
	@Out(required = false)
	public HistoricoSincronizacao historicoSincronizacaoPesquisa;

	@In(required = false, create = true)
	@Out(required = false)
	public List<HistoricoSincronizacao> listHistoricoSincronizacao;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<HistoricoSincronizacao> listTodosHistoricosSincronizacao;

	@In(required = false, create = true)
	@Out(required = false)
	public List<HistoricoSincronizacao> listTotalAlteracao;

	@In(required = false, create = true)
	@Out(required = false)
	public Long totalRegistrosAtualizados;

	@In(required = false, create = true)
	@Out(required = false)
	public List<HistoricoSincronizacao> listDetalhesPorCpf;

	@In(required = false, create = true)
	@Out(required = false)
	public List<HistoricoSincronizacao> listHistoricoSincronizacaoAlterados;

	@In(required = false, create = true)
	@Out(required = false)
	public String emailUsuario;

	@RequestParameter("idSincronizacao")
	public Long idSincronizacao;

	@In(required = false, create = true)
	@Out(required = false)
	public String cpfPesquisa;

	@In(value = "#{facesContext.externalContext}")
	private ExternalContext extCtx;

	@In(value = "#{facesContext}")
	private FacesContext facesContext;

	@In(required = false, create = true)
	@Out(required = false)
	private PessoaFisica pessoa;

	@In(create = true)
	private Renderer renderer;

	private Boolean uploaded = false;

	public InputStream arquivo;

	public Tarefa tarefa;

	public String irHistoricoSincronizacoes() {
		this.sincronizacao = new Sincronizacao();
		return "historicoSincronizacao";
	}

	public String irDetalhesSincronizacao(Sincronizacao sincro) {
		this.sincronizacao = sincro;
		this.historicoSincronizacao.setSincronizacao(this.sincronizacao);
		listarHistoricoSincronizacoes();

		controllerHelper.setRedirect("?Page=Consultar_Sincronizacao");
		return "detalhesSincronizacao";
	}

	public String voltarDetalhesSincronizacao() {
		cpfPesquisa = "";
		statusIncluido = false;
		statusAlterado = false;
		controllerHelper.setRedirect("?Page=Detalhes_Sincronizacao");
		return "voltar_detalhesSincronizacao";
	}

	public String irVisualizarDetalhesPorCpf(HistoricoSincronizacao historicoSincronizacao) {
		this.historicoSincronizacao = historicoSincronizacao;
		cpfPesquisa = this.historicoSincronizacao.getCpf();
		cpfPesquisa = cpfPesquisa.replace(".", "").replace("-", "");
		listarHistoricoSincronizacoesPorCpf();

		controllerHelper.setRedirect("?Page=Historico_Sincronizacao");
		return "detalhesSincronizacaoPorCpf";
	}

	public void listarHistoricoSincronizacoes() {
		if (this.sincronizacao != null && this.sincronizacao.getHistoricos() != null) {
			listTotalAlteracao = this.sincronizacao.getHistoricos();
		}
		if (cpfPesquisa == null || cpfPesquisa == "" && statusAlterado == false && statusIncluido == false) {
			this.historicoSincronizacao = new HistoricoSincronizacao();
			this.historicoSincronizacao.setSincronizacao(this.sincronizacao);
		}
		this.listHistoricoSincronizacao = historicoSincronizacaoManager.consultarHistoricoSincronizacao(this.historicoSincronizacao);
		this.listTodosHistoricosSincronizacao = historicoSincronizacaoManager.recuperarTotalRegistrosPorIdSincronizacao(this.sincronizacao.getId());
		this.totalRegistrosAtualizados = historicoSincronizacaoManager.recuperarTotalRegistrosPorIdSincronizacaoLong(this.sincronizacao.getId());
	}

	public void listarHistoricoSincronizacoesPesquisa() {
		listHistoricoSincronizacao = historicoSincronizacaoManager.consultarHistoricoSincronizacao(this.historicoSincronizacaoPesquisa);
	}

	public void listarHistoricoSincronizacoesPorCpf() {
		if (this.historicoSincronizacao != null) {
			listDetalhesPorCpf = historicoSincronizacaoManager.recuperarPorIdSincronizacaoECpf(this.historicoSincronizacao.getSincronizacao().getId(),
					this.historicoSincronizacao.getCpf());
		}
	}

	public void procurarSincronizacao() {
		if (getSincronizacao().getDataHoraInicio() != null && getSincronizacao().getDataHoraFim() != null) {
			if (getSincronizacao().getDataHoraInicio().after(getSincronizacao().getDataHoraFim())) {
				mensagemWarn("A data de início da sincronização é maior do que a data do fim da sincronização.");
				return;
			}
		}
		listSincronizacao = new ArrayList<Sincronizacao>();
		if (listSincronizacao != null) {
			listSincronizacao.clear();
		}
		listSincronizacao = sincronizacaoManager.consultarSincronizacao(this.sincronizacao);
		if (listSincronizacao == null || listSincronizacao.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}

	public void procurarSincronizacaoHistorico() {
		historicoSincronizacaoPesquisa = new HistoricoSincronizacao();
		listHistoricoSincronizacao = new ArrayList<HistoricoSincronizacao>();
		if (listHistoricoSincronizacao != null) {
			listHistoricoSincronizacao.clear();
		}
		this.historicoSincronizacaoPesquisa = new HistoricoSincronizacao();
		this.historicoSincronizacaoPesquisa.setSincronizacao(this.sincronizacao);
		if (cpfPesquisa != null && cpfPesquisa != "") {
			cpfPesquisa = cpfPesquisa.replace(".", "").replace("-", "");
			this.historicoSincronizacaoPesquisa.setCpf(cpfPesquisa);
		}
		if (statusIncluido == true && statusAlterado == false) {
			this.historicoSincronizacaoPesquisa.setStatus(StatusHistoricoSincronizacaoEnum.INCLUIDO.getChave());
		}
		if (statusIncluido == false && statusAlterado == true) {
			this.historicoSincronizacaoPesquisa.setStatus(StatusHistoricoSincronizacaoEnum.ALTERADO.getChave());
		}
		if (cpfPesquisa == null || cpfPesquisa == "" && statusAlterado == false && statusIncluido == false) {
			listarHistoricoSincronizacoes();
		}
		if (cpfPesquisa != "" || statusAlterado == true || statusIncluido == true) {
			listarHistoricoSincronizacoesPesquisa();
		}
		if (listHistoricoSincronizacao == null || listHistoricoSincronizacao.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
		this.historicoSincronizacaoPesquisa = new HistoricoSincronizacao();
		this.historicoSincronizacaoPesquisa.setSincronizacao(this.sincronizacao);
		this.historicoSincronizacao = new HistoricoSincronizacao();
		this.historicoSincronizacao.setSincronizacao(this.sincronizacao);

	}

	public void downloadFile() throws JRException, IOException {
		// byte[] to file
		File file = new File("meuarquivo.pdf"); // Criamos um
												// nome para o
												// arquivo
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file)); // Criamos
																							// o
																							// arquivo
		bos.write(this.getRelatorioHistorico()); // Gravamos os bytes lá
		bos.close(); // Fechamos o stream.
		// byte[] to file

		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		HttpServletRequest httpServletRequest = (HttpServletRequest) externalContext.getRequest();
		String nomeArquivo = "nomeArquivo" + System.currentTimeMillis();
		httpServletRequest.getSession().setAttribute(nomeArquivo, file);
		try {
			HttpServletResponse response = (HttpServletResponse) this.extCtx.getResponse();
			response.sendRedirect("http://" + httpServletRequest.getServerName() + ":" + httpServletRequest.getServerPort()
					+ httpServletRequest.getContextPath() + "/DownloadFile?nomeArquivo=" + nomeArquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ************* exportação para xls **************
	//
	// public File getFile(){
	// try
	// {
	// List<HistoricoSincronizacao> lista = listHistoricoSincronizacao;
	//
	// ExportExcel xls = new ExportExcel("plan1", "xlsHistorico.xls");
	// xls.escreverCabecalho(new String[] { "CPF", "Título Campo",
	// "Registro Anterior", "Registro Atual" });
	//
	// int numeroColunas = 4;// Corresponde ao numero de elementos na linha de
	// cima.
	//
	// String[][] dados = new String[lista.size()][numeroColunas];
	//
	// int i = 0;
	// for (HistoricoSincronizacao historico : lista)
	// {
	// dados[i][0] = historico.getCpf();
	// dados[i][1] = historico.getNomeCampo();
	// dados[i][2] = historico.getValorAnterior();
	// dados[i][3] = historico.getValorAtual();
	// i++;
	// }
	//
	// xls.addTodosDados(dados);
	// xls.close();
	//
	// return new File("xlsHistorico.xls");
	// } catch (IOException ex)
	// {
	// ex.printStackTrace();
	// }
	// return null;
	// }

	public byte[] getRelatorioHistorico() throws JRException, IOException {
		List<HistoricoSincronizacao> listaHistoricos = listTodosHistoricosSincronizacao;
		Sincronizacao sincroRelatorio = this.sincronizacao;

		Map<String, Object> parametrosRelatorio = new HashMap<String, Object>();
		String dataInicioFormatada = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(sincroRelatorio.getDataHoraInicio());
		String dataFimFormatada = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(sincroRelatorio.getDataHoraFim());
		parametrosRelatorio.put("HoraInicio", dataInicioFormatada);
		parametrosRelatorio.put("HoraFim", dataFimFormatada);
		parametrosRelatorio.put("UsuarioResp", sincroRelatorio.getNomeUsuario());
		InputStream arquivoJasper = this.getClass().getResourceAsStream("/report/report_historico_sincronizacao.jasper");
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(listaHistoricos);
		JasperPrint printReport = JasperFillManager.fillReport(arquivoJasper, parametrosRelatorio, dataSource);

		String nomeRelatorioSaida = "RelatórioHistóricoSincronização_" + Calendar.DAY_OF_MONTH + Calendar.MONTH + Calendar.YEAR + ".xls";
		JRXlsExporter tipoArquivoExportado = new JRXlsExporter();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		tipoArquivoExportado.setParameter(JRXlsExporterParameter.JASPER_PRINT, printReport);
		tipoArquivoExportado.setParameter(JRExporterParameter.INPUT_FILE_NAME, nomeRelatorioSaida);
		tipoArquivoExportado.setParameter(JRExporterParameter.OUTPUT_STREAM, baos);

		tipoArquivoExportado.exportReport();

		return baos.toByteArray();
	}

	public void fileUpload_Listener(UploadEvent event) {
		try {
			processUploadedFile(event.getUploadItem());
		} catch (Exception e) {
			mensagemWarn("Não foi possível completar o upload do arquivo.");
		}
	}

	private void processUploadedFile(UploadItem uploadItem) throws IOException {
		if (uploadItem.isTempFile()) { // if upload was set to use temp files
			File file = uploadItem.getFile();
			FileInputStream fis = new FileInputStream(file);
			arquivo = fis;
			System.out.println("file uploaded " + file.getName());
		} else if (uploadItem.getData() != null) { // if upload was done in
													// memory
			ByteArrayInputStream bais = new ByteArrayInputStream(uploadItem.getData());
			arquivo = bais;
			System.out.println("file uploaded " + uploadItem.getFileName());
		}

		if (arquivo == null) {
			mensagemWarn("O arquivo selecionado está vazio.");
			return;
		}

		uploaded = true;
	}

	public List<Sincronizacao> getListSincronizacao() {
		return listSincronizacao;
	}

	public void setListSincronizacao(List<Sincronizacao> listSincronizacao) {
		this.listSincronizacao = listSincronizacao;
	}

	public List<HistoricoSincronizacao> getListHistorico() {
		return listHistorico;
	}

	public void setListHistorico(List<HistoricoSincronizacao> listHistorico) {
		this.listHistorico = listHistorico;
	}

	public Sincronizacao getSincronizacao() {
		return sincronizacao;
	}

	public void setSincronizacao(Sincronizacao sincronizacao) {
		this.sincronizacao = sincronizacao;
	}

	public PessoaFisica getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaFisica pessoa) {
		this.pessoa = pessoa;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public Boolean getUploaded() {
		return uploaded;
	}

	public HistoricoSincronizacao getHistoricoSincronizacao() {
		return historicoSincronizacao;
	}

	public void setHistoricoSincronizacao(HistoricoSincronizacao historicoSincronizacao) {
		this.historicoSincronizacao = historicoSincronizacao;
	}

	public List<HistoricoSincronizacao> getListDetalhesPorCpf() {
		return listDetalhesPorCpf;
	}

	public void setListDetalhesPorCpf(List<HistoricoSincronizacao> listDetalhesPorCpf) {
		this.listDetalhesPorCpf = listDetalhesPorCpf;
	}

	public List<HistoricoSincronizacao> getListHistoricoSincronizacao() {
		return listHistoricoSincronizacao;
	}

	public void setListHistoricoSincronizacao(List<HistoricoSincronizacao> listHistoricoSincronizacao) {
		this.listHistoricoSincronizacao = listHistoricoSincronizacao;
	}

	public List<HistoricoSincronizacao> getListHistoricoSincronizacaoAlterados() {
		return listHistoricoSincronizacaoAlterados;
	}

	public void setListHistoricoSincronizacaoAlterados(List<HistoricoSincronizacao> listHistoricoSincronizacaoAlterados) {
		this.listHistoricoSincronizacaoAlterados = listHistoricoSincronizacaoAlterados;
	}

	public Long getIdSincronizacao() {
		return idSincronizacao;
	}

	public void setIdSincronizacao(Long idSincronizacao) {
		this.idSincronizacao = idSincronizacao;
	}

	public List<HistoricoSincronizacao> getListTotalAlteracao() {
		return listTotalAlteracao;
	}

	public void setListTotalAlteracao(List<HistoricoSincronizacao> listTotalAlteracao) {
		this.listTotalAlteracao = listTotalAlteracao;
	}

	public boolean isStatusIncluido() {
		return statusIncluido;
	}

	public void setStatusIncluido(boolean statusIncluido) {
		this.statusIncluido = statusIncluido;
	}

	public boolean isStatusAlterado() {
		return statusAlterado;
	}

	public void setStatusAlterado(boolean statusAlterado) {
		this.statusAlterado = statusAlterado;
	}

	public String getCpfPesquisa() {
		return cpfPesquisa;
	}

	public void setCpfPesquisa(String cpfPesquisa) {
		this.cpfPesquisa = cpfPesquisa;
	}

	public Long getTotalRegistrosAtualizados() {
		return totalRegistrosAtualizados;
	}

	public void setTotalRegistrosAtualizados(Long totalRegistrosAtualizados) {
		this.totalRegistrosAtualizados = totalRegistrosAtualizados;
	}

	public HistoricoSincronizacao getHistoricoSincronizacaoPesquisa() {
		return historicoSincronizacaoPesquisa;
	}

	public void setHistoricoSincronizacaoPesquisa(HistoricoSincronizacao historicoSincronizacaoPesquisa) {
		this.historicoSincronizacaoPesquisa = historicoSincronizacaoPesquisa;
	}

	public List<HistoricoSincronizacao> getListTodosHistoricosSincronizacao() {
		return listTodosHistoricosSincronizacao;
	}

	public void setListTodosHistoricosSincronizacao(
			List<HistoricoSincronizacao> listTodosHistoricosSincronizacao) {
		this.listTodosHistoricosSincronizacao = listTodosHistoricosSincronizacao;
	}
	
}