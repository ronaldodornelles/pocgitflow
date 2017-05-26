package br.gov.iphan.sisgep.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.jboss.seam.annotations.Name;


/**
 * Classe de persisténcia para a tabela do banco de dados GPT_CESSAO_REQUISICAO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_CESSAO_REQUISICAO")
@Name("cessaoRequisicao")
@NamedQueries({
    @NamedQuery(name="cessaoRequisicao.findByServidor", query="SELECT object(o) FROM CessaoRequisicao o " +
    		"WHERE o.servidor.id = :id")
})
public class CessaoRequisicao extends EntidadeAbstrata implements Serializable, EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_CESSAO_REQUISICAO", unique=true, nullable=false)
	private Long id;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="DTA_CESSAO_REQUISICAO")
	private Date datCessaoRequisicao;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="DTA_PUBILCACAO_DOC")
	private Date datPubilcacaoDoc;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="DTA_RENOVACAO")
	private Date datRenovacao;

	@Column(name="IND_DOC_LEGAL")
	private Long indDocLegal;

	@Column(name="IND_ONUS")
	private String indOnus;

	@Column(name="IND_PRAZO_ILIMITADO")
	private String indPrazoIlimitado;

	@Column(name="IND_TIPO_CESSAO_REQ")
	private String indTipoCessaoReq;

	@Column(name="NUM_DOC_LEGAL")
	private Long numDocLegal;

	@Column(name="NUM_PRAZO")
	private Long numPrazo;

	@Column(name="OBS_CESSAO_REQUISICAO")
	private String obsCessaoRequisicao;

	//bi-directional many-to-one association to Orgao
    @ManyToOne
	@JoinColumn(name="COD_ORGAO")
	private Orgao orgao;

	//bi-directional many-to-one association to Servidor
    @ManyToOne
	@JoinColumn(name="COD_SERVIDOR")
	private Servidor servidor;

    public CessaoRequisicao() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDatCessaoRequisicao() {
		return this.datCessaoRequisicao;
	}

	public void setDatCessaoRequisicao(Date datCessaoRequisicao) {
		this.datCessaoRequisicao = datCessaoRequisicao;
	}

	public Date getDatPubilcacaoDoc() {
		return this.datPubilcacaoDoc;
	}

	public void setDatPubilcacaoDoc(Date datPubilcacaoDoc) {
		this.datPubilcacaoDoc = datPubilcacaoDoc;
	}

	public Date getDatRenovacao() {
		return this.datRenovacao;
	}

	public void setDatRenovacao(Date datRenovacao) {
		this.datRenovacao = datRenovacao;
	}

	public Long getIndDocLegal() {
		return this.indDocLegal;
	}

	public void setIndDocLegal(Long indDocLegal) {
		this.indDocLegal = indDocLegal;
	}

	public String getIndOnus() {
		return this.indOnus;
	}

	public void setIndOnus(String indOnus) {
		this.indOnus = indOnus;
	}

	public String getIndPrazoIlimitado() {
		return this.indPrazoIlimitado;
	}

	public void setIndPrazoIlimitado(String indPrazoIlimitado) {
		this.indPrazoIlimitado = indPrazoIlimitado;
	}

	public String getIndTipoCessaoReq() {
		return this.indTipoCessaoReq;
	}

	public void setIndTipoCessaoReq(String indTipoCessaoReq) {
		this.indTipoCessaoReq = indTipoCessaoReq;
	}

	public Long getNumDocLegal() {
		return this.numDocLegal;
	}

	public void setNumDocLegal(Long numDocLegal) {
		this.numDocLegal = numDocLegal;
	}

	public Long getNumPrazo() {
		return this.numPrazo;
	}

	public void setNumPrazo(Long numPrazo) {
		this.numPrazo = numPrazo;
	}

	public String getObsCessaoRequisicao() {
		return this.obsCessaoRequisicao;
	}

	public void setObsCessaoRequisicao(String obsCessaoRequisicao) {
		this.obsCessaoRequisicao = removerCaracteresEsp(obsCessaoRequisicao);
	}

	public Orgao getOrgao() {
		return orgao;
	}

	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}
	
}