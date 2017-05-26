package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.faces.application.FacesMessage;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.faces.Renderer;
import org.jboss.seam.security.Credentials;

import br.gov.iphan.sisgep.entity.Afastamento;
import br.gov.iphan.sisgep.entity.AreaAtuacao;
import br.gov.iphan.sisgep.entity.CargoComissionado;
import br.gov.iphan.sisgep.entity.CargoEfetivo;
import br.gov.iphan.sisgep.entity.CargoFuncao;
import br.gov.iphan.sisgep.entity.CessaoRequisicao;
import br.gov.iphan.sisgep.entity.ClasseFuncionario;
import br.gov.iphan.sisgep.entity.Dependente;
import br.gov.iphan.sisgep.entity.FormaIngressoAposentacao;
import br.gov.iphan.sisgep.entity.FormacaoAcademica;
import br.gov.iphan.sisgep.entity.GrupoFuncionario;
import br.gov.iphan.sisgep.entity.NivelCargoFuncionario;
import br.gov.iphan.sisgep.entity.Servidor;
import br.gov.iphan.sisgep.entity.SituacaoFuncional;
import br.gov.iphan.sisgep.entity.corp.PessoaContato;
import br.gov.iphan.sisgep.entity.corp.PessoaFisica;
import br.gov.iphan.sisgep.entity.corp.Uf;
import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;
import br.gov.iphan.sisgep.entity.enums.ContatoEnum;
import br.gov.iphan.sisgep.manager.AreaAtuacaoManager;
import br.gov.iphan.sisgep.manager.CessaoRequisicaoManager;
import br.gov.iphan.sisgep.manager.PessoaFisicaManager;
import br.gov.iphan.sisgep.manager.ServidorManager;
import br.gov.iphan.sisgep.manager.ServidorManagerUserTransaction;
import br.gov.iphan.sisgep.manager.UnidadeAdministrativaManager;
import br.gov.iphan.sisgep.session.AuthenticatorSisgep;
import br.gov.iphan.sisgep.util.Email;
import br.gov.iphan.sisgep.util.Mensagens;

