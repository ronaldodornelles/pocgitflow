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

import br.gov.iphan.sisgep.entity.Equipe;
import br.gov.iphan.sisgep.entity.Servidor;
import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;
import br.gov.iphan.sisgep.manager.AvaliacaoManager;
import br.gov.iphan.sisgep.manager.EquipeManager;
import br.gov.iphan.sisgep.manager.ServidorManager;
import br.gov.iphan.sisgep.manager.UnidadeAdministrativaManager;
import br.gov.iphan.sisgep.util.Mensagens;

@Name("manterEquipeAction")
@Scope(ScopeType.CONVERSATION)
public class ManterEquipeAction extends BaseAction {

	private static final long serialVersionUID = -7409735643659325694L;

	private Boolean isIncluindo;
	private Boolean isEditando;
	private Boolean isVisualizando;

	private Boolean todosSelecionados = false;

	@In
	Credentials credentials;

	@In(required = false, create = true)
	private EquipeManager equipeManager;

	@In(required = false, create = true)
	@Out(required = false)
	public Equipe equipe;

	@In(required = false, create = true)
	@Out(required = false)
	public List<Equipe> listEquipe;

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
	public List<UnidadeAdministrativa> listUnidadeAdministrativaModal;

	@In(required = false, create = true)
	@Out(required = false)
	public List<UnidadeAdministrativa> listNodesModal;

	@In(required = false, create = true)
	@Out(required = false)
	public List<Servidor> listServidorModal;

	@In(required = false, create = true)
	CombosAuxiliarAction combosAuxiliarAction;

	@In(required = false, create = true)
	private UnidadeAdministrativaManager unidadeAdministrativaManager;

	@In(required = false, create = true)
	private ServidorManager servidorManager;

	@In(required = false, create = true)
	private AvaliacaoManager avaliacaoManager;

	@In(required = false, create = true)
	@Out(required = false)
	public Servidor servidor;

	@In(required = false, create = true)
	@Out(required = false)
	private Map<Servidor, Boolean> servidoresSelecionados = new HashMap<Servidor, Boolean>(0);

	@End
	public String salvarEVoltar() {
		if (equipe.getServidores() == null || equipe.getServidores().size() == 0) {
			mensagemErro(Mensagens.MSGW014.retornaMensagem());
			return "erro";
		} else if(equipe.getUnidadeAdministrativa() == null) {
			mensagemErro("Selecione uma Unidade Organizacional");
			return "erro";
		
		} else {
		
			equipeManager.salvar(this.equipe);
			limparObjetos();
			mensagemInfo(Mensagens.MSGI001.retornaMensagem());
			return "salvo_sucesso";
		}
	}

	public void excluir() {
		if (equipeManager.verificaEquipeAvalicao(equipe)) {
			mensagemInfo(Mensagens.MSGW015.retornaMensagem());
		} else {
			equipeManager.excluir(equipe);
			mensagemInfo(Mensagens.MSGI001.retornaMensagem());
			limparObjetos();
			this.procurar();
		}
	}

	public void excluirServidor() {
		List<Servidor> servidoresEquipe = getEquipe().getServidores();

		if (servidoresEquipe == null)
			servidoresEquipe = new ArrayList<Servidor>();

		servidoresEquipe.remove(this.servidor);

		getEquipe().setServidores(servidoresEquipe);

		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
	}

