package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.faces.Renderer;
import org.jboss.seam.security.Credentials;

import br.gov.iphan.sisgep.entity.Avaliacao;
import br.gov.iphan.sisgep.entity.Equipe;
import br.gov.iphan.sisgep.entity.EquipeAvaliacao;
import br.gov.iphan.sisgep.entity.Servidor;
import br.gov.iphan.sisgep.entity.ServidorAvaliacao;
import br.gov.iphan.sisgep.entity.TipoAvaliacao;
import br.gov.iphan.sisgep.entity.corp.Uf;
import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;
import br.gov.iphan.sisgep.manager.AvaliacaoManager;
import br.gov.iphan.sisgep.manager.EquipeManager;
import br.gov.iphan.sisgep.manager.ServidorManager;
import br.gov.iphan.sisgep.manager.UfManager;
import br.gov.iphan.sisgep.manager.UnidadeAdministrativaManager;
import br.gov.iphan.sisgep.util.Mensagens;

@Name("manterGerenciadorAvaliacaoAction")
@Scope(ScopeType.CONVERSATION)
public class ManterGerenciadorAvaliacaoAction extends BaseAction {

	private static final long serialVersionUID = -7409735643659325694L;

	private Boolean isIncluindo;
	private Boolean isEditando;
	private Boolean isVisualizando;

	private Boolean todosSelecionados = false;

	public boolean habilitaMensagem;

	public boolean preencheuUnidadeAdm;

	@In
	Credentials credentials;

	@In(required = false, create = true)
	private AvaliacaoManager avaliacaoManager;

	@In(required = false, create = true)
	@Out(required = false)
	public List<Avaliacao> listAvaliacao;

	@In(required = false, create = true)
	@Out(required = false)
	public ServidorManager servidorManager;

	@In(value = "#{facesContext.externalContext}")
	private ExternalContext extCtx;

	@In(value = "#{facesContext}")
	private FacesContext facesContext;

	@In(create = true)
	private Renderer renderer;

	@In(required = false, create = true)
	@Out(required = false)
	public String palavraChave;

	@In(required = false, create = true)
	@Out(required = false)
	public String condutor;

	@In(required = false, create = true)
	@Out(required = false)
	public String chefia;

	@In(required = false, create = true)
	@Out(required = false)
	private Map<Servidor, Boolean> servidoresSelecionados = new HashMap<Servidor, Boolean>(
			0);

	@In(required = false, create = true)
	@Out(required = false)
	public String tipo;

	@In(required = false, create = true)
	@Out(required = false)
	public String equipeString;

	@In(required = false, create = true)
	@Out(required = false)
	public Avaliacao avaliacao;

	@In(required = false, create = true)
	@Out(required = false)
	public Servidor condutorAvaliacao;

	@In(required = false, create = true)
	@Out(required = false)
	public List<Servidor> listServidorModal;

	@In(required = false, create = true)
	@Out(required = false)
	public List<Servidor> listChefiaModal;

	@In(required = false, create = true)
	@Out(required = false)
	public List<Equipe> listServidorEquipe;

	@In(required = false, create = true)
	@Out(required = false)
	public List<Servidor> listServidoresAvaliados;

	@In(required = false, create = true)
	@Out(required = false)
	public List<EquipeAvaliacao> listEquipeAvaliacao;

	@In(required = false, create = true)
	@Out(required = false)
	public List<ServidorAvaliacao> listServidorAvaliacao;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<Equipe> listEquipe;

	@In(required = false, create = true)
	@Out(required = false)
	public Servidor servidor;
	
	@In(required = false, create = true)
	private EquipeManager equipeManager;

	@In(required = false, create = true)
	@Out(required = false)
	public Servidor servidorChefia;

	@In(required = false, create = true)
	@Out(required = false)
	public Servidor servidorSelecionado;

	@In(required = false, create = true)
	@Out(required = false)
	public TipoAvaliacao tipoAvaliacao;

	@In(required = false, create = true)
	@Out(required = false)
	public EquipeAvaliacao equipeAvaliacao;

