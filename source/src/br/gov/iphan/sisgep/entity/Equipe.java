package br.gov.iphan.sisgep.entity;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;

@Entity
@Table(name = "EQUIPE")
@Name("equipe")
public class Equipe extends EntidadeAbstrata implements EntidadeBase {

	private static final long serialVersionUID = 9174484617037972133L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cod_unidade_administrativa")
	private UnidadeAdministrativa unidadeAdministrativa;

    @ManyToMany
    @Cascade(value = CascadeType.DELETE_ORPHAN)
   	@JoinTable(
   		name="EQUIPE_SERVIDOR"
   		, joinColumns={
   			@JoinColumn(name="id_equipe", nullable=false, updatable = false)
   			}
   		, inverseJoinColumns={
   			@JoinColumn(name="cod_servidor", nullable=false, updatable = false)
   			}
   		)
    private List<Servidor> servidores;
    		
    @Transient
    private String nomesServidores;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UnidadeAdministrativa getUnidadeAdministrativa() {
		return unidadeAdministrativa;
	}

	public void setUnidadeAdministrativa(UnidadeAdministrativa unidadeAdministrativa) {
		this.unidadeAdministrativa = unidadeAdministrativa;
	}

	public List<Servidor> getServidores() {
		return servidores;
	}

	public void setServidores(List<Servidor> servidores) {
		this.servidores = servidores;
	}

	public String getNomesServidores() {
		if (servidores != null) {
			Boolean first = true;
			for (Iterator<Servidor> iter = servidores.iterator(); iter.hasNext();) {
				Servidor servidor = iter.next();
				if (first) {
					nomesServidores = servidor.getPessoaFisica().getNomPessoaFisica().trim();
					first = false;
				} else {
					nomesServidores += ", " + servidor.getPessoaFisica().getNomPessoaFisica().trim();
				}
			}
		} else {
			nomesServidores = "";
		}
		
		return nomesServidores;
	}

	public void setNomesServidores(String nomesServidores) {
		this.nomesServidores = nomesServidores;
	}

}