	public void procurar() {
		if (this.equipe == null) {
			this.equipe = new Equipe();
		}
		listEquipe = equipeManager.consultarEquipe(this.palavraChave);
		palavraChave = "";
		if (listEquipe == null || listEquipe.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}

	public String irIncluir() {
		limparObjetos();

		this.isIncluindo = true;
		this.isVisualizando = false;
		this.isEditando = false;
		this.isVisualizando = false;

		this.isIncluir = true;
		this.isEditar = false;
		this.isVisualizar = false;

		controllerHelper.setRedirect("?Page=Incluir_Equipe");

		return "ir_incluir";
	}

	public void cancelarExclusao() {
		equipe = new Equipe();
	}

	public String cancelar() {
		equipe = new Equipe();
		listEquipe = new ArrayList<Equipe>();
		return "cancelar";
	}

	public String irEditar(Equipe equipe) {
		limparObjetos();
		this.equipe = equipe;
		this.isIncluindo = false;
		this.isVisualizando = false;
		this.isEditando = true;

		this.isIncluir = false;
		this.isEditar = true;
		this.isVisualizar = false;

		controllerHelper.setRedirect("?Page=Editar_Equipe");

		return "ir_editar";
	}

	public String irVisualizar(Equipe equipe) {
		this.equipe = equipe;

		this.isIncluindo = false;
		this.isVisualizando = true;
		this.isEditando = false;

		this.isIncluir = false;
		this.isEditar = false;
		this.isVisualizar = true;

		controllerHelper.setRedirect("?Page=Visualizar_Equipe");

		return "ir_visualizar";
	}

	public String irIncluirr() {
		return "teste";
	}

	public void prepararExclusaoServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public void prepararExclusao(Equipe equipe) {
		this.equipe = equipe;
	}

	private void limparObjetos() {
		equipe = new Equipe();
		listEquipe = new ArrayList<Equipe>();
		isVisualizando = false;
		isIncluindo = false;
		isEditando = false;
	}

	public void prepararModalUnidade() {
		getEquipe().setUnidadeAdministrativa(new UnidadeAdministrativa());
		getEquipe().getUnidadeAdministrativa().setUnidadeAdministrativa(new UnidadeAdministrativa());
		listUnidadeAdministrativaModal = new ArrayList<UnidadeAdministrativa>();
		listNodesModal = new ArrayList<UnidadeAdministrativa>();
	}

	public Boolean prepararModalServidor() {
		if(this.equipe != null && this.equipe.getServidores() != null) {
			if(this.equipe.getServidores().size() > 5) {
				mensagemErro("Uma equipe deve ter no máximo cinco membros");
				return false;
			}
		}
		
		
		listServidorModal = new ArrayList<Servidor>();
		servidor = new Servidor();
		return true;
	}

	public void vincularUnidade(UnidadeAdministrativa unidadeAdministrativa) {
		getEquipe().setUnidadeAdministrativa(unidadeAdministrativa);
	}

	public void procurarUnidadeAdmin() {
		listNodesModal = new ArrayList<UnidadeAdministrativa>();
		listUnidadeAdministrativaModal = new ArrayList<UnidadeAdministrativa>();
		listUnidadeAdministrativaModal = unidadeAdministrativaManager.consultarUnidadeAdministrativa(getEquipe().getUnidadeAdministrativa());
		if (listUnidadeAdministrativaModal == null || listUnidadeAdministrativaModal.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		} else {
			if (getEquipe().getUnidadeAdministrativa().getNomUnidadeAdministrativa().trim().equals("")
					&& getEquipe().getUnidadeAdministrativa().getUnidadeAdministrativa().getNomUnidadeAdministrativa().trim().equals("")
					&& getEquipe().getUnidadeAdministrativa().getSiglaUnidade() == null && getEquipe().getUnidadeAdministrativa().getCodUf() == null) {
				for (UnidadeAdministrativa adm : listUnidadeAdministrativaModal) {
					if (adm.getUnidadeAdministrativa() == null) {
						listNodesModal.add(adm);
					}
				}
			} else {
				for (UnidadeAdministrativa adm : listUnidadeAdministrativaModal) {
					if (adm.getUnidadeAdministrativa() != null) {
						UnidadeAdministrativa administrativa = recursivo(adm);
						if (!listNodesModal.contains(administrativa)) {
							listNodesModal.add(adm);
						}
					}
				}
			}

			if (getEquipe().getUnidadeAdministrativa().getCodUf() != null) {
				List<UnidadeAdministrativa> listNodes2 = new ArrayList<UnidadeAdministrativa>();
				listNodes2.addAll(listNodesModal);
				for (UnidadeAdministrativa ad : listNodes2) {
					if (ad.getUnidadeAdministrativas() != null) {
						listNodesModal.removeAll(ad.getUnidadeAdministrativas());
					}
				}
			}
		}

	}

	public UnidadeAdministrativa recursivo(UnidadeAdministrativa adm) {
		UnidadeAdministrativa administrativa = adm;
		if (administrativa.getUnidadeAdministrativa() != null && administrativa.getUnidadeAdministrativa().getUnidadeAdministrativa() == null) {
			recursivo(administrativa.getUnidadeAdministrativa());
		}
		return administrativa;
	}

	public void procurarServidor() {
		listServidorModal = servidorManager.consultarServidorSemEquipe(servidor);

		this.limparListaServidores();

		if (listServidorModal == null || listServidorModal.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}

	public void vincularServidor(Servidor servidor) {
		List<Servidor> servidoresEquipe = getEquipe().getServidores();
		if (servidoresEquipe == null)
			servidoresEquipe = new ArrayList<Servidor>();
		servidoresEquipe.add(servidor);
		getEquipe().setServidores(servidoresEquipe);
	}

	public void cancelarModal() {
		servidor = new Servidor();
	}

	public void limparListaServidores() {
		this.servidoresSelecionados = new HashMap<Servidor, Boolean>();

		if (listServidorModal != null) {
			for (Servidor servidor : listServidorModal) {
				this.servidoresSelecionados.put(servidor, false);
			}
		}

		List<Servidor> servidoresEquipe = new ArrayList<Servidor>();
		
		if (getEquipe().getServidores() != null)
			servidoresEquipe.addAll(getEquipe().getServidores());
		
		servidoresEquipe.addAll(equipeManager.buscarServidoresTodasEquipes());

		if (servidoresEquipe != null) {
			for (Servidor servidorAvaliado : servidoresEquipe) {
				for (Iterator<Servidor> serv = listServidorModal.iterator(); serv.hasNext();) {
					Servidor servidorNext = serv.next();
					if (servidorNext.getId() == servidorAvaliado.getId()) {
						serv.remove();
					}
				}
			}
		}
	}

	public void selecionarTodos() {
		if (!this.todosSelecionados) {
			for (Map.Entry<Servidor, Boolean> entry : this.servidoresSelecionados.entrySet()) {
				entry.setValue(true);
			}
			this.todosSelecionados = true;
		} else {
			for (Map.Entry<Servidor, Boolean> entry : this.servidoresSelecionados.entrySet()) {
				entry.setValue(false);
			}
			this.todosSelecionados = false;
		}
	}

	public Boolean salvarSelecionados() {

		List<Servidor> servidoresEquipe = getEquipe().getServidores();

		if (servidoresEquipe == null) {
			servidoresEquipe = new ArrayList<Servidor>();
		}

		for (Servidor servidor : this.servidoresSelecionados.keySet()) {
			if (this.servidoresSelecionados.get(servidor) == true) {
				if (servidoresEquipe.size() >= 5) {
					getEquipe().setServidores(servidoresEquipe);
					mensagemWarn(Mensagens.MSGW013.retornaMensagem());
					break;
				}
				servidoresEquipe.add(servidor);
			}
		}
		
		if(servidoresEquipe.size() > 5) {
			mensagemErro("Uma equipe deve ter no máximo cinco membros");
			return false;
		}

		getEquipe().setServidores(servidoresEquipe);
		return true;
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

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Map<Servidor, Boolean> getServidoresSelecionados() {
		return servidoresSelecionados;
	}

	public void setServidoresSelecionados(Map<Servidor, Boolean> servidoresSelecionados) {
		this.servidoresSelecionados = servidoresSelecionados;
	}

	public Boolean getTodosSelecionados() {
		return todosSelecionados;
	}

	public void setTodosSelecionados(Boolean todosSelecionados) {
		this.todosSelecionados = todosSelecionados;
	}

}