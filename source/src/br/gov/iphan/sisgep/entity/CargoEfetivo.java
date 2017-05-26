package br.gov.iphan.sisgep.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.jboss.seam.annotations.Name;


/**
 * Classe de persisténcia para a tabela do banco de dados GPT_CARGO_EFETIVO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_CARGO_EFETIVO")
@Name("cargoEfetivo")
public class CargoEfetivo extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_CARGO_EFETIVO", unique=true, nullable=false)
	private Long id;

	@Column(name="COD_VAGA", precision=6)
	private Long codVaga;
	
	@Column(name="TIP_GRATIFICACAO")
	private String indGratificacao;
	
	@Column(name="DES_GRATIFICACAO")
	private String desGratificacao;
	
	@Column(name = "IND_ESTAVEL", precision = 1)
	private Long indEstavel;
	
	//bi-directional many-to-one association to GptAreaAtuacao
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="COD_AREA_ATUACAO")
	private AreaAtuacao areaAtuacao;
    
  //bi-directional many-to-one association to Cbo
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="COD_CBO")
    private Cbo cbo;

	//bi-directional many-to-one association to CargoFuncionario
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="COD_CARGO_FUNCIONARIO")
	private CargoFuncionario cargoFuncionario;
    
	//bi-directional many-to-one association to GptTxOcupacao
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="COD_OCUPACAO")
	private Ocupacao ocupacao;
    
	//bi-directional many-to-one association to PadraoCargo
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="COD_PADRAO_CARGO")
	private PadraoCargo padraoCargo;
        
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTA_POSSE")
	private Date datPosse;
    
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTA_EXERCICIO")
	private Date datExercicio;

    public CargoEfetivo() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodVaga() {
		return this.codVaga;
	}

	public void setCodVaga(Long codVaga) {
		this.codVaga = codVaga;
	}

	public CargoFuncionario getCargoFuncionario() {
		return cargoFuncionario;
	}

	public void setCargoFuncionario(CargoFuncionario cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}

	public PadraoCargo getPadraoCargo() {
		return padraoCargo;
	}

	public void setPadraoCargo(PadraoCargo padraoCargo) {
		this.padraoCargo = padraoCargo;
	}

	public String getIndGratificacao() {
		return indGratificacao;
	}

	public void setIndGratificacao(String indGratificacao) {
		this.indGratificacao = indGratificacao;
	}

	public AreaAtuacao getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public Ocupacao getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
	}

	public String getDesGratificacao() {
		return desGratificacao;
	}

	public void setDesGratificacao(String desGratificacao) {
		this.desGratificacao = desGratificacao;
	}

	public Long getIndEstavel() {
		return indEstavel;
	}

	public void setIndEstavel(Long indEstavel) {
		this.indEstavel = indEstavel;
	}

	public Date getDatPosse() {
		return datPosse;
	}

	public void setDatPosse(Date datPosse) {
		this.datPosse = datPosse;
	}

	public Date getDatExercicio() {
		return datExercicio;
	}

	public void setDatExercicio(Date datExercicio) {
		this.datExercicio = datExercicio;
	}

	public Cbo getCbo() {
		return cbo;
	}

	public void setCbo(Cbo cbo) {
		this.cbo = cbo;
	}

}