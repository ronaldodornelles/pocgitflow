package br.gov.iphan.sisgep.entity.corp;

import java.util.Date;
import java.util.List;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.anotation.Orderby;
import br.gov.iphan.sisgep.entity.EntidadeAbstrata;
import br.gov.iphan.sisgep.entity.EntidadeBase;
import br.gov.iphan.sisgep.entity.Servidor;

/**
 * Classe de persisténcia para a tabela do banco de dados CRP_PESSOA_FISICA.
 * Responsável também em relacionar os atributos desta classe com as colunas referentes
 * na tabela do banco de dados.
 * @author 	Thiago Nunes Vieira
 **/
@Entity
@Table(name = "CRP_PESSOA_FISICA", schema = "CORP")
@Name("pessoaFisica")
@NamedQueries({
	@NamedQuery(name="pessoaFisica.findByCPF", query="SELECT Object(o) FROM PessoaFisica o WHERE lower( o.numCpf ) like lower( :cpf )"),
	@NamedQuery(name="pessoaFisica.verificarDuplicidadeCpf", query="SELECT Object(o) FROM PessoaFisica o " + "WHERE lower(o.numCpf) like lower( :numCpf ) and o.id != :id"),
	@NamedQuery(name="pessoaFisica.verificarDuplicidadeNome", query="SELECT Object(o) FROM PessoaFisica o " + "WHERE lower(o.nomPessoaFisica) like lower( concat( :nomPessoaFisica )) and lower(o.nomMae) like lower( concat( :nomMae )) and o.datNascimento = :datNascimento and o.id != :id"),
	@NamedQuery(name="pessoaFisica.verificarDuplicidadeCpfNovo", query="SELECT Object(o) FROM PessoaFisica o " + "WHERE lower(o.numCpf) like lower( :numCpf )"),
	@NamedQuery(name="pessoaFisica.verificarDuplicidadeNomeNovo", query="SELECT Object(o) FROM PessoaFisica o " + "WHERE lower(o.nomPessoaFisica) like lower( concat( :nomPessoaFisica )) and lower(o.nomMae) like lower( concat( :nomMae )) and o.datNascimento = :datNascimento")
})
@Orderby(ordenacao="nomPessoaFisica")
public class PessoaFisica extends EntidadeAbstrata implements EntidadeBase {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_PESSOA_FISICA")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "COD_COR_RACA")
	private CorRaca codCorRaca;

	@ManyToOne
	@JoinColumn(name = "COD_ESTADO_CIVIL")
	private EstadoCivil codEstadoCivil;

	@ManyToOne
	@JoinColumn(name = "COD_GRUPO_SANGUINEO")
	private GrupoSanguineo codGrupoSanguineo;

	@ManyToOne
	@JoinColumn(name = "COD_MUNICIPIO")
	private Municipio codMunicipio;

	@Column(name = "DTA_NASCIMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date datNascimento;

	@Column(name = "IND_SEXO")
	private String indSexo;

	@Column(name = "NOM_MAE")
	private String nomMae;

	@Column(name = "NOM_PAI")
	private String nomPai;

	@Column(name = "NOM_PESSOA_FISICA")
	private String nomPessoaFisica;

	@Column(name = "NUM_CPF")
	private String numCpf;

	// bi-directional many-to-one association to Servidor
	@OneToMany(mappedBy = "pessoaFisica", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
	@javax.persistence.OrderBy("id DESC")
	private List<Servidor> servidors;

	// bi-directional many-to-one association to PessoaContato
	@OneToMany(mappedBy = "pessoaFisica", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE}, fetch=FetchType.EAGER)
	private Set<PessoaContato> pessoaContatos;

	// bi-directional many-to-one association to PessoaEndereco
	@OneToMany(mappedBy = "pessoaFisica", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE}, fetch=FetchType.EAGER)
	private Set<PessoaEndereco> pessoaEnderecos;

	// bi-directional many-to-one association to EscolaridadePessoa
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinColumn(name = "COD_ESCOLARIDADE_PESSOA")
	private EscolaridadePessoa escolaridadePessoa;

	@Column(name="NOM_ORGAO_EMISSOR")
	private String nomOrgaoEmi;

	@ManyToOne
	@JoinColumn(name="COD_UF_RG")
	private Uf codUfRg;

	@Column(name="DTA_EMISSAO_RG")
	@Temporal( TemporalType.TIMESTAMP) 
	private Date datEmissaoRg;

	@Column(name="NUM_NIS")
	private String numNis;

	@Column(name="NUM_RG")
	private String numRg;

	@Column(name="NUM_TITULO_ELEITORAL")
	private Long numTituloEleitoral;
	
	@Transient
	private PessoaContato pessoaContatoTel = new PessoaContato();
	
	@Transient
	private PessoaContato pessoaContatoCel = new PessoaContato();
	
	@Transient
	private PessoaContato pessoaContatoEmail = new PessoaContato();
	
	@Transient
	private PessoaContato pessoaContatoEmailCorp = new PessoaContato();

	@Transient
	private PessoaEndereco pessoaEndereco = new PessoaEndereco();
	
	@Transient
	private Uf uf2;
	
	@Transient
	private String telaAnterior;
	
	
	public PessoaFisica() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CorRaca getCodCorRaca() {
		return codCorRaca;
	}

	public void setCodCorRaca(CorRaca codCorRaca) {
		this.codCorRaca = codCorRaca;
	}

