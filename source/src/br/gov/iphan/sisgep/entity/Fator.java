package br.gov.iphan.sisgep.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;

@Entity
@Table(name = "FATOR")
@Name("fator")
public class Fator extends EntidadeAbstrata implements EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "nome", length = 100)
	private String nome;
	
	@Column(name = "descricao", length = 200)
	private String descricao;
	
	@Column(name = "peso")
	private Integer peso;
	
	@ManyToOne
	@JoinColumn(name = "id_tipoavaliacao")
	private TipoAvaliacao tipoAvaliacao;
	
	@OneToMany(mappedBy = "fator", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<FatorSubfator> fatorSubfatores;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public TipoAvaliacao getTipoAvaliacao() {
		return tipoAvaliacao;
	}

	public void setTipoAvaliacao(TipoAvaliacao tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
	}

	public List<FatorSubfator> getFatorSubfatores() {
		return fatorSubfatores;
	}

	public void setFatorSubfatores(List<FatorSubfator> fatorSubfatores) {
		this.fatorSubfatores = fatorSubfatores;
	}
	
	


}
