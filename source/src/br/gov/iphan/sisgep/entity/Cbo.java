package br.gov.iphan.sisgep.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;


/**
 * Classe de persisténcia para a tabela do banco de dados GPT_CBO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_CBO")
@Name("cbo")
public class Cbo extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COD_CBO", nullable=false)
	private Long id;

	@Column(name="NOM_CBO", nullable=false, length=150)
	private String nomCbo;

	//bi-directional many-to-one association to CargoEfetivo
//	@OneToMany(mappedBy="cbo")
//	private List<CargoEfetivo> cargoEfetivos;

    public Cbo() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomCbo() {
		return this.nomCbo;
	}

	public void setNomCbo(String nomCbo) {
		nomCbo = removerCaracteresEsp(nomCbo);
		this.nomCbo = nomCbo;
	}
/*
	public List<CargoEfetivo> getCargoEfetivos() {
		return this.cargoEfetivos;
	}

	public void setGptCargoEfetivos(List<CargoEfetivo> cargoEfetivos) {
		this.cargoEfetivos = cargoEfetivos;
	}
*/	
}