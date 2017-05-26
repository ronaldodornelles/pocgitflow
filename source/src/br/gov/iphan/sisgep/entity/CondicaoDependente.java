package br.gov.iphan.sisgep.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;


/**
 * Classe de persisténcia para a tabela do banco de dados GPT_CONDICAO_DEPENDENTE.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_CONDICAO_DEPENDENTE")
@Name("condicaoDependente")
public class CondicaoDependente extends EntidadeAbstrata implements Serializable, EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_CONDICAO_DEPENDENTE", nullable=false)
	private Long id;

	@Column(name="COD_SIAPE_COND_DEPENDENTE", length=3, nullable=false)
	private Long codSiapeCondDependente;

	@Column(name="DES_CONDICAO_DEPENDENTE", length=150, nullable=false)
	private String desCondicaoDependente;

	//bi-directional many-to-one association to GptDependente
	@OneToMany(mappedBy="condicaoDependente", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private List<Dependente> dependentes;

    public CondicaoDependente() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodSiapeCondDependente() {
		return this.codSiapeCondDependente;
	}

	public void setCodSiapeCondDependente(Long codSiapeCondDependente) {
		this.codSiapeCondDependente = codSiapeCondDependente;
	}

	public String getDesCondicaoDependente() {
		return this.desCondicaoDependente;
	}

	public void setDesCondicaoDependente(String desCondicaoDependente) {
		desCondicaoDependente = removerCaracteresEsp(desCondicaoDependente);
		this.desCondicaoDependente = desCondicaoDependente;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	
}