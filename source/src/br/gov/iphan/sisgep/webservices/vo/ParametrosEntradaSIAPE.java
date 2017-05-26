package br.gov.iphan.sisgep.webservices.vo;

public class ParametrosEntradaSIAPE {
	
	public static final String SIGLA_SISGEP = "SISGEP";
	public static final String NOME_SISGEP = "Sistema de Gestao de Pessoas-IPHAN";
	public static final String SENHA_SISGEP = "I2921QV";
	public static final String CPF_SISGEP = "00783407130";
	public static final String CODIGO_ORGAO_SISGEP = "24204";
	public static final String PARAMETRO_EXISTE_PAGAMENTO = "b";
	public static final String PARAMETRO_TIPO_VINCULO = "c";
	
	private String siglaSistema;
	private String nomeSistema;
	private String senha;
	private String cpf;
	private String codigoOrgao;
	private String codigoUnidadeOrganizacional;
	private String parametroExistePagamento;
	private String parametroTipoVinculo;
	
	public String getSiglaSistema() {
		return siglaSistema!=null?siglaSistema:SIGLA_SISGEP;
	}
	public void setSiglaSistema(String siglaSistema) {
		this.siglaSistema = siglaSistema;
	}
	
	public String getNomeSistema() {
		return nomeSistema!=null?nomeSistema:NOME_SISGEP;
	}
	public void setNomeSistema(String nomeSistema) {
		this.nomeSistema = nomeSistema;
	}
	
	public String getSenha() {
		return senha!=null?senha:SENHA_SISGEP;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getCpf() {
		return cpf!=null?cpf:CPF_SISGEP;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCodigoOrgao() {
		return codigoOrgao!=null?codigoOrgao:CODIGO_ORGAO_SISGEP;
	}
	public void setCodigoOrgao(String codigoOrgao) {
		this.codigoOrgao = codigoOrgao;
	}
	
	public String getCodigoUnidadeOrganizacional() {
		return codigoUnidadeOrganizacional;
	}
	public void setCodigoUnidadeOrganizacional(String codigoUnidadeOrganizacional) {
		this.codigoUnidadeOrganizacional = codigoUnidadeOrganizacional;
	}
	
	public String getParametroExistePagamento() {
		return parametroExistePagamento!=null?parametroExistePagamento:PARAMETRO_EXISTE_PAGAMENTO;
	}
	public void setParametroExistePagamento(String parametroExistePagamento) {
		this.parametroExistePagamento = parametroExistePagamento;
	}
	
	public String getParametroTipoVinculo() {
		return parametroTipoVinculo!=null?parametroTipoVinculo:PARAMETRO_TIPO_VINCULO;
	}
	public void setParametroTipoVinculo(String parametroTipoVinculo) {
		this.parametroTipoVinculo = parametroTipoVinculo;
	}

}
