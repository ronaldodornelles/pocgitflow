package br.gov.iphan.sisgep.entity;

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
 * Classe de persisténcia para a tabela do banco de dados GPT_AFASTAMENTO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_AFASTAMENTO")
@Name("afastamento")
@NamedQueries({
    @NamedQuery(name="afastamento.findByServidor", query="SELECT object(o) FROM Afastamento o " +
    		"WHERE o.servidor.id = :id")
})
public class Afastamento extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_AFASTAMENTO", unique=true, nullable=false)
	private Long id;

    @Temporal(TemporalType.TIMESTAMP)
	@Column(name="DTA_FIM_AFASTAMENTO", nullable=false)
	private Date datFimAfastamento;

    @Temporal(TemporalType.TIMESTAMP)
	@Column(name="DTA_INICIO_AFASTMENTO", nullable=false)
	private Date datInicioAfastmento;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="DTA_PUBLICACAO_DOC")
	private Date datPublicacaoDoc;

	@Column(name="IND_DOC_LEGAL", length=6)
	private Long indDocLegal;

	@Column(name="NUM_DOC_LEGAL")
	private Long numDocLegal;

	@Column(name="OBS_AFASTAMENTO", length=250)
	private String obsAfastamento;

	//bi-directional many-to-one association to Servidor
    @ManyToOne
	@JoinColumn(name="COD_SERVIDOR", nullable=false)
	private Servidor servidor;

	//bi-directional many-to-one association to RegistroAfastamento
    @ManyToOne
	@JoinColumn(name="COD_REGISTRO_AFASTAMENTO", nullable=false)
	private RegistroAfastamento registroAfastamento;

    public Afastamento() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDatFimAfastamento() {
		return datFimAfastamento;
	}

	public void setDatFimAfastamento(Date datFimAfastamento) {
		this.datFimAfastamento = datFimAfastamento;
	}

	public Date getDatInicioAfastmento() {
		return datInicioAfastmento;
	}

	public void setDatInicioAfastmento(Date datInicioAfastmento) {
		this.datInicioAfastmento = datInicioAfastmento;
	}

	public Date getDatPublicacaoDoc() {
		return datPublicacaoDoc;
	}

	public void setDatPublicacaoDoc(Date datPublicacaoDoc) {
		this.datPublicacaoDoc = datPublicacaoDoc;
	}

	public Long getIndDocLegal() {
		return this.indDocLegal;
	}

	public void setIndDocLegal(Long indDocLegal) {
		this.indDocLegal = indDocLegal;
	}

	public Long getNumDocLegal() {
		return this.numDocLegal;
	}

	public void setNumDocLegal(Long numDocLegal) {
		this.numDocLegal = numDocLegal;
	}

	public Servidor getServidor() {
		return this.servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}
	
	public RegistroAfastamento getRegistroAfastamento() {
		return this.registroAfastamento;
	}

	public void setRegistroAfastamento(RegistroAfastamento registroAfastamento) {
		this.registroAfastamento = registroAfastamento;
	}

	public String getObsAfastamento() {
		return obsAfastamento;
	}

	public void setObsAfastamento(String obsAfastamento) {
		this.obsAfastamento = removerCaracteresEsp(obsAfastamento);
	}
		
}