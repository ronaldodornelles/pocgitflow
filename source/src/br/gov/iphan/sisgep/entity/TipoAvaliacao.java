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
import javax.persistence.Transient;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;

@Entity
@Table(name = "TIPOAVALIACAO")
@Name("tipoAvaliacao")
public class TipoAvaliacao extends EntidadeAbstrata implements EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "titulo", length = 250)
	private String titulo;
	
	@OneToMany(mappedBy = "tipoAvaliacao", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<Fator> fatores;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_subcategoria")
	private Subcategoria subcategoria;
	
	
	@Transient
	private String palavraChave;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}

	public List<Fator> getFatores() {
		return fatores;
	}

	public void setFatores(List<Fator> fatores) {
		this.fatores = fatores;
	}

	public Subcategoria getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(Subcategoria subcategoria) {
		this.subcategoria = subcategoria;
	}


}
