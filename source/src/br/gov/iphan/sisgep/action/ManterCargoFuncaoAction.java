package br.gov.iphan.sisgep.action;

import java.util.HashSet;
import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.Create;
import org.jboss.seam.annotations.FlushModeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

import br.gov.iphan.sisgep.entity.AreaAtuacao;
import br.gov.iphan.sisgep.entity.CargoComissionado;
import br.gov.iphan.sisgep.entity.CargoEfetivo;
import br.gov.iphan.sisgep.entity.CargoFuncao;
import br.gov.iphan.sisgep.entity.CargoFuncionario;
import br.gov.iphan.sisgep.entity.ClasseFuncionario;
import br.gov.iphan.sisgep.entity.FormacaoAcademica;
import br.gov.iphan.sisgep.entity.GrupoFuncionario;
import br.gov.iphan.sisgep.entity.InstituicaoEnsino;
import br.gov.iphan.sisgep.entity.NivelCargoFuncionario;
import br.gov.iphan.sisgep.entity.TipoCargoComissinado;
import br.gov.iphan.sisgep.manager.AreaAtuacaoManager;
import br.gov.iphan.sisgep.manager.CargoFuncionarioManager;
import br.gov.iphan.sisgep.manager.FormacaoAcademicaManager;
import br.gov.iphan.sisgep.manager.GrupoFuncionarioManager;
import br.gov.iphan.sisgep.manager.InstituicaoEnsinoManager;
import br.gov.iphan.sisgep.util.Mensagens;

/**
 * Classe responsável por promover e tratar ações pertinentes a entidade
 * Formacao Academica e as entidade associadas a ela.
 * 
 * @author Erick Xavier
 **/
@Name("manterCargoFuncaoAction")
@Scope(ScopeType.CONVERSATION)
public class ManterCargoFuncaoAction extends ManterServidorAction {
	private static final long serialVersionUID = -7409735643659325694L;
	
	
	public ManterCargoFuncaoAction() {
		super();
	}

	
	private Boolean podeFechar = false;

	public boolean cursando = false;
	
	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isIncluirCargoFuncao;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isEditarCargoFuncao;
	
	@In(create = true, required = false)
	@Out(required = false)
	private Boolean isVisualizarCargoFuncao;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean podeTrocarTipo;
	
	@In(create = true, required = false)
	@Out(required = false)
	public Boolean modalIntistuicao;

	@In(create = true, required = false)
	@Out(required = false)
	public CargoFuncionario cargoFuncionario;
	
	@In(create = true, required = false)
	@Out(required = false)
	public CargoFuncionarioManager cargoFuncionarioManager;
	
	@In(create = true, required = false)
	@Out(required = false)
	public GrupoFuncionarioManager grupoFuncionarioManager;

	@In(required = false, create = true)
	@Out(required = false)
	private FormacaoAcademica formacaoAcademica;

	@In(required = false, create = true)
	FormacaoAcademicaManager formacaoAcademicaManager;

	@In(required = false, create = true)
	InstituicaoEnsinoManager instituicaoEnsinoManager;

	@In(required = false, create = true)
	@Out(required = false)
	private InstituicaoEnsino instituicaoEnsino;
	
	private boolean regraModalCessaoReq;

	private boolean campoCargoEfetivo;

	private boolean ajaxDisable;

	private boolean campoCargoEfetivoContratoTempo;

	private boolean campoCargoEfetivoEstagio;

	private boolean campoCargoEfetivoAposentado;

	private boolean campoLotacao;
	
	@In(required = false, create = true)
	@Out(required = false)
	public ManterServidorAction manterServidorAction; 
	
	@In(required = false, create = true)
	@Out(required = false)
	public CargoFuncao cargoFuncao; 
	
	@In(required = false, create = true)
	@Out(required = false)
	public CargoEfetivo cargoEfetivo;

	@In(required = false, create = true)
	@Out(required = false)
	private CargoComissionado cargoComissionado;
	
	@In(required = false, create = true)
	private AreaAtuacaoManager areaAtuacaoManager;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<TipoCargoComissinado> listTiposCargoComissinado;
	
	@In(required = false, create = true)
	@Out(required = false)
	private AreaAtuacao areaAtuacao;
	
	private Boolean isVisualizar = false; 

	private String indGratificacao;
	
	private Long indEstavel;
	
	private Long codVaga;
	
	private String desGratificacao;
	
	private Boolean tipoEfetivo;
	
	private Boolean regra1 = false;
	
	private Boolean regra2 = false;
	
