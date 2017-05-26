package br.gov.iphan.sisgep.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;


/**
 * Classe de persisténcia para a tabela do banco de dados GPT_FORMA_PASSAGEM_SERV.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_FORMA_PASSAGEM_SERV")
@Name("formaPassagemServ")
@NamedQueries({
    @NamedQuery(name="formaPassagemServ.findByTipo", query="SELECT Object(o) FROM FormaPassagemServ o WHERE o.tipFormaPassServ like :tipFormaPassServ")
})
public class FormaPassagemServ extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_FORM_PASSAGEM_SERV", nullable=false)
	private Long id;

	@Column(name="COD_SIAPE_FORM_PASS_SERV", length=3, nullable=false)
	private Long codSiapeFormPassServ;

	@Column(name="DES_FORMA_PASS_SERV", length=50, nullable=false)
	private String desFormaPassServ;

	@Column(name="TIP_FORM_PASSAGEM_SERV", length=1, nullable=false)
	private String tipFormaPassServ;
	
	//bi-directional many-to-one association to FormaIngresso
	@OneToMany(mappedBy="formaPassagemServ")
	private List<FormaIngressoAposentacao> formaIngressos;

    public FormaPassagemServ() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodSiapeFormPassServ() {
		return codSiapeFormPassServ;
	}

	public void setCodSiapeFormPassServ(Long codSiapeFormPassServ) {
		this.codSiapeFormPassServ = codSiapeFormPassServ;
	}

	public String getDesFormaPassServ() {
		return this.desFormaPassServ;
	}

	public void setDesFormaPassServ(String desFormaPassServ) {
		this.desFormaPassServ = desFormaPassServ;
	}

	public List<FormaIngressoAposentacao> getFormaIngressos() {
		return formaIngressos;
	}

	public void setFormaIngressos(List<FormaIngressoAposentacao> formaIngressos) {
		this.formaIngressos = formaIngressos;
	}

	public String getTipFormaPassServ() {
		return tipFormaPassServ;
	}

	public void setTipFormaPassServ(String tipFormaPassServ) {
		this.tipFormaPassServ = tipFormaPassServ;
	}
}