	public EstadoCivil getCodEstadoCivil() {
		return codEstadoCivil;
	}

	public void setCodEstadoCivil(EstadoCivil codEstadoCivil) {
		this.codEstadoCivil = codEstadoCivil;
	}

	public GrupoSanguineo getCodGrupoSanguineo() {
		return codGrupoSanguineo;
	}

	public void setCodGrupoSanguineo(GrupoSanguineo codGrupoSanguineo) {
		this.codGrupoSanguineo = codGrupoSanguineo;
	}

	public Municipio getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Municipio codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public Date getDatNascimento() {
		return this.datNascimento;
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

	public String getNomMae() {
		return this.nomMae;
	}

	public void setNomMae(String nomMae) {
		nomMae = removerCaracteresEsp(nomMae);
		this.nomMae = nomMae.toUpperCase();
	}

	public String getNomPai() {
		return this.nomPai;
	}

	public void setNomPai(String nomPai) {
		nomPai = removerCaracteresEsp(nomPai);
		this.nomPai = nomPai.toUpperCase();
	}

	public String getNomPessoaFisica() {
		return this.nomPessoaFisica;
	}

	public void setNomPessoaFisica(String nomPessoaFisica) {
		nomPessoaFisica = removerCaracteresEsp(nomPessoaFisica);
		this.nomPessoaFisica = nomPessoaFisica.toUpperCase();
	}

	public String getNumCpf() {
		return this.numCpf;
	}

	public void setNumCpf(String numCpf) {
		numCpf = removerCaracteresEsp(numCpf);
		this.numCpf = numCpf.toUpperCase();
	}
	
	public List<Servidor> getServidors() {
		return servidors;
	}


	public void setServidors(List<Servidor> servidors) {
		this.servidors = servidors;
	}

	public Set<PessoaContato> getPessoaContatos() {
		return pessoaContatos;
	}

	public void setPessoaContatos(Set<PessoaContato> pessoaContatos) {
		this.pessoaContatos = pessoaContatos;
	}

	public Set<PessoaEndereco> getPessoaEnderecos() {
		return pessoaEnderecos;
	}

	public void setPessoaEnderecos(Set<PessoaEndereco> pessoaEnderecos) {
		this.pessoaEnderecos = pessoaEnderecos;
	}

	public EscolaridadePessoa getEscolaridadePessoa() {
		return escolaridadePessoa;
	}

	public void setEscolaridadePessoa(EscolaridadePessoa escolaridadePessoa) {
		this.escolaridadePessoa = escolaridadePessoa;
	}
	
	public PessoaContato getPessoaContatoTel() {
		return pessoaContatoTel;
	}

	public void setPessoaContatoTel(PessoaContato pessoaContatoTel) {
		this.pessoaContatoTel = pessoaContatoTel;
	}

	public PessoaContato getPessoaContatoCel() {
		return pessoaContatoCel;
	}

	public void setPessoaContatoCel(PessoaContato pessoaContatoCel) {
		this.pessoaContatoCel = pessoaContatoCel;
	}

	public PessoaContato getPessoaContatoEmail() {
		return pessoaContatoEmail;
	}

	public void setPessoaContatoEmail(PessoaContato pessoaContatoEmail) {
		this.pessoaContatoEmail = pessoaContatoEmail;
	}

	public PessoaContato getPessoaContatoEmailCorp() {
		return pessoaContatoEmailCorp;
	}

	public void setPessoaContatoEmailCorp(PessoaContato pessoaContatoEmailCorp) {
		this.pessoaContatoEmailCorp = pessoaContatoEmailCorp;
	}

	public PessoaEndereco getPessoaEndereco() {
		return pessoaEndereco;
	}

	public void setPessoaEndereco(PessoaEndereco pessoaEndereco) {
		this.pessoaEndereco = pessoaEndereco;
	}

	public Uf getUf2() {
		return uf2;
	}

	public void setUf2(Uf uf2) {
		this.uf2 = uf2;
	}
	
	//Documento Pessoa Física
	
	public String getNomOrgaoEmi() {
		return nomOrgaoEmi;
	}

	public void setNomOrgaoEmi(String nomOrgaoEmi) {
		this.nomOrgaoEmi = nomOrgaoEmi;
	}
	
	public Uf getCodUfRg() {
		return codUfRg;
	}

	public void setCodUfRg(Uf codUfRg) {
		this.codUfRg = codUfRg;
	}

	public Date getDatEmissaoRg() {
		return this.datEmissaoRg;
	}

	public void setDatEmissaoRg(Date datEmissaoRg) {
		this.datEmissaoRg = datEmissaoRg;
	}


	public String getNumNis() {
		return this.numNis;
	}

	public void setNumNis(String numNis) {
		numNis = removerCaracteresEsp(numNis);
		this.numNis = numNis.toUpperCase();
	}

	public String getNumRg() {
		return this.numRg;
	}

	public void setNumRg(String numRg) {
		numRg = removerCaracteresEsp(numRg);
		this.numRg = numRg.toUpperCase();
	}

	public Long getNumTituloEleitoral() {
		return this.numTituloEleitoral;
	}

	public void setNumTituloEleitoral(Long numTituloEleitoral) {
		this.numTituloEleitoral = numTituloEleitoral;
	}

	public String getTelaAnterior() {
		return telaAnterior;
	}

	public void setTelaAnterior(String telaAnterior) {
		this.telaAnterior = telaAnterior;
	}
}