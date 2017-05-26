package br.gov.iphan.sisgep.action;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;

import org.apache.poi.util.IOUtils;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.faces.Renderer;
import org.jboss.seam.security.Credentials;
import org.quartz.ObjectAlreadyExistsException;
import org.quartz.SchedulerException;
import org.richfaces.event.UploadEvent;
import org.richfaces.model.UploadItem;

import br.gov.iphan.sisgep.entity.Sincronizacao;
import br.gov.iphan.sisgep.entity.corp.PessoaFisica;
import br.gov.iphan.sisgep.manager.AreaAtuacaoManager;
import br.gov.iphan.sisgep.manager.CargoFuncionarioManager;
import br.gov.iphan.sisgep.manager.CboManager;
import br.gov.iphan.sisgep.manager.CondicaoDependenteManager;
import br.gov.iphan.sisgep.manager.ConfigManager;
import br.gov.iphan.sisgep.manager.CorRacaManager;
import br.gov.iphan.sisgep.manager.EscolaridadePessoaManager;
import br.gov.iphan.sisgep.manager.EstadoCivilManager;
import br.gov.iphan.sisgep.manager.FormaPassagemServManager;
import br.gov.iphan.sisgep.manager.FormacaoAcademicaManager;
import br.gov.iphan.sisgep.manager.GrupoSanguineoManager;
import br.gov.iphan.sisgep.manager.HistoricoSincronizacaoManager;
import br.gov.iphan.sisgep.manager.MunicipioManager;
import br.gov.iphan.sisgep.manager.NivelCargoFuncionarioManager;
import br.gov.iphan.sisgep.manager.PadraoCargoManager;
import br.gov.iphan.sisgep.manager.PessoaFisicaManager;
import br.gov.iphan.sisgep.manager.ServidorManager;
import br.gov.iphan.sisgep.manager.SincronizacaoManager;
import br.gov.iphan.sisgep.manager.SituacaoFuncionalManager;
import br.gov.iphan.sisgep.manager.TipoCargoComissionadoManager;
import br.gov.iphan.sisgep.manager.UfManager;
import br.gov.iphan.sisgep.manager.UnidadeAdministrativaManager;
import br.gov.iphan.sisgep.session.AuthenticatorSisgep;
import br.gov.iphan.sisgep.sincronizacao.SincronizacaoJob;
import br.gov.iphan.sisgep.sincronizacao.SincronizacaoUploadJob;
import br.gov.iphan.sisgep.util.Tarefa;

@Name("sincronizacaoAction")
@Scope(ScopeType.CONVERSATION)
public class SincronizacaoAction extends BaseAction {

	private static final long serialVersionUID = -7210132007260663109L;

	@In
	Credentials credentials;

	@In(create = true, required = false)
	@Out(required = false)
	private String sincronizacaoIniciada;

	@In(required = false, create = true)
	private PessoaFisicaManager pessoaFisicaManager;

	@In(required = false, create = true)
	private CorRacaManager corRacaManager;

	@In(required = false, create = true)
	private EstadoCivilManager estadoCivilManager;

	@In(required = false, create = true)
	private GrupoSanguineoManager grupoSanguineoManager;

	@In(required = false, create = true)
	private SincronizacaoManager sincronizacaoManager;

	@In(required = false, create = true)
	private HistoricoSincronizacaoManager historicoSincronizacaoManager;

	@In(required = false, create = true)
	private MunicipioManager municipioManager;

	@In(required = false, create = true)
	private UfManager ufManager;

	@In(required = false, create = true)
	private ConfigManager configManager;

	@In(required = false, create = true)
	private ServidorManager servidorManager;

	@In(required = false, create = true)
	private EscolaridadePessoaManager escolaridadePessoaManager;

	@In(required = false, create = true)
	private UnidadeAdministrativaManager unidadeAdministrativaManager;

	@In(required = false, create = true)
	private CondicaoDependenteManager condicaoDependenteManager;

	@In(required = false, create = true)
	private SituacaoFuncionalManager situacaoFuncionalManager;

