package br.gov.iphan.sisgep.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.anotation.Orderby;
import br.gov.iphan.sisgep.entity.corp.PessoaFisica;
import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;

/**
 * Classe de persisténcia para a tabela do banco de dados GPT_SERVIDOR.
 * Responsável também em relacionar os atributos desta classe com as colunas
 * referentes na tabela do banco de dados.
 * 
 * @author Thiago Nunes Vieira
 **/
@Entity
@Table(name = "GPT_SERVIDOR")
@Name("servidor")
@NamedQueries({ @NamedQuery(name = "servidor.verificarDuplicidade", query = "SELECT count(o) FROM Servidor o " + "WHERE o.numMatricula = :numMatricula"),
		@NamedQuery(name = "servidor.findByPessoa", query = "SELECT object(o) FROM Servidor o " + "WHERE o.pessoaFisica.id = :id") })
@Orderby(ordenacao = "numMatricula")
public class Servidor extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_SERVIDOR", unique = true, nullable = false)
	private Long id;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "COD_PESSOA_FISICA")
	private PessoaFisica pessoaFisica = new PessoaFisica();

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "COD_UNIDADE_ADM_EXERC")
	private UnidadeAdministrativa unidadeAdministrativaExce;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "COD_CARGO_COMIS_FUNCAO")
	private CargoComissionado cargoComissionado;

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "COD_UNIDADE_ADM_LOTACAO")
	private UnidadeAdministrativa unidadeAdmLotacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTA_PRIMEIRO_EMPREGO")
	private Date datPrimeiroEmprego;

	@Column(name = "IND_STATUS", precision = 1)
	private Long indStatus;

	@Column(name = "NUM_ID_UNICO_MATRICULA")
	private Long numIdUnicoMatricula;

	@Column(name = "NUM_JORNADA_TRABALHO", precision = 2)
	private Long numJornadaTrabalho;

	@Column(name = "NUM_MATRICULA", nullable = false, length = 7)
	private Long numMatricula;

	@Column(name = "TXT_OBSERV_SERV_PUB", length = 250)
	private String txtObservServPub;

	// bi-directional many-to-one association to GptAfastamento
	@OneToMany(mappedBy = "servidor", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Afastamento> afastamentos;

	// bi-directional many-to-one association to GptServidor
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "COD_CARGO_EFETIVO")
	private CargoEfetivo cargoEfetivo;

	// bi-directional many-to-one association to UnidadeAdministrativa
	@OneToMany(mappedBy = "servidor", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<UnidadeAdministrativa> uniAdministrativas;

	// bi-directional many-to-one association to GptDependente
	@OneToMany(mappedBy = "servidor", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private Set<Dependente> dependentes;

	@OneToMany(mappedBy = "servidor", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.EAGER)
	private Set<FormacaoAcademica> formacaoAcademicas;

	@OneToMany(mappedBy = "servidor", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private Set<CargoFuncao> cargoFuncao;

	// bi-directional many-to-one association to FormaIngresso
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "COD_FORMA_APOSENTACAO")
	private FormaIngressoAposentacao formaIngressoAposentacao3;

	// bi-directional many-to-one association to FormaIngresso
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "COD_FORMA_INGR_ORGAO")
	private FormaIngressoAposentacao formaIngressoAposentacao1;

	// bi-directional many-to-one association to FormaIngresso
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "COD_FORMA_INGR_SERV_PUB")
	private FormaIngressoAposentacao formaIngressoAposentacao2;

	// bi-directional many-to-one association to FormaSaida
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "COD_FORMA_SAIDA_ORGAO")
	private FormaSaida formaSaida;

	@ManyToOne
	@JoinColumn(name = "COD_SITUACAO_FUNCIONAL")
	private SituacaoFuncional situacaoFuncional;

	// bi-directional many-to-one association to CessaoRequisicao
	@OneToMany(mappedBy = "servidor", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private Set<CessaoRequisicao> cessaoRequisicaos;

    @Transient
	private Date datIngressoOrgaoInicio;

	@Transient
	private Date datIngressoOrgaoFim;

	@Transient
	private UnidadeAdministrativa unidadeAdministrativa;

	@Transient
	private String codSiape;

	@Transient
	private boolean status = false;
	
	@Transient
	private String cedido;
	
	@Transient
	private String cargos;
	
	@Transient
	private Long chefia;
	
	@Transient
	private boolean desabilitadoEquipePorSerAvaliado;
	
	@Transient
	private boolean desabilitadoEquipePorSerChefia;

	public Servidor() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public Long getIndStatus() {
		return indStatus;
	}

	public void setIndStatus(Long indStatus) {
		this.indStatus = indStatus;
	}

	public Long getNumJornadaTrabalho() {
		return this.numJornadaTrabalho;
	}

	public void setNumJornadaTrabalho(Long numJornadaTrabalho) {
		this.numJornadaTrabalho = numJornadaTrabalho;
	}

	public Long getNumMatricula() {
		return this.numMatricula;
	}

	public void setNumMatricula(Long numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getTxtObservServPub() {
		return this.txtObservServPub;
	}

	public void setTxtObservServPub(String txtObservServPub) {
		txtObservServPub = removerCaracteresEsp(txtObservServPub);
		this.txtObservServPub = txtObservServPub.toUpperCase();
	}

	public FormaIngressoAposentacao getFormaIngressoAposentacao3() {
		return formaIngressoAposentacao3;
	}

	public void setFormaIngressoAposentacao3(FormaIngressoAposentacao formaIngressoAposentacao3) {
		this.formaIngressoAposentacao3 = formaIngressoAposentacao3;
	}

	public FormaIngressoAposentacao getFormaIngressoAposentacao1() {
		return formaIngressoAposentacao1;
	}

	public void setFormaIngressoAposentacao1(FormaIngressoAposentacao formaIngressoAposentacao1) {
		this.formaIngressoAposentacao1 = formaIngressoAposentacao1;
	}

	public FormaIngressoAposentacao getFormaIngressoAposentacao2() {
		return formaIngressoAposentacao2;
	}

	public void setFormaIngressoAposentacao2(FormaIngressoAposentacao formaIngressoAposentacao2) {
		this.formaIngressoAposentacao2 = formaIngressoAposentacao2;
	}

	public SituacaoFuncional getSituacaoFuncional() {
		return situacaoFuncional;
	}

	public void setSituacaoFuncional(SituacaoFuncional situacaoFuncional) {
		this.situacaoFuncional = situacaoFuncional;
	}

	public UnidadeAdministrativa getUnidadeAdministrativaExce() {
		if (unidadeAdministrativaExce == null) {
			unidadeAdministrativaExce = new UnidadeAdministrativa();
		}
		return unidadeAdministrativaExce;
	}

	public void setUnidadeAdministrativaExce(UnidadeAdministrativa unidadeAdministrativaExce) {
		this.unidadeAdministrativaExce = unidadeAdministrativaExce;
	}

	public UnidadeAdministrativa getUnidadeAdmLotacao() {
		try {
			if (unidadeAdmLotacao == null) {
				unidadeAdmLotacao = new UnidadeAdministrativa();
				unidadeAdmLotacao.setNomUnidadeAdministrativa("");
			}
			if (unidadeAdmLotacao.getNomUnidadeAdministrativa() == null) {
				unidadeAdmLotacao.setNomUnidadeAdministrativa("");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return unidadeAdmLotacao;
	}

	public void setUnidadeAdmLotacao(UnidadeAdministrativa unidadeAdmLotacao) {
		this.unidadeAdmLotacao = unidadeAdmLotacao;
	}

	public Date getDatPrimeiroEmprego() {
		return datPrimeiroEmprego;
	}

	public void setDatPrimeiroEmprego(Date datPrimeiroEmprego) {
		this.datPrimeiroEmprego = datPrimeiroEmprego;
	}

	public Long getNumIdUnicoMatricula() {
		return numIdUnicoMatricula;
	}

	public void setNumIdUnicoMatricula(Long numIdUnicoMatricula) {
		this.numIdUnicoMatricula = numIdUnicoMatricula;
	}

	public List<Afastamento> getAfastamentos() {
		return afastamentos;
	}

	public void setAfastamentos(List<Afastamento> afastamentos) {
		this.afastamentos = afastamentos;
	}

	public CargoComissionado getCargoComissionado() {
		if (cargoComissionado == null) {
			cargoComissionado = new CargoComissionado();
		}
		return cargoComissionado;
	}

	public void setCargoComissionado(CargoComissionado cargoComissionado) {
		this.cargoComissionado = cargoComissionado;
	}

	public Set<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(Set<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public Set<FormacaoAcademica> getFormacaoAcademicas() {
/*
		if (formacaoAcademicas == null) {
			formacaoAcademicas = new HashSet<FormacaoAcademica>();
		}
*/
		return formacaoAcademicas;
	}

	public void setFormacaoAcademicas(Set<FormacaoAcademica> formacaoAcademicas) {
		this.formacaoAcademicas = formacaoAcademicas;
	}

	public FormaSaida getFormaSaida() {
		if (formaSaida == null) {
			formaSaida = new FormaSaida();
		}
		return formaSaida;
	}

	public void setFormaSaida(FormaSaida formaSaida) {
		this.formaSaida = formaSaida;
	}

	public CargoEfetivo getCargoEfetivo() {
		if (cargoEfetivo == null) {
			cargoEfetivo = new CargoEfetivo();
		}
		return cargoEfetivo;
	}

	public void setCargoEfetivo(CargoEfetivo cargoEfetivo) {
		this.cargoEfetivo = cargoEfetivo;
	}

	public Date getDatIngressoOrgaoInicio() {
		return datIngressoOrgaoInicio;
	}

	public void setDatIngressoOrgaoInicio(Date datIngressoOrgaoInicio) {
		this.datIngressoOrgaoInicio = datIngressoOrgaoInicio;
	}

	public Date getDatIngressoOrgaoFim() {
		return datIngressoOrgaoFim;
	}

	public void setDatIngressoOrgaoFim(Date datIngressoOrgaoFim) {
		this.datIngressoOrgaoFim = datIngressoOrgaoFim;
	}

	public Set<CessaoRequisicao> getCessaoRequisicaos() {
		return cessaoRequisicaos;
	}

	public void setCessaoRequisicaos(Set<CessaoRequisicao> cessaoRequisicaos) {
		this.cessaoRequisicaos = cessaoRequisicaos;
	}

	public UnidadeAdministrativa getUnidadeAdministrativa() {
		if (unidadeAdministrativa == null) {
			unidadeAdministrativa = new UnidadeAdministrativa();
		}
		return unidadeAdministrativa;
	}

	public void setUnidadeAdministrativa(UnidadeAdministrativa unidadeAdministrativa) {
		this.unidadeAdministrativa = unidadeAdministrativa;
	}

	public List<UnidadeAdministrativa> getUniAdministrativas() {
		return uniAdministrativas;
	}

	public void setUniAdministrativas(List<UnidadeAdministrativa> uniAdministrativas) {
		this.uniAdministrativas = uniAdministrativas;
	}

	public String getCodSiape() {
		return codSiape;
	}

	public void setCodSiape(String codSiape) {
		this.codSiape = codSiape;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Set<CargoFuncao> getCargoFuncao() {
		return cargoFuncao;
	}

	public void setCargoFuncao(Set<CargoFuncao> cargoFuncao) {
		this.cargoFuncao = cargoFuncao;
	}

	@SuppressWarnings("deprecation")
	public String getCedido() {
		Boolean isCedido = false;
		if (cessaoRequisicaos != null) {
			for (Iterator<CessaoRequisicao> iter = cessaoRequisicaos.iterator(); iter.hasNext();) {
				CessaoRequisicao cessaoRequisicao = iter.next();
				if (cessaoRequisicao.getIndPrazoIlimitado().equalsIgnoreCase("N")) {
					isCedido = true;
				} else {
					int ano = cessaoRequisicao.getDatCessaoRequisicao().getYear() + cessaoRequisicao.getNumPrazo().intValue();
					int mes = cessaoRequisicao.getDatCessaoRequisicao().getMonth();
					int dia = cessaoRequisicao.getDatCessaoRequisicao().getDate();
					
					Date dataLimite = new Date(ano, mes, dia);
					
					if (dataLimite.after(new Date(Calendar.getInstance().getTimeInMillis()))) {
						isCedido = true;
					}
				}
			}
		}
		return isCedido?"Sim":"Não";
	}

	public void setCedido(String cedido) {
		this.cedido = cedido;
	}

	public String getCargos() {
		if (cargoFuncao != null) {
			Boolean first = true;
			for (Iterator<CargoFuncao> iter = cargoFuncao.iterator(); iter.hasNext();) {
				CargoFuncao cargoFuncao = iter.next();
				if (cargoFuncao.getCargoEfetivo() != null) {
					if (first) {
						cargos = cargoFuncao.getCargoEfetivo().getCargoFuncionario().getTxtDescricao();
						first = false;
					} else {
						cargos+= ", " + cargoFuncao.getCargoEfetivo().getCargoFuncionario().getTxtDescricao();
					}
				}
				if (cargoFuncao.getCargoComissionado() != null) {
					if (first) {
						cargos = cargoFuncao.getCargoComissionado().getTipoCargoComissinado().getTxtDescricao();
						first = false;
					} else {
						cargos+= ", " + cargoFuncao.getCargoComissionado().getTipoCargoComissinado().getTxtDescricao();
					}
				}
			}
		}
		
		return cargos;
	}

	public void setCargos(String cargos) {
		this.cargos = cargos;
	}

	public Long getChefia() {
		return chefia;
	}

	public void setChefia(Long chefia) {
		this.chefia = chefia;
	}

	public boolean isDesabilitadoEquipePorSerAvaliado() {
		return desabilitadoEquipePorSerAvaliado;
	}

	public void setDesabilitadoEquipePorSerAvaliado(
			boolean desabilitadoEquipePorSerAvaliado) {
		this.desabilitadoEquipePorSerAvaliado = desabilitadoEquipePorSerAvaliado;
	}

	public boolean isDesabilitadoEquipePorSerChefia() {
		return desabilitadoEquipePorSerChefia;
	}

	public void setDesabilitadoEquipePorSerChefia(
			boolean desabilitadoEquipePorSerChefia) {
		this.desabilitadoEquipePorSerChefia = desabilitadoEquipePorSerChefia;
	}
	
}