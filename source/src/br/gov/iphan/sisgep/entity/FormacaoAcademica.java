package br.gov.iphan.sisgep.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.corp.Municipio;

/**
 * Classe de persisténcia para a tabela do banco de dados
 * GPT_FORMACAO_ACADEMICA. Responsável também em relacionar os atributos desta
 * classe com as colunas referentes na tabela do banco de dados.
 * 
 * @author Thiago Nunes Vieira
 **/
@Entity
@Table(name = "GPT_FORMACAO_ACADEMICA")
@Name("formacaoAcademica")
public class FormacaoAcademica extends EntidadeAbstrata implements Serializable, EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_FORMACAO_ACADEMICA", nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "COD_MUNICIPIO")
	private Municipio codMunicipio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTA_CONCLUSAO_CURSO")
	private Date datConclusaoCurso;

	@Column(name = "IND_CURSANDO", length = 1)
	private Long indCursando;

	@Column(name = "IND_TIPO_FORMACAO", length = 1)
	private Long indTipoFormacao;

	@Column(name = "NOM_CURSO", length = 150)
	private String nomCurso;

	@Column(name = "NUM_CARGA_HORARIA", length = 3)
	private Long numCargaHoraria;

	// bi-directional many-to-one association to GptServidor
	@ManyToOne
	@JoinColumn(name = "COD_SERVIDOR", nullable = false)
	private Servidor servidor;

	// bi-directional many-to-one association to InstituicaoEnsino
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinColumn(name = "COD_INSTITUICAO_ENSINO")
	private InstituicaoEnsino instituicaoEnsino;

	public FormacaoAcademica() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Municipio getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Municipio codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public Date getDatConclusaoCurso() {
		return datConclusaoCurso;
	}

	public void setDatConclusaoCurso(Date datConclusaoCurso) {
		this.datConclusaoCurso = datConclusaoCurso;
	}

	public Long getIndCursando() {
		return indCursando;
	}

	public void setIndCursando(Long indCursando) {
		this.indCursando = indCursando;
	}

	public Long getIndTipoFormacao() {
		return indTipoFormacao;
	}

	public void setIndTipoFormacao(Long indTipoFormacao) {
		this.indTipoFormacao = indTipoFormacao;
	}

	public void setNumCargaHoraria(Long numCargaHoraria) {
		this.numCargaHoraria = numCargaHoraria;
	}

	public String getNomCurso() {
		return this.nomCurso;
	}

	public void setNomCurso(String nomCurso) {
		nomCurso = removerCaracteresEsp(nomCurso);
		this.nomCurso = nomCurso;
	}

	public Long getNumCargaHoraria() {
		return numCargaHoraria;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public InstituicaoEnsino getInstituicaoEnsino() {
		return instituicaoEnsino;
	}

	public void setInstituicaoEnsino(InstituicaoEnsino instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}

}