	@In(required = false, create = true)
	private FormaPassagemServManager formaPassagemServManager;

	@In(required = false, create = true)
	private PadraoCargoManager padraoCargoManager;

	@In(required = false, create = true)
	private CargoFuncionarioManager cargoFuncionarioManager;

	@In(required = false, create = true)
	private TipoCargoComissionadoManager tipoCargoComissionadoManager;

	@In(required = false, create = true)
	private AreaAtuacaoManager areaAtuacaoManager;

	@In(required = false, create = true)
	private NivelCargoFuncionarioManager nivelCargoFuncionarioManager;

	@In(required = false, create = true)
	private CboManager cboManager;

	@In(required = false, create = true)
	private FormacaoAcademicaManager formacaoAcademicaManager;

	@In(required = false, create = true)
	@Out(required = false)
	public Sincronizacao sincronizacao;

	@RequestParameter("email")
	public String email;

	@RequestParameter("statusSincronizacao")
	public Boolean statusSincronizacao;

	@In(required = false, create = true)
	@Out(required = false)
	public String emailUsuario;

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

	// true = sincronização SIAPE e false = Sincronização por arquivo
	private Boolean tipoSincronizacao;

	public List<File> arquivos = new ArrayList<File>();

	public Tarefa tarefa;

	public String sincronizar() {
		try {
			AuthenticatorSisgep authenticatorSisgep = new AuthenticatorSisgep();
			setPessoa(authenticatorSisgep.getEmailUsuario(credentials));
			if (tipoSincronizacao) {
				this.sincronizacaoIniciada = "N";
				this.agendarSincronizacao();
			} else {
				this.sincronizacaoIniciada = "N";
				if (arquivos.size() > 0 && uploaded == true) {
					this.agendarSincronizacaoArquivo();
				} else {
					mensagemWarn("Carregue pelo menos um arquivo para realizar a Sincronização.");
					return "";
				}

			}
		} catch (ObjectAlreadyExistsException e) {
			this.sincronizacaoIniciada = "S";
			System.out.println(e.getMessage());
		} catch (SchedulerException e1) {
			System.out.println(e1.getMessage());
		}
		return "sincronizacao";
	}

	public void mensagemSincronizacao() {
		this.emailUsuario = sincronizacaoManager.buscarEmailUsuario();
		this.sincronizacaoIniciada = getSincronizacaoIniciada();
	}

	public void irSincronizacaoArquivo() {
		tipoSincronizacao = false;
	}

	public void irSincronizacaoSiape() {
		tipoSincronizacao = true;
	}

	public void agendarSincronizacao() throws SchedulerException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("job", SincronizacaoJob.class);
		params.put("pessoaFisicaManager", pessoaFisicaManager);
		params.put("corRacaManager", corRacaManager);
		params.put("estadoCivilManager", estadoCivilManager);
		params.put("grupoSanguineoManager", grupoSanguineoManager);
		params.put("sincronizacaoManager", sincronizacaoManager);
		params.put("municipioManager", municipioManager);
		params.put("ufManager", ufManager);
		params.put("configManager", configManager);
		params.put("servidorManager", servidorManager);
		params.put("escolaridadePessoaManager", escolaridadePessoaManager);
		params.put("unidadeAdministrativaManager", unidadeAdministrativaManager);
		params.put("condicaoDependenteManager", condicaoDependenteManager);
		params.put("situacaoFuncionalManager", situacaoFuncionalManager);
		params.put("formaPassagemServManager", formaPassagemServManager);
		params.put("padraoCargoManager", padraoCargoManager);
		params.put("cargoFuncionarioManager", cargoFuncionarioManager);
		params.put("tipoCargoComissionadoManager", tipoCargoComissionadoManager);
		params.put("areaAtuacaoManager", areaAtuacaoManager);
		params.put("nivelCargoFuncionarioManager", nivelCargoFuncionarioManager);
		params.put("cboManager", cboManager);
		params.put("formacaoAcademicaManager", formacaoAcademicaManager);
		params.put("credentials", credentials);
		params.put("pessoaEmail", pessoa);
		params.put("arquivos", arquivos);

