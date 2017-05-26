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
 * Classe de persisténcia para a tabela do banco de dados GPT_TX_CARGO_FUNCIONARIO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_TX_CARGO_FUNCIONARIO")
@Name("cargoFuncionario")
@NamedQueries({
    @NamedQuery(name="cargoFuncionario.findByGrupo", query="SELECT Object(o) FROM CargoFuncionario o WHERE o.grupoFuncionario.id = :codGrupo")
})
public class CargoFuncionario extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_CARGO_FUNCIONARIO", unique=true, nullable=false)
	private Long id;
	
	@Column(name="COD_SIAPE_CARGO", nullable=false, precision=6)
	private Long codSiapeCargo;

	@Column(name="TXT_DESCRICAO", nullable=false, length=50)
	private String txtDescricao;

	//bi-directional many-to-one association to CargoEfetivo
	@OneToMany(mappedBy="cargoFuncionario")
	private List<CargoEfetivo> cargoEfetivos;
	
	//bi-directional many-to-one association to GrupoFuncionario
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name="COD_GRUPO_FUNCIONARIO")
	private GrupoFuncionario grupoFuncionario;

    public CargoFuncionario() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getCodSiapeCargo() {
		return codSiapeCargo;
	}

	public void setCodSiapeCargo(Long codSiapeCargo) {
		this.codSiapeCargo = codSiapeCargo;
	}

	public String getTxtDescricao() {
		return this.txtDescricao;
	}

	public void setTxtDescricao(String txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public List<CargoEfetivo> getCargoEfetivos() {
		return cargoEfetivos;
	}

	public void setCargoEfetivos(List<CargoEfetivo> cargoEfetivos) {
		this.cargoEfetivos = cargoEfetivos;
	}

	public GrupoFuncionario getGrupoFuncionario() {
		return grupoFuncionario;
	}

	public void setGrupoFuncionario(GrupoFuncionario grupoFuncionario) {
		this.grupoFuncionario = grupoFuncionario;
	}
}