package br.gov.iphan.sisgep.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;

@Entity
@Table(name = "FATORSUBFATOR")
@Name("fatorSubfator")
public class FatorSubfator extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_fator")
	private Fator fator;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_subfator")
	private Subfator subfator;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Fator getFator() {
		return fator;
	}

	public void setFator(Fator fator) {
		this.fator = fator;
	}

	public Subfator getSubfator() {
		return subfator;
	}

	public void setSubfator(Subfator subfator) {
		this.subfator = subfator;
	}
	
	
}
