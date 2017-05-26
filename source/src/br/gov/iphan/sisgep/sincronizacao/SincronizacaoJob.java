package br.gov.iphan.sisgep.sincronizacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.mail.MessagingException;
import javax.naming.NamingException;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import org.jboss.seam.annotations.In;
import org.jboss.seam.security.Credentials;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;

import br.gov.iphan.sisgep.action.SincronizacaoAction;
import br.gov.iphan.sisgep.entity.Afastamento;
import br.gov.iphan.sisgep.entity.CargoComissionado;
import br.gov.iphan.sisgep.entity.CargoEfetivo;
import br.gov.iphan.sisgep.entity.CargoFuncao;
import br.gov.iphan.sisgep.entity.CargoFuncionario;
import br.gov.iphan.sisgep.entity.CondicaoDependente;
import br.gov.iphan.sisgep.entity.Dependente;
import br.gov.iphan.sisgep.entity.FormaIngressoAposentacao;
import br.gov.iphan.sisgep.entity.FormaPassagemServ;
import br.gov.iphan.sisgep.entity.FormaSaida;
import br.gov.iphan.sisgep.entity.FormacaoAcademica;
import br.gov.iphan.sisgep.entity.HistoricoSincronizacao;
import br.gov.iphan.sisgep.entity.PadraoCargo;
import br.gov.iphan.sisgep.entity.Sincronizacao;
import br.gov.iphan.sisgep.entity.SituacaoFuncional;
import br.gov.iphan.sisgep.entity.TipoCargoComissinado;
import br.gov.iphan.sisgep.entity.corp.CorRaca;
import br.gov.iphan.sisgep.entity.corp.EscolaridadePessoa;
import br.gov.iphan.sisgep.entity.corp.EstadoCivil;
import br.gov.iphan.sisgep.entity.corp.GrupoSanguineo;
import br.gov.iphan.sisgep.entity.corp.Municipio;
import br.gov.iphan.sisgep.entity.corp.PessoaContato;
import br.gov.iphan.sisgep.entity.corp.PessoaEndereco;
import br.gov.iphan.sisgep.entity.corp.PessoaFisica;
import br.gov.iphan.sisgep.entity.corp.Uf;
import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;
import br.gov.iphan.sisgep.entity.enums.ContatoEnum;
import br.gov.iphan.sisgep.entity.enums.StatusHistoricoSincronizacaoEnum;
import br.gov.iphan.sisgep.entity.enums.TipoSincronizacaoEnum;
import br.gov.iphan.sisgep.exception.SincronizacaoException;
import br.gov.iphan.sisgep.manager.CargoFuncionarioManager;
import br.gov.iphan.sisgep.manager.CondicaoDependenteManager;
import br.gov.iphan.sisgep.manager.ConfigManager;
import br.gov.iphan.sisgep.manager.CorRacaManager;
import br.gov.iphan.sisgep.manager.EscolaridadePessoaManager;
import br.gov.iphan.sisgep.manager.EstadoCivilManager;
import br.gov.iphan.sisgep.manager.FormaPassagemServManager;
import br.gov.iphan.sisgep.manager.GrupoSanguineoManager;
import br.gov.iphan.sisgep.manager.MunicipioManager;
import br.gov.iphan.sisgep.manager.PadraoCargoManager;
import br.gov.iphan.sisgep.manager.PessoaFisicaManager;
import br.gov.iphan.sisgep.manager.ServidorManager;
import br.gov.iphan.sisgep.manager.SincronizacaoManager;
import br.gov.iphan.sisgep.manager.SituacaoFuncionalManager;
import br.gov.iphan.sisgep.manager.TipoCargoComissionadoManager;
import br.gov.iphan.sisgep.manager.UfManager;
import br.gov.iphan.sisgep.manager.UnidadeAdministrativaManager;
import br.gov.iphan.sisgep.util.Mailer;
import br.gov.iphan.sisgep.webservices.ConsultaSIAPEWS;
import br.gov.iphan.sisgep.webservices.vo.ParametrosEntradaSIAPE;
import br.gov.iphan.sisgep.ws.ArrayOfDadosCurso;
import br.gov.iphan.sisgep.ws.ArrayOfDadosOcorrencias;
import br.gov.iphan.sisgep.ws.DadosAfastamentoPorMatricula;
import br.gov.iphan.sisgep.ws.DadosCurso;
import br.gov.iphan.sisgep.ws.DadosDependentes;
import br.gov.iphan.sisgep.ws.DadosDocumentacao;
import br.gov.iphan.sisgep.ws.DadosEnderecoResidencial;
import br.gov.iphan.sisgep.ws.DadosEscolares;
import br.gov.iphan.sisgep.ws.DadosFuncionais;
import br.gov.iphan.sisgep.ws.DadosOcorrencias;
import br.gov.iphan.sisgep.ws.DadosPessoais;
import br.gov.iphan.sisgep.ws.Servidor;
import br.gov.iphan.sisgep.ws.Uorg;

@DisallowConcurrentExecution
public class SincronizacaoJob implements Job {

	private PessoaFisicaManager pessoaFisicaManager;
	private CorRacaManager corRacaManager;
	private EstadoCivilManager estadoCivilManager;
	private GrupoSanguineoManager grupoSanguineoManager;
	private SincronizacaoManager sincronizacaoManager;
	private MunicipioManager municipioManager;
	private UfManager ufManager;
	private ConfigManager configManager;
	private ServidorManager servidorManager;
	private EscolaridadePessoaManager escolaridadePessoaManager;
	private CondicaoDependenteManager condicaoDependenteManager;
	private SituacaoFuncionalManager situacaoFuncionalManager;
	private FormaPassagemServManager formaPassagemServManager;
	private UnidadeAdministrativaManager unidadeAdministrativaManager;
	private PadraoCargoManager padraoCargoManager;
	private CargoFuncionarioManager cargoFuncionarioManager;
	private TipoCargoComissionadoManager tipoCargoComissionadoManager;
	private Locale ptBr = new Locale("pt", "BR");
	private SimpleDateFormat semBarras = new SimpleDateFormat("ddMMyyyy", ptBr);
	private SimpleDateFormat comBarras = new SimpleDateFormat("dd/MM/yyyy", ptBr);
	private Sincronizacao sincronizacao;
	private List<HistoricoSincronizacao> historicos;
	private String cpf;
	private Credentials credentials;
	private String usuarioLogado;
	private ConsultaSIAPEWS consultaWS;
	private boolean ressalva;
	private boolean erro;
	private boolean novo;
	private String nomePessoaAtual;
	private PessoaFisica pessoaEmail;
	private StringBuffer logs = new StringBuffer();

