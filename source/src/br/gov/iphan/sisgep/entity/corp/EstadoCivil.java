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
 * Classe de persisténcia para a tabela do banco de dados CRP_ESTADO_CIVIL.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="CRP_ESTADO_CIVIL", schema = "CORP")
@Name("estadoCivil")
public class EstadoCivil extends EntidadeAbstrata implements Serializable, EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_ESTADO_CIVIL")
	private Long id;

	@Column(name="NOM_ESTADO_CIVIL")
	private String nomEstadoCivil;
	
	@Column(name="COD_SIAPE_ESTADO_CIVIL")
	private Long codigoSiapeEstCivil;

    public EstadoCivil() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomEstadoCivil() {
		return this.nomEstadoCivil;
	}

	public void setNomEstadoCivil(String nomEstadoCivil) {
		this.nomEstadoCivil = nomEstadoCivil;
	}

	public Long getCodigoSiapeEstCivil() {
		return codigoSiapeEstCivil;
	}

	public void setCodigoSiapeEstCivil(Long codigoSiapeEstCivil) {
		this.codigoSiapeEstCivil = codigoSiapeEstCivil;
	}

}