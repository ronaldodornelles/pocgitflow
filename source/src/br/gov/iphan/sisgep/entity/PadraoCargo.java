package br.gov.iphan.sisgep.entity;

import java.util.List;

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
 * Classe de persisténcia para a tabela do banco de dados GPT_TX_PADRAO_CARGO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_TX_PADRAO_CARGO")
@Name("padraoCargo")
@NamedQueries({
    @NamedQuery(name="padraoCargo.findByClasse", query="SELECT Object(o) FROM PadraoCargo o WHERE o.classeFuncionario.id = :codClasse")
})
public class PadraoCargo extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_PADRAO_CARGO", unique=true, nullable=false)
	private Long id;

	@Column(name="TXT_DESCRICAO", nullable=false, length=50)
	private String txtDescricao;

	//bi-directional many-to-one association to CargoEfetivo
	@OneToMany(mappedBy="padraoCargo")
	private List<CargoEfetivo> cargoEfetivos;
	
	//bi-directional many-to-one association to ClasseFuncionario
    @ManyToOne
	@JoinColumn(name="COD_CLASSE_FUNCIONARIO")
	private ClasseFuncionario classeFuncionario;

    public PadraoCargo() {
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

	public List<CargoEfetivo> getCargoEfetivos() {
		return cargoEfetivos;
	}

	public void setCargoEfetivos(List<CargoEfetivo> cargoEfetivos) {
		this.cargoEfetivos = cargoEfetivos;
	}

	public ClasseFuncionario getClasseFuncionario() {
		return classeFuncionario;
	}

	public void setClasseFuncionario(ClasseFuncionario classeFuncionario) {
		this.classeFuncionario = classeFuncionario;
	}
	
}