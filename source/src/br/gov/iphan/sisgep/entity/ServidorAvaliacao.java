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
@Table(name="SERVIDOR_AVALIACAO")
@Name("servidorAvaliacao")
public class ServidorAvaliacao extends EntidadeAbstrata implements EntidadeBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_servidor")
	private Servidor servidor;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_avaliacao")
	private Avaliacao avaliacao;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_chefia")
	private Servidor chefia;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Servidor getChefia() {
		return chefia;
	}

	public void setChefia(Servidor chefia) {
		this.chefia = chefia;
	}
}