	@In(required = false, create = true)
	@Out(required = false)
	public UnidadeAdministrativa unidadeAdministrativa;

	@In(required = false, create = true)
	@Out(required = false)
	public UnidadeAdministrativa UnidAuxiliar;

	@In(required = false, create = true)
	@Out(required = false)
	public Uf uf;
	
	@In(required = false, create = true)
	@Out(required = false)
	public Uf ufAuxiliar;

	@In(required = false, create = true)
	@Out(required = false)
	public UnidadeAdministrativaManager unidadeAdministrativaManager;

	@In(required = false, create = true)
	@Out(required = false)
	public List<UnidadeAdministrativa> listUnidadeAdministrativa;

	@In(required = false, create = true)
	@Out(required = false)
	public List<Uf> listUfs;

	@In(required = false, create = true)
	@Out(required = false)
	public UfManager ufManager;

	@In(required = false, create = true)
	@Out(required = false)
	public Equipe equipe;
	
	@End
	public String salvar() {
		if (tipo == null || tipo == "") {
			mensagemWarn("Insira o Tipo de Avaliação.");
		} else if (condutor == null || condutor == "") {
			mensagemWarn("Insira o Condutor do Processo de Avaliação.");
		} else if (equipeString == null || equipeString == "") {
			mensagemWarn("Insira a Equipe de Avaliação.");
		} else if (listServidoresAvaliados == null
				|| listServidoresAvaliados.size() == 0) {
			mensagemWarn("A Avaliação deve ter ao menos 1 Servidor a ser avaliado."
					+ " Em Servidores Avaliados, clique no botão Inserir Novo.");
		} else {
			this.avaliacao.setTipoAvaliacao(this.tipoAvaliacao);
			this.avaliacao.setUnidadeOrganizacional(this.unidadeAdministrativa);

			for (Servidor _servidor : listServidoresAvaliados) {
				if (!validaUnidadeOrganizacionalServidor(_servidor,
						this.unidadeAdministrativa)) {
					mensagemWarn("O sistema não pode salvar o servidor "
							+ _servidor.getPessoaFisica().getNomPessoaFisica()
							+ " para esta avaliação pois não esta não é sua unidade/Exercício avaliativa.");
				}

				if (this.avaliacao.getServidoresAvaliacao() == null) {
					this.avaliacao
							.setServidoresAvaliacao(new ArrayList<ServidorAvaliacao>());
				}

				ServidorAvaliacao servidorAvaliacao = new ServidorAvaliacao();
				servidorAvaliacao.setAvaliacao(this.avaliacao);
				servidorAvaliacao.setServidor(_servidor);
				this.avaliacao.getServidoresAvaliacao().add(servidorAvaliacao);
			}

			avaliacaoManager.salvarAvaliacao(this.avaliacao);
			limparObjetos();
			mensagemInfo(Mensagens.MSGI001.retornaMensagem());
			return "ir_incluir";
		}
		return "ir_incluir";
	}

	private boolean validaUnidadeOrganizacionalServidor(Servidor _servidor,
			UnidadeAdministrativa unidadeAdministrativa2) {
		return true;
	}

	@End
	public String editar() {
		if (tipo == null || tipo == "") {
			mensagemWarn("Insira o Tipo de Avaliação.");
		} else if (condutor == null || condutor == "") {
			mensagemWarn("Insira o Condutor do Processo de Avaliação.");
		} else if (equipeString == null || equipeString == "") {
			mensagemWarn("Insira a Equipe de Avaliação.");
		} else if (listServidoresAvaliados == null
				|| listServidoresAvaliados.size() == 0) {
			mensagemWarn("A Avaliação deve ter ao menos 1 Servidor a ser avaliado."
					+ " Em Servidores Avaliados, clique no botão Inserir Novo.");
		} else {
			this.avaliacao.setTipoAvaliacao(this.tipoAvaliacao);
			this.avaliacao.setUnidadeOrganizacional(this.unidadeAdministrativa);

			for (Servidor servidor : listServidoresAvaliados) {
				if (this.avaliacao.getServidoresAvaliacao() == null) {
					this.avaliacao
							.setServidoresAvaliacao(new ArrayList<ServidorAvaliacao>());
				}

				ServidorAvaliacao servidorAvaliacao = new ServidorAvaliacao();
				servidorAvaliacao.setAvaliacao(this.avaliacao);
				servidorAvaliacao.setServidor(servidor);
				this.avaliacao.getServidoresAvaliacao().add(servidorAvaliacao);
			}

			avaliacaoManager.editarAvaliacao(this.avaliacao);
			limparObjetos();
			mensagemInfo(Mensagens.MSGI001.retornaMensagem());
			return "salvo_sucesso";
		}
		return "ir_editar";
	}