		Tarefa.iniciarTarefa(params);
	}

	public void agendarSincronizacaoArquivo() throws SchedulerException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("job", SincronizacaoUploadJob.class);
		params.put("pessoaFisicaManager", pessoaFisicaManager);
		params.put("corRacaManager", corRacaManager);
		params.put("estadoCivilManager", estadoCivilManager);
		params.put("grupoSanguineoManager", grupoSanguineoManager);
		params.put("sincronizacaoManager", sincronizacaoManager);
		params.put("municipioManager", municipioManager);
		params.put("ufManager", ufManager);
		params.put("configManager", configManager);
		params.put("servidorManager", servidorManager);
		params.put("escolaridadePessoaManager", escolaridadePessoaManager);
		params.put("unidadeAdministrativaManager", unidadeAdministrativaManager);
		params.put("condicaoDependenteManager", condicaoDependenteManager);
		params.put("situacaoFuncionalManager", situacaoFuncionalManager);
		params.put("formaPassagemServManager", formaPassagemServManager);
		params.put("padraoCargoManager", padraoCargoManager);
		params.put("cargoFuncionarioManager", cargoFuncionarioManager);
		params.put("tipoCargoComissionadoManager", tipoCargoComissionadoManager);
		params.put("areaAtuacaoManager", areaAtuacaoManager);
		params.put("nivelCargoFuncionarioManager", nivelCargoFuncionarioManager);
		params.put("cboManager", cboManager);
		params.put("formacaoAcademicaManager", formacaoAcademicaManager);
		params.put("credentials", credentials);
		params.put("pessoaEmail", pessoa);
		params.put("arquivos", arquivos);

		Tarefa.iniciarTarefa(params);
	}

	public String irUpload() {
		return "uploadSincronizacao";
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

	public void fileUpload_Listener(UploadEvent event) {
		try {
			processUploadedFile(event.getUploadItem());
		} catch (Exception e) {
			mensagemWarn("Não foi possível completar o upload do arquivo.");
		}
	}

	private void processUploadedFile(UploadItem uploadItem) throws IOException {
		File file = uploadItem.getFile();

		if (file == null) {
			mensagemWarn("O arquivo selecionado está vazio.");
			return;
		}

		arquivos.add(file);

		uploaded = true;
	}

	public void clearUpload() {
		arquivos = new ArrayList<File>();
		uploaded = false;
	}

	public byte[] getPlanilhas() throws IOException {
		InputStream arquivo = this.getClass().getResourceAsStream("/planilhas/planilhas_sincronizacao.zip");
		byte[] bytes = IOUtils.toByteArray(arquivo);
		return bytes;
	}

	public void downloadPlanilhas() throws JRException, IOException {
		// byte[] to file
		File file = new File("planilhas.zip"); // Criamos um nome para o arquivo
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file)); // Criamos
																							// o
																							// arquivo
		bos.write(this.getPlanilhas()); // Gravamos os bytes lá
		bos.close(); // Fechamos o stream.

		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		HttpServletRequest httpServletRequest = (HttpServletRequest) externalContext.getRequest();
		String nomeArquivo = "planilhas" + System.currentTimeMillis();
		httpServletRequest.getSession().setAttribute(nomeArquivo, file);
		try {
			HttpServletResponse response = (HttpServletResponse) this.extCtx.getResponse();
			response.sendRedirect("http://" + httpServletRequest.getServerName() + ":" + httpServletRequest.getServerPort()
					+ httpServletRequest.getContextPath() + "/DownloadPlanilha?nomeArquivo=" + nomeArquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
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

	public String getSincronizacaoIniciada() {
		return sincronizacaoIniciada;
	}

	public void setSincronizacaoIniciada(String sincronizacaoIniciada) {
		this.sincronizacaoIniciada = sincronizacaoIniciada;
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

	public Boolean getTipoSincronizacao() {
		return tipoSincronizacao;
	}

	public void setTipoSincronizacao(Boolean tipoSincronizacao) {
		this.tipoSincronizacao = tipoSincronizacao;
	}

}