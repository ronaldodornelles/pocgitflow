package br.gov.iphan.sisgep.sincronizacao;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import javax.mail.MessagingException;
import javax.naming.NamingException;
import javax.persistence.NoResultException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jboss.seam.annotations.In;
import org.jboss.seam.security.Credentials;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;

import br.gov.iphan.sisgep.action.SincronizacaoAction;
import br.gov.iphan.sisgep.entity.AreaAtuacao;
import br.gov.iphan.sisgep.entity.CargoComissionado;
import br.gov.iphan.sisgep.entity.CargoEfetivo;
import br.gov.iphan.sisgep.entity.CargoFuncao;
import br.gov.iphan.sisgep.entity.CargoFuncionario;
import br.gov.iphan.sisgep.entity.Cbo;
import br.gov.iphan.sisgep.entity.Dependente;
import br.gov.iphan.sisgep.entity.FormaIngressoAposentacao;
import br.gov.iphan.sisgep.entity.FormaSaida;
import br.gov.iphan.sisgep.entity.FormacaoAcademica;
import br.gov.iphan.sisgep.entity.GrupoFuncionario;
import br.gov.iphan.sisgep.entity.HistoricoSincronizacao;
import br.gov.iphan.sisgep.entity.InstituicaoEnsino;
import br.gov.iphan.sisgep.entity.NivelCargoFuncionario;
import br.gov.iphan.sisgep.entity.Servidor;
import br.gov.iphan.sisgep.entity.Sincronizacao;
import br.gov.iphan.sisgep.entity.corp.PessoaFisica;
import br.gov.iphan.sisgep.entity.corp.Uf;
import br.gov.iphan.sisgep.entity.enums.StatusHistoricoSincronizacaoEnum;
import br.gov.iphan.sisgep.entity.enums.TipoSincronizacaoEnum;
import br.gov.iphan.sisgep.manager.AreaAtuacaoManager;
import br.gov.iphan.sisgep.manager.CboManager;
import br.gov.iphan.sisgep.manager.FormacaoAcademicaManager;
import br.gov.iphan.sisgep.manager.NivelCargoFuncionarioManager;
import br.gov.iphan.sisgep.manager.ServidorManager;
import br.gov.iphan.sisgep.manager.SincronizacaoManager;
import br.gov.iphan.sisgep.manager.UfManager;
import br.gov.iphan.sisgep.util.Mailer;

@DisallowConcurrentExecution
public class SincronizacaoUploadJob implements Job {

	private static final Integer VALOR_MAXIMO_DOCUMENTO_LEGAL = new Integer(30);
	private SincronizacaoManager sincronizacaoManager;
	private UfManager ufManager;
	private ServidorManager servidorManager;
	private AreaAtuacaoManager areaAtuacaoManager;
	private NivelCargoFuncionarioManager nivelCargoFuncionarioManager;
	private CboManager cboManager;
	private FormacaoAcademicaManager formacaoAcademicaManager;
	private Locale ptBr = new Locale("pt", "BR");
	private TimeZone tz = TimeZone.getTimeZone("America/Sao_Paulo");
	private SimpleDateFormat comBarras = new SimpleDateFormat("dd/MM/yyyy", ptBr);
	private Sincronizacao sincronizacao;
	private List<HistoricoSincronizacao> historicos;
	private String cpf;
	private Credentials credentials;
	private String usuarioLogado;
	private boolean ressalva;
	private boolean novo;
	private boolean firstRow = true;
	private String nomePessoaAtual;
	private PessoaFisica pessoaEmail;
	private List<File> arquivos = new ArrayList<File>();

	@In
	private SincronizacaoAction sincronizacaoAction;

