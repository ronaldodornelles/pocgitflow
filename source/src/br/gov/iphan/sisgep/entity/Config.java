package br.gov.iphan.sisgep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.anotation.Orderby;

@Entity
@Table(name = "GPT_CONFIG")
@Name("config")
@NamedQueries({
	@NamedQuery(name="config.findBychave", query="SELECT Object(o) FROM Config o WHERE lower( o.chave ) like lower( :chave )"),
})
@Orderby(ordenacao = "id_config")
public class Config extends EntidadeAbstrata implements EntidadeBase {

	private static final long serialVersionUID = -2191589756919441692L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONFIG", unique = true, nullable = false)
	private Long id;

	@Column(name = "CHAVE", length = 50)
	private String chave;

	@Column(name = "VALOR", length = 450)
	private String valor;

	@Column(name = "ATIVO")
	private Boolean ativo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
