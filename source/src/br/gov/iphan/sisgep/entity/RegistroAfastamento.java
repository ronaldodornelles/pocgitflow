package br.gov.iphan.sisgep.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;


/**
 * Classe de persisténcia para a tabela do banco de dados GPT_TX_REGISTRO_AFASTAMENTO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_TX_REGISTRO_AFAST")
@Name("registroAfastamento")
public class RegistroAfastamento extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_REGISTRO_AFASTAMENTO", unique=true, nullable=false)
	private Long id;

	@Column(name="TXT_DESCRICAO", nullable=false, length=50)
	private String txtDescricao;

	//bi-directional many-to-one association to BeneficioAfastamento
	@OneToMany(mappedBy="registroAfastamento")
	private List<Afastamento> afastamentos;

    public RegistroAfastamento() {
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
		txtDescricao = removerCaracteresEsp(txtDescricao);
		this.txtDescricao = txtDescricao;
	}

	public List<Afastamento> getAfastamentos() {
		return afastamentos;
	}

	public void setAfastamentos(List<Afastamento> afastamentos) {
		this.afastamentos = afastamentos;
	}
}