	private Boolean regra3 = false;
	
	private Boolean regra4 = false;
	
	private Boolean regra5 = false;
	
	private Boolean regra6 = false;
	
	private Boolean desabilitaBotaoAdicionar = false;
	
	@In(required = false, create = true)
	@Out(required = false)	
	private TipoCargoComissinado tipoCargoComissinado;

	@Override
	@Create
	@Begin(flushMode = FlushModeType.MANUAL, join = true)
	public void init() {
	}
	
	public void salvarAreaAtucao() {
		if(cargoFuncao.getCargoComissionado()!=null){
			if(cargoFuncao.getCargoComissionado().getTipoCargoComissinado() == null){
				cargoFuncao.setCargoComissionado(null);
			}
		}
		if(cargoFuncao.getCargoEfetivo()!=null){
			if(cargoFuncao.getCargoEfetivo().getCargoFuncionario() == null){
				cargoFuncao.setCargoEfetivo(null);
			}
		}
		this.cargoEfetivo.setAreaAtuacao(this.areaAtuacao);
		areaAtuacaoManager.salvar(areaAtuacao);
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		areaAtuacao = new AreaAtuacao();
		modalAreaAtucao=false;
	}
	
	public void cancelarSalvarAreaAtucao() {
		areaAtuacao = new AreaAtuacao();
	}	
	
	
	public void irIncluirAreaAtucao(){
		setAreaAtuacao(new AreaAtuacao());
		modalAreaAtucao=true;
	}
	
	
	public void salvarFormacaoAcademica() {
		if (!validarRegras()) {
			return;
		}
		reRenderModal=false;
		if(getServidor().getUnidadeAdmLotacao().getId()==null){
			getServidor().setUnidadeAdmLotacao(null);
		}
		formacaoAcademica.setServidor(getServidor());
		formacaoAcademicaManager.salvar(formacaoAcademica);
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		if (getServidor().getFormacaoAcademicas() == null) {
			getServidor().setFormacaoAcademicas(new HashSet<FormacaoAcademica>());
		}
		if(!isEditarCargoFuncao){
			getServidor().getFormacaoAcademicas().add(formacaoAcademica);
		}
		formacaoAcademica=new FormacaoAcademica();
		
	}
	
	
	
	public void validarRegraSituacao() {
		if(getServidor() !=null && getServidor().getSituacaoFuncional() != null && getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc() != null){
			if(this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(3L)
				|| this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(8L)
				|| this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(14L)
				|| this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(18L)
				|| this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(44L)){
				setRegraModalCessaoReq(false);
			}
			else{
				setRegraModalCessaoReq(true);
			}
			
			if(this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(4L)){
				this.setCampoCargoEfetivo(false);
				this.setAjaxDisable(false);
			}
			else{
				this.setCampoCargoEfetivo(true);
			}
			if(this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(12L)){
				this.setCampoCargoEfetivoContratoTempo(false);
				this.setAjaxDisable(false);
			}
			else{
				this.setCampoCargoEfetivoContratoTempo(true);
			}
			if(this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(66L)){
				this.getServidor().setCargoEfetivo(new CargoEfetivo());
				this.getServidor().setCargoComissionado(new CargoComissionado());
				this.setCampoCargoEfetivoEstagio(false);
				this.setAjaxDisable(false);
			}
			else{
				this.setCampoCargoEfetivoEstagio(true);
			}
			if(this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(2L)){
				this.setCampoCargoEfetivoAposentado(false);
				this.setAjaxDisable(false);
			}
			else{
				this.setCampoCargoEfetivoAposentado(true);
			}
			
			if(this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(1L)
					|| this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(2L)
					|| this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(8L)
					|| this.getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(11L)){
				this.setCampoLotacao(true);
			}
			else{
				this.setCampoLotacao(false);
			}
		}
		else{
			this.setAjaxDisable(true);
		}
	}	
	
	
	
	

	/**
	 * Metodo responsável por tratar e realizar a ação de inserção de
	 * Instituição de Ensino na modal
	 * 
	 * @return void
	 * @author Erick Xavier
	 **/
	public void salvarInstituicaoEnsino() {
		if (validarRegras()) {
			instituicaoEnsinoManager.salvar(instituicaoEnsino);
			mensagemInfo(Mensagens.MSGI001.retornaMensagem());
			instituicaoEnsino = new InstituicaoEnsino();
			modalIntistuicao=false;
		}
	}

