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
 * Classe de persisténcia para a tabela do banco de dados GPT_TX_CARGO_COMIS.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_CARGO_COMIS_FUNCAO")
@Name("cargoComissionado")
public class CargoComissionado extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_CARGO_COMIS_FUNCAO")
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DTA_EXONERACAO")
	private Date datExoneracao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DTA_EXERCICIO")
	private Date datExercicio;
		
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DTA_POSSE")
	private Date datPosse;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DTA_PUBLICACAO_DOC_EXO")
	private Date datPublicacaoDocExo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DTA_PUBLICACAO_DOC_NOM")
	private Date datPublicacaoDocNom;

	@Column(name="IND_DOC_LEGAL_EXO", length=6)
	private Long indDocLegalExo;

	@Column(name="IND_DOC_LEGAL_NOM", length=6)
	private Long indDocLegalNom;
	
	@Column(name="NUM_DOC_LEGAL_EXO")
	private Long numDocLegalExo;

	@Column(name="NUM_DOC_LEGAL_NOM")
	private Long numDocLegalNom;

	//bi-directional many-to-one association to TipoCargoComissinado
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="COD_CARGO_COMISSIONADO")
	private TipoCargoComissinado tipoCargoComissinado;

    public CargoComissionado() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDatExoneracao() {
		return datExoneracao;
	}

	public void setDatExoneracao(Date datExoneracao) {
		this.datExoneracao = datExoneracao;
	}

	public Date getDatPublicacaoDocExo() {
		return datPublicacaoDocExo;
	}

	public void setDatPublicacaoDocExo(Date datPublicacaoDocExo) {
		this.datPublicacaoDocExo = datPublicacaoDocExo;
	}

	public Date getDatPublicacaoDocNom() {
		return datPublicacaoDocNom;
	}

	public void setDatPublicacaoDocNom(Date datPublicacaoDocNom) {
		this.datPublicacaoDocNom = datPublicacaoDocNom;
	}
	
	public Date getDatExercicio() {
		return datExercicio;
	}

	public void setDatExercicio(Date datExercicio) {
		this.datExercicio = datExercicio;
	}
	
	public Date getDatPosse() {
		return datPosse;
	}

	public void setDatPosse(Date datPosse) {
		this.datPosse = datPosse;
	}

	public Long getIndDocLegalExo() {
		return this.indDocLegalExo;
	}

	public void setIndDocLegalExo(Long indDocLegalExo) {
		this.indDocLegalExo = indDocLegalExo;
	}

	public Long getIndDocLegalNom() {
		return this.indDocLegalNom;
	}

	public void setIndDocLegalNom(Long indDocLegalNom) {
		this.indDocLegalNom = indDocLegalNom;
	}

	public Long getNumDocLegalExo() {
		return numDocLegalExo;
	}

	public Long getNumDocLegalNom() {
		return numDocLegalNom;
	}

	public TipoCargoComissinado getTipoCargoComissinado() {
		return tipoCargoComissinado;
	}

	public void setTipoCargoComissinado(TipoCargoComissinado tipoCargoComissinado) {
		this.tipoCargoComissinado = tipoCargoComissinado;
	}

	public void setNumDocLegalExo(Long numDocLegalExo) {
		this.numDocLegalExo = numDocLegalExo;
	}

	public void setNumDocLegalNom(Long numDocLegalNom) {
		this.numDocLegalNom = numDocLegalNom;
	}

}