package br.gov.iphan.sisgep.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;


/**
 * Classe de persisténcia para a tabela do banco de dados GPT_INSTITUICAO_ENSINO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_INSTITUICAO_ENSINO")
@Name("instituicaoEnsino")
public class InstituicaoEnsino extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_INSTITUICAO_ENSINO", nullable=false)
	private Long id;

	@Column(name="DES_INSTITUICAO_ENSINO", length=250)
	private String desInstituicaoEnsino;

	@Column(name="NOM_INSTITUICAO_ENSINO", length=150)
	private String nomInstituicaoEnsino;

	@Column(name="SIG_INSTITUICAO_ENSINO", length=20)
	private String sigInstituicaoEnsino;
	
	@Column(name="TXT_EMAIL_CONTATO", length=150)
	private String txtEmailContato;

	@Column(name="TXT_TELEFONE_CONTATO", length=12)
	private String txtTelefoneContato;

	//bi-directional many-to-one association to FormacaoAcademica
	@OneToMany(mappedBy="instituicaoEnsino")
	private List<FormacaoAcademica> formacaoAcademicas;

    public InstituicaoEnsino() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesInstituicaoEnsino() {
		return this.desInstituicaoEnsino;
	}

	public void setDesInstituicaoEnsino(String desInstituicaoEnsino) {
		desInstituicaoEnsino = removerCaracteresEsp(desInstituicaoEnsino);
		this.desInstituicaoEnsino = desInstituicaoEnsino;
	}

	public String getNomInstituicaoEnsino() {
		return this.nomInstituicaoEnsino;
	}

	public void setNomInstituicaoEnsino(String nomInstituicaoEnsino) {
		nomInstituicaoEnsino = removerCaracteresEsp(nomInstituicaoEnsino);
		this.nomInstituicaoEnsino = nomInstituicaoEnsino;
	}

	public String getSigInstituicaoEnsino() {
		return this.sigInstituicaoEnsino;
	}

	public void setSigInstituicaoEnsino(String sigInstituicaoEnsino) {
		sigInstituicaoEnsino = removerCaracteresEsp(sigInstituicaoEnsino);
		this.sigInstituicaoEnsino = sigInstituicaoEnsino;
	}
	
	public String getTxtEmailContato() {
		return txtEmailContato;
	}

	public void setTxtEmailContato(String txtEmailContato) {
		this.txtEmailContato = txtEmailContato;
	}

	public String getTxtTelefoneContato() {
		return txtTelefoneContato;
	}

	public void setTxtTelefoneContato(String txtTelefoneContato) {
		this.txtTelefoneContato = txtTelefoneContato;
	}

	public List<FormacaoAcademica> getFormacaoAcademicas() {
		return formacaoAcademicas;
	}

	public void setFormacaoAcademicas(List<FormacaoAcademica> formacaoAcademicas) {
		this.formacaoAcademicas = formacaoAcademicas;
	}
	
}