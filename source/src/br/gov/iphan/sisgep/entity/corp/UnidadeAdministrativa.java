package br.gov.iphan.sisgep.entity.corp;

import java.util.List;

import javax.persistence.CascadeType;
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
import br.gov.iphan.sisgep.entity.Servidor;

/**
 * Classe de persisténcia para a tabela do banco de dados
 * CRP_UNIDADE_ADMINISTRATIVA. Responsável também em relacionar os atributos
 * desta classe com as colunas referentes na tabela do banco de dados.
 * 
 * @author Thiago Nunes Vieira
 **/
@Entity
@Table(name = "CRP_UNIDADE_ADMINISTRATIVA", schema = "CORP")
@Name("unidadeAdministrativa")
@NamedQueries({
		@NamedQuery(name = "unidadeAdministrativa.findByUf", query = "SELECT Object(o) FROM UnidadeAdministrativa o WHERE o.codUf.id = :codUf"),
		@NamedQuery(name = "unidadeAdministrativa.find", query = "SELECT Object(o) FROM UnidadeAdministrativa o WHERE o.codUf.id = :codUf and "
				+ " lower( o.nomUnidadeAdministrativa )  like lower( concat('%',:nomUnidadeAdministrativa,'%') ) and "
				+ " lower( o.unidadeAdministrativa.nomUnidadeAdministrativa )  like lower( concat('%',:nomUnidadeAdministrativa2,'%') )") })
public class UnidadeAdministrativa extends EntidadeAbstrata implements
		EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_UNIDADE_ADMINISTRATIVA", unique = true, nullable = false)
	private Long id;

	@Column(name = "NOM_UNIDADE_ADMINISTRATIVA")
	private String nomUnidadeAdministrativa;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "COD_UF")
	private Uf codUf;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_SERVIDOR", updatable = false)
	private Servidor servidor;

	@ManyToOne
	@JoinColumn(name = "COD_UNIDADE_PAI")
	private UnidadeAdministrativa unidadeAdministrativa;

	@Column(name = "SIG_UNIDADE_ADMINISTRATIVA", length = 5)
	private String siglaUnidade;

	@Column(name = "TXT_ENDERECO", length = 150)
	private String txtEndereco;

	@Column(name = "TXT_EMAIL_CONTATO", length = 150)
	private String txtEmailContato;

	@Column(name = "TXT_TELEFONE_CONTATO", length = 12)
	private String txtTelefoneContato;

	@Column(name = "IND_SUPERINTENDECIA", length = 1)
	private Long indSuperintendecia;

	@Transient
	private List<UnidadeAdministrativa> unidadeAdministrativas;

	public UnidadeAdministrativa() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomUnidadeAdministrativa() {
		nomUnidadeAdministrativa = removerCaracteresEsp(nomUnidadeAdministrativa);
		return nomUnidadeAdministrativa.toUpperCase();
	}

	public void setNomUnidadeAdministrativa(String nomUnidadeAdministrativa) {
		this.nomUnidadeAdministrativa = nomUnidadeAdministrativa;
	}

	public Uf getCodUf() {
		return codUf;
	}

	public void setCodUf(Uf codUf) {
		this.codUf = codUf;
	}

	public UnidadeAdministrativa getUnidadeAdministrativa() {
		return unidadeAdministrativa;
	}

	public void setUnidadeAdministrativa(
			UnidadeAdministrativa unidadeAdministrativa) {
		this.unidadeAdministrativa = unidadeAdministrativa;
	}

	public String getSiglaUnidade() {
		return siglaUnidade;
	}

	public void setSiglaUnidade(String siglaUnidade) {
		this.siglaUnidade = siglaUnidade;
	}

	public String getTxtEndereco() {
		return txtEndereco;
	}

	public void setTxtEndereco(String txtEndereco) {
		this.txtEndereco = removerCaracteresEsp(txtEndereco);
	}

	public String getTxtEmailContato() {
		return txtEmailContato;
	}

	public void setTxtEmailContato(String txtEmailContato) {
		this.txtEmailContato = removerCaracteresEsp(txtEmailContato);
	}

	public String getTxtTelefoneContato() {
		return txtTelefoneContato;
	}

	public void setTxtTelefoneContato(String txtTelefoneContato) {
		this.txtTelefoneContato = txtTelefoneContato;
	}

	public Long getIndSuperintendecia() {
		return indSuperintendecia;
	}

	public void setIndSuperintendecia(Long indSuperintendecia) {
		this.indSuperintendecia = indSuperintendecia;
	}

	public List<UnidadeAdministrativa> getUnidadeAdministrativas() {
		return unidadeAdministrativas;
	}

	public void setUnidadeAdministrativas(
			List<UnidadeAdministrativa> unidadeAdministrativas) {
		this.unidadeAdministrativas = unidadeAdministrativas;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnidadeAdministrativa other = (UnidadeAdministrativa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}