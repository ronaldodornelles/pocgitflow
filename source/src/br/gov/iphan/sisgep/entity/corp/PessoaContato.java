package br.gov.iphan.sisgep.entity.corp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.EntidadeAbstrata;
import br.gov.iphan.sisgep.entity.EntidadeBase;
import br.gov.iphan.sisgep.entity.enums.ContatoEnum;


/**
 * Classe de persisténcia para a tabela do banco de dados CRP_PESSOA_CONTATO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Name("pessoaContato")
@Table(name="CRP_PESSOA_CONTATO", schema = "CORP")
@NamedQueries({
    @NamedQuery(name="pessoaContato.verificarDuplicidade", query="SELECT count(o) FROM PessoaContato o " +
    		"WHERE o.txtContato = :txtContato and o.indContato = :indContato and o.pessoaFisica.id = :id and o.numDdd = :numDdd"),
    @NamedQuery(name="pessoaContato.findByPessoa", query="SELECT object(o) FROM PessoaContato o " +
    		"WHERE o.pessoaFisica.id = :id")
})
public class PessoaContato extends EntidadeAbstrata implements Serializable, EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_PESSOA_CONTATO")
	private Long id;

	@Column(name="IND_CONTATO")
	private String indContato;

	@Column(name="NUM_DDD")
	private Long numDdd;

	@Column(name="TXT_CONTATO")
	private String txtContato;

	//bi-directional many-to-one association to PessoaFisica
    @ManyToOne
	@JoinColumn(name="COD_PESSOA_FISICA")
	private PessoaFisica pessoaFisica;

    public PessoaContato() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIndContato() {
		return this.indContato;
	}

	public void setIndContato(String indContato) {
		if(indContato.equals(ContatoEnum.CELULAR.getChave()) 
				|| indContato.equals(ContatoEnum.TELEFONE.getChave())){
			String texto = txtContato;
			if(texto!=null && !texto.trim().equals("")){
				numDdd = new Long(texto.substring(1, 2));
			}
		}
		indContato = removerCaracteresEsp(indContato);
		this.indContato = indContato.toUpperCase();
	}

	public Long getNumDdd() {
		return this.numDdd;
	}

	public void setNumDdd(Long numDdd) {
		this.numDdd = numDdd;
	}

	public String getTxtContato() {
		return this.txtContato;
	}

	public void setTxtContato(String txtContato) {
		this.txtContato = txtContato;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}	
}