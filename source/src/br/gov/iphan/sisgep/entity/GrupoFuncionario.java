package br.gov.iphan.sisgep.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;


/**
 * Classe de persisténcia para a tabela do banco de dados GPT_TX_GRUPO_FUNCIONARIO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_TX_GRUPO_FUNCIONARIO")
@Name("grupoFuncionario")
@NamedQueries({
    @NamedQuery(name="grupoFuncionario.findByNivel", query="SELECT Object(o) FROM GrupoFuncionario o WHERE o.nivelCargoFuncionario.id = :codNivel")
})
public class GrupoFuncionario extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_GRUPO_FUNCIONARIO", unique=true, nullable=false)
	private Long id;
	
	@Column(name="COD_SIAPE_GRUPO_FUNC", nullable=false, precision=6)
	private Long codSiapeGrupoFunc;

	@Column(name="TXT_DESCRICAO", nullable=false, length=50)
	private String txtDescricao;


	//bi-directional many-to-one association to CargoFuncionario
	@OneToMany(mappedBy="grupoFuncionario")
	private List<CargoFuncionario> cargoFuncionarios;

	//bi-directional many-to-one association to NivelCargoFuncionario
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name="COD_NIVEL_CARGO_FUNC")
	private NivelCargoFuncionario nivelCargoFuncionario;

    public GrupoFuncionario() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTxtDescricao() {
		return this.txtDescricao;
	}

	public void setTxtDescricao(String txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public Long getCodSiapeGrupoFunc() {
		return codSiapeGrupoFunc;
	}

	public void setCodSiapeGrupoFunc(Long codSiapeGrupoFunc) {
		this.codSiapeGrupoFunc = codSiapeGrupoFunc;
	}

	public List<CargoFuncionario> getCargoFuncionarios() {
		return cargoFuncionarios;
	}

	public void setCargoFuncionarios(List<CargoFuncionario> cargoFuncionarios) {
		this.cargoFuncionarios = cargoFuncionarios;
	}

	public NivelCargoFuncionario getNivelCargoFuncionario() {
		return nivelCargoFuncionario;
	}

	public void setNivelCargoFuncionario(NivelCargoFuncionario nivelCargoFuncionario) {
		this.nivelCargoFuncionario = nivelCargoFuncionario;
	}
	
}