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
 * Classe de persisténcia para a tabela do banco de dados GPT_TX_NIVEL_CARGO_FUNCIONARIO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_TX_NIVEL_CARGO_FUNC")
@Name("nivelCargoFuncionario")
public class NivelCargoFuncionario extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_NIVEL_CARGO_FUNC", unique=true, nullable=false)
	private Long id;
	
	@Column(name="COD_SIAPE_NIVEL_CARGO", nullable=false, precision=6)
	private Long codSiapeNivelCargo;

	@Column(name="TXT_DESCRICAO", nullable=false, length=50)
	private String txtDescricao;

	//bi-directional many-to-one association to CargoComissionado
	@OneToMany(mappedBy="nivelCargoFuncionario")
	private List<GrupoFuncionario> grupoFuncionarios;

    public NivelCargoFuncionario() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodSiapeNivelCargo() {
		return codSiapeNivelCargo;
	}

	public void setCodSiapeNivelCargo(Long codSiapeNivelCargo) {
		this.codSiapeNivelCargo = codSiapeNivelCargo;
	}

	public String getTxtDescricao() {
		return this.txtDescricao;
	}

	public void setTxtDescricao(String txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public List<GrupoFuncionario> getGrupoFuncionarios() {
		return grupoFuncionarios;
	}

	public void setGrupoFuncionarios(List<GrupoFuncionario> grupoFuncionarios) {
		this.grupoFuncionarios = grupoFuncionarios;
	}

}