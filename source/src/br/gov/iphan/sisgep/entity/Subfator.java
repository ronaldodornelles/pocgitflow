package br.gov.iphan.sisgep.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.jboss.seam.annotations.Name;

@Entity
@Table(name = "SUBFATOR")
@Name("subfator")
public class Subfator extends EntidadeAbstrata implements EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "descricao", length = 300)
	private String descricao;
	
	@Column(name = "escala_maxima")
	private Integer escalaMaxima;
	
	@OneToMany(mappedBy = "subfator", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<Escala> escalas;
	
	@Transient
	private Integer posicao;

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

	public Integer getEscalaMaxima() {
		return escalaMaxima;
	}

	public void setEscalaMaxima(Integer escalaMaxima) {
		this.escalaMaxima = escalaMaxima;
	}

	public List<Escala> getEscalas() {
		return escalas;
	}

	public void setEscalas(List<Escala> escalas) {
		this.escalas = escalas;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}
}