	@SuppressWarnings("unchecked")
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		try {
			SchedulerContext schedulerContext = context.getScheduler().getContext();
			sincronizacaoManager = (SincronizacaoManager) schedulerContext.get("sincronizacaoManager");
			ufManager = (UfManager) schedulerContext.get("ufManager");
			servidorManager = (ServidorManager) schedulerContext.get("servidorManager");
			areaAtuacaoManager = (AreaAtuacaoManager) schedulerContext.get("areaAtuacaoManager");
			nivelCargoFuncionarioManager = (NivelCargoFuncionarioManager) schedulerContext
					.get("nivelCargoFuncionarioManager");
			cboManager = (CboManager) schedulerContext.get("cboManager");
			formacaoAcademicaManager = (FormacaoAcademicaManager) schedulerContext.get("formacaoAcademicaManager");
			credentials = (Credentials) schedulerContext.get("credentials");
			pessoaEmail = (PessoaFisica) schedulerContext.get("pessoaEmail");
			arquivos = (List<File>) schedulerContext.get("arquivos");

			usuarioLogado = credentials.getUsername();

			sincronizar();
		} catch (Exception e) {
			e.printStackTrace();
			throw new JobExecutionException(e.getMessage());
		}

	}

	private void sincronizar() throws Exception {
		try {
			sincronizacao = new Sincronizacao();
			sincronizacao.setNomeUsuario(usuarioLogado);
			iniciaSincronizacao();

			for (File file : arquivos) {
				Workbook workbook = WorkbookFactory.create(file);
				Sheet worksheetIngressoIphan = workbook.getSheet("IngressoIphan");
				Sheet worksheetIngressoServ = workbook.getSheet("IngressoServ");
				Sheet worksheetAposenta = workbook.getSheet("Aposenta");
				Sheet worksheetCargoEfetivo = workbook.getSheet("CargoEfetivo");
				Sheet worksheetCargoComis = workbook.getSheet("CargoComis");
				Sheet worksheetFormAcad = workbook.getSheet("FormAcad");
				Sheet worksheetDepende = workbook.getSheet("Depende");

				historicos = new ArrayList<HistoricoSincronizacao>();

				// Planilha IngressoIphan
				if (worksheetIngressoIphan != null) {
					for (Iterator<Row> iterRow = worksheetIngressoIphan.iterator(); iterRow.hasNext();) {
						processaIngressoIphan(iterRow);
					}
				}

				// Planilha IngressoServ
				if (worksheetIngressoServ != null) {
					firstRow = true;
					for (Iterator<Row> iterRow = worksheetIngressoServ.iterator(); iterRow.hasNext();) {
						processaIngressoServ(iterRow);
					}
				}

				// Planilha Aposenta
				if (worksheetAposenta != null) {
					firstRow = true;
					for (Iterator<Row> iterRow = worksheetAposenta.iterator(); iterRow.hasNext();) {
						processaAposenta(iterRow);
					}
				}

				// Planilha CargoEfetivo
				if (worksheetCargoEfetivo != null) {
					firstRow = true;
					for (Iterator<Row> iterRow = worksheetCargoEfetivo.iterator(); iterRow.hasNext();) {
						processaCargoEfetivo(iterRow);
					}
				}

				// Planilha CargoComis
				if (worksheetCargoComis != null) {
					firstRow = true;
					for (Iterator<Row> iterRow = worksheetCargoComis.iterator(); iterRow.hasNext();) {
						processaCargoComis(iterRow);
					}
				}

				// Planilha FormAcad
				if (worksheetFormAcad != null) {
					firstRow = true;
					for (Iterator<Row> iterRow = worksheetFormAcad.iterator(); iterRow.hasNext();) {
						processaFormAcad(iterRow);
					}
				}

				// Planilha Depende
				if (worksheetDepende != null) {
					firstRow = true;
					for (Iterator<Row> iterRow = worksheetDepende.iterator(); iterRow.hasNext();) {
						processaDepende(iterRow);
					}
				}

				workbook.close();
			}

			finalizaSincronizacao();

		} catch (Exception e) {
			e.printStackTrace();
			ressalvaSincronizacao(e.getMessage());
			finalizaSincronizacao();
		}
	}

	private void processaIngressoIphan(Iterator<Row> iterRow) {
		Row row = iterRow.next();
		boolean atualizou = false;

		if (firstRow) {
			firstRow = false;
			return;
		}

		Cell codigoMatricula = row.getCell(0);
		Cell nome = row.getCell(1);
		Cell cpf = row.getCell(2);
		Cell dataPublicacaoIngresso = row.getCell(3);
		Cell numeroDocumentoIngresso = row.getCell(4);
		Cell numeroDocumentoLegal = row.getCell(5);
		Cell dataExoneracao = row.getCell(7);
		Cell numeroDocumentoExoneracao = row.getCell(8);

		if (codigoMatricula == null || getStringCellValue(codigoMatricula) == null)
			return;

		Servidor servidor = new Servidor();
		try {
			servidor = servidorManager.consultaServidorPorMatricula(new Long(getStringCellValue(codigoMatricula)));
		} catch (NoResultException e) {
			e.printStackTrace();
			ressalvaSincronizacao("Não existe servidor cadastrado para a matrícula "
					+ getStringCellValue(codigoMatricula) + ".");
			return;
		}

		this.cpf = getStringCellValue(cpf);
		this.nomePessoaAtual = getStringCellValue(nome);

		FormaIngressoAposentacao aposentacao = servidor.getFormaIngressoAposentacao1();
		FormaSaida exoneracao = servidor.getFormaSaida();

		if (aposentacao != null) {
			if (dataPublicacaoIngresso != null && validDate(dataPublicacaoIngresso)) {
				if (historicoCampo("Ingresso IPHAN: Data Publicação", aposentacao.getDatPublicacaoDoc() == null ? ""
						: comBarras.format(aposentacao.getDatPublicacaoDoc()), comBarras.format(dataPublicacaoIngresso
						.getDateCellValue())))
					aposentacao.setDatPublicacaoDoc(dataPublicacaoIngresso.getDateCellValue());
			}

			if (numeroDocumentoLegal != null && getStringCellValue(numeroDocumentoLegal) != null) {
				if (new Integer(getStringCellValue(numeroDocumentoLegal)) > VALOR_MAXIMO_DOCUMENTO_LEGAL) {
					ressalvaSincronizacao("O valor \"" + getStringCellValue(numeroDocumentoLegal)
							+ "\" é inválido para Documento Legal do Ingresso no IPHAN. CPF: " + cpf + ";");
				} else {
					if (historicoCampo("Ingresso IPHAN: Documento Legal", aposentacao.getIndDocLegal() == null ? ""
							: aposentacao.getIndDocLegal() == null ? "" : aposentacao.getIndDocLegal().toString(),
							numeroDocumentoLegal == null ? "" : getStringCellValue(numeroDocumentoLegal)))
						aposentacao.setIndDocLegal(new Long(getStringCellValue(numeroDocumentoLegal)));
				}
			}

			try {
				if (historicoCampo("Ingresso IPHAN: Número Documento Legal", aposentacao.getNumDocLegal() == null ? ""
						: aposentacao.getNumDocLegal() == null ? "" : aposentacao.getNumDocLegal().toString(),
						numeroDocumentoIngresso == null ? "" : getStringCellValue(numeroDocumentoIngresso)))
					aposentacao.setNumDocLegal(new Long(getStringCellValue(numeroDocumentoIngresso)));
			} catch (NumberFormatException e) {
				e.printStackTrace();
				ressalvaSincronizacao("O valor \"" + getStringCellValue(numeroDocumentoIngresso)
						+ "\" é inválido para o campo Número do Documento Legal, no servidor "
						+ getStringCellValue(codigoMatricula) + ".");
			}

			servidor.setFormaIngressoAposentacao1(aposentacao);
			atualizou = true;
		}

		if (exoneracao != null) {
			if (dataExoneracao != null && validDate(dataExoneracao)) {
				if (historicoCampo("Ingresso IPHAN: Data Exoneração", exoneracao.getDatPublicacaoDoc() == null ? ""
						: comBarras.format(exoneracao.getDatPublicacaoDoc()), comBarras.format(dataExoneracao
						.getDateCellValue())))
					exoneracao.setDatPublicacaoDoc(dataExoneracao.getDateCellValue());
			}

			try {
				if (historicoCampo("Ingresso IPHAN: Número Documento Legal Exoneração",
						exoneracao.getNumDocLegal() == null ? "" : exoneracao.getNumDocLegal() == null ? ""
								: exoneracao.getNumDocLegal().toString(), numeroDocumentoExoneracao == null ? ""
								: getStringCellValue(numeroDocumentoExoneracao)))
					exoneracao.setNumDocLegal(new Long(getStringCellValue(numeroDocumentoExoneracao)));
			} catch (NumberFormatException e) {
				e.printStackTrace();
				ressalvaSincronizacao("O valor \"" + getStringCellValue(numeroDocumentoExoneracao)
						+ "\" é inválido para o campo Número do Documento Legal, no servidor "
						+ getStringCellValue(codigoMatricula) + ".");
			}

			servidor.setFormaSaida(exoneracao);
			atualizou = true;
		}

		if (atualizou) {
			servidorManager.salvar(servidor);
			atualizaSincronizacao();
		}
	}

	private void processaIngressoServ(Iterator<Row> iterRow) {
		Row row = iterRow.next();

		if (firstRow) {
			firstRow = false;
			return;
		}

		Cell codigoMatricula = row.getCell(0);
		Cell nome = row.getCell(1);
		Cell cpf = row.getCell(2);
		Cell numeroDocumentoIngresso = row.getCell(3);
		Cell dataPublicacaoIngresso = row.getCell(4);
		Cell numeroDocumentoLegal = row.getCell(5);

		if (codigoMatricula == null || getStringCellValue(codigoMatricula) == null)
			return;

		Servidor servidor = new Servidor();
		try {
			servidor = servidorManager.consultaServidorPorMatricula(new Long(getStringCellValue(codigoMatricula)));
		} catch (NoResultException e) {
			e.printStackTrace();
			ressalvaSincronizacao("Não existe servidor cadastrado para a matrícula "
					+ getStringCellValue(codigoMatricula) + ".");
			return;
		}

		this.cpf = getStringCellValue(cpf);
		this.nomePessoaAtual = getStringCellValue(nome);

		FormaIngressoAposentacao aposentacao = servidor.getFormaIngressoAposentacao2();

		if (aposentacao != null) {
			if (dataPublicacaoIngresso != null && validDate(dataPublicacaoIngresso)) {
				if (historicoCampo(
						"Ingresso Serviço Público: Data Publicação",
						aposentacao.getDatPublicacaoDoc() == null ? "" : comBarras.format(aposentacao
								.getDatPublicacaoDoc()), comBarras.format(dataPublicacaoIngresso.getDateCellValue())))
					aposentacao.setDatPublicacaoDoc(dataPublicacaoIngresso.getDateCellValue());
			}

			if (numeroDocumentoLegal != null && getStringCellValue(numeroDocumentoLegal) != null) {
				if (new Integer(getStringCellValue(numeroDocumentoLegal)) > VALOR_MAXIMO_DOCUMENTO_LEGAL) {
					ressalvaSincronizacao("O valor \"" + getStringCellValue(numeroDocumentoLegal)
							+ "\" é inválido para Documento Legal do Ingresso no Serviço Público. CPF: " + cpf + ";");
				} else {
					if (historicoCampo("Ingresso Serviço Público: Documento Legal",
							aposentacao.getIndDocLegal() == null ? "" : aposentacao.getIndDocLegal().toString(),
							numeroDocumentoLegal == null ? "" : getStringCellValue(numeroDocumentoLegal)))
						aposentacao.setIndDocLegal(new Long(getStringCellValue(numeroDocumentoLegal)));
				}
			}

			try {
				if (historicoCampo("Ingresso Serviço Público: Número Documento Legal",
						aposentacao.getNumDocLegal() == null ? "" : aposentacao.getNumDocLegal().toString(),
						numeroDocumentoIngresso == null ? "" : getStringCellValue(numeroDocumentoIngresso)))
					aposentacao.setNumDocLegal(new Long(getStringCellValue(numeroDocumentoIngresso)));
			} catch (NumberFormatException e) {
				e.printStackTrace();
				ressalvaSincronizacao("O valor \"" + getStringCellValue(numeroDocumentoIngresso)
						+ "\" é inválido para o campo Número do Documento Legal, no servidor "
						+ getStringCellValue(codigoMatricula) + ".");
			}

			servidor.setFormaIngressoAposentacao2(aposentacao);

			servidorManager.salvar(servidor);
			atualizaSincronizacao();
		}
	}

	private void processaAposenta(Iterator<Row> iterRow) {
		Row row = iterRow.next();

		if (firstRow) {
			firstRow = false;
			return;
		}

		Cell codigoMatricula = row.getCell(0);
		Cell nome = row.getCell(1);
		Cell cpf = row.getCell(2);
		Cell numeroDocumentoAposentacao = row.getCell(3);
		Cell dataPrimeiroEmprego = row.getCell(4);

		if (codigoMatricula == null || getStringCellValue(codigoMatricula) == null)
			return;

		Servidor servidor = new Servidor();
		try {
			servidor = servidorManager.consultaServidorPorMatricula(new Long(getStringCellValue(codigoMatricula)));
		} catch (NoResultException e) {
			e.printStackTrace();
			ressalvaSincronizacao("Não existe servidor cadastrado para a matrícula "
					+ getStringCellValue(codigoMatricula) + ".");
			return;
		}

		this.cpf = getStringCellValue(cpf);
		this.nomePessoaAtual = getStringCellValue(nome);

		FormaIngressoAposentacao aposentacao = servidor.getFormaIngressoAposentacao3();

		if (aposentacao != null) {
			if (dataPrimeiroEmprego != null && validDate(dataPrimeiroEmprego)) {
				if (historicoCampo("Aposentação: Data Primeiro Emprego", servidor.getDatPrimeiroEmprego() == null ? ""
						: comBarras.format(servidor.getDatPrimeiroEmprego()), comBarras.format(dataPrimeiroEmprego
						.getDateCellValue())))
					servidor.setDatPrimeiroEmprego(dataPrimeiroEmprego.getDateCellValue());
			}

			try {
				if (historicoCampo("Aposentação: Número Documento Legal", aposentacao.getNumDocLegal() == null ? ""
						: aposentacao.getNumDocLegal().toString(), numeroDocumentoAposentacao == null ? ""
						: getStringCellValue(numeroDocumentoAposentacao)))
					aposentacao.setNumDocLegal(new Long(getStringCellValue(numeroDocumentoAposentacao)));
			} catch (NumberFormatException e) {
				e.printStackTrace();
				ressalvaSincronizacao("O valor \"" + getStringCellValue(numeroDocumentoAposentacao)
						+ "\" é inválido para o campo Número do Documento Legal, no servidor "
						+ getStringCellValue(codigoMatricula) + ".");
			}

			servidor.setFormaIngressoAposentacao3(aposentacao);

			servidorManager.salvar(servidor);
			atualizaSincronizacao();
		}
	}

	private void processaCargoEfetivo(Iterator<Row> iterRow) {
		Row row = iterRow.next();

		if (firstRow) {
			firstRow = false;
			return;
		}

		Cell codigoMatricula = row.getCell(0); // Numeric
		Cell cpf = row.getCell(1);
		Cell nome = row.getCell(2);
		Cell nomeAreaAtuacao = row.getCell(3); // String
		Cell nivel = row.getCell(4); // String
		Cell codigoCBO = row.getCell(5); // Numeric
		Cell estabilidade = row.getCell(6); // String
		Cell codigoVaga = row.getCell(7); // Numeric
		Cell dataIngressoIphan = row.getCell(8); // Numeric (Date)

		if (codigoMatricula == null || getStringCellValue(codigoMatricula) == null)
			return;

		Servidor servidor = new Servidor();
		try {
			servidor = servidorManager.consultaServidorPorMatricula(new Long(getStringCellValue(codigoMatricula)));
		} catch (NoResultException e) {
			e.printStackTrace();
			ressalvaSincronizacao("Não existe servidor cadastrado para a matrícula "
					+ getStringCellValue(codigoMatricula) + ".");
			return;
		}

		this.cpf = getStringCellValue(cpf);
		this.nomePessoaAtual = getStringCellValue(nome);

		Set<CargoFuncao> cargos = servidor.getCargoFuncao();

		if (cargos != null && cargos.size() > 0) {
			for (CargoFuncao cargoFuncao : cargos) {
				if (cargoFuncao.getTipoEfetivo()) {
					CargoEfetivo cargo = cargoFuncao.getCargoEfetivo();

					if (historicoCampo("Cargo Efetivo: Código da Vaga", cargo.getCodVaga() == null ? "" : cargo
							.getCodVaga().toString(), codigoVaga == null ? "" : getStringCellValue(codigoVaga)))
						cargo.setCodVaga(new Long(getStringCellValue(codigoVaga)));

					AreaAtuacao areaAtuacao = areaAtuacaoManager.buscarAreaPorNome(getStringCellValue(nomeAreaAtuacao));
					if (areaAtuacao != null) {
						if (historicoCampo("Cargo Efetivo: Área Atuação", cargo.getAreaAtuacao() == null ? "" : cargo
								.getAreaAtuacao().getNomAreaAtuacao() == null ? "" : cargo.getAreaAtuacao()
								.getNomAreaAtuacao(),
								areaAtuacao.getNomAreaAtuacao() == null ? "" : areaAtuacao.getNomAreaAtuacao()))
							cargo.setAreaAtuacao(areaAtuacao);
					}

					NivelCargoFuncionario nivelCargoFuncionario = nivelCargoFuncionarioManager
							.buscarNivelPorNome(getStringCellValue(nivel));
					if (nivelCargoFuncionario != null) {
						CargoFuncionario cargoFuncionario = cargo.getCargoFuncionario();
						if (cargoFuncionario != null) {
							GrupoFuncionario grupoFuncionario = cargoFuncionario.getGrupoFuncionario();
							if (grupoFuncionario != null) {
								NivelCargoFuncionario nivelCargo = grupoFuncionario.getNivelCargoFuncionario();
								if (nivelCargo != null) {
									if (historicoCampo("Cargo Efetivo: Nível Cargo",
											nivelCargo.getTxtDescricao() == null ? "" : nivelCargo.getTxtDescricao(),
											nivelCargoFuncionario.getTxtDescricao() == null ? ""
													: nivelCargoFuncionario.getTxtDescricao())) {
										grupoFuncionario.setNivelCargoFuncionario(nivelCargoFuncionario);
										cargoFuncionario.setGrupoFuncionario(grupoFuncionario);
										cargo.setCargoFuncionario(cargoFuncionario);
									}
								}
							}
						}
					}

					Cbo cbo = (Cbo) cboManager.recuperarPorId(Cbo.class, new Long(getStringCellValue(codigoCBO)));
					if (cbo != null) {
						if (historicoCampo("Cargo Efetivo: CBO", cargo.getCbo() == null ? ""
								: cargo.getCbo().getId() == null ? "" : cargo.getCbo().getId().toString(),
								cbo.getId() == null ? "" : cbo.getId().toString()))
							cargo.setCbo(cbo);
					}

					if (historicoCampo("Cargo Efetivo: Estabilidade", cargo.getIndEstavel() == null ? "" : cargo
							.getIndEstavel().toString(),
							getEstabilidade(estabilidade) == null ? "" : getEstabilidade(estabilidade).toString()))
						cargo.setIndEstavel(getEstabilidade(estabilidade));

					if (dataIngressoIphan != null && validDate(dataIngressoIphan)) {
						if (historicoCampo("Cargo Efetivo: Data Exercício", cargo.getDatExercicio() == null ? ""
								: comBarras.format(cargo.getDatExercicio()), comBarras.format(dataIngressoIphan
								.getDateCellValue())))
							cargo.setDatExercicio(dataIngressoIphan.getDateCellValue());
					}

					cargoFuncao.setCargoEfetivo(cargo);
				}
			}

			servidor.setCargoFuncao(cargos);

			servidorManager.salvar(servidor);
			atualizaSincronizacao();
		}
	}

	private void processaCargoComis(Iterator<Row> iterRow) {
		Row row = iterRow.next();

		if (firstRow) {
			firstRow = false;
			return;
		}

		Cell codigoMatricula = row.getCell(0);
		Cell nome = row.getCell(1);
		Cell cpf = row.getCell(2);
		Cell documentoLegal = row.getCell(3);
		Cell dataPublicacao = row.getCell(4);
		Cell numeroDocumentoLegal = row.getCell(5);
		Cell dataPosse = row.getCell(6);

		if (codigoMatricula == null || getStringCellValue(codigoMatricula) == null)
			return;

		Servidor servidor = new Servidor();
		try {
			servidor = servidorManager.consultaServidorPorMatricula(new Long(getStringCellValue(codigoMatricula)));
		} catch (NoResultException e) {
			e.printStackTrace();
			ressalvaSincronizacao("Não existe servidor cadastrado para a matrícula "
					+ getStringCellValue(codigoMatricula) + ".");
			return;
		}

		this.cpf = getStringCellValue(cpf);
		this.nomePessoaAtual = getStringCellValue(nome);

		Set<CargoFuncao> cargos = servidor.getCargoFuncao();

		if (cargos != null && cargos.size() > 0) {
			for (CargoFuncao cargoFuncao : cargos) {
				if (!cargoFuncao.getTipoEfetivo()) {
					CargoComissionado cargo = cargoFuncao.getCargoComissionado();

					if (documentoLegal != null && getStringCellValue(documentoLegal) != null) {
						if (new Integer(getStringCellValue(documentoLegal)) > VALOR_MAXIMO_DOCUMENTO_LEGAL) {
							ressalvaSincronizacao("O valor \"" + getStringCellValue(documentoLegal)
									+ "\" é inválido para Documento Legal do Cargo Comissionado. CPF: " + cpf + ";");
						} else {
							if (historicoCampo("Cargo Comissionado: Documento Legal",
									cargo.getIndDocLegalNom() == null ? "" : cargo.getIndDocLegalNom().toString(),
									documentoLegal == null ? "" : getStringCellValue(documentoLegal)))
								cargo.setIndDocLegalNom(new Long(getStringCellValue(documentoLegal)));
						}
					}

					if (dataPublicacao != null && validDate(dataPublicacao)) {
						if (historicoCampo(
								"Cargo Comissionado: Data Publicação",
								cargo.getDatPublicacaoDocNom() == null ? "" : comBarras.format(cargo
										.getDatPublicacaoDocNom()), comBarras.format(dataPublicacao.getDateCellValue())))
							cargo.setDatPublicacaoDocNom(dataPublicacao.getDateCellValue());
					}

					if (historicoCampo("Cargo Comissionado: Número Documento Legal",
							cargo.getNumDocLegalNom() == null ? "" : cargo.getNumDocLegalNom().toString(),
							numeroDocumentoLegal == null ? "" : getStringCellValue(numeroDocumentoLegal)))
						cargo.setNumDocLegalNom(new Long(getStringCellValue(numeroDocumentoLegal)));

					if (dataPosse != null && validDate(dataPosse)) {
						if (historicoCampo("Cargo Comissionado: Data Posse", cargo.getDatPosse() == null ? ""
								: comBarras.format(cargo.getDatPosse()), comBarras.format(dataPosse.getDateCellValue())))
							cargo.setDatPosse(dataPosse.getDateCellValue());
					}

					cargoFuncao.setCargoComissionado(cargo);
				}
			}

			servidor.setCargoFuncao(cargos);

			servidorManager.salvar(servidor);
			atualizaSincronizacao();
		}
	}

	private void processaFormAcad(Iterator<Row> iterRow) {
		Row row = iterRow.next();

		if (firstRow) {
			firstRow = false;
			return;
		}

		Cell codigoMatricula = row.getCell(0);
		Cell cpf = row.getCell(1);
		Cell nome = row.getCell(2);
		Cell nomeEstabelecimento = row.getCell(3);

		if (codigoMatricula == null || getStringCellValue(codigoMatricula) == null)
			return;

		Servidor servidor = new Servidor();
		try {
			servidor = servidorManager.consultaServidorPorMatricula(new Long(getStringCellValue(codigoMatricula)));
		} catch (NoResultException e) {
			e.printStackTrace();
			ressalvaSincronizacao("Não existe servidor cadastrado para a matrícula "
					+ getStringCellValue(codigoMatricula) + ".");
			return;
		}

		this.cpf = getStringCellValue(cpf);
		this.nomePessoaAtual = getStringCellValue(nome);

		Set<FormacaoAcademica> formacoes = servidor.getFormacaoAcademicas();

		if (formacoes != null && formacoes.size() > 0) {
			boolean encontrou = false;
			for (FormacaoAcademica formacao : formacoes) {
				InstituicaoEnsino instituicao = formacao.getInstituicaoEnsino();
				if (instituicao != null) {
					String nomeInstituicao = instituicao.getNomInstituicaoEnsino();
					if (nomeInstituicao != null) {
						if (nomeInstituicao.equals(notNull(nomeEstabelecimento))) {
							encontrou = true;
						}
					}
				}
			}

			if (!encontrou) {
				FormacaoAcademica formacao = new FormacaoAcademica();
				InstituicaoEnsino instituicaoEnsino = new InstituicaoEnsino();

				for (FormacaoAcademica formacaoAtual : formacoes) {
					if (formacaoAtual.getInstituicaoEnsino() != null)
						instituicaoEnsino = formacaoAtual.getInstituicaoEnsino();
					formacaoAcademicaManager.excluirFormacaoAcademica(formacao);
				}
				formacoes = new HashSet<FormacaoAcademica>();

				if (historicoCampo(
						"Formação Acadêmica: Instituição de Ensino",
						instituicaoEnsino.getNomInstituicaoEnsino() == null ? "" : instituicaoEnsino
								.getNomInstituicaoEnsino(), nomeEstabelecimento == null ? ""
								: getStringCellValue(nomeEstabelecimento))) {
					instituicaoEnsino.setNomInstituicaoEnsino(notNull(nomeEstabelecimento));
					formacao.setInstituicaoEnsino(instituicaoEnsino);
					formacao.setServidor(servidor);
					formacoes.add(formacao);
				}
			}

			servidor.setFormacaoAcademicas(formacoes);
		} else {
			formacoes = new HashSet<FormacaoAcademica>();

			FormacaoAcademica formacao = new FormacaoAcademica();
			formacao.setServidor(servidor);
			InstituicaoEnsino instituicaoEnsino = new InstituicaoEnsino();
			if (historicoCampo(
					"Formação Acadêmica: Instituição de Ensino",
					instituicaoEnsino.getNomInstituicaoEnsino() == null ? "" : instituicaoEnsino
							.getNomInstituicaoEnsino(), nomeEstabelecimento == null ? ""
							: getStringCellValue(nomeEstabelecimento))) {
				instituicaoEnsino.setNomInstituicaoEnsino(notNull(nomeEstabelecimento));
				formacao.setInstituicaoEnsino(instituicaoEnsino);
				formacao.setServidor(servidor);
				formacoes.add(formacao);
			}

			servidor.setFormacaoAcademicas(formacoes);
		}

		servidorManager.salvar(servidor);
		atualizaSincronizacao();
	}

	private void processaDepende(Iterator<Row> iterRow) {
		Row row = iterRow.next();

		if (firstRow) {
			firstRow = false;
			return;
		}

		Cell codigoMatricula = row.getCell(4);
		Cell nomeDependente = row.getCell(1);
		Cell sexo = row.getCell(2);
		Cell nomeCartorio = row.getCell(6);
		Cell livro = row.getCell(7);
		Cell folha = row.getCell(8);
		Cell numeroCertidao = row.getCell(9);
		Cell numCpf = row.getCell(12);
		Cell nomeMae = row.getCell(13);
		Cell dataNascimento = row.getCell(14);
		Cell rg = row.getCell(15);
		Cell ufRg = row.getCell(16);
		Cell orgaoExpedidor = row.getCell(17);
		Cell dataExpedicao = row.getCell(18);

		if (codigoMatricula == null || getStringCellValue(codigoMatricula) == null)
			return;

		Servidor servidor = new Servidor();
		try {
			servidor = servidorManager.consultaServidorPorMatricula(new Long(getStringCellValue(codigoMatricula)));
		} catch (NoResultException e) {
			e.printStackTrace();
			ressalvaSincronizacao("Não existe servidor cadastrado para a matrícula "
					+ getStringCellValue(codigoMatricula) + ".");
			return;
		}

		this.cpf = servidor.getPessoaFisica().getNumCpf();
		this.nomePessoaAtual = servidor.getPessoaFisica().getNomPessoaFisica();

		Set<Dependente> dependentes = servidor.getDependentes();

		Boolean encontrou = false;
		Boolean atualizou = false;

		if (dependentes != null && dependentes.size() > 0) {
			for (Dependente dependente : dependentes) {
				if (dependente.getNumCpf().equals(getStringCellValue(numCpf))) {
					encontrou = true;
					atualizou = true;
					atualizaDependente(nomeDependente, sexo, nomeCartorio, livro, folha, numeroCertidao, nomeMae,
							dataNascimento, rg, ufRg, orgaoExpedidor, dataExpedicao, numCpf, dependente);

				}
			}

			if (!encontrou) {
				Dependente dependente = new Dependente();

				atualizou = true;
				atualizaDependente(nomeDependente, sexo, nomeCartorio, livro, folha, numeroCertidao, nomeMae,
						dataNascimento, rg, ufRg, orgaoExpedidor, dataExpedicao, numCpf, dependente);

				dependente.setServidor(servidor);

				dependentes.add(dependente);
			}
		} else {
			Dependente dependente = new Dependente();

			atualizou = true;
			atualizaDependente(nomeDependente, sexo, nomeCartorio, livro, folha, numeroCertidao, nomeMae,
					dataNascimento, rg, ufRg, orgaoExpedidor, dataExpedicao, numCpf, dependente);

			dependente.setServidor(servidor);

			dependentes.add(dependente);
		}

		if (atualizou) {
			servidor.setDependentes(dependentes);

			servidorManager.salvar(servidor);
			atualizaSincronizacao();
		}
	}

	private void atualizaDependente(Cell nomeDependente, Cell sexo, Cell nomeCartorio, Cell livro, Cell folha,
			Cell numeroCertidao, Cell nomeMae, Cell dataNascimento, Cell rg, Cell ufRg, Cell orgaoExpedidor,
			Cell dataExpedicao, Cell numCpf, Dependente dependente) {
		if (dataNascimento != null && validDate(dataNascimento)) {
			if (historicoCampo("Dependente: Data de Nascimento",
					dependente.getDatNascimento() == null ? "" : comBarras.format(dependente.getDatNascimento()),
					comBarras.format(dataNascimento.getDateCellValue())))
				dependente.setDatNascimento(dataNascimento.getDateCellValue());
		}

		if (historicoCampo("Dependente: CPF", dependente.getNumCpf() == null ? "" : dependente.getNumCpf(),
				numCpf == null ? "" : getStringCellValue(numCpf)))
			dependente.setNumCpf(getStringCellValue(numCpf));

		if (historicoCampo("Dependente: Nome",
				dependente.getNomDependente() == null ? "" : dependente.getNomDependente(), nomeDependente == null ? ""
						: getStringCellValue(nomeDependente)))
			dependente.setNomDependente(getStringCellValue(nomeDependente));

		if (historicoCampo("Dependente: Sexo", dependente.getIndSexo() == null ? "" : dependente.getIndSexo(),
				sexo == null ? "" : getStringCellValue(sexo)))
			dependente.setIndSexo(getStringCellValue(sexo));

		if (historicoCampo("Dependente: Nome da mãe", dependente.getNomMae() == null ? "" : dependente.getNomMae(),
				nomeMae == null ? "" : getStringCellValue(nomeMae)))
			dependente.setNomMae(getStringCellValue(nomeMae));

		if (historicoCampo("Dependente: RG", dependente.getNumRg() == null ? "" : dependente.getNumRg(),
				rg == null ? "" : getStringCellValue(rg)))
			dependente.setNumRg(getStringCellValue(rg));

		if (dataExpedicao != null && validDate(dataExpedicao)) {
			if (historicoCampo("Dependente: Data de Emissão",
					dependente.getDatEmissaoRg() == null ? "" : comBarras.format(dependente.getDatEmissaoRg()),
					comBarras.format(dataExpedicao.getDateCellValue())))
				dependente.setDatEmissaoRg(dataExpedicao.getDateCellValue());
		}

		if (historicoCampo("Dependente: Órgão Expedidor",
				dependente.getNomOrgaoExpeditor() == null ? "" : dependente.getNomOrgaoExpeditor(),
				orgaoExpedidor == null ? "" : getStringCellValue(orgaoExpedidor)))
			dependente.setNomOrgaoExpeditor(getStringCellValue(orgaoExpedidor));

		if (historicoCampo("Dependente: UF-RG", dependente.getCodUf() == null ? "" : dependente.getCodUf()
				.getDesSigla(), ufRg == null ? "" : getStringCellValue(ufRg)))
			dependente.setCodUf(getUf(getStringCellValue(ufRg)));

		if (historicoCampo("Dependente: Numero da Certidão", dependente.getNumCertidaoNasc() == null ? "" : dependente
				.getNumCertidaoNasc().toString(),
				numeroCertidao == null ? "" : getCertidao(getStringCellValue(numeroCertidao)).toString()))
			dependente.setNumCertidaoNasc(getCertidao(getStringCellValue(numeroCertidao)));

		if (historicoCampo("Dependente: Livro",
				dependente.getDesLivroCertidao() == null ? "" : dependente.getDesLivroCertidao(), livro == null ? ""
						: getStringCellValue(livro)))
			dependente.setDesLivroCertidao(getStringCellValue(livro));

		if (historicoCampo("Dependente: Folha",
				dependente.getNumFolhaLivroCertidao() == null ? "" : dependente.getNumFolhaLivroCertidao(),
				folha == null ? "" : getStringCellValue(folha)))
			dependente.setNumFolhaLivroCertidao(getStringCellValue(folha));

		if (historicoCampo("Dependente: Nome do Cartório", dependente.getNomCartorioCertidao() == null ? ""
				: dependente.getNomCartorioCertidao().trim(), nomeCartorio == null ? "" : getStringCellValue(nomeCartorio).trim()))
			dependente.setNomCartorioCertidao(getStringCellValue(nomeCartorio));
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

	private void iniciaSincronizacao() {
		Calendar dataHoraInicio = Calendar.getInstance(tz, ptBr);
		sincronizacao.setDataHoraInicio(dataHoraInicio.getTime());
		sincronizacao.setStatus(Sincronizacao.STATUS_ANDAMENTO);
		sincronizacao.setEmailUsuario(pessoaEmail.getPessoaContatoEmail().getTxtContato());
		sincronizacao.setTipo(TipoSincronizacaoEnum.ARQUIVO.getChave());
		sincronizacaoManager.salvar(sincronizacao);
	}

	private void atualizaSincronizacao() {
		sincronizacao.setHistoricos(historicos);
		sincronizacao = sincronizacaoManager.salvar(sincronizacao);
		sincronizacao = sincronizacaoManager.recuperarPorId(sincronizacao.getId());
		historicos = sincronizacao.getHistoricos();
	}

	private void finalizaSincronizacao() {
		Calendar dataHoraFim = Calendar.getInstance(tz, ptBr);
		sincronizacao.setDataHoraFim(dataHoraFim.getTime());

		if (ressalva)
			sincronizacao.setStatus(Sincronizacao.STATUS_CONCLUIDO_COM_RESSALVA);
		else
			sincronizacao.setStatus(Sincronizacao.STATUS_SUCESSO);

		sincronizacaoManager.salvar(sincronizacao);
		enviarEmail();
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Long getEstabilidade(Cell estabilidade) {
		if (getStringCellValue(estabilidade).equalsIgnoreCase("ESTAVEL"))
			return new Long(1);
		else
			return new Long(0);
	}

	private Uf getUf(String nomeUf) {
		return ufManager.consultarUfPorSigla(nomeUf);
	}

	private Long getCertidao(String stringCellValue) {
		return new Long(stringCellValue.substring(0, 10));
	}

	private String notNull(Cell cell) {
		if (cell == null)
			return "";
		else
			return getStringCellValue(cell);
	}

	private String getStringCellValue(Cell cell) {
		if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
			return cell.getStringCellValue();
		} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			return new BigDecimal(cell.getNumericCellValue()).toString();
		} else {
			return null;
		}
	}

	private Boolean validDate(Cell cell) {
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
		Integer year = new Integer(yearFormat.format(cell.getDateCellValue()));
		if (year > 1900)
			return true;
		else
			return false;
	}
}