package br.gov.iphan.sisgep.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;


/**
 * Classe de persisténcia para a tabela do banco de dados GPT_TX_OCUPACAO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_FIM_DEPENDENTE")
@Name("fimDependente")
public class FimDependente extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_FIM_DEPENDENTE", nullable = false)
	private Long id;

	@Column(name="COD_SIAPE_FIM_DEPEND", nullable = false, length=3)
	private Long codSiapeFimDepend;

	@Column(name="DES_FIM_DEPENDENTE", nullable = false, length=150)
	private String desFimDependente;

	//bi-directional many-to-many association to Dependente
//    @ManyToMany
//	@JoinTable(
//		name="GPT_DEPENDENTE_X_GPT_FIM_DEPEN"
//		, joinColumns={
//			@JoinColumn(name="COD_FIM_DEPENDENTE", nullable=false)
//			}
//		, inverseJoinColumns={
//			@JoinColumn(name="COD_DEPENDENTE", nullable=false)
//			}
//		)
	@ManyToMany(mappedBy="fimDependentes", cascade=CascadeType.ALL)
	private List<Dependente> dependentes;

    public FimDependente() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodSiapeFimDepend() {
		return codSiapeFimDepend;
	}

	public void setCodSiapeFimDepend(Long codSiapeFimDepend) {
		this.codSiapeFimDepend = codSiapeFimDepend;
	}

	public String getDesFimDependente() {
		return this.desFimDependente;
	}

	public void setDesFimDependente(String desFimDependente) {
		desFimDependente = removerCaracteresEsp(desFimDependente);
		this.desFimDependente = desFimDependente;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof FimDependente)) {
			return false;
		}
		FimDependente other = (FimDependente) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	
}