package br.gov.iphan.sisgep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;


/**
 * Classe de persisténcia para a tabela do banco de dados GPT_TX_SITUACAO_FUNCIONAL.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_TX_SITUACAO_FUNCIONAL")
@Name("situacaoFuncional")
public class SituacaoFuncional extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_SITUACAO_FUNCIONAL", unique=true, nullable=false)
	private Long id;
	
	@Column(name="COD_SIAPE_SITUACAO_FUNC")
	private Long codSiapeSituacaoFunc;

	@Column(name="TXT_DESCRICAO", nullable=false, length=50)
	private String txtDescricao;

    public SituacaoFuncional() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodSiapeSituacaoFunc() {
		return codSiapeSituacaoFunc;
	}

	public void setCodSiapeSituacaoFunc(Long codSiapeSituacaoFunc) {
		this.codSiapeSituacaoFunc = codSiapeSituacaoFunc;
	}

	public String getTxtDescricao() {
		return this.txtDescricao;
	}

	public void setTxtDescricao(String txtDescricao) {
		txtDescricao = removerCaracteresEsp(txtDescricao);
		this.txtDescricao = txtDescricao;
	}

}