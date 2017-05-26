package br.gov.iphan.sisgep.entity;

import java.util.Date;

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
 * Classe de persisténcia para a tabela do banco de dados GPT_FORMA_INGRESSO_APOSENTACAO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_FORMA_INGRESSO_APOSE")
@Name("formaIngressoAposentacao")
public class FormaIngressoAposentacao extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_FORMA_INGRESSO_APOS", unique=true, nullable=false)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DTA_PUBLICACAO_DOC")
	private Date datPublicacaoDoc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DTA_INGRESSO_APOS")
	private Date datIngressoApos;

	@Column(name="IND_DOC_LEGAL", length=6)
	private Long indDocLegal;

	@Column(name="NUM_DOC_LEGAL", length=20)
	private Long numDocLegal;
	
	@Column(name="OBS_FORMA_PASSAGEM_SERV", length=250)
	private String obsFormaPassagemServ;

	//bi-directional many-to-one association to GptFormaPassagemServ
    @ManyToOne
	@JoinColumn(name="COD_FORM_PASSAGEM_SERV")
	private FormaPassagemServ formaPassagemServ;

    public FormaIngressoAposentacao() {
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

	public Date getDatIngressoApos() {
		return datIngressoApos;
	}

	public void setDatIngressoApos(Date datIngressoApos) {
		this.datIngressoApos = datIngressoApos;
	}

	public Long getIndDocLegal() {
		return indDocLegal;
	}

	public void setIndDocLegal(Long indDocLegal) {
		this.indDocLegal = indDocLegal;
	}

	public Long getNumDocLegal() {
		return numDocLegal;
	}

	public void setNumDocLegal(Long numDocLegal) {
		this.numDocLegal = numDocLegal;
	}

	public String getObsFormaPassagemServ() {
		return obsFormaPassagemServ;
	}

	public void setObsFormaPassagemServ(String obsFormaPassagemServ) {
		this.obsFormaPassagemServ = removerCaracteresEsp(obsFormaPassagemServ);
	}

	public FormaPassagemServ getFormaPassagemServ() {
		return formaPassagemServ;
	}

	public void setFormaPassagemServ(FormaPassagemServ formaPassagemServ) {
		this.formaPassagemServ = formaPassagemServ;
	}
}