package br.gov.iphan.sisgep.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;


/**
 * Classe de persisténcia para a tabela do banco de dados GPT_TX_CARGO_COMIS.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_TX_CARGO_COMIS")
@Name("tipoCargoComissinado")
@NamedQueries({
    @NamedQuery(name="tipoCargoComissinado.listarTodosCodSiage", query="SELECT DISTINCT o.codSiapeCargoComissionado FROM TipoCargoComissinado o "),
    @NamedQuery(name="tipoCargoComissinado.findTipoCargoComissinado", query="SELECT Object(o) FROM TipoCargoComissinado o WHERE lower(o.codSiapeCargoComissionado) like lower(:codSiapeCargoComissionado) ")
})
public class TipoCargoComissinado extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_CARGO_COMISSIONADO", unique=true, nullable=false)
	private Long id;

	@Column(name="COD_SIAPE_CARGO_COMIS", nullable=false, length=20)
	private String codSiapeCargoComissionado;

	@Column(name="TXT_DESCRICAO", nullable=false, length=50)
	private String txtDescricao;

	//bi-directional many-to-one association to CargoComissionado
	@OneToMany(mappedBy="tipoCargoComissinado")
	private List<CargoComissionado> cargoComissionados;

    public TipoCargoComissinado() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodSiapeCargoComissionado() {
		return this.codSiapeCargoComissionado;
	}

	public void setCodSiapeCargoComissionado(String codSiapeCargoComissionado) {
		this.codSiapeCargoComissionado = codSiapeCargoComissionado;
	}

	public String getTxtDescricao() {
		return this.txtDescricao;
	}

	public void setTxtDescricao(String txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public List<CargoComissionado> getCargoComissionados() {
		return cargoComissionados;
	}

	public void setCargoComissionados(List<CargoComissionado> cargoComissionados) {
		this.cargoComissionados = cargoComissionados;
	}

}