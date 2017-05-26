package br.gov.iphan.sisgep.entity.corp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.EntidadeAbstrata;
import br.gov.iphan.sisgep.entity.EntidadeBase;


/**
 * Classe de persisténcia para a tabela do banco de dados CRP_PESSOA_ENDERECO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="CRP_PESSOA_ENDERECO", schema = "CORP")
@Name("pessoaEndereco")
@NamedQueries({
    @NamedQuery(name="pessoaEndereco.verificarDuplicidade", query="SELECT Object(o) FROM PessoaEndereco o " +
    		"WHERE o.codCep = :codCep and o.numEndereco = :numEndereco and o.pessoaFisica.id <> :id"),
    	    @NamedQuery(name="pessoaEndereco.findByPessoa", query="SELECT object(o) FROM PessoaEndereco o " +
    	    		"WHERE o.pessoaFisica.id = :id")
})
public class PessoaEndereco extends EntidadeAbstrata implements Serializable, EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_PESSOA_ENDERECO")
	private Long id;

	@Column(name="COD_CEP")
	private Long codCep;

	@Column(name="NOM_BAIRRO")
	private String nomBairro;

	@Column(name="NOM_LOGRADOURO")
	private String nomLogradouro;

	@Column(name="NUM_ENDERECO")
	private String numEndereco;

	@Column(name="IND_ENDERECO")
	private String tpEndereco;

	@Column(name="TXT_COMPLEMENTO")
	private String txtComplemento;

	//bi-directional many-to-one association to Municipio
    @ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="COD_MUNICIPIO")
	private Municipio municipio;

	//bi-directional many-to-one association to PessoaFisica
    @ManyToOne
	@JoinColumn(name="COD_PESSOA_FISICA")
	private PessoaFisica pessoaFisica;
    
    @Transient
    private String cep;

    public PessoaEndereco() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodCep() {
		return this.codCep;
	}

	public void setCodCep(Long codCep) {
		this.codCep = codCep;
	}

	public String getNomBairro() {
		return this.nomBairro;
	}

	public void setNomBairro(String nomBairro) {
		nomBairro = removerCaracteresEsp(nomBairro);
		this.nomBairro = nomBairro.toUpperCase();
	}

	public String getNomLogradouro() {
		return this.nomLogradouro;
	}

	public void setNomLogradouro(String nomLogradouro) {
		this.nomLogradouro = nomLogradouro.toUpperCase();
	}

	public String getNumEndereco() {
		return this.numEndereco;
	}

	public void setNumEndereco(String numEndereco) {
		numEndereco = removerCaracteresEsp(numEndereco);
		this.numEndereco = numEndereco.toUpperCase();
	}

	public String getTpEndereco() {
		return this.tpEndereco;
	}

	public void setTpEndereco(String tpEndereco) {
		this.tpEndereco = tpEndereco;
	}

	public String getTxtComplemento() {
		return this.txtComplemento;
	}

	public void setTxtComplemento(String txtComplemento) {
		txtComplemento = removerCaracteresEsp(txtComplemento);
		this.txtComplemento = txtComplemento.toUpperCase();
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public String getCep() {
		if(cep == null && getCodCep() !=null){
			cep = getCodCep().toString().trim();
		}
		return cep;
	}

	public void setCep(String cep) {
		if(cep.trim().length() > 1){
		cep = removerCaracteresEsp(cep);
		setCodCep(new Long(cep));
		}
		this.cep = cep;
	}
	
}