	@In
	private SincronizacaoAction sincronizacaoAction;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		try {
			ressalva = false;

			SchedulerContext schedulerContext = context.getScheduler().getContext();
			pessoaFisicaManager = (PessoaFisicaManager) schedulerContext.get("pessoaFisicaManager");
			corRacaManager = (CorRacaManager) schedulerContext.get("corRacaManager");
			estadoCivilManager = (EstadoCivilManager) schedulerContext.get("estadoCivilManager");
			grupoSanguineoManager = (GrupoSanguineoManager) schedulerContext.get("grupoSanguineoManager");
			sincronizacaoManager = (SincronizacaoManager) schedulerContext.get("sincronizacaoManager");
			municipioManager = (MunicipioManager) schedulerContext.get("municipioManager");
			ufManager = (UfManager) schedulerContext.get("ufManager");
			configManager = (ConfigManager) schedulerContext.get("configManager");
			servidorManager = (ServidorManager) schedulerContext.get("servidorManager");
			escolaridadePessoaManager = (EscolaridadePessoaManager) schedulerContext.get("escolaridadePessoaManager");
			condicaoDependenteManager = (CondicaoDependenteManager) schedulerContext.get("condicaoDependenteManager");
			situacaoFuncionalManager = (SituacaoFuncionalManager) schedulerContext.get("situacaoFuncionalManager");
			formaPassagemServManager = (FormaPassagemServManager) schedulerContext.get("formaPassagemServManager");
			unidadeAdministrativaManager = (UnidadeAdministrativaManager) schedulerContext.get("unidadeAdministrativaManager");
			padraoCargoManager = (PadraoCargoManager) schedulerContext.get("padraoCargoManager");
			cargoFuncionarioManager = (CargoFuncionarioManager) schedulerContext.get("cargoFuncionarioManager");
			tipoCargoComissionadoManager = (TipoCargoComissionadoManager) schedulerContext.get("tipoCargoComissionadoManager");
			credentials = (Credentials) schedulerContext.get("credentials");
			pessoaEmail = (PessoaFisica) schedulerContext.get("pessoaEmail");

			usuarioLogado = credentials.getUsername();
			String wsdlLocation = configManager.getValor("WSDL_SIAPE_LOCATION");
			consultaWS = new ConsultaSIAPEWS(wsdlLocation);

			sincronizar();
//			gerarRelatorioMatriculas();
		} catch (Exception e) {
			erro = true;
			finalizaSincronizacao();
			e.printStackTrace();
			System.out.println(logs.toString());
			throw new JobExecutionException(e.getMessage());
		}

	}
	
	@SuppressWarnings("unused")
	private void gerarRelatorioMatriculas() throws Exception {
		logs.append("Relatório de Matrículas por CPF");
		System.out.println("Relatório de Matrículas por CPF");
		
		ParametrosEntradaSIAPE parametros = new ParametrosEntradaSIAPE();
		List<Uorg> uorgs = consultaWS.listaUorgs(parametros);
		System.out.println("Total de uorgs: " + uorgs.size());
		int countUorg = 0;

		for (Uorg uorg : uorgs) {
			System.out.println("Uorg: " + uorg.getCodigo().getValue());
			System.out.println("Uorg Count: " + ++countUorg);
			parametros.setCodigoUnidadeOrganizacional(uorg.getCodigo().getValue());

			List<Servidor> servidores = consultaWS.listaServidores(parametros);

			System.out.println("Total de servidores: " + servidores.size());
			int countServidor = 0;

			for (Servidor servidor : servidores) {
				cpf = servidor.getCpf().getValue();
				System.out.println("Servidor: " + cpf);
				System.out.println("Servidor Count: " + ++countServidor);
				
				parametros.setCpf(cpf);
				DadosPessoais dadosPessoais = consultaWS.consultaDadosPessoais(parametros);
				List<DadosFuncionais> dadosFuncionais = consultaWS.consultaDadosFuncionais(parametros);
				
				logs.append("\n" + cpf + ";" + dadosPessoais.getNome().getValue());

				System.out.println("Total de matrículas: " + dadosFuncionais.size());
				int countMatricula = 0;

				for (DadosFuncionais dados : dadosFuncionais) {
					countMatricula++;
					System.out.println("Matrícula: " + dados.getMatriculaSiape().getValue());
					System.out.println("Matrícula Count: " + ++countMatricula);
					
					SituacaoFuncional situacaoFuncional = situacaoFuncionalManager.consultarPorCodigoSiape(new Long(dados.getCodSitFuncional().getValue()));
					
					logs.append(";" + dados.getMatriculaSiape().getValue());
					logs.append(";" + dados.getCodSitFuncional().getValue());
					
					if (situacaoFuncional != null)
						logs.append(";" + situacaoFuncional.getTxtDescricao());
					else
						logs.append(";");
				}
				
				while (countMatricula < 4) {
					countMatricula++;
					logs.append(";"); //Número da Matrícula
					logs.append(";"); //Código da Situação Funcional
					logs.append(";"); //Nome da Situação Funcional
				}
			}
		}

		logs.append("\nFim do Relatório");
		System.out.println("Fim do Relatório");
		System.out.println(logs.toString());
	}

