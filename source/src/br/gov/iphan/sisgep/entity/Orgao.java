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
 * Classe de persisténcia para a tabela do banco de dados GPT_ORGAO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_ORGAO")
@Name("orgao")
public class Orgao extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_ORGAO", unique=true, nullable=false)
	private Long id;

	@Column(name="COD_SIAPE_ORGAO", nullable=false, precision=6)
	private Long codSiapeOrgao;

	@Column(name="NOM_ORGAO", nullable=false, length=130)
	private String nomOrgao;

	@Column(name="SG_ORGAO", nullable=false, length=20)
	private String sgOrgao;

	//bi-directional many-to-one association to CessaoRequisicao
	@OneToMany(mappedBy="orgao")
	private List<CessaoRequisicao> cessaoRequisicaos;

    public Orgao() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodSiapeOrgao() {
		return this.codSiapeOrgao;
	}

	public void setCodSiapeOrgao(Long codSiapeOrgao) {
		this.codSiapeOrgao = codSiapeOrgao;
	}

	public String getNomOrgao() {
		return this.nomOrgao;
	}

	public void setNomOrgao(String nomOrgao) {
		this.nomOrgao = nomOrgao;
	}

	public String getSgOrgao() {
		return this.sgOrgao;
	}

	public void setSgOrgao(String sgOrgao) {
		this.sgOrgao = sgOrgao;
	}

	public List<CessaoRequisicao> getCessaoRequisicaos() {
		return cessaoRequisicaos;
	}

	public void setCessaoRequisicaos(List<CessaoRequisicao> cessaoRequisicaos) {
		this.cessaoRequisicaos = cessaoRequisicaos;
	}
	
}