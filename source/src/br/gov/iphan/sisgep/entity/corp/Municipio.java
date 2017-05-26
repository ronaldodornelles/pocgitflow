package br.gov.iphan.sisgep.entity.corp;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.EntidadeAbstrata;
import br.gov.iphan.sisgep.entity.EntidadeBase;


/**
 * Classe de persisténcia para a tabela do banco de dados CRP_MUNICIPIO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="CRP_MUNICIPIO", schema = "CORP")
@Name("municipio")
@NamedQueries({
    @NamedQuery(name="municipio.findByUf", query="SELECT Object(o) FROM Municipio o WHERE o.codUf.id = :codUf")
})
public class Municipio extends EntidadeAbstrata implements Serializable, EntidadeBase {
	/**
	 * 
 **/
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_MUNICIPIO")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="COD_UF")
	private Uf codUf;

	@Column(name="NOM_MUNICIPIO")
	private String nomMunicipio;

	//bi-directional many-to-one association to PessoaEndereco
	@OneToMany(mappedBy="municipio")
	private List<PessoaEndereco> pessoaEnderecos;

    public Municipio() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Uf getCodUf() {
		return codUf;
	}

	public void setCodUf(Uf codUf) {
		this.codUf = codUf;
	}

	public String getNomMunicipio() {
		return this.nomMunicipio;
	}

	public void setNomMunicipio(String nomMunicipio) {
		this.nomMunicipio = nomMunicipio;
	}

	public List<PessoaEndereco> getPessoaEnderecos() {
		return pessoaEnderecos;
	}

	public void setPessoaEnderecos(List<PessoaEndereco> pessoaEnderecos) {
		this.pessoaEnderecos = pessoaEnderecos;
	}
	
}