	public void excluir() {
		avaliacaoManager.excluirAvaliacao(avaliacao);
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		limparObjetos();
		this.procurar();
	}

	public void procurar() {
		if (getAvaliacao().getPeriodoInicio() != null
				&& getAvaliacao().getPeriodoFim() != null) {
			if (getAvaliacao().getPeriodoInicio().after(
					getAvaliacao().getPeriodoFim())) {
				mensagemWarn("A data de início do período é maior do que a data do final de período.");
				return;
			}
		}
		listAvaliacao = new ArrayList<Avaliacao>();
		if (listAvaliacao != null) {
			listAvaliacao.clear();
		}
		listAvaliacao = avaliacaoManager.consultarAvaliacao(this.avaliacao);
		if (listAvaliacao == null || listAvaliacao.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}

	public void verificaSePreencheuUnidadeAdm() {
		if (this.unidadeAdministrativa != null) {
			preencheuUnidadeAdm = true;
			if(!equipeString.equals("") && this.isIncluir){
				equipeString = "";
			}
			if(this.UnidAuxiliar != null && this.UnidAuxiliar.getNomUnidadeAdministrativa() != null 
					&& this.unidadeAdministrativa.getNomUnidadeAdministrativa() != null){
				if(this.UnidAuxiliar.getNomUnidadeAdministrativa() != this.unidadeAdministrativa.getNomUnidadeAdministrativa()){
					equipeString = "";
					this.equipe = new Equipe();
				}
			}
		} else {
			preencheuUnidadeAdm = false;
		}
	}

	public void mostraMensagemUnidAdm() {
		mensagemWarn("Preencha primeiro o campo de Unidade Organizacional.");
	}

	public String irIncluir() {
		limparObjetos();

		this.isIncluindo = true;
		this.isVisualizando = false;
		this.isEditando = false;

		this.isIncluir = true;
		this.isEditar = false;
		this.isVisualizar = false;

		controllerHelper.setRedirect("?Page=Incluir_Avaliacao");

		return "ir_incluir";
	}

	public void publicar() {

	}

	public void naoPublicar() {

	}

	public void procurarServidorParaAvaliacao() {
		if ((getServidor().getDatIngressoOrgaoInicio() != null && getServidor()
				.getDatIngressoOrgaoFim() == null)
				|| (getServidor().getDatIngressoOrgaoInicio() == null && getServidor()
						.getDatIngressoOrgaoFim() != null)) {
			if (getServidor().getDatIngressoOrgaoInicio() == null
					|| getServidor().getDatIngressoOrgaoFim() == null) {
				mensagemWarn("Informe a data inicial e data final.");
				getServidor().setDatIngressoOrgaoFim(null);
				getServidor().setDatIngressoOrgaoInicio(null);
				return;
			} else if (getServidor().getDatIngressoOrgaoInicio().after(
					getServidor().getDatIngressoOrgaoFim())) {
				mensagemWarn("A data inicial da Data de Entrada do IPHAN não pode ser maior que a data a sua data final.");
				return;
			}
		}
		Servidor servidor1 = new Servidor();
		listServidorModal = servidorManager.consultarServidor(servidor1);
		if(listAvaliacao != null){
			this.limparListaServidores();
		}
		this.servidor = new Servidor();
		if (listServidorModal == null || listServidorModal.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}

	public void procurarServidorParaAvaliacaoModal() {
		if ((getServidor().getDatIngressoOrgaoInicio() != null && getServidor()
				.getDatIngressoOrgaoFim() == null)
				|| (getServidor().getDatIngressoOrgaoInicio() == null && getServidor()
						.getDatIngressoOrgaoFim() != null)) {
			if (getServidor().getDatIngressoOrgaoInicio() == null
					|| getServidor().getDatIngressoOrgaoFim() == null) {
				mensagemWarn("Informe a data inicial e data final.");
				getServidor().setDatIngressoOrgaoFim(null);
				getServidor().setDatIngressoOrgaoInicio(null);
				return;
			} else if (getServidor().getDatIngressoOrgaoInicio().after(
					getServidor().getDatIngressoOrgaoFim())) {
				mensagemWarn("A data inicial da Data de Entrada do IPHAN não pode ser maior que a data a sua data final.");
				return;
			}
		}
		listServidorModal = servidorManager.consultarServidor(getServidor());
		palavraChave = "";
		this.limparListaServidores();
		if (listServidorModal == null || listServidorModal.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}

	public void procurarServidorCondutor() {
		if ((getServidor().getDatIngressoOrgaoInicio() != null && getServidor()
				.getDatIngressoOrgaoFim() == null)
				|| (getServidor().getDatIngressoOrgaoInicio() == null && getServidor()
						.getDatIngressoOrgaoFim() != null)) {
			if (getServidor().getDatIngressoOrgaoInicio() == null
					|| getServidor().getDatIngressoOrgaoFim() == null) {
				mensagemWarn("Informe a data inicial e data final.");
				getServidor().setDatIngressoOrgaoFim(null);
				getServidor().setDatIngressoOrgaoInicio(null);
				return;
			} else if (getServidor().getDatIngressoOrgaoInicio().after(
					getServidor().getDatIngressoOrgaoFim())) {
				mensagemWarn("A data inicial da Data de Entrada do IPHAN não pode ser maior que a data a sua data final.");
				return;
			}
		}

		listServidorModal = servidorManager.consultarServidor(getServidor());
		palavraChave = "";
		if (listServidorModal == null || listServidorModal.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}

	public void procurarServidorChefe() {
		if ((getServidor().getDatIngressoOrgaoInicio() != null && getServidor()
				.getDatIngressoOrgaoFim() == null)
				|| (getServidor().getDatIngressoOrgaoInicio() == null && getServidor()
						.getDatIngressoOrgaoFim() != null)) {
			if (getServidor().getDatIngressoOrgaoInicio() == null
					|| getServidor().getDatIngressoOrgaoFim() == null) {
				mensagemWarn("Informe a data inicial e data final.");
				getServidor().setDatIngressoOrgaoFim(null);
				getServidor().setDatIngressoOrgaoInicio(null);
				return;
			} else if (getServidor().getDatIngressoOrgaoInicio().after(
					getServidor().getDatIngressoOrgaoFim())) {
				mensagemWarn("A data inicial da Data de Entrada do IPHAN não pode ser maior que a data a sua data final.");
				return;
			}
		}

		listChefiaModal = servidorManager.consultarServidor(getServidor());
		palavraChave = "";
		this.tirarProprioServidor();
		if (listChefiaModal == null || listChefiaModal.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}

	public void limparListaServidores() {
		this.servidor = new Servidor();
		this.servidoresSelecionados = new HashMap<Servidor, Boolean>();

		if (listServidorModal != null) {
			for (Servidor servidor : listServidorModal) {
				this.servidoresSelecionados.put(servidor, false);
			}
		}

		if (listServidoresAvaliados != null) {
			for (Servidor servidorAvaliado : listServidoresAvaliados) {
				for (Iterator<Servidor> serv = listServidorModal.iterator(); serv
						.hasNext();) {
					Servidor servidorNext = serv.next();
					if (servidorNext.getId() == servidorAvaliado.getId()) {
						serv.remove();
					}
				}
			}
		}
	}

	public void tirarProprioServidor() {
		for (Iterator<Servidor> serv = listChefiaModal.iterator(); serv
				.hasNext();) {
			Servidor servidorNext = serv.next();
			if (servidorNext.getPessoaFisica().getNomPessoaFisica() == servidorSelecionado
					.getPessoaFisica().getNomPessoaFisica()) {
				serv.remove();
			}
		}
	}

	public void desabilitarServidorDaEquipe() {
		if (this.avaliacao.getEquipeAvaliacao() != null
				&& listServidoresAvaliados != null) {
			for (EquipeAvaliacao equipe : this.avaliacao.getEquipeAvaliacao()) {
				for (Servidor servidorEquipe : equipe.getEquipe()
						.getServidores()) {
					for (Servidor servidor : listServidoresAvaliados) {
						if (servidorEquipe.getPessoaFisica()
								.getNomPessoaFisica() == servidor
								.getPessoaFisica().getNomPessoaFisica()) {
							servidorEquipe
									.setDesabilitadoEquipePorSerAvaliado(true);
						}
						if (servidorEquipe.getPessoaFisica()
								.getNomPessoaFisica() == buscarChefia(servidor)) {
							servidorEquipe
									.setDesabilitadoEquipePorSerChefia(true);
						}
					}
				}
			}
		}
	}

	public void selecionarTodos() {
		if (!this.todosSelecionados) {
			for (Map.Entry<Servidor, Boolean> entry : this.servidoresSelecionados
					.entrySet()) {
				entry.setValue(true);
			}
			this.todosSelecionados = true;
		} else {
			for (Map.Entry<Servidor, Boolean> entry : this.servidoresSelecionados
					.entrySet()) {
				entry.setValue(false);
			}
			this.todosSelecionados = false;
		}
	}

	public void salvarSelecionados() {

		if (listServidoresAvaliados == null) {
			listServidoresAvaliados = new ArrayList<Servidor>();
		}

		for (Servidor servidor : this.servidoresSelecionados.keySet()) {
			if (this.servidoresSelecionados.get(servidor) == true) {
				listServidoresAvaliados.add(servidor);
			}
		}
	}

	public void visualizarAvaliado(Servidor servidor) {
		this.servidorSelecionado = servidor;
		this.servidor = new Servidor();
		desabilitarServidorDaEquipe();
	}

	public void cancelarModalTipoAvaliacao() {
		tipoAvaliacao = new TipoAvaliacao();
		palavraChave = "";
	}

	public void cancelarModalEquipeAvaliacao() {
		palavraChave = "";
	}
	
	public void procurarNomeUnidAdm() {
		if(this.uf != null){
			listUnidadeAdministrativa = new ArrayList<UnidadeAdministrativa>();
			listUnidadeAdministrativa = unidadeAdministrativaManager
					.findByUf(this.uf);
			if(this.isIncluir){
				equipeString = "";
				this.equipe = new Equipe();
			}
			if(this.ufAuxiliar != this.uf){
				equipeString = "";
				this.equipe = new Equipe();
			}
		}
	}

	public List<Uf> carregarUfs() {
			listUfs = new ArrayList<Uf>();
			return listUfs = ufManager.listarTodos();
	}
	
	public List<UnidadeAdministrativa> carregarUnidadeAdmPorUF(){
		listUnidadeAdministrativa = new ArrayList<UnidadeAdministrativa>();
		return listUnidadeAdministrativa = unidadeAdministrativaManager.findByUf(this.uf);
	}

	public void cancelarModalCondutor() {
		servidor = new Servidor();
	}

	public void cancelarModalChefia() {
		servidor = new Servidor();
	}

	public void cancelarModalServidorAvaliado() {
		servidor = new Servidor();
	}

	public void prepararModalServidorAvaliado(Servidor servidor) {
		this.servidor = servidor;
	}

	public void excluirServidorAvaliado() {
		if (listServidoresAvaliados != null) {
			listServidoresAvaliados.remove(this.servidor);
		}
		this.servidor = new Servidor();
		
	}

	public void prepararModalServidor() {
		listServidorModal = new ArrayList<Servidor>();
		this.servidor = new Servidor();
	}

	public void prepararModalChefia(Servidor _servidor) {
		this.servidorSelecionado = _servidor;
		listChefiaModal = new ArrayList<Servidor>();
		this.servidor = new Servidor();
	}

	public void cancelarExclusao() {
		this.avaliacao = new Avaliacao();
	}

	public String voltar() {
		limparObjetos();
		return "cancelar";
	}

	public String irEditar(Avaliacao avaliacao) {
		limparObjetos();
		this.avaliacao = avaliacaoManager.recuperarPorId(avaliacao.getId());
		tipoAvaliacao = this.avaliacao.getTipoAvaliacao();
		unidadeAdministrativa = this.avaliacao.getUnidadeOrganizacional();
		tipo = this.tipoAvaliacao.getTitulo();
		condutorAvaliacao = this.avaliacao.getCondutor();
		condutor = this.condutorAvaliacao.getPessoaFisica()
				.getNomPessoaFisica();
		listEquipeAvaliacao = this.avaliacao.getEquipeAvaliacao();
		listServidorAvaliacao = this.avaliacao.getServidoresAvaliacao();

		for (EquipeAvaliacao equipeAvaliacao : listEquipeAvaliacao) {
			this.equipeAvaliacao = equipeAvaliacao;
		}

		this.equipe = this.equipeAvaliacao.getEquipe();

		equipeString = this.equipeAvaliacao.getEquipe().getNomesServidores();

		if (listServidoresAvaliados == null) {
			listServidoresAvaliados = new ArrayList<Servidor>();
		}
		for (ServidorAvaliacao servidorAvaliacao : listServidorAvaliacao) {
			if (servidorAvaliacao.getChefia() != null) {
				servidorAvaliacao.getServidor().setChefia(
						servidorAvaliacao.getChefia().getId());
			}
			listServidoresAvaliados.add(servidorAvaliacao.getServidor());

		}
		this.avaliacao.getServidoresAvaliacao().clear();

		this.isIncluindo = false;
		this.isVisualizando = false;
		this.isEditando = true;

		this.isIncluir = false;
		this.isEditar = true;
		this.isVisualizar = false;
		
		this.uf = this.avaliacao.getUnidadeOrganizacional().getCodUf();
		this.ufAuxiliar = this.uf;
		this.procurarNomeUnidAdm();
		
		this.unidadeAdministrativa = this.avaliacao.getUnidadeOrganizacional();
		this.UnidAuxiliar = this.unidadeAdministrativa;
		verificaSePreencheuUnidadeAdm();

		controllerHelper.setRedirect("?Page=Editar_Avaliacao");

		return "ir_editar";
	}

	public String irVisualizar(Avaliacao avaliacao) {
		limparObjetos();
		this.avaliacao = avaliacaoManager.recuperarPorId(avaliacao.getId());
		tipoAvaliacao = this.avaliacao.getTipoAvaliacao();
		unidadeAdministrativa = this.avaliacao.getUnidadeOrganizacional();
		tipo = this.tipoAvaliacao.getTitulo();
		condutorAvaliacao = this.avaliacao.getCondutor();
		condutor = this.condutorAvaliacao.getPessoaFisica()
				.getNomPessoaFisica();
		listEquipeAvaliacao = this.avaliacao.getEquipeAvaliacao();
		listServidorAvaliacao = this.avaliacao.getServidoresAvaliacao();

		for (EquipeAvaliacao equipeAvaliacao : listEquipeAvaliacao) {
			this.equipeAvaliacao = equipeAvaliacao;
		}

		equipeString = this.equipeAvaliacao.getEquipe().getNomesServidores();

		if (listServidoresAvaliados == null) {
			listServidoresAvaliados = new ArrayList<Servidor>();
		}
		for (ServidorAvaliacao servidorAvaliacao : listServidorAvaliacao) {
			if (servidorAvaliacao.getChefia() != null) {
				servidorAvaliacao.getServidor().setChefia(
						servidorAvaliacao.getChefia().getId());
			}
			listServidoresAvaliados.add(servidorAvaliacao.getServidor());
		}

		this.isIncluindo = false;
		this.isVisualizando = true;
		this.isEditando = false;

		this.isIncluir = false;
		this.isEditar = false;
		this.isVisualizar = true;
		
		this.uf = this.avaliacao.getUnidadeOrganizacional().getCodUf();
		this.ufAuxiliar = this.uf;
		this.procurarNomeUnidAdm();
		
		this.unidadeAdministrativa = this.avaliacao.getUnidadeOrganizacional();
		this.UnidAuxiliar = this.unidadeAdministrativa;

		controllerHelper.setRedirect("?Page=Visualizar_Avaliacao");

		return "ir_visualizar";
	}

	public void preparExclusao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public void vincularServidor(Servidor servidor) {
		this.avaliacao.setCondutor(servidor);
		condutor = servidor.getPessoaFisica().getNomPessoaFisica();
	}

	public void vincularChefia(Servidor servidorChefia) {
		for (Servidor servidor : listServidoresAvaliados) {
			if (servidor.getId() == servidorSelecionado.getId()) {
				servidor.setChefia(servidorChefia.getId());
			}
		}
	}

	public String buscarChefia(Servidor _servidor) {
		if (_servidor.getUnidadeAdministrativaExce() != null
				&& _servidor.getUnidadeAdministrativaExce().getServidor() != null
				&& _servidor.getUnidadeAdministrativaExce().getServidor()
						.getPessoaFisica() != null
				&& !_servidor.getUnidadeAdministrativaExce().getServidor()
						.getPessoaFisica().getNomPessoaFisica().isEmpty()) {
			return _servidor.getUnidadeAdministrativaExce().getServidor()
					.getPessoaFisica().getNomPessoaFisica();
		} else {
			if (_servidor.getChefia() != null) {
				Servidor servidor2 = (Servidor) servidorManager.recuperarPorId(
						Servidor.class, _servidor.getChefia());
				return servidor2.getPessoaFisica().getNomPessoaFisica();
			}
		}

		return "";
	}

	public String buscarChefiaDetalhes() {
		if (this.servidorSelecionado != null) {
			if (this.servidorSelecionado.getUnidadeAdministrativaExce() != null
					&& this.servidorSelecionado.getUnidadeAdministrativaExce()
							.getServidor() != null
					&& this.servidorSelecionado.getUnidadeAdministrativaExce()
							.getServidor().getPessoaFisica() != null
					&& !this.servidorSelecionado.getUnidadeAdministrativaExce()
							.getServidor().getPessoaFisica()
							.getNomPessoaFisica().isEmpty()) {
				return this.servidorSelecionado.getUnidadeAdministrativaExce()
						.getServidor().getPessoaFisica().getNomPessoaFisica();
			} else {
				if (this.servidorSelecionado.getChefia() != null) {
					Servidor servidor2 = (Servidor) servidorManager
							.recuperarPorId(Servidor.class,
									this.servidorSelecionado.getChefia());
					return servidor2.getPessoaFisica().getNomPessoaFisica();
				}
			}
			return "";
		} else {
			return "";
		}
	}

	public void procurarEquipe(UnidadeAdministrativa unidadeAdministrativa) {
		if (this.equipe == null) {
			this.equipe = new Equipe();
		}
		listEquipe = equipeManager.consultarEquipe(this.palavraChave, unidadeAdministrativa);
		this.palavraChave = "";
		if (listEquipe == null || listEquipe.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}
	
	public void vincularEquipe(Equipe equipe) {
		if (equipe != null) {
			if (this.avaliacao != null
					&& this.avaliacao.getEquipeAvaliacao() == null) {
				this.avaliacao
						.setEquipeAvaliacao(new ArrayList<EquipeAvaliacao>());
			}
			EquipeAvaliacao equipeAvaliacao = new EquipeAvaliacao();
			equipeAvaliacao.setAvaliacao(this.avaliacao);
			equipeAvaliacao.setEquipe(equipe);
			this.avaliacao.getEquipeAvaliacao().add(equipeAvaliacao);
			listEquipe = new ArrayList<Equipe>();
		}
		this.equipe = equipe;
		equipeString = equipe.getNomesServidores();
		palavraChave = "";
	}

	public void vincularTipo(TipoAvaliacao tipoo) {
		tipo = tipoo.getTitulo();
		palavraChave = "";
	}

	private void limparObjetos() {
		this.servidor = new Servidor();
		this.avaliacao = new Avaliacao();
		this.unidadeAdministrativa = new UnidadeAdministrativa();
		this.uf = new Uf();
		if (listServidoresAvaliados != null) {
			listServidoresAvaliados.clear();
		}
		if (listAvaliacao != null) {
			listAvaliacao.clear();
		}
		listAvaliacao = new ArrayList<Avaliacao>();
		isVisualizando = false;
		isIncluindo = false;
		isEditando = false;
		condutor = "";
		tipo = "";
		equipeString = "";
	}

	public void setIsIncluindo(Boolean isIncluindo) {
		this.isIncluindo = isIncluindo;
	}

	public void setIsEditando(Boolean isEditando) {
		this.isEditando = isEditando;
	}

	public void setIsVisualizando(Boolean isVisualizando) {
		this.isVisualizando = isVisualizando;
	}

	public Boolean getIsVisualizando() {
		return isVisualizando;
	}

	public Boolean getIsEditando() {
		return isEditando;
	}

	public Boolean getIsIncluindo() {
		return isIncluindo;
	}

	public String getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}

	public String getCondutor() {
		return condutor;
	}

	public void setCondutor(String condutor) {
		this.condutor = condutor;
	}

	public String getTipoAvaliacao() {
		return tipo;
	}

	public void setTipoAvaliacao(String tipoAvaliacao) {
		this.tipo = tipoAvaliacao;
	}

	public String getEquipeString() {
		return equipeString;
	}

	public void setEquipeString(String equipe) {
		this.equipeString = equipe;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public Map<Servidor, Boolean> getServidoresSelecionados() {
		return servidoresSelecionados;
	}

	public void setServidoresSelecionados(
			Map<Servidor, Boolean> servidoresSelecionados) {
		this.servidoresSelecionados = servidoresSelecionados;
	}

	public Boolean getTodosSelecionados() {
		return todosSelecionados;
	}

	public void setTodosSelecionados(Boolean todosSelecionados) {
		this.todosSelecionados = todosSelecionados;
	}

	public UnidadeAdministrativa getUnidadeAdministrativa() {
		return unidadeAdministrativa;
	}

	public void setUnidadeAdministrativa(
			UnidadeAdministrativa unidadeAdministrativa) {
		this.unidadeAdministrativa = unidadeAdministrativa;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public String getChefia() {
		return chefia;
	}

	public void setChefia(String chefia) {
		this.chefia = chefia;
	}

	public Servidor getServidorChefe() {
		return servidorChefia;
	}

	public void setServidorChefe(Servidor servidorChefe) {
		this.servidorChefia = servidorChefe;
	}

	public Servidor getServidor1() {
		return servidorSelecionado;
	}

	public void setServidor1(Servidor servidor1) {
		this.servidorSelecionado = servidor1;
	}

	public boolean isHabilitaMensagem() {
		return habilitaMensagem;
	}

	public void setHabilitaMensagem(boolean habilitaMensagem) {
		this.habilitaMensagem = habilitaMensagem;
	}

	public boolean isPreencheuUnidadeAdm() {
		return preencheuUnidadeAdm;
	}

	public void setPreencheuUnidadeAdm(boolean preencheuUnidadeAdm) {
		this.preencheuUnidadeAdm = preencheuUnidadeAdm;
	}

	public UnidadeAdministrativa getUnidAuxiliar() {
		return UnidAuxiliar;
	}

	public void setUnidAuxiliar(UnidadeAdministrativa unidAuxiliar) {
		UnidAuxiliar = unidAuxiliar;
	}

	public Uf getUfAuxiliar() {
		return ufAuxiliar;
	}

	public void setUfAuxiliar(Uf ufAuxiliar) {
		this.ufAuxiliar = ufAuxiliar;
	}

}