package br.gov.iphan.sisgep.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.corp.Uf;


/**
 * Classe de persisténcia para a tabela do banco de dados GPT_TX_OCUPACAO.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name="GPT_DEPENDENTE")
@Name("dependente")
public class Dependente extends EntidadeAbstrata implements EntidadeBase {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_DEPENDENTE", nullable=false)
	private Long id;

	@ManyToOne
	@JoinColumn(name="COD_UF_RG")
	private Uf codUf;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DTA_EMISSAO_RG")
	private Date datEmissaoRg;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DTA_NASCIMENTO")
	private Date datNascimento;

	@Column(name="IND_SEXO", length=1)
	private String indSexo;

	@Column(name="NOM_ORGAO_EXPEDITOR", length=50)
	private String nomOrgaoExpeditor;

	@Column(name="NOM_DEPENDENTE", length=150, nullable=false)
	private String nomDependente;

	@Column(name="NOM_MAE", length=150)
	private String nomMae;

	@Column(name="NUM_CPF", length=11)
	private String numCpf;

	@Column(name="NUM_RG", length=20)
	private String numRg;

	@Column(name="TIP_GRAU_PARENTESCO")
	private String tipGrauParentesco;

	//bi-directional many-to-one association to CondicaoDependente
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinColumn(name="COD_CONDICAO_DEPENDENTE")
	private CondicaoDependente condicaoDependente;

    @ManyToOne
	@JoinColumn(name="COD_UF_CERTIDAO")
	private Uf codUfCertidao;

	@Column(name="DES_LIVRO_CERTIDAO", length=50)
	private String desLivroCertidao;

	@Column(name="IND_TIPO_CERTIDAO_NASC", length=1)
	private String indTipoCertidaoNasc;

	@Column(name="NOM_CARTORIO_CERTIDAO", length=150)
	private String nomCartorioCertidao;

	@Column(name="NUM_CERTIDAO_NASC", length=15)
	private Long numCertidaoNasc;

	@Column(name="NUM_FOLHA_LIVRO_CERTIDAO", length=10)
	private String numFolhaLivroCertidao;

    @ManyToMany
   	@JoinTable(
   		name="GPT_DEPE_X_GPT_FIM_DEPE"
   		, joinColumns={
   			@JoinColumn(name="COD_DEPENDENTE", nullable=false)
   			}
   		, inverseJoinColumns={
   			@JoinColumn(name="COD_FIM_DEPENDENTE", nullable=false)
   			}
   		)
    private List<FimDependente> fimDependentes;
    
	//bi-directional many-to-one association to Servidor
    @ManyToOne
	@JoinColumn(name="COD_SERVIDOR", nullable=false)
	private Servidor servidor;

    public Dependente() {
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

	public Date getDatEmissaoRg() {
		return datEmissaoRg;
	}

	public void setDatEmissaoRg(Date datEmissaoRg) {
		this.datEmissaoRg = datEmissaoRg;
	}

	public Date getDatNascimento() {
		return datNascimento;
	}

	public void setDatNascimento(Date datNascimento) {
		this.datNascimento = datNascimento;
	}

	public String getIndSexo() {
		return this.indSexo;
	}

	public void setIndSexo(String indSexo) {
		this.indSexo = indSexo;
	}

	public String getNomOrgaoExpeditor() {
		return this.nomOrgaoExpeditor;
	}

	public void setNomOrgaoExpeditor(String nomOrgaoExpeditor) {
		nomOrgaoExpeditor = removerCaracteresEsp(nomOrgaoExpeditor);
		this.nomOrgaoExpeditor = nomOrgaoExpeditor;
	}

	public String getNomDependente() {
		return this.nomDependente;
	}

	public void setNomDependente(String nomDependente) {
		nomDependente = removerCaracteresEsp(nomDependente);
		this.nomDependente = nomDependente;
	}

	public String getNomMae() {
		return this.nomMae;
	}

	public void setNomMae(String nomMae) {
		nomMae = removerCaracteresEsp(nomMae);
		this.nomMae = nomMae;
	}

	public String getTipGrauParentesco() {
		return this.tipGrauParentesco;
	}

	public void setTipGrauParentesco(String tipGrauParentesco) {
		this.tipGrauParentesco = tipGrauParentesco;
	}

	public CondicaoDependente getCondicaoDependente() {
		return condicaoDependente;
	}

	public void setCondicaoDependente(CondicaoDependente condicaoDependente) {
		this.condicaoDependente = condicaoDependente;
	}

	public Uf getCodUfCertidao() {
		return codUfCertidao;
	}

	public void setCodUfCertidao(Uf codUfCertidao) {
		this.codUfCertidao = codUfCertidao;
	}

	public String getDesLivroCertidao() {
		return this.desLivroCertidao;
	}

	public void setDesLivroCertidao(String desLivroCertidao) {
		desLivroCertidao = removerCaracteresEsp(desLivroCertidao);
		this.desLivroCertidao = desLivroCertidao;
	}

	public String getIndTipoCertidaoNasc() {
		return this.indTipoCertidaoNasc;
	}

	public void setIndTipoCertidaoNasc(String indTipoCertidaoNasc) {
		this.indTipoCertidaoNasc = indTipoCertidaoNasc;
	}

	public String getNomCartorioCertidao() {
		return this.nomCartorioCertidao;
	}

	public void setNomCartorioCertidao(String nomCartorioCertidao) {
		nomCartorioCertidao = removerCaracteresEsp(nomCartorioCertidao);
		this.nomCartorioCertidao = nomCartorioCertidao;
	}

	public Long getNumCertidaoNasc() {
		return this.numCertidaoNasc;
	}

	public void setNumCertidaoNasc(Long numCertidaoNasc) {
		this.numCertidaoNasc = numCertidaoNasc;
	}

	public String getNumFolhaLivroCertidao() {
		return this.numFolhaLivroCertidao;
	}

	public void setNumFolhaLivroCertidao(String numFolhaLivroCertidao) {
		numFolhaLivroCertidao = removerCaracteresEsp(numFolhaLivroCertidao);
		this.numFolhaLivroCertidao = numFolhaLivroCertidao;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public List<FimDependente> getFimDependentes() {
		return fimDependentes;
	}

	public void setFimDependentes(List<FimDependente> fimDependentes) {
		this.fimDependentes = fimDependentes;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public String getNumCpf() {
		return numCpf;
	}

	public void setNumCpf(String numCpf) {
		numCpf = removerCaracteresEsp(numCpf);
		this.numCpf = numCpf;
	}

	public String getNumRg() {
		return numRg;
	}

	public void setNumRg(String numRg) {
		this.numRg = numRg;
	}
	
}