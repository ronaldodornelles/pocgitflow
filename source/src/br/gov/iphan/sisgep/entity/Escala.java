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
@Table(name = "ESCALA")
@Name("escala")
public class Escala extends EntidadeAbstrata implements EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "descricao", length = 300)
	private String descricao;
	
	@Column(name = "pontos")
	private Integer pontos;
	    
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_subfator")
    private Subfator subfator;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public Subfator getSubfator() {
		return subfator;
	}

	public void setSubfator(Subfator subfator) {
		this.subfator = subfator;
	}
}
