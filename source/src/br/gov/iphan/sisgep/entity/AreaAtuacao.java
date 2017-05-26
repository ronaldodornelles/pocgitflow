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
 * Classe de persisténcia para a tabela do banco de dados GPT_AREA_ATUACAO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_AREA_ATUACAO")
@Name("areaAtuacao")
@NamedQueries({
	@NamedQuery(name="areaAtuacao.findDuplicidade", query="SELECT Object(o) FROM AreaAtuacao o WHERE lower( o.nomAreaAtuacao )  like lower( concat( :nomAreaAtuacao ) )")
})
public class AreaAtuacao extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_AREA_ATUACAO", nullable=false)
	private Long id;

	@Column(name="DES_AREA_ATUACAO", length=250)
	private String desAreaAtuacao;

	@Column(name="NOM_AREA_ATUACAO", nullable=false, length=150)
	private String nomAreaAtuacao;
	
	@Column(name="IND_SITUACAO")
	private Long ativo;

	//bi-directional many-to-one association to CargoEfetivo
	@OneToMany(mappedBy="areaAtuacao")
	private List<CargoEfetivo> cargoEfetivos;

    public AreaAtuacao() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesAreaAtuacao() {
		return this.desAreaAtuacao;
	}

	public void setDesAreaAtuacao(String desAreaAtuacao) {
		desAreaAtuacao = removerCaracteresEsp(desAreaAtuacao);
		this.desAreaAtuacao = desAreaAtuacao;
	}

	public String getNomAreaAtuacao() {
		return this.nomAreaAtuacao;
	}

	public void setNomAreaAtuacao(String nomAreaAtuacao) {
		nomAreaAtuacao = removerCaracteresEsp(nomAreaAtuacao);
		this.nomAreaAtuacao = nomAreaAtuacao;
	}

	public List<CargoEfetivo> getCargoEfetivos() {
		return this.cargoEfetivos;
	}

	public void setGptCargoEfetivos(List<CargoEfetivo> cargoEfetivos) {
		this.cargoEfetivos = cargoEfetivos;
	}

	public Long getAtivo() {
		return ativo;
	}

	public void setAtivo(Long ativo) {
		this.ativo = ativo;
	}
}