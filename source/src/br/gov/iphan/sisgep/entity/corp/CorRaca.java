package br.gov.iphan.sisgep.entity.corp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.EntidadeAbstrata;
import br.gov.iphan.sisgep.entity.EntidadeBase;


/**
 * Classe de persisténcia para a tabela do banco de dados CRP_COR_RACA.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Name("corRaca")
@Table(name="CRP_COR_RACA", schema = "CORP")
@AutoCreate
public class CorRaca extends EntidadeAbstrata implements Serializable, EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_cor_raca")
	private Long id;

	@Column(name="nom_cor_raca")
	private String nomCorRaca;
	
	@Column(name="cod_siape_cor_raca")
	private Long codigoSiapeCorRaca;

    public CorRaca() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomCorRaca() {
		return this.nomCorRaca;
	}

	public void setNomCorRaca(String nomCorRaca) {
		this.nomCorRaca = nomCorRaca;
	}

	public Long getCodigoSiapeCorRaca() {
		return codigoSiapeCorRaca;
	}

	public void setCodigoSiapeCorRaca(Long codigoSiapeCorRaca) {
		this.codigoSiapeCorRaca = codigoSiapeCorRaca;
	}
	
}