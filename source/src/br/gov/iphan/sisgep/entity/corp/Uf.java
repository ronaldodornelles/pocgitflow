package br.gov.iphan.sisgep.entity.corp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.EntidadeAbstrata;
import br.gov.iphan.sisgep.entity.EntidadeBase;


/**
 * Classe de persisténcia para a tabela do banco de dados CRP_UF.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="CRP_UF", schema = "CORP")
@Name("uf")
public class Uf extends EntidadeAbstrata implements Serializable, EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_UF")
	private Long id;

	@Column(name="DES_SIGLA")
	private String desSigla;

	@Column(name="NOM_UF")
	private String nomUf;

    public Uf() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesSigla() {
		return this.desSigla;
	}

	public void setDesSigla(String desSigla) {
		this.desSigla = desSigla;
	}

	public String getNomUf() {
		return this.nomUf;
	}

	public void setNomUf(String nomUf) {
		this.nomUf = nomUf;
	}

}