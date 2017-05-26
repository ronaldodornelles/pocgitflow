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
 * Classe de persisténcia para a tabela do banco de dados GPT_TX_OCUPACAO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_TX_OCUPACAO")
@Name("ocupacao")
public class Ocupacao extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_OCUPACAO", nullable=false)
	private Long id;

	@Column(name="COD_SIAPE_OCUPACAO", nullable=false, length=3)
	private Long codSiapeOcupacao;

	@Column(name="NOM_OCUPACAO", nullable=false, length=150)
	private String nomOcupacao;

	//bi-directional many-to-one association to GptCargoEfetivo
	@OneToMany(mappedBy="ocupacao")
	private List<CargoEfetivo> cargoEfetivos;

    public Ocupacao() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodSiapeOcupacao() {
		return this.codSiapeOcupacao;
	}

	public void setCodSiapeOcupacao(Long codSiapeOcupacao) {
		this.codSiapeOcupacao = codSiapeOcupacao;
	}

	public String getNomOcupacao() {
		return this.nomOcupacao;
	}

	public void setNomOcupacao(String nomOcupacao) {
		nomOcupacao = removerCaracteresEsp(nomOcupacao);
		this.nomOcupacao = nomOcupacao;
	}

	public List<CargoEfetivo> getCargoEfetivos() {
		return this.cargoEfetivos;
	}

	public void setCargoEfetivos(List<CargoEfetivo> cargoEfetivos) {
		this.cargoEfetivos = cargoEfetivos;
	}
	
}