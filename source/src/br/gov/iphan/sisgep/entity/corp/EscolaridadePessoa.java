package br.gov.iphan.sisgep.entity.corp;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.EntidadeAbstrata;
import br.gov.iphan.sisgep.entity.EntidadeBase;


/**
 * Classe de persisténcia para a tabela do banco de dados CRP_ESCOLARIDADE_PESSOA.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Name("escolaridadePessoa")
@Table(name="CRP_ESCOLARIDADE_PESSOA", schema = "CORP")
public class EscolaridadePessoa extends EntidadeAbstrata implements Serializable, EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_ESCOLARIDADE_PESSOA")
	private Long id;

	@Column(name="txt_descricao")
	private String txtDescricao;
	
	@Column(name="COD_SIAPE_ESCOLARIDADE")
	private Long codigoSiapeEscolaridade;

	//bi-directional many-to-one association to PessoaFisica
	@OneToMany(mappedBy="escolaridadePessoa", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private List<PessoaFisica> pessoaFisicas;

    public EscolaridadePessoa() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTxtDescricao() {
		return this.txtDescricao;
	}

	public void setTxtDescricao(String txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public List<PessoaFisica> getPessoaFisicas() {
		return pessoaFisicas;
	}

	public void setPessoaFisicas(List<PessoaFisica> pessoaFisicas) {
		this.pessoaFisicas = pessoaFisicas;
	}

	public Long getCodigoSiapeEscolaridade() {
		return codigoSiapeEscolaridade;
	}

	public void setCodigoSiapeEscolaridade(Long codigoSiapeEscolaridade) {
		this.codigoSiapeEscolaridade = codigoSiapeEscolaridade;
	}
		
}