/**
 * Classe responsável por promover e tratar ações pertinentes a entidade Servidor e as entidade
 * associadas a ela. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("manterServidorAction")
@Scope(ScopeType.CONVERSATION)
public class ManterServidorAction extends BaseAction {
	private static final long serialVersionUID = -7409735643659325694L;

	private Boolean isIncluindo = false;
	private Boolean isEditando = false;
	private Boolean isVisualizando = false;
	
	private Boolean reRenderedModal;
	
	private Boolean regraModalCessaoReq = true;
	
	@In(required = false, create = true)
	private AreaAtuacaoManager areaAtuacaoManager;

	@In(required = false, create = true)
	@Out(required = false)
	private AreaAtuacao areaAtuacao;
	
	@In(create = true, required = false)
	@Out(required = false)
	private Boolean campoCargoEfetivo;
	
	@In(create = true, required = false)
	@Out(required = false)
	public Boolean modalAreaAtucao;
	
	@In(create = true, required = false)
	@Out(required = false)
	private Boolean campoLotacao;
	
	@In(create = true, required = false)
	@Out(required = false)
	private Boolean ajaxDisable;
	
	@In(create = true, required = false)
	@Out(required = false)
	private Boolean campoCargoEfetivoContratoTempo;
	
	@In(create = true, required = false)
	@Out(required = false)
	private Boolean campoCargoEfetivoEstagio;
	
	@In(create = true, required = false)
	@Out(required = false)
	private Boolean campoCargoEfetivoAposentado;
	
	@In(create = true, required = false)
	@Out(required = false)
	private Boolean isLotacao;
	
	@In(required = false, create = true)
	@Out(required = false)
	private ServidorManager servidorManager;
	
	@In(required = false, create = true)
	@Out(required = false)
	private ServidorManagerUserTransaction servidorManagerUserTransaction;
	
	@In(required = false, create = true)
	@Out(required = false)
	private PessoaFisicaManager pessoaFisicaManager;
	
	@In(required = false, create = true)
	@Out(required = false)
	private UnidadeAdministrativaManager unidadeAdministrativaManager;

	@In(required = false, create = true)
	@Out(required = false)
	public Servidor servidor;
	
	@In(required = false, create = true)
	@Out(required = false)
	private Servidor dadosServidor;
	
	@In(required = false, create = true)
	@Out(required = false)
	public PessoaFisica pessoaFisica;

	@In(required = false, create = true)
	@Out(required = false)
	public NivelCargoFuncionario nivelCargoFuncionario;
	
	@In(required = false, create = true)
	@Out(required = false)
	public NivelCargoFuncionario nivelCargoFuncionarioComissionado;
	
	@In(required = false, create = true)
	@Out(required = false)
	GrupoFuncionario grupoFuncionario;
	
	@In(required = false, create = true)
	@Out(required = false)
	ClasseFuncionario classeFuncionario;

	@In(required = false, create = true)
	@Out(required = false)
	public List<Servidor> listServidor;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<Servidor> listServidorConsulta;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<PessoaFisica> listPessoaFisicaModal;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<UnidadeAdministrativa> listUnidadeAdministrativaModal;
	
	@In(required = false, create = true)
    @Out(required = false)
    public List<UnidadeAdministrativa> listNodesModal;
	
	@In(required = false, create = true)
	@Out(required = false)
	CombosAuxiliarAction combosAuxiliarAction;

	@In(required = false, create = true)
	@Out(required = false)
	private CessaoRequisicao cessaoRequisicao;
	
	@In(required = false, create = true)
	@Out(required = false)
	CessaoRequisicaoManager cessaoRequisicaoManager;
	
	@In(required = false, create = true)
	@Out(required = false)
	private PessoaFisica pessoa;
	
	@In Credentials credentials;
	
	@In(required = false, create = true)
	@Out(required = false)
	private Email emailAction; 
	
	@SuppressWarnings("unused")
	private Boolean podeAdionarCargo; 
	
	private String aba;
	
	@SuppressWarnings("unused")
	private Integer cargoEfetivoSize;
	
	@SuppressWarnings("unused")
	private Integer cargoComissionadoSize;

	
	/**
	 * Metodo responsável por tratar e realizar as ações de Inserção e Atualização da entidade servidor.
	 * @return 			  String contendo o indentificador do redirect que aplicação deve realizar.
	 * @author            Thiago Nunes Vieira
	 **/
	@End
	public void salvarServidor() {
		if(!validarRegras()){
			return;
		}
		
		//setarDadosFuncionais();
		
		getServidor().setIndStatus(1L);
		if(getServidor().getCargoComissionado().getTipoCargoComissinado()==null){
			getServidor().setCargoComissionado(null);
		}
		if(getServidor().getUnidadeAdmLotacao().getId()==null){
			getServidor().setUnidadeAdmLotacao(null);
		}
		
	//	fechServidor();
	//	this.servidor.setPessoaFisica((PessoaFisica)this.pessoaFisicaManager.recuperarPorId(PessoaFisica.class, this.servidor.getPessoaFisica().getId()));
		
		
		this.servidorManager.salvarServidor(getServidor());
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		
		if(!regraModalCessaoReq){
			if(cessaoRequisicao.getIndTipoCessaoReq()!=null){
				cessaoRequisicao.setServidor(getServidor());
				cessaoRequisicaoManager.persistir(cessaoRequisicao);
			}
		}
		setServidor(new Servidor());
		
	}
	
	@SuppressWarnings("unused")
	private void fechServidor() {
		if(this.servidor.getAfastamentos() != null) {
			for (Afastamento afastamento : this.servidor.getAfastamentos()) {
				System.out.println(afastamento.getId());
			}
			
		}
		if(this.servidor.getCargoFuncao() != null) {
			for (CargoFuncao cargoFuncao : this.servidor.getCargoFuncao()) {
				System.out.println(cargoFuncao.getId());
			}
			this.servidor.getCargoFuncao().size();
		}

		if(this.servidor.getCessaoRequisicaos() != null) {
			for (CessaoRequisicao cessaoRequisicao : this.servidor.getCessaoRequisicaos()) {
				System.out.println(cessaoRequisicao.getId());
			}
			this.servidor.getCessaoRequisicaos().size();
		}
		if(this.servidor.getDependentes() != null) {
			for (Dependente dependente : this.servidor.getDependentes()) {
				System.out.println(dependente.getId());
			}
			this.servidor.getDependentes().size();
		}	
		if(this.servidor.getFormacaoAcademicas() != null) {
			for (FormacaoAcademica formacaoAcademica : this.servidor.getFormacaoAcademicas()) {
				System.out.println(formacaoAcademica.getId());
			}
			this.servidor.getFormacaoAcademicas().size();
		}
		
		if(this.servidor.getUniAdministrativas() != null) {
			for (UnidadeAdministrativa unidadeAdministrativa : this.servidor.getUniAdministrativas()) {
				System.out.println(unidadeAdministrativa.getId());
				UnidadeAdministrativa unidadeAdministrativaInner = unidadeAdministrativa.getUnidadeAdministrativa();
				if (unidadeAdministrativaInner!= null) {
					Servidor servidorInner = unidadeAdministrativaInner.getServidor();
					if (servidorInner != null) {
						servidorInner.getId();
					}
				}
				List<UnidadeAdministrativa> unidadeAdministrativas = unidadeAdministrativa.getUnidadeAdministrativas();
				if (unidadeAdministrativas != null) {
					for (UnidadeAdministrativa unidadeAdministrativaInner2 : unidadeAdministrativas) {
						Servidor servidorInner = unidadeAdministrativaInner2.getServidor();
						if (servidorInner != null) {
							servidorInner.getId();
						}
					}
				}
			}
//			this.servidor.getUniAdministrativas().size();
		}
		
		if(this.servidor.getCargoComissionado() != null) {
			System.out.println(this.servidor.getCargoComissionado().getId());
		}
		if(this.servidor.getCargoEfetivo() != null) {
			System.out.println(this.servidor.getCargoEfetivo().getId());
		}
		if(this.servidor.getFormaIngressoAposentacao1() != null) {
			System.out.println(this.servidor.getFormaIngressoAposentacao1().getId());
		}
		if(this.servidor.getFormaIngressoAposentacao2() != null) {
			System.out.println(this.servidor.getFormaIngressoAposentacao2().getId());
		}
		if(this.servidor.getFormaIngressoAposentacao3() != null) {
			System.out.println(this.servidor.getFormaIngressoAposentacao3().getId());
		}
		if(this.servidor.getFormaSaida() != null) {
			System.out.println(this.servidor.getFormaSaida().getId());
		}
		if(this.servidor.getPessoaFisica() != null) {
			System.out.println(this.servidor.getPessoaFisica().getId());
			List<Servidor> servidors = this.servidor.getPessoaFisica().getServidors();
			if (servidors != null) {
				for (Servidor servidorInner : servidors) {
					PessoaFisica pessoaFisicaInner = servidorInner.getPessoaFisica();
					if (pessoaFisicaInner != null) {
						pessoaFisicaInner.getId();
					}
				}
			}
		}
		if(this.servidor.getSituacaoFuncional() != null) {
			System.out.println(this.servidor.getSituacaoFuncional().getId());
		}

		if(this.servidor.getUnidadeAdministrativa() != null) {
			System.out.println(this.servidor.getUnidadeAdministrativa().getId());
		}
		if(this.servidor.getUnidadeAdministrativaExce() != null) {
			System.out.println(this.servidor.getUnidadeAdministrativaExce().getId());
		}
		if(this.servidor.getUnidadeAdmLotacao() != null) {
			System.out.println(this.servidor.getUnidadeAdmLotacao().getId());
		}
		
	}

	@SuppressWarnings("unused")
	private void setarDadosFuncionais() {
		
		this.servidor.setSituacaoFuncional(this.dadosServidor.getSituacaoFuncional());
		this.servidor.setNumJornadaTrabalho(this.dadosServidor.getNumJornadaTrabalho());
		this.servidor.setFormaIngressoAposentacao1(this.dadosServidor.getFormaIngressoAposentacao1());
		this.servidor.setFormaIngressoAposentacao2(this.dadosServidor.getFormaIngressoAposentacao2());
		this.servidor.setFormaIngressoAposentacao3(this.dadosServidor.getFormaIngressoAposentacao3());
		this.servidor.setFormaSaida(this.dadosServidor.getFormaSaida());
		this.servidor.setUnidadeAdmLotacao(this.dadosServidor.getUnidadeAdmLotacao());
		this.servidor.setUnidadeAdministrativaExce(this.dadosServidor.getUnidadeAdministrativaExce());
		this.servidor.setDatPrimeiroEmprego(this.dadosServidor.getDatPrimeiroEmprego());

	}

	/**
	 * Metodo responsável por persistir a cessaoRequisicao de acordo com a situacao.
	 * @author            Thiago Nunes Vieira
	 **/
	public void salvarCessaoRequisicao(){
		this.cessaoRequisicao.setServidor(getServidor());
		if(getServidor().getId()!=null){
			if(!validarRegras()){
				return;
			}
			cessaoRequisicaoManager.salvar(cessaoRequisicao);
		}
		else{
			if(getServidor().getCessaoRequisicaos()==null){
				getServidor().setCessaoRequisicaos(new HashSet<CessaoRequisicao>());
			}
			getServidor().getCessaoRequisicaos().add(cessaoRequisicao);
		}
		
		reRenderedModal = false;
	}
	
	/**
	 * Metodo responsável por realizar a regra do prazo de afastamento.
	 * @author            Thiago Nunes Vieira
	 **/
	public void verificaPrazoAfastamentoIlimitado(){
		if(cessaoRequisicao.getIndPrazoIlimitado()!=null && cessaoRequisicao.getIndPrazoIlimitado().equals("N")){
			cessaoRequisicao.setNumPrazo(null);
			cessaoRequisicao.setDatRenovacao(null);
		}
	}
	
	/**
	 * Metodo responsável por calcular o intervalo entre a data de início de afastamento e data fim de afastamento.
	 * @author            Thiago Nunes Vieira
	 **/
	public void calcularRenovacao(){
		if(cessaoRequisicao.getDatCessaoRequisicao()!=null &&
				cessaoRequisicao.getNumPrazo()!=null){
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(cessaoRequisicao.getDatCessaoRequisicao());
			calendar.add(Calendar.YEAR, cessaoRequisicao.getNumPrazo().intValue());
			cessaoRequisicao.setDatRenovacao(calendar.getTime());
			
		}
	}
	
	/**
	 * Metodo responsável por tratar e realizar as ações de Inserção e Atualização da entidade Area Atuação.
	 * @author            Thiago Nunes Vieira
	 **/
	public void salvarAreaAtucao() {
		if(getServidor().getCargoComissionado()!=null){
			if(getServidor().getCargoComissionado().getTipoCargoComissinado()==null){
				getServidor().setCargoComissionado(null);
			}
		}
		if(getServidor().getCargoEfetivo()!=null){
			if(getServidor().getCargoEfetivo().getCargoFuncionario()==null){
				getServidor().setCargoEfetivo(null);
			}
		}
		
		areaAtuacaoManager.salvar(areaAtuacao);
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		areaAtuacao = new AreaAtuacao();
		modalAreaAtucao=false;
	}
	
	/**
	 * Metodo responsável por cancelar a operação de salvar Area Atuação
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void cancelarSalvarAreaAtucao() {
		areaAtuacao = new AreaAtuacao();
	}
	
	/**
	 * Metodo responsável por preparar a inclusão da entidade Area Atuação.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void irIncluirAreaAtucao(){
		areaAtuacao = new AreaAtuacao();
		modalAreaAtucao=true;
	}

	/**
	 * Metodo responsável por verificar as regras ao persistir o servidor.
	 * @return 			  Boolean
	 * @author            Thiago Nunes Vieira
	 **/
	public Boolean validarRegras() {
		
		if (getServidor().getId() == null) {
			if (servidorManager.verificarDuplicidade(getServidor()) > 0) {
				mensagemWarn(Mensagens.MSGW002.retornaMensagem(getServidor()
						.getNumMatricula().toString()));
				return false;
			}
			getServidor().setFormacaoAcademicas(null);
			getServidor().setDependentes(null);
			getServidor().setCessaoRequisicaos(null);
			getServidor().setAfastamentos(null);
		}
		if(getServidor().getFormacaoAcademicas()==null || 
				getServidor().getFormacaoAcademicas().isEmpty()){
			getServidor().setFormacaoAcademicas(null);
		}
		if (getServidor().getPessoaFisica().getDatEmissaoRg() != null) {
			if (getServidor().getPessoaFisica().getDatEmissaoRg().after(new Date())) {
				mensagemWarn(Mensagens.MSGW004.retornaMensagem("Informe a data de emissão."));
				return false;
			}
		}
		if (getServidor().getPessoaFisica().getDatNascimento() != null) {
			if (getServidor().getPessoaFisica().getDatNascimento().after(new Date())) {
				mensagemWarn(Mensagens.MSGW004.retornaMensagem("Informe a data de nascimento."));
				return false;
			}
		}
		if (getServidor().getFormaSaida().getDatSaida() != null
				&& getServidor().getFormaIngressoAposentacao1().getDatIngressoApos() != null) {
			if (getServidor().getFormaSaida().getDatSaida().before(
					getServidor().getFormaIngressoAposentacao1().getDatIngressoApos())) {
				mensagemWarn(Mensagens.MSGW009.retornaMensagem("Informe a data de saída do IPHAN."));
				return false;
			}
		}
		if ((getServidor().getCargoEfetivo().getOcupacao() != null
				|| getServidor().getCargoEfetivo().getCodVaga() != null)
				&& getServidor().getCargoEfetivo().getCargoFuncionario() == null) {
			mensagemWarn("Informe o cargo do funcionário.");
			return false;
		}
		if ((getServidor().getCargoEfetivo().getCargoFuncionario() == null
				|| getServidor().getCargoEfetivo().getOcupacao() == null
				|| getServidor().getCargoEfetivo().getCodVaga() == null)
				&& getServidor().getCargoEfetivo().getCargoFuncionario() == null) {
			getServidor().setCargoEfetivo(null);
		}
		if(getServidor().getCargoComissionado().getTipoCargoComissinado()==null){
			getServidor().setCargoComissionado(null);
		}
		if(getServidor().getFormaSaida().getFormaPassagemServ()==null){
			getServidor().setFormaSaida(null);
		}
		if(getServidor().getFormaIngressoAposentacao3().getFormaPassagemServ()==null){
			getServidor().setFormaIngressoAposentacao3(null);
		}
		if(getServidor().getId() == null && getServidor().getPessoaFisica().getPessoaContatoEmailCorp() != null 
				&& getServidor().getPessoaFisica().getPessoaContatoEmailCorp().getTxtContato() != null && getServidor().getPessoaFisica().getPessoaContatos() != null){
			getServidor().getPessoaFisica().getPessoaContatoEmailCorp().setIndContato(ContatoEnum.EMAIL_CORP.getChave());
			getServidor().getPessoaFisica().getPessoaContatoEmailCorp().setPessoaFisica(getServidor().getPessoaFisica());
			getServidor().getPessoaFisica().getPessoaContatos().add(getServidor().getPessoaFisica().getPessoaContatoEmailCorp());
		}
		if(!validarPessoa(getServidor().getPessoaFisica())){
			mensagemWarn(Mensagens.MSGW002.retornaMensagem(getServidor().getPessoaFisica().getNomPessoaFisica()));
			return false;
		}
	/*	if(campoLotacao){
			if(getServidor().getUnidadeAdmLotacao()==null){
				mensagemWarn("O preenchimento da unidade de lotação é obrigatório.");
				return false;
			}
			if(getServidor().getUnidadeAdmLotacao()!=null){
				if(getServidor().getUnidadeAdmLotacao().getId()==null){
					mensagemWarn("O preenchimento da unidade de lotação é obrigatório.");
					return false;
				}
			}
		}*/
//		if(getServidor().getUnidadeAdministrativaExce() == null){
//			getServidor().setUnidadeAdministrativaExce(new UnidadeAdministrativa());
//			return false;
//		}
//		if(getServidor().getUnidadeAdministrativaExce() != null){
//			if(getServidor().getUnidadeAdministrativaExce().getNomUnidadeAdministrativa() == null
//					|| getServidor().getUnidadeAdministrativaExce().getNomUnidadeAdministrativa().equals("")){
//				mensagemWarn("O preenchimento da Unidade de Exercício é obrigatório.");
//				return false;
//			}
//		}
		return true;
	}
	
	public boolean verificaSituacaoFuncinalPreenchida(){
		if(this.servidor.getSituacaoFuncional() == null || this.servidor.getSituacaoFuncional().getTxtDescricao() == null || this.servidor.getSituacaoFuncional().getTxtDescricao() == ""){
			return true;
		}else{
			return false;
		}
		
	}
	
	public void mostraMensagemSituacaoFuncionalVazia(){
		mensagemWarn("Por favor, primeiro preencha a Situação Funcional na aba Dados Funcionais.");
	}

	/**
	 * Metodo responsável por tratar e realizar a ações de exclusão da entidade servidor.
	 * @author            Thiago Nunes Vieira
	 **/
	public void excluir() {
		listServidor.remove(getServidor());
		servidorManager.excluir(getServidor());
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		setServidor(new Servidor());
	}

	/**
	 * Metodo responsável por promover e realizar a ações de pesquisa da entidade servidor.
	 * @author            Thiago Nunes Vieira
	 **/
	public void procurar() {

		if ((getServidor().getDatIngressoOrgaoInicio() != null && getServidor().getDatIngressoOrgaoFim() == null) || 
			(getServidor().getDatIngressoOrgaoInicio() == null && getServidor().getDatIngressoOrgaoFim() != null)) {
			if (getServidor().getDatIngressoOrgaoInicio() == null || getServidor().getDatIngressoOrgaoFim() == null) {
				mensagemWarn("Informe a data inicial e data final.");
				getServidor().setDatIngressoOrgaoFim(null);
				getServidor().setDatIngressoOrgaoInicio(null);
				return;
			} else if (getServidor().getDatIngressoOrgaoInicio().after(getServidor().getDatIngressoOrgaoFim())) {
				mensagemWarn("A data inicial da Data de Entrada do IPHAN não pode ser maior que a data a sua data final.");
				return;
			}
		}

		listServidor = servidorManager.consultarServidor(getServidor());
		if (listServidor == null || listServidor.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}
	
	
	public List<Servidor> getMatriculas() {
		if(getServidor().getPessoaFisica() != null && getServidor().getPessoaFisica().getServidors() != null) {
			return getServidor().getPessoaFisica().getServidors();
		}
		return new ArrayList<Servidor>();
	}
	
	public Integer getNumeroMatriculas() {
		return this.getMatriculas().size();
	}
	
	/**
	 * Metodo responsável por promover e realizar a ações de pesquisa da entidade Pessoa.
	 * @author            Thiago Nunes Vieira
	 **/
	public void procurarPessoa() {
		listPessoaFisicaModal = pessoaFisicaManager.consultarPessoaFisica(pessoaFisica);
		if (listPessoaFisicaModal == null || listPessoaFisicaModal.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}
	
	/**
	 * Metodo responsável por promover e realizar a ações de pesquisa da entidade Unidade Administrativa.
	 * @author            Thiago Nunes Vieira
	 **/
	public void procurarUnidadeAdmin() {
		listNodesModal = new ArrayList<UnidadeAdministrativa>();
		listUnidadeAdministrativaModal = new ArrayList<UnidadeAdministrativa>();
		listUnidadeAdministrativaModal = unidadeAdministrativaManager.consultarUnidadeAdministrativa(getServidor());
		if (listUnidadeAdministrativaModal == null || listUnidadeAdministrativaModal.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
		else{
			if(getServidor().getUnidadeAdministrativa().getNomUnidadeAdministrativa().trim().equals("")
					&& getServidor().getUnidadeAdministrativa().getUnidadeAdministrativa().getNomUnidadeAdministrativa().trim().equals("")
					&& getServidor().getUnidadeAdministrativa().getSiglaUnidade()==null
					&& getServidor().getUnidadeAdministrativa().getCodUf()==null){
				for(UnidadeAdministrativa adm : listUnidadeAdministrativaModal){
					if(adm.getUnidadeAdministrativa() == null){
						listNodesModal.add(adm);
					}
				}
			}
			else{
				for(UnidadeAdministrativa adm : listUnidadeAdministrativaModal){
	            	if(adm.getUnidadeAdministrativa() != null){
	            		UnidadeAdministrativa administrativa = recursivo(adm);
	            		if(!listNodesModal.contains(administrativa)){
	            			listNodesModal.add(adm);
	            		}
	            	}
	            }
			}
			
			if(getServidor().getUnidadeAdministrativa().getCodUf() != null){
				List<UnidadeAdministrativa> listNodes2 = new ArrayList<UnidadeAdministrativa>();
				listNodes2.addAll(listNodesModal);
				for(UnidadeAdministrativa ad : listNodes2){
					if(ad.getUnidadeAdministrativas()!=null){
						listNodesModal.removeAll(ad.getUnidadeAdministrativas());
					}
				}
			}
        }
		
	}
	
	/**
	 * Metodo montar a arvore de unidades organizacional
	 * @param 			  UnidadeAdministrativa adm
	 * @return			  UnidadeAdministrativa 
	 * @author            Thiago Nunes Vieira
	 **/
	public UnidadeAdministrativa recursivo(UnidadeAdministrativa adm){
		UnidadeAdministrativa administrativa=adm;
		if(administrativa.getUnidadeAdministrativa() != null && administrativa.getUnidadeAdministrativa().getUnidadeAdministrativa()==null){
			recursivo(administrativa.getUnidadeAdministrativa());
		}
		return administrativa;
	}
	
	/**
	 * Metodo responsável por cancelamento da consulta de pessoa
	 * @author            Thiago Nunes Vieira
	 **/
	public void cancelarModal(){
		getServidor().setPessoaFisica(new PessoaFisica());
	}
	
	/**
	 * Metodo responsável por promover vincular pessoa ao servidor.
	 * @author            Thiago Nunes Vieira
	 **/
	public void vincularPessoa(PessoaFisica vincularPessoaFisica) {
		getServidor().setPessoaFisica(vincularPessoaFisica);
		controleContato();
	}

	/**
	 * Metodo responsável por prepara a consulta de Unidade Administrativa.
	 * @author            Thiago Nunes Vieira
	 **/
	public void prepararModalUnidade(String key){
		if(key.equals("S")){
			isLotacao = true;
		}
		else{
			isLotacao = false;
		}
		getServidor().setUnidadeAdministrativa(new UnidadeAdministrativa());
		getServidor().getUnidadeAdministrativa().setUnidadeAdministrativa(new UnidadeAdministrativa());
		listUnidadeAdministrativaModal= new ArrayList<UnidadeAdministrativa>();
		listNodesModal= new ArrayList<UnidadeAdministrativa>();
	}
	

	/**
	 * Metodo responsável por promover vincular Unidade Administrativa ao servidor.
	 * @author            Thiago Nunes Vieira
	 **/
	public void vincularUnidade(UnidadeAdministrativa unidadeAdministrativaa){
		if(isLotacao){
			getServidor().setUnidadeAdmLotacao(unidadeAdministrativaa);
		}
		else{
			getServidor().setUnidadeAdministrativaExce(unidadeAdministrativaa);
		}
	}

	/**
	 * Metodo responsável por preparar a entidade servidor para inclusão.
	 * @return 			  String contendo o indentificador do redirect para a interface de inclusão de servidor.
	 * @author            Thiago Nunes Vieira
	 **/
	public String irIncluir() {
		limparObjetos();
		combosAuxiliarAction.setUf(new Uf());
		combosAuxiliarAction.setUf2(new Uf());
		
		nivelCargoFuncionario = new NivelCargoFuncionario();
		grupoFuncionario = new GrupoFuncionario();
		classeFuncionario = new ClasseFuncionario();
		
		
		isEditando = false;
		isIncluindo = true;
		isVisualizando = false;
		
		this.campoCargoEfetivo=true;
		this.campoCargoEfetivoContratoTempo=true;
		this.campoCargoEfetivoEstagio=true;
		this.campoCargoEfetivoAposentado=true;
		this.ajaxDisable = true;
		campoLotacao = false;
		
		if(this.pessoaFisica != null) {
			this.getServidor().setPessoaFisica(this.pessoaFisica);
		}
		
		controllerHelper.setRedirect("?Page=Pesquisar_Servidor___Dados_Pessoais___Incluir");
		return "ir_incluir";
	}
	
	@In(create=true)
	private Renderer renderer;
	   
	@SuppressWarnings("deprecation")
	public void send() {
		try {
			AuthenticatorSisgep authenticatorSisgep = new AuthenticatorSisgep();
			setPessoa(authenticatorSisgep.getEmailUsuario(credentials));
			renderer.render("/pages/email/sincronizacaoConcluida.xhtml");
			facesMessages.add("Email sent successfully");
		} catch (Exception e) {
			facesMessages.add(FacesMessage.SEVERITY_INFO, "Email sending failed: " + e.getMessage());
		}
	}
	
	
	/*
	
	public String mandarEmail() {
		
		return emailAction.enviarEmailSincronizacao();
	}
	/*
	/**
	 * Metodo responsável por limpar a entidade CessaoRequisicao após fecha a modal.
	 * @author            Thiago Nunes Vieira
	 **/
	public void voltarModal() {
		this.cessaoRequisicao = new CessaoRequisicao();
	}
	
	/**
	 * Metodo responsável por limpar a entidade CessaoRequisicao após fecha a modal.
	 * @author            Thiago Nunes Vieira
	 **/
	public void cancelarModalCessaoRequisicao() {
		this.cessaoRequisicao = new CessaoRequisicao();
		getServidor().setSituacaoFuncional(new SituacaoFuncional());
	}


	/**
	 * Metodo responsável por preparar a entidade servidor para edição.
	 * @return 			  String contendo o indentificador do redirect para a interface de edição de servidor.
	 * @author            Thiago Nunes Vieira
	 **/
	public String irEditar(Servidor servidorEditar) {
		
		isEditando = true;
		isIncluindo = false;
		isVisualizando = false;
		
		this.campoCargoEfetivo=true;
		this.campoCargoEfetivoContratoTempo=true;
		this.campoCargoEfetivoEstagio=true;
		this.campoCargoEfetivoAposentado=true;
		this.ajaxDisable = false;
		campoLotacao = false;
		this.setServidor(servidorEditar);
		
		//recuperarDadosFuncionais();
		
		
		if(servidorEditar.getCargoEfetivo()!=null){
			if(servidorEditar.getCargoEfetivo().getCargoFuncionario()!=null){
				if(servidorEditar.getCargoEfetivo().getCargoFuncionario().getGrupoFuncionario()!=null){
					combosAuxiliarAction.setNivelCargoFuncionario(servidorEditar.getCargoEfetivo().
							getCargoFuncionario().getGrupoFuncionario().getNivelCargoFuncionario());
					combosAuxiliarAction.setGrupoFuncionario(servidorEditar.getCargoEfetivo().
							getCargoFuncionario().getGrupoFuncionario());
					
					nivelCargoFuncionario = servidorEditar.getCargoEfetivo().
							getCargoFuncionario().getGrupoFuncionario().getNivelCargoFuncionario();
					grupoFuncionario = servidorEditar.getCargoEfetivo().
							getCargoFuncionario().getGrupoFuncionario();
					
					if(servidorEditar.getCargoEfetivo().getPadraoCargo()!=null){
						combosAuxiliarAction.setClasseFuncionario(servidorEditar.getCargoEfetivo().
								getPadraoCargo().getClasseFuncionario());
						
						classeFuncionario = servidorEditar.getCargoEfetivo().
								getPadraoCargo().getClasseFuncionario();
					}
				}
			}
		}
		if(getServidor().getSituacaoFuncional()!=null){
			if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(1L)
					|| getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(2L)
					|| getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(3L)
					|| getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(66L)){
				this.campoLotacao = true;
			}
			else{
				this.campoLotacao = false;
			}
		}
		controleContato();
		controllerHelper.setRedirect("?Page=Editar___Dados_Pessoais");
		return "ir_editar";
	}
	
	@SuppressWarnings("unused")
	private void recuperarDadosFuncionais() {
		if(this.servidor != null) {
			this.dadosServidor = new Servidor();	
			this.dadosServidor.setSituacaoFuncional(this.servidor.getSituacaoFuncional());
			this.dadosServidor.setNumJornadaTrabalho(this.servidor.getNumJornadaTrabalho());
			this.dadosServidor.setFormaIngressoAposentacao1(this.servidor.getFormaIngressoAposentacao1());
			this.dadosServidor.setFormaIngressoAposentacao2(this.servidor.getFormaIngressoAposentacao2());
			this.dadosServidor.setFormaIngressoAposentacao3(this.servidor.getFormaIngressoAposentacao3());
			this.dadosServidor.setFormaSaida(this.servidor.getFormaSaida());
			this.dadosServidor.setUnidadeAdmLotacao(this.servidor.getUnidadeAdmLotacao());
			this.dadosServidor.setUnidadeAdministrativaExce(this.servidor.getUnidadeAdministrativaExce());
			this.dadosServidor.setDatPrimeiroEmprego(this.servidor.getDatPrimeiroEmprego());
		}
	}

	public String irEditarRedirect(Servidor servidorIrEditar) {
		this.irEditar(servidorIrEditar);
		controllerHelper.setRedirect("?Page=Editar___Dados_Pessoais&faces-redirect=true");
		return "ir_editar";
	}
	
	public void trocarServidor(Servidor trocarServidor) {
		this.setServidor(trocarServidor);
	}
	
	public String adicionarServidor(PessoaFisica AddPessoaFisica) {
		this.pessoaFisica = AddPessoaFisica;
		this.setServidor(new Servidor());
		return irIncluir();
	}


	/**
	 * Metodo responsável por preparar a entidade servidor para visualização.
	 * @return 			  String contendo o indentificador do redirect para a interface de visualização de servidor.
	 * @author            Thiago Nunes Vieira
	 **/
	public String irVisualizar(Servidor servidorVisualizar) {
		this.setServidor(servidorVisualizar);
		
		isVisualizando = true;
		isEditando = false;
		isIncluindo = false;
		
		campoLotacao = false;
		if(servidorVisualizar.getCargoEfetivo()!=null){
			if(servidorVisualizar.getCargoEfetivo().getCargoFuncionario()!=null){
				if(servidorVisualizar.getCargoEfetivo().getCargoFuncionario().getGrupoFuncionario()!=null){
					combosAuxiliarAction.setNivelCargoFuncionario(servidorVisualizar.getCargoEfetivo().
							getCargoFuncionario().getGrupoFuncionario().getNivelCargoFuncionario());
					combosAuxiliarAction.setGrupoFuncionario(servidorVisualizar.getCargoEfetivo().
							getCargoFuncionario().getGrupoFuncionario());
					
					nivelCargoFuncionario = servidorVisualizar.getCargoEfetivo().
							getCargoFuncionario().getGrupoFuncionario().getNivelCargoFuncionario();
					grupoFuncionario = servidorVisualizar.getCargoEfetivo().
							getCargoFuncionario().getGrupoFuncionario();
					
					if(servidorVisualizar.getCargoEfetivo().getPadraoCargo()!=null){
						combosAuxiliarAction.setClasseFuncionario(servidorVisualizar.getCargoEfetivo().
								getPadraoCargo().getClasseFuncionario());
						
						classeFuncionario = servidorVisualizar.getCargoEfetivo().
								getPadraoCargo().getClasseFuncionario();
					}
				}
			}
		}
		controleContato();
		controllerHelper.setRedirect("?Page=Visualizar___Dados_Pessoais");
		return "ir_visualizar";
	}

	/**
	 * Metodo responsável por preparar a entidade servidor para exclusão.
	 * @return 			  String contendo o indentificador do redirect para a interface de exclusão de servidor.
	 * @author            Thiago Nunes Vieira
	 **/
	public String preparExclusao(Servidor servidorExclusao) {
		this.setServidor(servidorExclusao);
		return null;
	}

	/**
	 * Metodo responsável por limpar os atributos dos objetos.
	 * @author            Thiago Nunes Vieira
	 **/
	private void limparObjetos() {
		setServidor(new Servidor());
		
		if (this.servidor.getFormaIngressoAposentacao1() == null) {
			this.servidor.setFormaIngressoAposentacao1(new FormaIngressoAposentacao());
		}

		if (this.servidor.getFormaIngressoAposentacao2() == null) {
			this.servidor.setFormaIngressoAposentacao2(new FormaIngressoAposentacao());
		}

		if (this.servidor.getFormaIngressoAposentacao3() == null) {
			this.servidor.setFormaIngressoAposentacao3(new FormaIngressoAposentacao());
		}

		isVisualizando = false;
		isIncluindo = true;
		isEditando = false;
		
		this.dadosServidor = new Servidor();
		if (this.dadosServidor.getFormaIngressoAposentacao1() == null) {
			this.dadosServidor.setFormaIngressoAposentacao1(new FormaIngressoAposentacao());
		}

		if (this.dadosServidor.getFormaIngressoAposentacao2() == null) {
			this.dadosServidor.setFormaIngressoAposentacao2(new FormaIngressoAposentacao());
		}

		if (this.dadosServidor.getFormaIngressoAposentacao3() == null) {
			this.dadosServidor.setFormaIngressoAposentacao3(new FormaIngressoAposentacao());
		}
	}


	/**
	 * Metodo responsável por carregar e controlar os Contatos e o Endereço do Servidor.
	 * @author            Thiago Nunes Vieira
	 **/
	private void controleContato() {

		if (getServidor().getPessoaFisica().getId() == null) {
			if (getServidor().getPessoaFisica().getPessoaContatos() == null) {
				getServidor().getPessoaFisica().setPessoaContatos(
						new HashSet<PessoaContato>());
			}
			if (getServidor().getPessoaFisica().getPessoaContatoTel()
					.getTxtContato() != null
					&& !getServidor().getPessoaFisica().getPessoaContatoTel()
							.getTxtContato().trim().equals("")) {
				getServidor().getPessoaFisica().getPessoaContatoTel()
						.setIndContato(ContatoEnum.TELEFONE.getChave());
				getServidor().getPessoaFisica().getPessoaContatoTel()
						.setPessoaFisica(getServidor().getPessoaFisica());
				getServidor().getPessoaFisica().getPessoaContatos()
						.add(getServidor().getPessoaFisica().getPessoaContatoTel());
			}
			if (getServidor().getPessoaFisica().getPessoaContatoCel()
					.getTxtContato() != null
					&& !getServidor().getPessoaFisica().getPessoaContatoCel()
							.getTxtContato().trim().equals("")) {
				getServidor().getPessoaFisica().getPessoaContatoCel()
						.setIndContato(ContatoEnum.CELULAR.getChave());
				getServidor().getPessoaFisica().getPessoaContatoCel()
						.setPessoaFisica(getServidor().getPessoaFisica());
				getServidor().getPessoaFisica().getPessoaContatos()
						.add(getServidor().getPessoaFisica().getPessoaContatoCel());
			}
			if (getServidor().getPessoaFisica().getPessoaContatoEmail()
					.getTxtContato() != null
					&& !getServidor().getPessoaFisica().getPessoaContatoEmail()
							.getTxtContato().trim().equals("")) {
				getServidor().getPessoaFisica().getPessoaContatoEmail()
						.setIndContato(ContatoEnum.EMAIL.getChave());
				getServidor().getPessoaFisica().getPessoaContatoEmail()
						.setPessoaFisica(getServidor().getPessoaFisica());
				getServidor().getPessoaFisica()
						.getPessoaContatos()
						.add(getServidor().getPessoaFisica().getPessoaContatoEmail());
			}

			if (getServidor().getPessoaFisica().getPessoaContatoEmailCorp()
					.getTxtContato() != null
					&& !getServidor().getPessoaFisica().getPessoaContatoEmailCorp()
							.getTxtContato().trim().equals("")) {
				getServidor().getPessoaFisica().getPessoaContatoEmailCorp()
						.setIndContato(ContatoEnum.EMAIL_CORP.getChave());
				getServidor().getPessoaFisica().getPessoaContatoEmailCorp()
						.setPessoaFisica(getServidor().getPessoaFisica());
				getServidor().getPessoaFisica()
						.getPessoaContatos()
						.add(getServidor().getPessoaFisica()
								.getPessoaContatoEmailCorp());
			}
		} else {
			
			if(getServidor().getPessoaFisica().getPessoaEnderecos() !=null &&
					!getServidor().getPessoaFisica().getPessoaEnderecos().isEmpty()){
				getServidor().getPessoaFisica().setPessoaEndereco(
						getServidor().getPessoaFisica().getPessoaEnderecos().iterator().next());
			}
			if (getServidor().getPessoaFisica().getPessoaContatos() != null) {
				for (PessoaContato pessoaContato : getServidor().getPessoaFisica()
						.getPessoaContatos()) {
					if (pessoaContato.getIndContato().equals(
							ContatoEnum.TELEFONE.getChave())) {
						getServidor().getPessoaFisica().setPessoaContatoTel(
								pessoaContato);
					}
					if (pessoaContato.getIndContato().equals(
							ContatoEnum.CELULAR.getChave())) {
						getServidor().getPessoaFisica().setPessoaContatoCel(
								pessoaContato);
					}
					if (pessoaContato.getIndContato().equals(
							ContatoEnum.EMAIL.getChave())) {
						getServidor().getPessoaFisica().setPessoaContatoEmail(
								pessoaContato);
					}
					if (pessoaContato.getIndContato().equals(
							ContatoEnum.EMAIL_CORP.getChave())) {
						getServidor().getPessoaFisica().setPessoaContatoEmailCorp(
								pessoaContato);
					}
				}
			}

		}

	}
	
	/**
	 * Metodo responsável por realizar as regras de validação de Pessoa Física.
	 * @param  param	  Entidade PessoaFisica com os atributos a serem validados.
	 * @return			  boolean com o status da validação.
	 * @author            Thiago Nunes Vieira
	 **/
	public boolean validarPessoa(PessoaFisica param) {
		
		PessoaFisica pessoaFisicaCpf = new PessoaFisica();
		if(param.getNumCpf() != null){
			if(param.getId() != null){
				pessoaFisicaCpf = pessoaFisicaManager.verificarDuplicidadeCpf(param);
			}else{
				pessoaFisicaCpf = pessoaFisicaManager.verificarDuplicidadeCpfNovo(param);
			}
			if(pessoaFisicaCpf != null){
				if(pessoaFisicaCpf.getId() !=null){
					registroExistente(pessoaFisicaCpf.getNumCpf());
					return false;
				}
			}
		}
		PessoaFisica pessoaFisicaNome = new PessoaFisica();
		if(param.getId() != null){
			pessoaFisicaNome = pessoaFisicaManager.verificarDuplicidadeNome(param);
		}else{
			pessoaFisicaNome = pessoaFisicaManager.verificarDuplicidadeNomeNovo(param);
		}
		if (pessoaFisicaNome!= null){
			if (pessoaFisicaNome.getId() != null){
				registroExistente(pessoaFisicaNome.getNomPessoaFisica());
				return false;
			}
		}
		if(param.getDatEmissaoRg()!=null){
			if(param.getDatEmissaoRg().after(new Date())){
				mensagemWarn(Mensagens.MSGW004.retornaMensagem("data de emissão"));
			}
		}
		if(param.getDatNascimento()!=null){
			if(param.getDatNascimento().after(new Date())){
				mensagemWarn(Mensagens.MSGW004.retornaMensagem("data de nascimento"));
			}
		}
		return true;
	}
	
	/**
	 * Metodo responsável por realizar as regras de validação da Situacao do servidor.
	 * @author            Thiago Nunes Vieira
	 **/
	public void validarRegraSituacao() {
		if(getServidor() !=null && getServidor().getSituacaoFuncional() != null && getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc() != null){
			if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(3L)
				|| getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(8L)
				|| getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(14L)
				|| getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(18L)
				|| getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(44L)){
				regraModalCessaoReq = false;
			}
			else{
				regraModalCessaoReq = true;
			}
			
			if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(4L)){
				this.campoCargoEfetivo = false;
				this.ajaxDisable = false;
			}
			else{
				this.campoCargoEfetivo = true;
			}
			if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(12L)){
				this.campoCargoEfetivoContratoTempo = false;
				this.ajaxDisable = false;
			}
			else{
				this.campoCargoEfetivoContratoTempo = true;
			}
			if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(66L)){
				getServidor().setCargoEfetivo(new CargoEfetivo());
				getServidor().setCargoComissionado(new CargoComissionado());
				this.campoCargoEfetivoEstagio = false;
				this.ajaxDisable = false;
			}
			else{
				this.campoCargoEfetivoEstagio = true;
			}
			if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(2L)){
				this.campoCargoEfetivoAposentado = false;
				this.ajaxDisable = false;
			}
			else{
				this.campoCargoEfetivoAposentado = true;
			}
			
			if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(1L)
					|| getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(2L)
					|| getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(3L)
					|| getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(66L)){
				this.campoLotacao = true;
			}
			else{
				this.campoLotacao = false;
			}
		}
		else{
			this.ajaxDisable = true;
		}
	}
	
	
	/**
	 * Metodo responsável por voltar o CSU para interdace anterior.
	 * @return 			  String contendo o indentificador do redirect para a interface anterior.
	 * @author            Thiago Nunes Vieira
	 **/
	public String voltar() {
		setServidor(new Servidor());
		combosAuxiliarAction.setUf(new Uf());
		combosAuxiliarAction.setUf2(new Uf());
		setAba("aba1");
		return "voltar";
	}
	
	public Boolean getIsEditando() {
		return isEditando;
	}

	public Boolean getIsIncluindo() {
		return isIncluindo;
	}
	public Boolean getIsVisualizando() {
		return isVisualizando;
	}
	
	public String getAba() {
		return aba;
	}

	/**
	 * Metodo responsável por atribuir a aba que foi selecionada pelo cliente
	 * @author thiago nunes vieira
	 **/
	public void setAba(String aba) {
		this.aba = aba;
		if(aba.equals("aba1")){
			controllerHelper.setRedirect("?Page=Pesquisar_Servidor___Dados_Pessoais___Incluir");
		}
		if(aba.equals("aba2")){
			controllerHelper.setRedirect("?Page=Pesquisar_Servidor___Dados_Funcionais___Incluir");
		}
		if(aba.equals("aba3")){
			controllerHelper.setRedirect("?Page=Pesquisar_Servidor___Cargo_Fun_ao___Incluir");
			validarRegraSituacao();
		}
		if(aba.equals("aba4")){
			controllerHelper.setRedirect("?Page=Pesquisar_Servidor___Afastamento_Ocorrencia");
		}
		if(aba.equals("aba5")){
			controllerHelper.setRedirect("?Page=Pesquisar_Servidor___Cessao_Requisi_ao");
		}
		if(aba.equals("aba6")){
			controllerHelper.setRedirect("?Page=Pesquisar_Servidor___Forma_ao_Academica");
		}
		if(aba.equals("aba7")){
			controllerHelper.setRedirect("?Page=Pesquisar_Servidor___Dependentes");
		}
	}

	public Boolean getReRenderedModal() {
		return reRenderedModal;
	}

	public void setReRenderedModal(Boolean reRenderedModal) {
		this.reRenderedModal = reRenderedModal;
	}

	public Boolean getRegraModalCessaoReq() {
		return regraModalCessaoReq;
	}

	public void setRegraModalCessaoReq(Boolean regraModalCessaoReq) {
		this.regraModalCessaoReq = regraModalCessaoReq;
	}

	public Boolean getPodeAdionarCargoEfetivo() {
		
		if(getServidor() != null && getServidor().getCargoFuncao() != null) {
			Integer efetivos = 0;
			
			for(CargoFuncao cargoFuncao : getServidor().getCargoFuncao()) {
				if(cargoFuncao.getTipoEfetivo()){
					efetivos++;
				}
			}
			if(efetivos >= 1 ) {
				return false;			
			}
		}
		return true;
	}
	
	
	
	public Boolean getPodeAdionarCargoComissionado() {
		
		if(getServidor() != null && getServidor().getCargoFuncao() != null) {
			Integer comissionado = 0;
			
			for(CargoFuncao cargoFuncao : getServidor().getCargoFuncao()) {
				if(!cargoFuncao.getTipoEfetivo()){
					comissionado++;
				}
			}
			
			if(comissionado >= 1 ) {
				return false;			
			}
		}
		return true;
	}	
	
	
	public Boolean getPodeAdionarCargo() {
		return (getPodeAdionarCargoEfetivo() || getPodeAdionarCargoComissionado());
	}

	public void setPodeAdionarCargo(Boolean podeAdionarCargo) {
		this.podeAdionarCargo = podeAdionarCargo;
	}

	public Integer getCargoEfetivoSize() {
		if(getServidor() != null && getServidor().getCargoFuncao() != null) {
			Integer efetivos = 0;
			
			for(CargoFuncao cargoFuncao : getServidor().getCargoFuncao()) {
				if(cargoFuncao.getTipoEfetivo()){
					efetivos++;
				}
			}
			if(efetivos == 1 ) {
				return 1;			
			}
		}
		return 0;
	}

	public void setCargoEfetivoSize(Integer cargoEfetivoSize) {
		this.cargoEfetivoSize = cargoEfetivoSize;
	}
	
	
	
	public Integer getCargoComissionadoSize() {
		if(getServidor() != null && getServidor().getCargoFuncao() != null) {
			Integer comissionado = 0;
			
			for(CargoFuncao cargoFuncao : getServidor().getCargoFuncao()) {
				if(!cargoFuncao.getTipoEfetivo()){
					comissionado++;
				}
			}
			
			if(comissionado == 1 ) {
				return 1;			
			}
		}
		return 0;
	}

	public void setCargoComissionadoSize(Integer cargoComissionadoSize) {
		this.cargoComissionadoSize = cargoComissionadoSize;
	}

	public Servidor getServidor() {
		if (this.servidor.getFormaIngressoAposentacao1() == null) {
			this.servidor.setFormaIngressoAposentacao1(new FormaIngressoAposentacao());
		}

		if (this.servidor.getFormaIngressoAposentacao2() == null) {
			this.servidor.setFormaIngressoAposentacao2(new FormaIngressoAposentacao());
		}

		if (this.servidor.getFormaIngressoAposentacao3() == null) {
			this.servidor.setFormaIngressoAposentacao3(new FormaIngressoAposentacao());
		}

		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
		
		if (this.servidor.getFormaIngressoAposentacao1() == null) {
			this.servidor.setFormaIngressoAposentacao1(new FormaIngressoAposentacao());
		}

		if (this.servidor.getFormaIngressoAposentacao2() == null) {
			this.servidor.setFormaIngressoAposentacao2(new FormaIngressoAposentacao());
		}

		if (this.servidor.getFormaIngressoAposentacao3() == null) {
			this.servidor.setFormaIngressoAposentacao3(new FormaIngressoAposentacao());
		}

	}

	public Servidor getDadosServidor() {
		if (this.dadosServidor.getFormaIngressoAposentacao1() == null) {
			this.dadosServidor.setFormaIngressoAposentacao1(new FormaIngressoAposentacao());
		}

		if (this.dadosServidor.getFormaIngressoAposentacao2() == null) {
			this.dadosServidor.setFormaIngressoAposentacao2(new FormaIngressoAposentacao());
		}

		if (this.dadosServidor.getFormaIngressoAposentacao3() == null) {
			this.dadosServidor.setFormaIngressoAposentacao3(new FormaIngressoAposentacao());
		}

		return dadosServidor;
	}

	public void setDadosServidor(Servidor dadosServidor) {
		this.dadosServidor = dadosServidor;

		if (this.dadosServidor.getFormaIngressoAposentacao1() == null) {
			this.dadosServidor.setFormaIngressoAposentacao1(new FormaIngressoAposentacao());
		}

		if (this.dadosServidor.getFormaIngressoAposentacao2() == null) {
			this.dadosServidor.setFormaIngressoAposentacao2(new FormaIngressoAposentacao());
		}

		if (this.dadosServidor.getFormaIngressoAposentacao3() == null) {
			this.dadosServidor.setFormaIngressoAposentacao3(new FormaIngressoAposentacao());
		}

	}

	public PessoaFisica getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaFisica pessoa) {
		this.pessoa = pessoa;
	}
	
}