	/**
	 * Metodo responsável por cancelar a operação de salvar Instituição de
	 * Ensino
	 * 
	 * @return void
	 * @author Erick Xavier
	 **/
	public void cancelarSalvarInstituicaoEnsino() {
		instituicaoEnsino = new InstituicaoEnsino();
	}

	/**
	 * Metodo responsável por tratar e realizar a ação de Exclusão da entidade
	 * dependente.
	 * 
	 * @author Erick Xavier
	 **/
	public void excluirFormacaoAcademica() {
		validarRegras();
		if(getServidor().getUnidadeAdmLotacao().getId()==null){
			getServidor().setUnidadeAdmLotacao(null);
		}
		formacaoAcademicaManager.excluir(formacaoAcademica);
		getServidor().getFormacaoAcademicas().remove(formacaoAcademica);
	}

	/**
	 * Metodo responsável por preparar a exclusão da entidade dependente.
	 * @author Erick Xavier
	 **/
	public void prepararExclusaoFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	/**
	 * Metodo responsável por cancelar e fecha a inclusao de dependente
	 * @author Erick Xavier
	 **/
	public void voltarModal() {
		formacaoAcademica = new FormacaoAcademica();
	}

	/**
	 * Metodo responsável por cancelar e fecha a inclusao de dependente
	 * @author Erick Xavier
	 **/
	public void cancelarModal() {
		formacaoAcademica = new FormacaoAcademica();
	}

	/**
	 * Metodo responsável por preparar a inclusão da entidade dependente.
	 * @author Erick Xavier
	 **/
	public void irIncluirCargoFuncao(){
		this.grupoFuncionario = new GrupoFuncionario();
		this.nivelCargoFuncionario = new NivelCargoFuncionario();
		this.classeFuncionario = new ClasseFuncionario();

		this.validarRegraSituacao();
		isIncluirCargoFuncao = true;
		isEditarCargoFuncao = false;
		isVisualizarCargoFuncao = false;
		reRenderModal = true;
		modalIntistuicao=true;
		this.isVisualizar = false;
		
		cargoFuncionario=new CargoFuncionario();
		combosAuxiliarAction.nivelCargoFuncionario = new NivelCargoFuncionario();
		combosAuxiliarAction.grupoFuncionario = new GrupoFuncionario();
		
		
		if(getPodeAdionarCargoEfetivo()) {
			this.tipoEfetivo = true;
		} else if (getPodeAdionarCargoComissionado()) {
			this.tipoEfetivo = false;
		} 
		
		if(getPodeAdionarCargoEfetivo() && getPodeAdionarCargoComissionado()) {
			podeTrocarTipo = true;	
		} else {
			podeTrocarTipo = false;
		}
		
		this.validaRegrasSituacaoFuncional();
		
		this.cargoEfetivo = new CargoEfetivo();
		this.cargoEfetivo.setCargoFuncionario(new CargoFuncionario());
		
		this.cargoEfetivo.getCargoFuncionario().setGrupoFuncionario(new GrupoFuncionario());
		this.cargoEfetivo.getCargoFuncionario().getGrupoFuncionario().setCodSiapeGrupoFunc(442l);
		this.cargoEfetivo.getCargoFuncionario().getGrupoFuncionario().setTxtDescricao("Novo cargo");
		
		this.setCargoComissionado(new CargoComissionado());
	
		this.cargoFuncao = new CargoFuncao();
		}
	