//	@SuppressWarnings("unused")
	private void sincronizar() throws Exception {
		try {
			Long totalServidores = new Long(0);

			sincronizacao = new Sincronizacao();
			sincronizacao.setNomeUsuario(usuarioLogado);
			iniciaSincronizacao();

			ParametrosEntradaSIAPE parametros = new ParametrosEntradaSIAPE();
			List<Uorg> uorgs = consultaWS.listaUorgs(parametros);
			logs.append("Total de uorgs: " + uorgs.size() + "\n");
			int totalServidoresSincronizados = 0;

			for (Iterator<Uorg> iter = uorgs.iterator(); iter.hasNext();) {
				try {
					Uorg uorg = iter.next();
					parametros.setCodigoUnidadeOrganizacional(uorg.getCodigo().getValue());

					List<Servidor> servidores = consultaWS.listaServidores(parametros);
					logs.append("Total de servidores para a uorg " + uorg.getCodigo().getValue() + ": " + servidores.size() + "\n");
					totalServidores += servidores.size();
					int totalServidoresSincronizadosUorg = 0;
					for (Iterator<Servidor> iter2 = servidores.iterator(); iter2.hasNext();) {
						try {
							historicos = new ArrayList<HistoricoSincronizacao>();

							Servidor servidor = iter2.next();
							cpf = servidor.getCpf().getValue();
/*
							if (!cpf.equals("94931003753"))
								continue;
*/
							PessoaFisica pessoa = pessoaFisicaManager.getPessoaFisicaByCPF(cpf);

							if (pessoa == null) {
								pessoa = new PessoaFisica();
								novo = true;
							} else {
								novo = false;
							}

							pessoa = sincronizaPessoa(servidor, pessoa);

							pessoaFisicaManager.salvar(pessoa);
							logs.append("Servidor sincronizado: " + cpf);
							totalServidoresSincronizados++;
							totalServidoresSincronizadosUorg++;
							atualizaSincronizacao();
						} catch (SincronizacaoException e) {
							e.printStackTrace();
							ressalvaSincronizacao(e.getMessage());
						} catch (Exception e1) {
							e1.printStackTrace();
							ressalvaSincronizacao(e1.getMessage());
						}
					}
					logs.append("Total de servidores sincronizados para a uorg " + uorg.getCodigo().getValue() + ": " + totalServidoresSincronizadosUorg + "\n");
				} catch (Exception e) {
					e.printStackTrace();
					ressalvaSincronizacao(e.getMessage());
				}
			}

			logs.append("Total geral de servidores sincronizados: " + totalServidoresSincronizados + "\n");
			logs.append("Total geral de servidores: " + totalServidores);

			finalizaSincronizacao();
		} catch (Exception e) {
			e.printStackTrace();
			ressalvaSincronizacao(e.getMessage());
			finalizaSincronizacao();
		}
	}

	private PessoaFisica sincronizaPessoa(Servidor servidor, PessoaFisica pessoa) throws SincronizacaoException, Exception {
		ParametrosEntradaSIAPE parametros = new ParametrosEntradaSIAPE();
		parametros.setCpf(cpf);

		DadosPessoais dadosPessoais = consultaWS.consultaDadosPessoais(parametros);
		List<DadosFuncionais> dadosFuncionais = consultaWS.consultaDadosFuncionais(parametros);
		DadosDocumentacao dadosDocumentacao = consultaWS.consultaDadosDocumentacao(parametros);
		DadosEscolares dadosEscolares = consultaWS.consultaDadosEscolares(parametros);
		DadosEnderecoResidencial dadosEndereco = consultaWS.consultaDadosEnderecoResidencial(parametros);

		if (dadosPessoais != null) {
			nomePessoaAtual = dadosPessoais.getNome().getValue();
			
			if (historicoCampo("Cor/Raça", pessoa.getCodCorRaca() == null ? "" : pessoa.getCodCorRaca().getCodigoSiapeCorRaca() == null ? "" : pessoa
					.getCodCorRaca().getCodigoSiapeCorRaca().toString(), dadosPessoais.getCodCor() == null ? "" : dadosPessoais.getCodCor().getValue()))
				pessoa.setCodCorRaca(getCorRaca(dadosPessoais.getCodCor().getValue()));

			if (historicoCampo("Estado Civil", pessoa.getCodEstadoCivil() == null ? "" : pessoa.getCodEstadoCivil().getCodigoSiapeEstCivil() == null ? ""
					: pessoa.getCodEstadoCivil().getCodigoSiapeEstCivil().toString(), dadosPessoais.getCodEstadoCivil().getValue()))
				pessoa.setCodEstadoCivil(getEstadoCivil(dadosPessoais.getCodEstadoCivil().getValue()));

			if (historicoCampo("Grupo Sanguíneo", pessoa.getCodGrupoSanguineo() == null ? "" : pessoa.getCodGrupoSanguineo().getDesSigla(), dadosPessoais
					.getGrupoSanguineo().getValue()))
				pessoa.setCodGrupoSanguineo(getGrupoSanguineo(dadosPessoais.getGrupoSanguineo().getValue()));

			if (historicoCampo("Naturalidade", pessoa.getCodMunicipio() == null ? "" : pessoa.getCodMunicipio().getNomMunicipio(), dadosEndereco
					.getNomeMunicipio().getValue()))
				pessoa.setCodMunicipio(getMunicipio(dadosPessoais.getNomeMunicipNasc().getValue(), getUf(dadosPessoais.getUfNascimento().getValue())));

			if (dadosPessoais.getDataNascimento() != null && dadosPessoais.getDataNascimento().getValue() != null
					&& !dadosPessoais.getDataNascimento().getValue().equals(""))
				if (historicoCampo("Data Nascimento", pessoa.getDatNascimento() == null ? "" : comBarras.format(pessoa.getDatNascimento()),
						comBarras.format(semBarras.parse(dadosPessoais.getDataNascimento().getValue()))))
					pessoa.setDatNascimento(semBarras.parse(dadosPessoais.getDataNascimento().getValue()));

			if (historicoCampo("Sexo", pessoa.getIndSexo(), dadosPessoais.getCodSexo().getValue()))
				pessoa.setIndSexo(dadosPessoais.getCodSexo().getValue());

			if (historicoCampo("Nome Mãe", pessoa.getNomMae(), dadosPessoais.getNomeMae().getValue()))
				pessoa.setNomMae(dadosPessoais.getNomeMae().getValue());

			if (historicoCampo("Nome Pai", pessoa.getNomPai(), dadosPessoais.getNomePai().getValue()))
				pessoa.setNomPai(dadosPessoais.getNomePai().getValue());

			if (historicoCampo("Nome", pessoa.getNomPessoaFisica(), dadosPessoais.getNome().getValue()))
				pessoa.setNomPessoaFisica(dadosPessoais.getNome().getValue());
		} else {
			nomePessoaAtual = "";
		}

		if (historicoCampo("CPF ", pessoa.getNumCpf(), servidor.getCpf().getValue()))
			pessoa.setNumCpf(servidor.getCpf().getValue());

		if (dadosEscolares != null) {
			if (historicoCampo("Escolaridade Pessoa", pessoa.getEscolaridadePessoa() == null ? ""
					: pessoa.getEscolaridadePessoa().getCodigoSiapeEscolaridade() == null ? "" : pessoa.getEscolaridadePessoa().getCodigoSiapeEscolaridade()
							.toString(), dadosEscolares.getCodEscolaridade().getValue()))
				pessoa.setEscolaridadePessoa(getEscolaridadePessoa(dadosEscolares.getCodEscolaridade().getValue(), pessoa));
		}

		if (dadosDocumentacao != null) {
			if (historicoCampo("Orgão Emissor-RG", pessoa.getNomOrgaoEmi(), dadosDocumentacao.getOrgaoCarteiraIdentidade().getValue()))
				pessoa.setNomOrgaoEmi(dadosDocumentacao.getOrgaoCarteiraIdentidade().getValue());

			if (historicoCampo("UF-RG", pessoa.getCodUfRg() == null ? "" : pessoa.getCodUfRg().getDesSigla(), dadosDocumentacao.getUfCarteiraIdentidade()
					.getValue()))
				pessoa.setCodUfRg(getUf(dadosDocumentacao.getUfCarteiraIdentidade().getValue()));

			if (dadosDocumentacao.getDataCarteiraIdentidade() != null && dadosDocumentacao.getDataCarteiraIdentidade().getValue() != null
					&& !dadosDocumentacao.getDataCarteiraIdentidade().getValue().equals(""))
				if (historicoCampo("Data Emissão-RG", pessoa.getDatEmissaoRg() == null ? "" : comBarras.format(pessoa.getDatEmissaoRg()),
						comBarras.format(semBarras.parse(dadosDocumentacao.getDataCarteiraIdentidade().getValue()))))
					pessoa.setDatEmissaoRg(semBarras.parse(dadosDocumentacao.getDataCarteiraIdentidade().getValue()));

			if (historicoCampo("RG", pessoa.getNumRg(), dadosDocumentacao.getNumeroCarteiraIdentidade().getValue()))
				pessoa.setNumRg(dadosDocumentacao.getNumeroCarteiraIdentidade().getValue());

			if (historicoCampo("Título Eleitoral", pessoa.getNumTituloEleitoral() == null ? "" : pessoa.getNumTituloEleitoral().toString(), dadosDocumentacao
					.getNumeroTituloEleitor().getValue()))
				pessoa.setNumTituloEleitoral(new Long(dadosDocumentacao.getNumeroTituloEleitor().getValue()));

			if (historicoCampo("PIS/PASEP", pessoa.getNumNis(), dadosDocumentacao.getNumPisPasep().getValue()))
				pessoa.setNumNis(dadosDocumentacao.getNumPisPasep().getValue());
		}

		if (dadosEndereco != null) {
			pessoa.setPessoaContatos(getContatos(pessoa, dadosEndereco, dadosFuncionais));
			pessoa.setPessoaEnderecos(getEndereco(pessoa, dadosEndereco));
		}

		if (dadosFuncionais != null) {
			pessoa.setServidors(getServidores(pessoa.getServidors(), dadosFuncionais, pessoa));
		}

		return pessoa;
	}

	private void iniciaSincronizacao() {
		Calendar dataHoraInicio = Calendar.getInstance();
		sincronizacao.setDataHoraInicio(dataHoraInicio.getTime());
		sincronizacao.setStatus(Sincronizacao.STATUS_ANDAMENTO);
		sincronizacao.setEmailUsuario(pessoaEmail.getPessoaContatoEmail().getTxtContato());
		sincronizacao.setTipo(TipoSincronizacaoEnum.SIAPE.getChave());
		sincronizacaoManager.salvar(sincronizacao);
	}

	private void atualizaSincronizacao() {
		sincronizacao.setHistoricos(historicos);
		sincronizacao = sincronizacaoManager.salvar(sincronizacao);
		sincronizacao = sincronizacaoManager.recuperarPorId(sincronizacao.getId());
		historicos = sincronizacao.getHistoricos();
	}

	private void finalizaSincronizacao() {
		Calendar dataHoraFim = Calendar.getInstance();
		sincronizacao.setDataHoraFim(dataHoraFim.getTime());

		if (erro)
			sincronizacao.setStatus(Sincronizacao.STATUS_ERRO);
		else if (ressalva)
			sincronizacao.setStatus(Sincronizacao.STATUS_CONCLUIDO_COM_RESSALVA);
		else
			sincronizacao.setStatus(Sincronizacao.STATUS_SUCESSO);

		sincronizacaoManager.salvar(sincronizacao);
		enviarEmail();

		System.out.println(logs.toString());
	}

	private void ressalvaSincronizacao(String mensagemErro) {
		ressalva = true;

		String novaMensagemErro = null;
		if (sincronizacao.getMensagemErro() == null || sincronizacao.getMensagemErro().isEmpty()) {
			novaMensagemErro = mensagemErro;
		} else {
			novaMensagemErro = sincronizacao.getMensagemErro() + "; " + mensagemErro;
		}
		if (novaMensagemErro != null && novaMensagemErro.length() >= 8000) {
			novaMensagemErro = novaMensagemErro.substring(0, 8000 - 1);
		}
		sincronizacao.setMensagemErro(novaMensagemErro);
		sincronizacaoManager.salvar(sincronizacao);
	}

	private Boolean historicoCampo(String nomeCampo, String valorAnterior, String valorAtual) {
		Boolean atualiza = new Boolean(false);
		HistoricoSincronizacao historico = new HistoricoSincronizacao();
		if (valorAnterior == null)
			valorAnterior = "";

		if (valorAtual != null && !valorAtual.isEmpty() && !valorAnterior.equalsIgnoreCase(valorAtual)) {
			historico.setNomeCampo(nomeCampo);
			historico.setCpf(cpf);
			historico.setNomeServidor(nomePessoaAtual);
			historico.setSincronizacao(sincronizacao);
			historico.setValorAnterior(valorAnterior);
			historico.setValorAtual(valorAtual);
			if (novo) {
				historico.setStatus(StatusHistoricoSincronizacaoEnum.INCLUIDO.getChave());
			} else {
				historico.setStatus(StatusHistoricoSincronizacaoEnum.ALTERADO.getChave());
			}
			historicos.add(historico);
			atualiza = new Boolean(true);
		}

		return atualiza;
	}

	private Set<PessoaEndereco> getEndereco(PessoaFisica pessoa, DadosEnderecoResidencial dadosEndereco) throws SincronizacaoException {
		Set<PessoaEndereco> pessoaEnderecos = pessoa.getPessoaEnderecos();

		if (pessoaEnderecos != null && pessoaEnderecos.size() > 0) {
			for (Iterator<PessoaEndereco> iter = pessoaEnderecos.iterator(); iter.hasNext();) {
				PessoaEndereco endereco = iter.next();

				if (historicoCampo("CEP", endereco.getCep(), dadosEndereco.getCep().getValue()))
					endereco.setCep(dadosEndereco.getCep().getValue());

				if (historicoCampo("Município", endereco.getMunicipio() == null ? "" : endereco.getMunicipio().getNomMunicipio(), dadosEndereco
						.getNomeMunicipio().getValue()))
					endereco.setMunicipio(getMunicipio(dadosEndereco.getNomeMunicipio().getValue(), getUf(dadosEndereco.getUf().getValue())));

				if (historicoCampo("Bairro", endereco.getNomBairro(), dadosEndereco.getBairro().getValue()))
					endereco.setNomBairro(dadosEndereco.getBairro().getValue());

				if (historicoCampo("Logradouro", endereco.getNomLogradouro(), dadosEndereco.getLogradouro().getValue()))
					endereco.setNomLogradouro(dadosEndereco.getLogradouro().getValue());

				if (historicoCampo("Número", endereco.getNumEndereco(), dadosEndereco.getNumero().getValue()))
					endereco.setNumEndereco(dadosEndereco.getNumero().getValue());

				if (historicoCampo("Complemento", endereco.getTxtComplemento(), dadosEndereco.getComplemento().getValue()))
					endereco.setTxtComplemento(dadosEndereco.getComplemento().getValue());

				endereco.setPessoaFisica(pessoa);
			}
		} else {
			pessoaEnderecos = new HashSet<PessoaEndereco>();

			PessoaEndereco endereco = new PessoaEndereco();

			if (historicoCampo("CEP", endereco.getCep(), dadosEndereco.getCep().getValue()))
				endereco.setCep(dadosEndereco.getCep().getValue());

			if (historicoCampo("Município", endereco.getMunicipio() == null ? "" : endereco.getMunicipio().getNomMunicipio(), dadosEndereco.getNomeMunicipio()
					.getValue()))
				endereco.setMunicipio(getMunicipio(dadosEndereco.getNomeMunicipio().getValue(), getUf(dadosEndereco.getUf().getValue())));

			if (historicoCampo("Bairro", endereco.getNomBairro(), dadosEndereco.getBairro().getValue()))
				endereco.setNomBairro(dadosEndereco.getBairro().getValue());

			if (historicoCampo("Logradouro", endereco.getNomLogradouro(), dadosEndereco.getLogradouro().getValue()))
				endereco.setNomLogradouro(dadosEndereco.getLogradouro().getValue());

			if (historicoCampo("Número", endereco.getNumEndereco(), dadosEndereco.getNumero().getValue()))
				endereco.setNumEndereco(dadosEndereco.getNumero().getValue());

			endereco.setPessoaFisica(pessoa);

			pessoaEnderecos.add(endereco);
		}

		return pessoaEnderecos;
	}

	private Set<PessoaContato> getContatos(PessoaFisica pessoa, DadosEnderecoResidencial dadosEndereco, List<DadosFuncionais> dadosFuncionais) {
		Set<PessoaContato> contatos = pessoa.getPessoaContatos();

		if (contatos != null && contatos.size() > 0) {
			Boolean incluiuTelefone = false;
			Boolean incluiuEmail = false;

			for (Iterator<PessoaContato> iter = contatos.iterator(); iter.hasNext();) {
				PessoaContato contato = iter.next();

				if (contato.getIndContato().equals(ContatoEnum.TELEFONE.getChave())) {
					incluiContatoTelefone(pessoa, dadosEndereco, contato);
					incluiuTelefone = true;
				} else if (contato.getIndContato().equals(ContatoEnum.EMAIL.getChave())) {
					incluiContatoEmail(pessoa, dadosFuncionais, contato);
					incluiuEmail = true;
				}
			}

			if (!incluiuTelefone) {
				PessoaContato contatoTelefone = new PessoaContato();
				if (incluiContatoTelefone(pessoa, dadosEndereco, contatoTelefone))
					contatos.add(contatoTelefone);
			}

			if (!incluiuEmail) {
				PessoaContato contatoEmail = new PessoaContato();
				if (incluiContatoEmail(pessoa, dadosFuncionais, contatoEmail))
					contatos.add(contatoEmail);
			}
		} else {
			contatos = new HashSet<PessoaContato>();

			PessoaContato contatoTelefone = new PessoaContato();
			if (incluiContatoTelefone(pessoa, dadosEndereco, contatoTelefone))
				contatos.add(contatoTelefone);

			PessoaContato contatoEmail = new PessoaContato();
			if (incluiContatoEmail(pessoa, dadosFuncionais, contatoEmail))
				contatos.add(contatoEmail);

		}

		return contatos;
	}

	private Boolean incluiContatoEmail(PessoaFisica pessoa, List<DadosFuncionais> dadosFuncionais, PessoaContato contato) {
		for (DadosFuncionais dados : dadosFuncionais) {
			if (dados != null && dados.getEmailServidor() != null) {
				if (historicoCampo("Tipo Contato-Email", contato.getIndContato(), ContatoEnum.EMAIL.getChave()))
					contato.setIndContato(ContatoEnum.EMAIL.getChave());

				if (historicoCampo("Texto Contato-Email", contato.getTxtContato() == null ? "" : contato.getTxtContato(), dados.getEmailServidor() == null ? ""
						: dados.getEmailServidor().getValue()))
					contato.setTxtContato(dados.getEmailServidor().getValue());

				contato.setPessoaFisica(pessoa);

				return true;
			}
		}

		return false;
	}

	private Boolean incluiContatoTelefone(PessoaFisica pessoa, DadosEnderecoResidencial dadosEndereco, PessoaContato contato) {
		Boolean retorno = false;

		if (historicoCampo("Tipo Contato-Telefone", contato.getIndContato(), ContatoEnum.TELEFONE.getChave())) {
			contato.setIndContato(ContatoEnum.TELEFONE.getChave());
			retorno = true;
		}

		if (historicoCampo("Texto Contato-Telefone", contato.getTxtContato() == null ? "" : contato.getTxtContato(),
				dadosEndereco.getNumTelefone() == null ? "" : dadosEndereco.getNumTelefone().getValue())) {
			contato.setTxtContato(dadosEndereco.getNumTelefone().getValue());
			retorno = true;
		}

		if (historicoCampo("DDD", contato.getNumDdd() == null ? "" : contato.getNumDdd().toString(), dadosEndereco.getDddTelefone() == null ? ""
				: dadosEndereco.getDddTelefone().getValue())) {
			contato.setNumDdd(new Long(dadosEndereco.getDddTelefone().getValue()));
			retorno = true;
		}

		contato.setPessoaFisica(pessoa);

		return retorno;
	}

	private List<br.gov.iphan.sisgep.entity.Servidor> getServidores(List<br.gov.iphan.sisgep.entity.Servidor> servidores,
			List<DadosFuncionais> dadosFuncionais, PessoaFisica pessoa) throws SincronizacaoException, Exception {
		if (servidores == null) {
			servidores = new ArrayList<br.gov.iphan.sisgep.entity.Servidor>();
		}

		ParametrosEntradaSIAPE parametros = new ParametrosEntradaSIAPE();
		parametros.setCpf(pessoa.getNumCpf());

		List<DadosAfastamentoPorMatricula> dadosAfastamento = consultaWS.consultaDadosAfastamento(parametros);
		List<DadosDependentes> dadosDependentes = consultaWS.consultaDadosDependentes(parametros);
		DadosEscolares dadosEscolares = consultaWS.consultaDadosEscolares(parametros);

		for (Iterator<DadosFuncionais> iter = dadosFuncionais.iterator(); iter.hasNext();) {
			DadosFuncionais dados = iter.next();
			if (servidores == null || servidores.size() == 0) {
				br.gov.iphan.sisgep.entity.Servidor servidor = new br.gov.iphan.sisgep.entity.Servidor();
				getServidor(dadosAfastamento, dadosDependentes, dadosEscolares, dados, servidor);
				if (servidorManager.consultarServidorPorMatricula(servidor).size() > 0) {
					throw new SincronizacaoException("A matrícula " + dados.getMatriculaSiape().getValue() + " do servidor com o CPF " + pessoa.getNumCpf()
							+ " no SIAPE já existe no SISGEP para outro CPF.");
				}
				servidor.setPessoaFisica(pessoa);
				servidores.add(servidor);
			} else {
				boolean find = false;
				for (Iterator<br.gov.iphan.sisgep.entity.Servidor> iter2 = servidores.iterator(); iter2.hasNext();) {
					br.gov.iphan.sisgep.entity.Servidor servidor = iter2.next();
					if (dados.getMatriculaSiape().getValue().equals(servidor.getNumMatricula().toString())) {
						find = true;
						getServidor(dadosAfastamento, dadosDependentes, dadosEscolares, dados, servidor);
						if (!validaServidor(servidor, pessoa)) {
							throw new SincronizacaoException("A matrícula " + dados.getMatriculaSiape().getValue() + " do servidor com o CPF "
									+ pessoa.getNumCpf() + " no SIAPE já existe no SISGEP para outro CPF.");
						}
					}
				}
				if (!find) {
					br.gov.iphan.sisgep.entity.Servidor servidor = new br.gov.iphan.sisgep.entity.Servidor();
					getServidor(dadosAfastamento, dadosDependentes, dadosEscolares, dados, servidor);
					if (servidorManager.consultarServidorPorMatricula(servidor).size() > 0) {
						throw new SincronizacaoException("A matrícula " + dados.getMatriculaSiape().getValue() + " do servidor com o CPF " + pessoa.getNumCpf()
								+ " no SIAPE já existe no SISGEP para outro CPF.");
					}
					servidor.setPessoaFisica(pessoa);
					servidores.add(servidor);
				}
			}
		}

		return servidores;
	}

	private boolean validaServidor(br.gov.iphan.sisgep.entity.Servidor servidor, PessoaFisica pessoa) {
		List<br.gov.iphan.sisgep.entity.Servidor> servidores = servidorManager.consultarServidorPorMatricula(servidor);
		for (Iterator<br.gov.iphan.sisgep.entity.Servidor> iter = servidores.iterator(); iter.hasNext();) {
			br.gov.iphan.sisgep.entity.Servidor serv = iter.next();
			if (!serv.getPessoaFisica().getNumCpf().equals(pessoa.getNumCpf())) {
				return false;
			}
		}
		return true;
	}

	private void getServidor(List<DadosAfastamentoPorMatricula> dadosAfastamento, List<DadosDependentes> dadosDependentes, DadosEscolares dadosEscolares,
			DadosFuncionais dados, br.gov.iphan.sisgep.entity.Servidor servidor) throws Exception, ParseException {

		servidor.setAfastamentos(getAfastamentos(servidor.getAfastamentos(), dadosAfastamento, servidor));
		servidor.setCargoFuncao(getCargos(servidor.getCargoFuncao(), dados));

		if (historicoCampo("Código SIAPE", servidor.getCodSiape(), dados.getMatriculaSiape().getValue()))
			servidor.setCodSiape(dados.getMatriculaSiape().getValue());

		if (dados.getDataOcorrIngressoOrgao() != null && dados.getDataOcorrIngressoOrgao().getValue() != null
				&& !dados.getDataOcorrIngressoOrgao().getValue().equals(""))
			if (historicoCampo("Data Inicial Ingresso Orgão",
					servidor.getDatIngressoOrgaoInicio() == null ? "" : comBarras.format(servidor.getDatIngressoOrgaoInicio()),
					comBarras.format(semBarras.parse(dados.getDataOcorrIngressoOrgao().getValue()))))
				servidor.setDatIngressoOrgaoInicio(semBarras.parse(dados.getDataOcorrIngressoOrgao().getValue()));

		servidor.setDependentes(getDependentes(servidor, servidor.getDependentes(), dadosDependentes));
		servidor.setFormacaoAcademicas(getFormacaoAcademica(servidor, servidor.getFormacaoAcademicas(), dadosEscolares));
		servidor.setFormaIngressoAposentacao1(getFormaIngressoOrgao(servidor.getFormaIngressoAposentacao1(), dados));
		servidor.setFormaIngressoAposentacao2(getFormaIngressoServicoPublico(servidor.getFormaIngressoAposentacao2(), dados));
		servidor.setFormaIngressoAposentacao3(getFormaIngressoAposentacao(servidor.getFormaIngressoAposentacao3(), dados));
		servidor.setFormaSaida(getFormaSaida(servidor.getFormaSaida(), dados));

		if (historicoCampo("Jornada de Trabalho ", servidor.getNumJornadaTrabalho() == null ? "" : servidor.getNumJornadaTrabalho().toString(), dados
				.getCodJornada().getValue()))
			servidor.setNumJornadaTrabalho(new Long(dados.getCodJornada().getValue()));

		if (historicoCampo("Matrícula", servidor.getNumMatricula() == null ? "" : servidor.getNumMatricula().toString(), dados.getMatriculaSiape().getValue()))
			servidor.setNumMatricula(new Long(dados.getMatriculaSiape().getValue()));

		servidor.setSituacaoFuncional(getSituacaoFuncional(dados, servidor));

		if (historicoCampo("Unidade Administrativa Lotação", servidor.getUnidadeAdmLotacao() == null ? ""
				: servidor.getUnidadeAdmLotacao().getId() == null ? "" : servidor.getUnidadeAdmLotacao().getId().toString(),
				dados.getCodUorgLotacao() == null ? "" : dados.getCodUorgLotacao().getValue()))
			servidor.setUnidadeAdmLotacao(getUnidadeAdministrativa(dados.getCodUorgLotacao().getValue()));
		if (servidor.getUnidadeAdmLotacao() != null && servidor.getUnidadeAdmLotacao().getId() == null) {
			servidor.setUnidadeAdmLotacao(null);
		}

		if (historicoCampo("Unidade Administrativa Exercício", servidor.getUnidadeAdministrativaExce() == null ? "" : servidor.getUnidadeAdministrativaExce()
				.getId() == null ? "" : servidor.getUnidadeAdministrativaExce().getId().toString(), dados.getCodUorgExercicio() == null ? "" : dados
				.getCodUorgExercicio().getValue()))
			servidor.setUnidadeAdministrativaExce(getUnidadeAdministrativa(dados.getCodUorgExercicio().getValue()));

	}

	private UnidadeAdministrativa getUnidadeAdministrativa(String codigoUorg) {
		UnidadeAdministrativa retorno = (UnidadeAdministrativa) unidadeAdministrativaManager.recuperarPorId(UnidadeAdministrativa.class, new Long(codigoUorg));
		return retorno;
	}

	private SituacaoFuncional getSituacaoFuncional(DadosFuncionais dados, br.gov.iphan.sisgep.entity.Servidor servidor) {
		SituacaoFuncional situacaoFuncional = servidor.getSituacaoFuncional();

		if (situacaoFuncional == null) {
			situacaoFuncional = new SituacaoFuncional();
		}

		if (historicoCampo("Situação Funcional", situacaoFuncional.getCodSiapeSituacaoFunc() == null ? "" : situacaoFuncional.getCodSiapeSituacaoFunc()
				.toString(), dados.getCodSitFuncional().getValue()))
			situacaoFuncional = situacaoFuncionalManager.consultarPorCodigoSiape(new Long(dados.getCodSitFuncional().getValue()));

		return situacaoFuncional;
	}

	private FormaIngressoAposentacao getFormaIngressoOrgao(FormaIngressoAposentacao aposentacao, DadosFuncionais dadosFuncionais) throws Exception {
		if (aposentacao == null) {
			aposentacao = new FormaIngressoAposentacao();
		}

		if (dadosFuncionais.getDataOcorrIngressoOrgao() != null && dadosFuncionais.getDataOcorrIngressoOrgao().getValue() != null
				&& !dadosFuncionais.getDataOcorrIngressoOrgao().getValue().equals(""))
			if (historicoCampo("Data Ingresso IPHAN", aposentacao.getDatIngressoApos() == null ? "" : comBarras.format(aposentacao.getDatIngressoApos()),
					comBarras.format(semBarras.parse(dadosFuncionais.getDataOcorrIngressoOrgao().getValue()))))
				aposentacao.setDatIngressoApos(semBarras.parse(dadosFuncionais.getDataOcorrIngressoOrgao().getValue()));

		if (historicoCampo("Forma Ingresso IPHAN", aposentacao.getFormaPassagemServ() == null ? "" : aposentacao.getFormaPassagemServ()
				.getCodSiapeFormPassServ() == null ? "" : aposentacao.getFormaPassagemServ().getCodSiapeFormPassServ().toString(),
				dadosFuncionais.getCodOcorrIngressoOrgao() == null ? "" : dadosFuncionais.getCodOcorrIngressoOrgao().getValue()))
			aposentacao.setFormaPassagemServ(getFormaPassagemServ(dadosFuncionais.getCodOcorrIngressoOrgao().getValue()));

		return aposentacao;
	}

	private FormaIngressoAposentacao getFormaIngressoServicoPublico(FormaIngressoAposentacao aposentacao, DadosFuncionais dadosFuncionais) throws Exception {
		if (aposentacao == null) {
			aposentacao = new FormaIngressoAposentacao();
		}

		if (dadosFuncionais.getDataOcorrIngressoServPublico() != null && dadosFuncionais.getDataOcorrIngressoServPublico().getValue() != null
				&& !dadosFuncionais.getDataOcorrIngressoServPublico().getValue().equals(""))
			if (historicoCampo("Data Ingresso Serviço Público",
					aposentacao.getDatIngressoApos() == null ? "" : comBarras.format(aposentacao.getDatIngressoApos()),
					comBarras.format(semBarras.parse(dadosFuncionais.getDataOcorrIngressoServPublico().getValue()))))
				aposentacao.setDatIngressoApos(semBarras.parse(dadosFuncionais.getDataOcorrIngressoServPublico().getValue()));

		if (historicoCampo("Forma Ingresso Serviço Público", aposentacao.getFormaPassagemServ() == null ? "" : aposentacao.getFormaPassagemServ()
				.getCodSiapeFormPassServ() == null ? "" : aposentacao.getFormaPassagemServ().getCodSiapeFormPassServ().toString(),
				dadosFuncionais.getCodOcorrIngressoServPublico() == null ? "" : dadosFuncionais.getCodOcorrIngressoServPublico().getValue()))
			aposentacao.setFormaPassagemServ(getFormaPassagemServ(dadosFuncionais.getCodOcorrIngressoServPublico().getValue()));

		return aposentacao;
	}

	private FormaIngressoAposentacao getFormaIngressoAposentacao(FormaIngressoAposentacao aposentacao, DadosFuncionais dadosFuncionais) throws Exception {
		if (aposentacao == null) {
			aposentacao = new FormaIngressoAposentacao();
		}

		if (dadosFuncionais.getDataOcorrAposentadoria() != null && dadosFuncionais.getDataOcorrAposentadoria().getValue() != null
				&& !dadosFuncionais.getDataOcorrAposentadoria().getValue().equals(""))
			if (historicoCampo("Data Ingresso Aposentação", aposentacao.getDatIngressoApos() == null ? "" : comBarras.format(aposentacao.getDatIngressoApos()),
					comBarras.format(semBarras.parse(dadosFuncionais.getDataOcorrAposentadoria().getValue()))))
				aposentacao.setDatIngressoApos(semBarras.parse(dadosFuncionais.getDataOcorrAposentadoria().getValue()));

		if (historicoCampo("Forma Ingresso Aposentação", aposentacao.getFormaPassagemServ() == null ? "" : aposentacao.getFormaPassagemServ()
				.getCodSiapeFormPassServ() == null ? "" : aposentacao.getFormaPassagemServ().getCodSiapeFormPassServ().toString(),
				dadosFuncionais.getCodOcorrAposentadoria() == null ? "" : dadosFuncionais.getCodOcorrAposentadoria().getValue()))
			aposentacao.setFormaPassagemServ(getFormaPassagemServ(dadosFuncionais.getCodOcorrAposentadoria().getValue()));

		return aposentacao;
	}

	private FormaSaida getFormaSaida(FormaSaida formaSaida, DadosFuncionais dadosFuncionais) throws Exception {
		if (formaSaida == null) {
			formaSaida = new FormaSaida();
		}

		if (dadosFuncionais.getDataOcorrExclusao() != null && dadosFuncionais.getDataOcorrExclusao().getValue() != null
				&& !dadosFuncionais.getDataOcorrExclusao().getValue().equals(""))
			if (historicoCampo("Data Saída IPHAN", formaSaida.getDatSaida() == null ? "" : comBarras.format(formaSaida.getDatSaida()),
					comBarras.format(semBarras.parse(dadosFuncionais.getDataOcorrExclusao().getValue()))))
				formaSaida.setDatSaida(semBarras.parse(dadosFuncionais.getDataOcorrExclusao().getValue()));

		if (historicoCampo("Forma Saída IPHAN", formaSaida.getFormaPassagemServ() == null ? ""
				: formaSaida.getFormaPassagemServ().getCodSiapeFormPassServ() == null ? "" : formaSaida.getFormaPassagemServ().getCodSiapeFormPassServ()
						.toString(), dadosFuncionais.getCodOcorrExclusao() == null ? "" : dadosFuncionais.getCodOcorrExclusao().getValue()))
			formaSaida.setFormaPassagemServ(getFormaPassagemServ(dadosFuncionais.getCodOcorrExclusao().getValue()));

		return formaSaida;
	}

	private FormaPassagemServ getFormaPassagemServ(String codigoFormaPassagemServ) {
		List<FormaPassagemServ> formas = formaPassagemServManager.listarTodos();

		for (Iterator<FormaPassagemServ> iter = formas.iterator(); iter.hasNext();) {
			FormaPassagemServ forma = iter.next();
			if (forma.getCodSiapeFormPassServ().equals(new Long(codigoFormaPassagemServ))) {
				return forma;
			}
		}

		return null;
	}

	private Set<FormacaoAcademica> getFormacaoAcademica(br.gov.iphan.sisgep.entity.Servidor servidor, Set<FormacaoAcademica> formacoes,
			DadosEscolares dadosEscolares) {
		if (formacoes == null) {
			formacoes = new HashSet<FormacaoAcademica>();
		}

		if (dadosEscolares == null || dadosEscolares.getArrayCursos() == null) {
			return formacoes;
		}

		ArrayOfDadosCurso arrayCursos = dadosEscolares.getArrayCursos().getValue();

		if (arrayCursos == null || arrayCursos.getDadosCurso() == null || arrayCursos.getDadosCurso().size() == 0) {
			return formacoes;
		}

		List<DadosCurso> dadosCurso = arrayCursos.getDadosCurso();

		for (Iterator<DadosCurso> iter = dadosCurso.iterator(); iter.hasNext();) {
			DadosCurso dado = iter.next();

			if (formacoes == null || formacoes.size() == 0) {
				FormacaoAcademica formacao = new FormacaoAcademica();
				formacao.setServidor(servidor);

				if (historicoCampo("Curso - Formação Acadêmica", formacao.getNomCurso(), dado.getNomeCurso().getValue()))
					formacao.setNomCurso(dado.getNomeCurso().getValue());

				formacoes.add(formacao);
			} else {
				boolean find = false;
				for (Iterator<FormacaoAcademica> iter2 = formacoes.iterator(); iter2.hasNext();) {
					FormacaoAcademica formacao = iter2.next();
					if (dado.getNomeCurso().getValue().equals(formacao.getNomCurso())) {
						find = true;
					}
				}
				if (!find) {
					FormacaoAcademica formacao = new FormacaoAcademica();
					formacao.setServidor(servidor);

					if (historicoCampo("Curso - Formação Acadêmica", formacao.getNomCurso(), dado.getNomeCurso().getValue()))
						formacao.setNomCurso(dado.getNomeCurso().getValue());

					formacoes.add(formacao);
				}
			}
		}

		return formacoes;
	}

	private Set<Dependente> getDependentes(br.gov.iphan.sisgep.entity.Servidor servidor, Set<Dependente> dependentes, List<DadosDependentes> dadosDependentes) {
		if (dependentes == null) {
			dependentes = new HashSet<Dependente>();
		}

		for (Iterator<DadosDependentes> iter = dadosDependentes.iterator(); iter.hasNext();) {
			DadosDependentes dado = iter.next();

			if (dependentes == null || dependentes.size() == 0) {
				Dependente dependente = new Dependente();
				dependente.setServidor(servidor);
				getDependente(dado, dependente);
				dependentes.add(dependente);
			} else {
				boolean find = false;
				for (Iterator<Dependente> iter2 = dependentes.iterator(); iter2.hasNext();) {
					Dependente dependente = iter2.next();
					if (dado.getCpf().getValue().equals(dependente.getNumCpf())) {
						getDependente(dado, dependente);
						find = true;
					}
				}
				if (!find) {
					Dependente dependente = new Dependente();
					dependente.setServidor(servidor);
					getDependente(dado, dependente);
					dependentes.add(dependente);
				}
			}
		}

		return dependentes;
	}

	private void getDependente(DadosDependentes dado, Dependente dependente) {
		if (historicoCampo("Condição Dependente", dependente.getCondicaoDependente() == null ? "" : dependente.getCondicaoDependente()
				.getCodSiapeCondDependente() == null ? "" : dependente.getCondicaoDependente().getCodSiapeCondDependente().toString(), dado.getCodCondicao()
				.getValue()))
			dependente.setCondicaoDependente(getCondicaoDependente(dado.getCodCondicao().getValue()));

		if (historicoCampo("Nome Dependente", dependente.getNomDependente(), dado.getNome().getValue()))
			dependente.setNomDependente(dado.getNome().getValue());

		if (historicoCampo("CPF Dependente", dependente.getNumCpf(), dado.getCpf().getValue()))
			dependente.setNumCpf(dado.getCpf().getValue());

		// if (historicoCampo("Grau Parentesco",
		// dependente.getTipGrauParentesco(),
		// dado.getNomeGrauParentesco().getValue()))
		// dependente.setTipGrauParentesco(dado.getNomeGrauParentesco().getValue());
	}

	private Set<CargoFuncao> getCargos(Set<CargoFuncao> cargos, DadosFuncionais dados) throws Exception {
		if (dados != null) {
			String codigoCargoSiape = null;
			String codigoGrupo = null;
			String codigoCargo = null;
			Boolean encontrou = false;

			if (dados.getCodCargo() != null && !dados.getCodCargo().getValue().isEmpty()) {
				codigoCargoSiape = dados.getCodCargo().getValue();
				codigoGrupo = codigoCargoSiape.substring(0, 3);
				codigoCargo = codigoCargoSiape.substring(3, 6);
			}
			
			if (cargos != null && cargos.size() > 0) {
				for (CargoFuncao cargoFuncao : cargos) {
					if (cargoFuncao.getTipoEfetivo()) {
						CargoEfetivo cargo = cargoFuncao.getCargoEfetivo();
						
						if (cargo.getCargoFuncionario().getCodSiapeCargo().equals(codigoCargo)
								&& cargo.getCargoFuncionario().getGrupoFuncionario().getCodSiapeGrupoFunc().equals(codigoGrupo)) {
							encontrou = true;

							if (cargo.getPadraoCargo() != null) {
								PadraoCargo padraoCargo = cargo.getPadraoCargo();
								if (!(padraoCargo.getTxtDescricao().equals(dados.getCodPadrao().getValue()) && padraoCargo.getClasseFuncionario()
										.getTxtDescricao().equals(dados.getCodClasse().getValue()))) {
									if (historicoCampo("Padrão Cargo", padraoCargo.getTxtDescricao(), dados.getCodPadrao().getValue()))
										cargo.setPadraoCargo(getPadraoCargo(dados));
								}
							} else {
								if (historicoCampo("Padrão Cargo", "", dados.getCodPadrao().getValue()))
									cargo.setPadraoCargo(getPadraoCargo(dados));
							}
						}
					} else {
						CargoComissionado cargo = cargoFuncao.getCargoComissionado();
						
						if (cargo.getTipoCargoComissinado().getCodSiapeCargoComissionado().equals(formataCodigoFuncao(dados.getCodFuncao().getValue()))) {
							encontrou = true;
							
							if (historicoCampo("Data de Exercício Cargo", cargo.getDatExercicio() == null ? "" : comBarras.format(cargo.getDatExercicio()),
									comBarras.format(semBarras.parse(dados.getDataIngressoFuncao().getValue()))))
								cargo.setDatExercicio(semBarras.parse(dados.getDataIngressoFuncao().getValue()));

							if (historicoCampo("Data da Exoneração Cargo", cargo.getDatExoneracao() == null ? "" : comBarras.format(cargo.getDatExoneracao()),
									comBarras.format(semBarras.parse(dados.getDataOcorrExclusao().getValue()))))
								cargo.setDatExoneracao(semBarras.parse(dados.getDataOcorrExclusao().getValue()));

						}
					}
				}
				
				if (!encontrou) {
					incluiCargoNovo(cargos, dados, codigoCargoSiape, codigoGrupo, codigoCargo);
				}
			} else {
				cargos = new HashSet<CargoFuncao>();
				incluiCargoNovo(cargos, dados, codigoCargoSiape, codigoGrupo, codigoCargo);
			}
		}

		return cargos;
	}

	private void incluiCargoNovo(Set<CargoFuncao> cargos, DadosFuncionais dados, String codigoCargoSiape, String codigoGrupo, String codigoCargo)
			throws ParseException {
		CargoFuncao cargoFuncao = new CargoFuncao();
		
		if (codigoCargoSiape != null) {
			CargoEfetivo cargo = new CargoEfetivo();
			
			cargo.setCargoFuncionario(getCargoFuncionario(dados, codigoGrupo, codigoCargo));
			cargo.setPadraoCargo(getPadraoCargo(dados));

			cargoFuncao.setCargoEfetivo(cargo);
		} else {
			CargoComissionado cargo = new CargoComissionado();
			
			cargo.setTipoCargoComissinado(getTipoCargoComissionado(dados));

			if (historicoCampo("Data de Exercício Cargo", cargo.getDatExercicio() == null ? "" : comBarras.format(cargo.getDatExercicio()),
					dados.getDataIngressoFuncao().getValue().equals("") ? "" : comBarras.format(semBarras.parse(dados.getDataIngressoFuncao().getValue()))))
				cargo.setDatExercicio(semBarras.parse(dados.getDataIngressoFuncao().getValue()));

			if (historicoCampo("Data da Exoneração Cargo", cargo.getDatExoneracao() == null ? "" : comBarras.format(cargo.getDatExoneracao()),
					dados.getDataOcorrExclusao().getValue().equals("") ? "" : comBarras.format(semBarras.parse(dados.getDataOcorrExclusao().getValue()))))
				cargo.setDatExoneracao(semBarras.parse(dados.getDataOcorrExclusao().getValue()));
			
			cargoFuncao.setCargoComissionado(cargo);
		}
		
		cargos.add(cargoFuncao);
	}

	private TipoCargoComissinado getTipoCargoComissionado(DadosFuncionais dados) {
		List<TipoCargoComissinado> tipos = tipoCargoComissionadoManager.listarTodos();

		for (TipoCargoComissinado tipo : tipos) {
			if (tipo.getCodSiapeCargoComissionado().equals(formataCodigoFuncao(dados.getCodFuncao().getValue()))) {
				return tipo;
			}
		}

		return null;
	}

	private String formataCodigoFuncao(String value) {
		String letras = value.replaceAll("[^a-zA-Z]", "");
		String numeros = value.replaceAll("[^1-9]", "");
		
		while (numeros.length() < 4) {
			numeros = "0" + numeros;
		}
		
		return letras + numeros;
	}

	private CargoFuncionario getCargoFuncionario(DadosFuncionais dados, String codigoGrupo, String codigoCargo) {
		List<CargoFuncionario> cargos = cargoFuncionarioManager.consultarCargoFuncionarioSiape(new Long(codigoCargo), new Long(codigoGrupo));
		return cargos.get(0);
	}

	private List<Afastamento> getAfastamentos(List<Afastamento> afastamentos, List<DadosAfastamentoPorMatricula> dadosAfastamento,
			br.gov.iphan.sisgep.entity.Servidor servidor) throws Exception {
		if (afastamentos == null) {
			afastamentos = new ArrayList<Afastamento>();
		}

		for (Iterator<DadosAfastamentoPorMatricula> iter = dadosAfastamento.iterator(); iter.hasNext();) {
			DadosAfastamentoPorMatricula dadoAfastamento = iter.next();
			if (dadosAfastamento == null || dadoAfastamento.getGrMatricula() == null || servidor == null || servidor.getNumMatricula() == null) {
				return afastamentos;
			}

			if (dadoAfastamento.getGrMatricula().getValue().equals(servidor.getNumMatricula().toString())) {
				ArrayOfDadosOcorrencias arrayOcorrencias = dadoAfastamento.getOcorrencias().getValue();
				List<DadosOcorrencias> ocorrencias = arrayOcorrencias.getDadosOcorrencias();
				for (Iterator<DadosOcorrencias> iter2 = ocorrencias.iterator(); iter.hasNext();) {
					DadosOcorrencias ocorrencia = iter2.next();
					Afastamento afastamento = new Afastamento();

					if (ocorrencia.getDataFim() != null && ocorrencia.getDataFim().getValue() != null && !ocorrencia.getDataFim().getValue().equals(""))
						if (historicoCampo("Data Final Afastamento",
								afastamento.getDatFimAfastamento() == null ? "" : comBarras.format(afastamento.getDatFimAfastamento()),
								comBarras.format(semBarras.parse(ocorrencia.getDataFim().getValue()))))
							afastamento.setDatFimAfastamento(semBarras.parse(ocorrencia.getDataFim().toString()));

					if (ocorrencia.getDataIni() != null && ocorrencia.getDataIni().getValue() != null && !ocorrencia.getDataIni().getValue().equals(""))
						if (historicoCampo("Data Início Afastamento",
								afastamento.getDatInicioAfastmento() == null ? "" : comBarras.format(afastamento.getDatInicioAfastmento()),
								comBarras.format(semBarras.parse(ocorrencia.getDataIni().getValue()))))
							afastamento.setDatInicioAfastmento(semBarras.parse(ocorrencia.getDataIni().toString()));

					if (historicoCampo("Número Afastamento", afastamento.getNumDocLegal() == null ? "" : afastamento.getNumDocLegal().toString(), ocorrencia
							.getCodOcorrencia().getValue()))
						afastamento.setNumDocLegal(new Long(ocorrencia.getCodOcorrencia().getValue()));

					if (historicoCampo("Descrição Afastamento", afastamento.getObsAfastamento(), ocorrencia.getDescOcorrencia().getValue()))
						afastamento.setObsAfastamento(ocorrencia.getDescOcorrencia().getValue());

					afastamentos.add(afastamento);
				}
			}
		}

		return afastamentos;
	}

	private PadraoCargo getPadraoCargo(DadosFuncionais dados) {
		List<PadraoCargo> padroes = padraoCargoManager.listarTodos();

		for (PadraoCargo padrao : padroes) {
			if (padrao.getTxtDescricao().equals(dados.getCodPadrao().getValue()) 
				&& padrao.getClasseFuncionario().getTxtDescricao().equals(dados.getCodClasse().getValue())) {
				return padrao;
			}
		}

		return null;
	}

	private CorRaca getCorRaca(String codigoCorRaca) {
		List<CorRaca> cores = corRacaManager.listarTodos();

		for (Iterator<CorRaca> iter = cores.iterator(); iter.hasNext();) {
			CorRaca corRaca = iter.next();
			if (corRaca.getCodigoSiapeCorRaca().equals(new Long(codigoCorRaca))) {
				return corRaca;
			}
		}

		return null;
	}

	private Municipio getMunicipio(String nomeMunicipio, Uf uf) throws SincronizacaoException {
		Municipio municipio = new Municipio();
		municipio.setNomMunicipio(nomeMunicipio);
		municipio.setCodUf(uf);

		try {
			municipio = municipioManager.consultarMunicipioPorNome(municipio);
		} catch (NoResultException e) {
			throw new SincronizacaoException("Não foi possível encontrar o município \"" + nomeMunicipio + "\" na UF \"" + uf.getDesSigla() + "\". CPF: " + cpf);
		} catch (NonUniqueResultException e) {
			throw new SincronizacaoException("Mais de um resultado foi encontrado para o município \"" + nomeMunicipio + "\" na UF \"" + uf.getDesSigla() + "\". CPF: " + cpf);
		}

		return municipio;
	}

	private Uf getUf(String nomeUf) throws SincronizacaoException {
		Uf retorno = null;
		try {
			retorno = ufManager.consultarUfPorSigla(nomeUf);
		} catch (NoResultException e) {
			throw new SincronizacaoException("Não foi possível encontrar a UF \"" + nomeUf + "\". CPF: " + cpf);
		}
		return retorno;
	}

	private EstadoCivil getEstadoCivil(String codigoEstadoCivil) {
		List<EstadoCivil> estados = estadoCivilManager.listarTodos();

		for (Iterator<EstadoCivil> iter = estados.iterator(); iter.hasNext();) {
			EstadoCivil estadoCivil = iter.next();
			if (estadoCivil.getCodigoSiapeEstCivil().equals(new Long(codigoEstadoCivil))) {
				return estadoCivil;
			}
		}

		return null;
	}

	private GrupoSanguineo getGrupoSanguineo(String codigoGrupoSanguineo) {
		List<GrupoSanguineo> grupos = grupoSanguineoManager.listarTodos();

		for (Iterator<GrupoSanguineo> iter = grupos.iterator(); iter.hasNext();) {
			GrupoSanguineo grupoSanguineo = iter.next();
			if (grupoSanguineo.getDesSigla().equals(codigoGrupoSanguineo.replaceAll(" ", ""))) {
				return grupoSanguineo;
			}
		}

		return null;
	}

	private EscolaridadePessoa getEscolaridadePessoa(String escolaridadePessoa, PessoaFisica pessoa) {
		List<EscolaridadePessoa> escolaridades = escolaridadePessoaManager.buscarEscolaridade(new Long(escolaridadePessoa));

		for (EscolaridadePessoa escolaridade : escolaridades) {
			if (escolaridade.getCodigoSiapeEscolaridade().equals(new Long(escolaridadePessoa))) {
				return escolaridade;
			}
		}

		return null;
	}

	private CondicaoDependente getCondicaoDependente(String condicaoDependente) {
		List<CondicaoDependente> condicoes = condicaoDependenteManager.listarTodos();

		for (Iterator<CondicaoDependente> iter = condicoes.iterator(); iter.hasNext();) {
			CondicaoDependente condicao = iter.next();
			if (condicao.getCodSiapeCondDependente().equals(condicaoDependente)) {
				return condicao;
			}
		}

		return null;
	}

	private void enviarEmail() {
		String br = System.getProperty("line.separator");
		String body = "Olá " + pessoaEmail.getNomPessoaFisica() + br;
		body += "A sincronização iniciada foi concluída.";
		body += br;
		body += "Para maiores detalhes, acesse os dados de histórico no sistema SISGEP.";

		Mailer mailer = new Mailer();

		try {
			mailer.sendMsg(pessoaEmail.getPessoaContatoEmail().getTxtContato(), "Sincronização SISGEP", body);
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
