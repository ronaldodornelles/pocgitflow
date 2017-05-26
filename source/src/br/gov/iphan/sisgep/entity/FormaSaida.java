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
 * Classe de persisténcia para a tabela do banco de dados GPT_TX_FORMA_SAIDA.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_FORMA_SAIDA")
@Name("formaSaida")
public class FormaSaida extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_FORMA_SAIDA", unique=true, nullable=false)
	private Long id;

	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="DTA_PUBLICACAO_DOC")
	private Date datPublicacaoDoc;

	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="DTA_SAIDA")
	private Date datSaida;

	@Column(name="IND_DOC_LEGAL", length=6)
	private Long indDocLegal;

	@Column(name="NUM_DOC_LEGAL", length=20)
	private Long numDocLegal;

	//bi-directional many-to-one association to GptFormaPassagemServ
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="COD_FORMA_SERVIDOR")
	private FormaPassagemServ formaPassagemServ;

    public FormaSaida() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDatPublicacaoDoc() {
		return datPublicacaoDoc;
	}

	public void setDatPublicacaoDoc(Date datPublicacaoDoc) {
		this.datPublicacaoDoc = datPublicacaoDoc;
	}

	public Date getDatSaida() {
		return datSaida;
	}

	public void setDatSaida(Date datSaida) {
		this.datSaida = datSaida;
	}

	public Long getIndDocLegal() {
		return indDocLegal;
	}

	public void setIndDocLegal(Long indDocLegal) {
		this.indDocLegal = indDocLegal;
	}

	public FormaPassagemServ getFormaPassagemServ() {
		return formaPassagemServ;
	}

	public void setFormaPassagemServ(FormaPassagemServ formaPassagemServ) {
		this.formaPassagemServ = formaPassagemServ;
	}

	public Long getNumDocLegal() {
		return numDocLegal;
	}

	public void setNumDocLegal(Long numDocLegal) {
		this.numDocLegal = numDocLegal;
	}
	
}