	public void validaRegrasSituacaoFuncional(){
		if(getServidor() !=null && getServidor().getSituacaoFuncional() != null && getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc() != null){
		   if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(2L)){
			   
			   /* Regra 2 - Habilitação parcial da funcionalidade Cargo/Função
				Dado que os Servidores cadastrados tenham a situação funcional:
				02 - Aposentado
				15 - Instituidor de Pensão
				44 - Exercício §7° Art93 Lei 8,112 (anistiado)
				Quando usuário for cadastrar informações na funcionalidade Cargo/Função
				Então o sistema habilita na funcionalidae o cadastro para:
				Cargo Efetivo
				Campo Nível */
			   this.regra2 = true;
			   this.regra1 = false;
			   this.regra3 = false;
			   this.regra4 = false;
			   this.regra5 = false;
			   this.regra6 = false;
			   this.tipoEfetivo = true;
				mensagemWarn("Situação Funcional Aposentado "
						+ "só pode acessar o tipo Cargo Efetivo.");
		   }
		   else if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(15L)){
				
			   /* Regra 2 - Habilitação parcial da funcionalidade Cargo/Função
				Dado que os Servidores cadastrados tenham a situação funcional:
				02 - Aposentado
				15 - Instituidor de Pensão
				44 - Exercício §7° Art93 Lei 8,112 (anistiado)
				Quando usuário for cadastrar informações na funcionalidade Cargo/Função
				Então o sistema habilita na funcionalidae o cadastro para:
				Cargo Efetivo
				Campo Nível */
			    this.regra2 = true;
				this.regra1 = false;
				this.regra3 = false;
				this.regra4 = false;
				this.regra5 = false;
				this.regra6 = false;
				this.tipoEfetivo = true;
				mensagemWarn("Situação Funcional Instituidor de Pensão "
						+ "só pode acessar o tipo Cargo Efetivo.");
			}
		   else if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(44L) ||
				   getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(43L)){
				
				/* Regra 2 - Habilitação parcial da funcionalidade Cargo/Função
				Dado que os Servidores cadastrados tenham a situação funcional:
				02 - Aposentado
				15 - Instituidor de Pensão
				44 - Exercício §7° Art93 Lei 8,112 (anistiado)
				43 - Anistiado
				Quando usuário for cadastrar informações na funcionalidade Cargo/Função
				Então o sistema habilita na funcionalidae o cadastro para:
				Cargo Efetivo
				Campo Nível */
			   this.regra2 = true;
			   this.regra1 = false;
			   this.regra3 = false;
			   this.regra4 = false;
			   this.regra5 = false;
			   this.regra6 = false;
			   this.tipoEfetivo = true;
				mensagemWarn("Situação Funcional Exercício §7° Art93 Lei 8,112 (anistiado) e Anistiado "
						+ "só pode acessar o tipo Cargo Efetivo.");
			}
			else if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(12L)){
				
				/* Regra 3 - Habilitação de área e nível da funcionalidade Cargo/Função
				Dado que os Servidores cadastrados tenham a situação funcional:
				12 - Contrato temporário
				Quando usuário for cadastrar informações na funcionalidade Cargo/Função
				Então o sistema habilita na funcionalidae o cadastro para:
				Campo Área de Atuação
				Campo Nível */
			   this.regra3 = true;
			   this.regra1 = false;
			   this.regra2 = false;
			   this.regra4 = false;
			   this.regra5 = false;
			   this.regra6 = false;
			   this.tipoEfetivo = true;
				mensagemWarn("Situação Funcional Contrato temporário só pode acessar "
						+ "o tipo Cargo Efetivo com os campos Área de Atuação e Nível.");
			}
			else if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(66L)){
				
				/* Regra 4 - Habilitação de área e nível da funcionalidade Cargo/Função
				Dado que os Servidores cadastrados tenham a situação funcional:
				66 - Estagiário
				Quando usuário for cadastrar informações na funcionalidade Cargo/Função
				Então o sistema habilita na funcionalidae o cadastro para:
				Campo Nível */
				this.regra4 = true;
				this.regra1 = false;
			    this.regra2 = false;
			    this.regra3 = false;
			    this.regra5 = false;
			    this.regra6 = false;
			    this.tipoEfetivo = true;
				mensagemWarn("Situação Funcional Estagiário só pode acessar "
						+ "o tipo Cargo Efetivo com o campo Nível.");
			}
			else if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(4L)){
				
				/* Regra 5 - Habilitação de Cargo em Comissão da funcionalidade Cargo/Função
				Dado que os Servidores cadastrados tenham a situação funcional:
				4 - Nomeado Cargo Comissão
				Quando usuário for cadastrar informações na funcionalidade Cargo/Função
				Então o sistema habilita na funcionalidae o cadastro para:
				Cargo em Comissão
				Campo Nível */
				this.regra5 = true;
				this.regra1 = false;
			    this.regra2 = false;
			    this.regra3 = false;
			    this.regra4 = false;
			    this.regra6 = false;
				this.tipoEfetivo = false;
				mensagemWarn("Situação Funcional Nomeado Cargo Comissão só pode acessar "
						+ "o tipo Cargo em Comissão.");
			}
			else if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(93L)){
				
				/* Regra 6 - Habilitação de área e nível da funcionalidade Cargo/Função
				Dado que os Servidores cadastrados tenham a situação funcional:
				93 - Beneficiário de Pensão
				Quando usuário for cadastrar informações na funcionalidade Cargo/Função
				Então o sistema habilita na funcionalidade e informa que usuário não tem 
				acesso pois o tipo de situação funcional não permite o cadastramento de Cargo/Função */
				this.regra6 = true;
				this.regra1 = false;
				this.regra2 = false;
				this.regra3 = false;
				this.regra4 = false;
				this.regra5 = false;
				mensagemWarn("Situação Funcional Beneficiário de Pensão não pode cadastrar Cargo.");
			}
			else{
				this.regra1 = true;
				this.regra2 = false;
				this.regra3 = false;
				this.regra4 = false;
				this.regra5 = false;
				this.regra6 = false;
			}
		}
	}
	
	public void verificacoesAbaCargo(){
		this.verificarRegrasSituacaoFuncionalParaHabilitarBotaoAdicionar();
		this.validaRegrasSituacaoFuncional();
	}
	
	public void verificarRegrasSituacaoFuncionalParaHabilitarBotaoAdicionar(){
		if(getServidor() !=null && getServidor().getSituacaoFuncional() != null && getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc() != null){
		   if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(2L)
				   || getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(15L)
				   || getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(44L)
				   || getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(43L)){
			   
			   /* Regra 2 */
			   if(getServidor() != null && getServidor().getCargoEfetivo() != null && getServidor().getCargoFuncao().size() > 0){
				   this.desabilitaBotaoAdicionar = true;
			   }else{
				   this.desabilitaBotaoAdicionar = false;
			   }
		   }
		   else if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(12L)){
				
				/* Regra 3 */
				if(getServidor() != null && getServidor().getCargoEfetivo() != null && getServidor().getCargoFuncao().size() > 0){
					 this.desabilitaBotaoAdicionar = true;
				}else{
					 this.desabilitaBotaoAdicionar = false;
				}
			}
			else if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(66L)){
				
				/* Regra 4 */
				if(getServidor() != null && getServidor().getCargoEfetivo() != null && getServidor().getCargoFuncao().size() > 0){
					this.desabilitaBotaoAdicionar = true;
				}else{
					this.desabilitaBotaoAdicionar = false;
				}
			}
			else if(getServidor().getSituacaoFuncional().getCodSiapeSituacaoFunc().equals(4L)){
				
				/* Regra 5 */
				if(getServidor() != null && getServidor().getCargoComissionado() != null && getServidor().getCargoFuncao().size() > 0){
					this.desabilitaBotaoAdicionar = true;
				}else{
					this.desabilitaBotaoAdicionar = false;
				}
			}
		}
	}
	
	public void irEditarCargoFuncao(CargoFuncao cargoFuncao) {
		this.validaRegrasSituacaoFuncional();
		if(cargoFuncao.getTipoEfetivo()) {
			this.cargoEfetivo = cargoFuncao.getCargoEfetivo();
			if(this.cargoEfetivo.getCargoFuncionario() != null) {
				this.cargoFuncionario = this.cargoEfetivo.getCargoFuncionario();
			}
			if(this.cargoEfetivo.getCargoFuncionario() != null && this.cargoEfetivo.getCargoFuncionario().getGrupoFuncionario() != null) {
				this.grupoFuncionario = this.cargoEfetivo.getCargoFuncionario().getGrupoFuncionario();
			}
			if(this.cargoEfetivo.getCargoFuncionario() != null && this.cargoEfetivo.getCargoFuncionario().getGrupoFuncionario() != null && this.cargoEfetivo.getCargoFuncionario().getGrupoFuncionario().getNivelCargoFuncionario() != null) {
				this.nivelCargoFuncionario = this.cargoEfetivo.getCargoFuncionario().getGrupoFuncionario().getNivelCargoFuncionario();
			}
			if(this.cargoEfetivo.getPadraoCargo() != null && this.cargoEfetivo.getPadraoCargo().getClasseFuncionario() != null) {
				this.classeFuncionario = this.cargoEfetivo.getPadraoCargo().getClasseFuncionario();
			}
			this.tipoEfetivo = cargoFuncao.getTipoEfetivo();
		} else {
			this.setCargoComissionado(cargoFuncao.getCargoComissionado());	
		}
		
		this.validarRegraSituacao();
		isIncluirCargoFuncao = false;
		isEditarCargoFuncao = true;
		isVisualizarCargoFuncao = false;
		reRenderModal = true;
		modalIntistuicao = true;
		
		this.isVisualizar = false;
		
		this.tipoEfetivo = cargoFuncao.getTipoEfetivo();
		
		if(cargoFuncao.getCargoComissionado() != null && cargoFuncao.getCargoComissionado().getTipoCargoComissinado() != null && cargoFuncao.getCargoComissionado().getTipoCargoComissinado().getCodSiapeCargoComissionado() != null){
			getServidor().setCodSiape(cargoFuncao.getCargoComissionado().getTipoCargoComissinado().getCodSiapeCargoComissionado());
		}
		this.cargoFuncao = cargoFuncao;

	}
	

	/**
	 * Metodo responsável por preparar a visualização da entidade dependente.
	 * @author           Erick Xavier
	 **/
	public void irVisualizar(CargoFuncao cargoFuncao) {
		this.irEditarCargoFuncao(cargoFuncao);
		this.isVisualizar = true;
		isEditar = false;
		isIncluir = false;
		isVisualizarCargoFuncao = true;
		isIncluirCargoFuncao = false;
		isEditarCargoFuncao = false;
	}
	
	
	
	
	/**
	 * Metodo que efetua a inserção de formação academica via modal
	 * 
	 * @return void
	 * @author Erick Xavier
	 */
	
	public void salvarCargoFuncao(){
		if(this.tipoEfetivo != null && this.tipoEfetivo) {
			if(this.tipoEfetivo != null && this.tipoEfetivo) {

				if(regra1){	
					if(this.cargoEfetivo.getAreaAtuacao() != null && this.nivelCargoFuncionario != null && this.grupoFuncionario != null && this.cargoEfetivo.getCargoFuncionario() != null && this.cargoEfetivo.getCbo() != null && this.cargoEfetivo.getDatPosse() != null && this.cargoEfetivo.getDatExercicio() != null) {
						this.podeFechar = true;
					} else {
						this.podeFechar = false;
						return;
					}
				}
				
				if(regra2){	
					if(this.cargoEfetivo.getAreaAtuacao() != null && this.nivelCargoFuncionario != null && this.grupoFuncionario != null && this.cargoEfetivo.getCargoFuncionario() != null && this.cargoEfetivo.getCbo() != null && this.cargoEfetivo.getDatPosse() != null && this.cargoEfetivo.getDatExercicio() != null) {
						this.podeFechar = true;
					} else {
						this.podeFechar = false;
						return;
					}
				}
				
				if(regra3){
					this.grupoFuncionario = grupoFuncionarioManager.consultarGrupoFuncionarioPeloNivel(this.nivelCargoFuncionario);
					this.cargoFuncionario = cargoFuncionarioManager.consultarCargoFuncionarioPeloGrupo(this.grupoFuncionario);

					if(this.cargoEfetivo.getAreaAtuacao() != null && this.nivelCargoFuncionario != null){
						this.podeFechar = true;
					} else {
						this.podeFechar = false;
						return;
					}
				}
				
				if(regra4){	
					this.grupoFuncionario = grupoFuncionarioManager.consultarGrupoFuncionarioPeloNivel(this.nivelCargoFuncionario);
					this.cargoFuncionario = cargoFuncionarioManager.consultarCargoFuncionarioPeloGrupo(this.grupoFuncionario);
					
					if(this.nivelCargoFuncionario != null) {
						this.podeFechar = true;
					} else {
						this.podeFechar = false;
						return;
					}
				}
				
				if(regra5){	
					this.podeFechar = true;
				}
			}

			if(this.cargoEfetivo.getCargoFuncionario() == null) {
				this.cargoEfetivo.setCargoFuncionario(new CargoFuncionario());
			}
			
			this.cargoEfetivo.setCargoFuncionario(this.cargoFuncionario);
			this.cargoEfetivo.getCargoFuncionario().setGrupoFuncionario(this.grupoFuncionario);
			this.cargoEfetivo.getCargoFuncionario().getGrupoFuncionario().setNivelCargoFuncionario(this.nivelCargoFuncionario);
			
			if(this.cargoEfetivo.getPadraoCargo() != null) {
				this.cargoEfetivo.getPadraoCargo().setClasseFuncionario(classeFuncionario);
			}
			this.cargoFuncao.setCargoEfetivo(this.cargoEfetivo);
			
		} else {
			this.podeFechar = true;
			this.cargoFuncao.setCargoComissionado(this.getCargoComissionado());
		}
		if(this.getServidor().getCargoFuncao() == null) {
			this.getServidor().setCargoFuncao(new HashSet<CargoFuncao>());
		}
	
		this.cargoFuncao.setTipoEfetivo(this.tipoEfetivo);
		
		if(isEditarCargoFuncao) {
			this.getServidor().getCargoFuncao().remove(cargoFuncao);
		}
		
		this.cargoFuncao.setServidor(this.getServidor());
		
		this.getServidor().getCargoFuncao().add(this.cargoFuncao);
		
		this.setCargoFuncao(new CargoFuncao());
		this.cargoEfetivo = new CargoEfetivo();
		this.setCargoComissionado(new CargoComissionado());	
		this.verificarRegrasSituacaoFuncionalParaHabilitarBotaoAdicionar();
	}	
	
	/**
	 * Metodo responsável por preparar a inclusão da entidade InstituicaoEnsino.
	 * 
	 * @author Erick Xavier
	 **/
	public void irIncluirIntituicaoEnsino(){
		modalIntistuicao=true;
	}

	/**
	 * Metodo responsável por preparar a edição da entidade dependente.
	 * 
	 * @author Erick Xavier
	 **/
	
	
	/**
	 * Metodo responsável por desabilitar os campos Data de Conclusão o dependente estiver cursando o curso.
	 * @author            Thiago Nunes Vieira
	 **/
	public void verificarStatusCurso(){
	 if(formacaoAcademica!=null){
		 if(formacaoAcademica.getIndCursando().equals(0L)){
				cursando = true;
			 }
			 else{
				 cursando = false;
				 formacaoAcademica.setDatConclusaoCurso(null);
			 }
		 }
	 }
	
	public void setarTipoEfetivo(){
		this.tipoEfetivo = false;
	}

	public boolean isCursando() {
		return cursando;
	}

	public void setCursando(boolean cursando) {
		this.cursando = cursando;
	}



	public boolean isRegraModalCessaoReq() {
		return regraModalCessaoReq;
	}



	public void setRegraModalCessaoReq(boolean regraModalCessaoReq) {
		this.regraModalCessaoReq = regraModalCessaoReq;
	}



	public boolean isCampoCargoEfetivo() {
		return campoCargoEfetivo;
	}



	public void setCampoCargoEfetivo(boolean campoCargoEfetivo) {
		this.campoCargoEfetivo = campoCargoEfetivo;
	}



	public boolean isAjaxDisable() {
		return ajaxDisable;
	}



	public void setAjaxDisable(boolean ajaxDisable) {
		this.ajaxDisable = ajaxDisable;
	}



	public boolean isCampoCargoEfetivoContratoTempo() {
		return campoCargoEfetivoContratoTempo;
	}



	public void setCampoCargoEfetivoContratoTempo(
			boolean campoCargoEfetivoContratoTempo) {
		this.campoCargoEfetivoContratoTempo = campoCargoEfetivoContratoTempo;
	}



	public boolean isCampoCargoEfetivoEstagio() {
		return campoCargoEfetivoEstagio;
	}



	public void setCampoCargoEfetivoEstagio(boolean campoCargoEfetivoEstagio) {
		this.campoCargoEfetivoEstagio = campoCargoEfetivoEstagio;
	}



	public boolean isCampoCargoEfetivoAposentado() {
		return campoCargoEfetivoAposentado;
	}



	public void setCampoCargoEfetivoAposentado(boolean campoCargoEfetivoAposentado) {
		this.campoCargoEfetivoAposentado = campoCargoEfetivoAposentado;
	}



	public boolean isCampoLotacao() {
		return campoLotacao;
	}



	public void setCampoLotacao(boolean campoLotacao) {
		this.campoLotacao = campoLotacao;
	}


	public AreaAtuacao getAreaAtuacao() {
		return areaAtuacao;
	}


	public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public CargoFuncao getCargoFuncao() {
		return cargoFuncao;
	}

	public void setCargoFuncao(CargoFuncao cargoFuncao) {
		this.cargoFuncao = cargoFuncao;
	}

	public Boolean getIsVisualizar() {
		return isVisualizar;
	}

	public void setIsVisualizar(Boolean isVisualizar) {
		this.isVisualizar = isVisualizar;
	}

	public Boolean getIsVisualizarCargoFuncao() {
		return isVisualizarCargoFuncao;
	}

	public void setIsVisualizarCargoFuncao(Boolean isVisualizarCargoFuncao) {
		this.isVisualizarCargoFuncao = isVisualizarCargoFuncao;
	}

	public Boolean getIsIncluirCargoFuncao() {
		return isIncluirCargoFuncao;
	}

	public void setIsIncluirCargoFuncao(Boolean isIncluirCargoFuncao) {
		this.isIncluirCargoFuncao = isIncluirCargoFuncao;
	}

	public Boolean getIsEditarCargoFuncao() {
		return isEditarCargoFuncao;
	}

	public void setIsEditarCargoFuncao(Boolean isEditarCargoFuncao) {
		this.isEditarCargoFuncao = isEditarCargoFuncao;
	}

	public Boolean getModalIntistuicao() {
		return modalIntistuicao;
	}

	public void setModalIntistuicao(Boolean modalIntistuicao) {
		this.modalIntistuicao = modalIntistuicao;
	}

	public FormacaoAcademica getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public FormacaoAcademicaManager getFormacaoAcademicaManager() {
		return formacaoAcademicaManager;
	}

	public void setFormacaoAcademicaManager(
			FormacaoAcademicaManager formacaoAcademicaManager) {
		this.formacaoAcademicaManager = formacaoAcademicaManager;
	}

	public InstituicaoEnsinoManager getInstituicaoEnsinoManager() {
		return instituicaoEnsinoManager;
	}

	public void setInstituicaoEnsinoManager(
			InstituicaoEnsinoManager instituicaoEnsinoManager) {
		this.instituicaoEnsinoManager = instituicaoEnsinoManager;
	}

	public InstituicaoEnsino getInstituicaoEnsino() {
		return instituicaoEnsino;
	}

	public void setInstituicaoEnsino(InstituicaoEnsino instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}

	public AreaAtuacaoManager getAreaAtuacaoManager() {
		return areaAtuacaoManager;
	}

	public void setAreaAtuacaoManager(AreaAtuacaoManager areaAtuacaoManager) {
		this.areaAtuacaoManager = areaAtuacaoManager;
	}

	public String getIndGratificacao() {
		return indGratificacao;
	}

	public void setIndGratificacao(String indGratificacao) {
		this.indGratificacao = indGratificacao;
	}

	public Long getIndEstavel() {
		return indEstavel;
	}

	public void setIndEstavel(Long indEstavel) {
		this.indEstavel = indEstavel;
	}

	public Long getCodVaga() {
		return codVaga;
	}

	public void setCodVaga(Long codVaga) {
		this.codVaga = codVaga;
	}

	public String getDesGratificacao() {
		return desGratificacao;
	}

	public void setDesGratificacao(String desGratificacao) {
		this.desGratificacao = desGratificacao;
	}


	public Boolean getTipoEfetivo() {
		return tipoEfetivo;
	}

	public void setTipoEfetivo(Boolean tipoEfetivo) {
		this.tipoEfetivo = tipoEfetivo;
	}

	public Boolean getPodeFechar() {
		return this.podeFechar;
	}

	public void setPodeFechar(Boolean podeFechar) {
		this.podeFechar = podeFechar;
	}

	public ManterServidorAction getManterServidorAction() {
		return manterServidorAction;
	}

	public void setManterServidorAction(ManterServidorAction manterServidorAction) {
		this.manterServidorAction = manterServidorAction;
	}

	public Boolean getRegra2() {
		return regra2;
	}

	public void setRegra2(Boolean regra2) {
		this.regra2 = regra2;
	}
	
	public Boolean getRegra3() {
		return regra3;
	}

	public void setRegra3(Boolean regra3) {
		this.regra3 = regra3;
	}
	
	public Boolean getRegra4() {
		return regra4;
	}

	public void setRegra4(Boolean regra4) {
		this.regra4 = regra4;
	}
	
	public Boolean getRegra5() {
		return regra5;
	}

	public void setRegra5(Boolean regra5) {
		this.regra5 = regra5;
	}
	
	public Boolean getRegra6() {
		return regra6;
	}

	public void setRegra6(Boolean regra6) {
		this.regra6 = regra6;
	}

	public Boolean getRegra1() {
		return regra1;
	}

	public void setRegra1(Boolean regra1) {
		this.regra1 = regra1;
	}

	public Boolean getDesabilitaBotaoAdicionar() {
		return desabilitaBotaoAdicionar;
	}

	public void setDesabilitaBotaoAdicionar(Boolean desabilitaBotaoAdicionar) {
		this.desabilitaBotaoAdicionar = desabilitaBotaoAdicionar;
	}

	public CargoComissionado getCargoComissionado() {
		return cargoComissionado;
	}

	public void setCargoComissionado(CargoComissionado cargoComissionado) {
		this.cargoComissionado = cargoComissionado;
	}

	public List<TipoCargoComissinado> getListTiposCargoComissinado() {
		return listTiposCargoComissinado;
	}

	public void setListTiposCargoComissinado(
			List<TipoCargoComissinado> listTiposCargoComissinado) {
		this.listTiposCargoComissinado = listTiposCargoComissinado;
	}

	public CargoFuncionario getCargoFuncionario() {
		return cargoFuncionario;
	}

	public void setCargoFuncionario(CargoFuncionario cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}
	
	

}