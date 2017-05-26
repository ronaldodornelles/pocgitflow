package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

import br.gov.iphan.sisgep.entity.Servidor;
import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;
import br.gov.iphan.sisgep.manager.ServidorManager;
import br.gov.iphan.sisgep.manager.UnidadeAdministrativaManager;
import br.gov.iphan.sisgep.util.Mensagens;

/**
 * Classe responsável por promover e tratar ações pertinentes a entidade
 * UnidadeAdministrativa e as entidade associadas a ela.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("manterUnidadeAdministrativaAction")
@Scope(ScopeType.CONVERSATION)
public class ManterUnidadeAdministrativaAction extends BaseAction {
	private static final long serialVersionUID = -7409735643659325694L;

	private Boolean isIncluindo;
	private Boolean isEditando;
	private Boolean isVisualizando;

	@In(required = false, create = true)
	private UnidadeAdministrativaManager unidadeAdministrativaManager;

	@In(required = false, create = true)
	private ServidorManager servidorManager;

	@In(required = false, create = true)
	@Out(required = false)
	private UnidadeAdministrativa unidadeAdministrativa;

	@In(required = false, create = true)
	@Out(required = false)
	private Servidor servidor;

	private UnidadeAdministrativa unidadeAdminConsultaModal;

	@In(required = false, create = true)
	@Out(required = false)
	public List<UnidadeAdministrativa> listUnidadeAdministrativa;

	@In(required = false, create = true)
	@Out(required = false)
	public List<UnidadeAdministrativa> listUnidadeAdministrativaModal;

	@In(required = false, create = true)
	@Out(required = false)
	public List<UnidadeAdministrativa> listNodesModal;

	@In(required = false, create = true)
	@Out(required = false)
	public List<Servidor> listServidor;

	@In(required = false, create = true)
	@Out(required = false)
	public List<UnidadeAdministrativa> listNodes;

	/**
	 * Metodo execultado todas as vezes que caso de uso e iniciado
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	@Override
	public void init() {
		unidadeAdministrativa.setUnidadeAdministrativa(new UnidadeAdministrativa());
		if (unidadeAdministrativa.getId() == null) {
			controllerHelper.setRedirect("?Page=Pesquisar_Unidade_Organizacional");
		}
		super.init();
	}

	/**
	 * Metodo responsável por tratar e realizar as ações de Inserção e
	 * Atualização da entidade UnidadeAdministrativa.
	 * 
	 * @return String contendo o indentificador do redirect que aplicação deve
	 *         realizar.
	 * @author Thiago Nunes Vieira
	 **/
	@End
	public String salvar() {
		// limpa tudo antes.
		unidadeAdministrativaManager.getEntityManager().clear();
		UnidadeAdministrativa unidadeAdministrativaBanco = (UnidadeAdministrativa) this.unidadeAdministrativaManager.recuperarPorId(
				UnidadeAdministrativa.class, unidadeAdministrativa.getId());
		Servidor servidor = null;
		if (unidadeAdministrativa.getServidor() != null) {
			servidor = (Servidor) servidorManager.recuperarPorId(Servidor.class, unidadeAdministrativa.getServidor().getId());
		}
		unidadeAdministrativaBanco.setTxtEmailContato(this.unidadeAdministrativa.getTxtEmailContato());
		unidadeAdministrativaBanco.setTxtTelefoneContato(this.unidadeAdministrativa.getTxtTelefoneContato());
		unidadeAdministrativaBanco.setTxtEndereco(this.unidadeAdministrativa.getTxtEndereco());
		unidadeAdministrativaBanco.setIndSuperintendecia(this.unidadeAdministrativa.getIndSuperintendecia());
		unidadeAdministrativaBanco.setUnidadeAdministrativa(this.unidadeAdministrativa.getUnidadeAdministrativa());
		unidadeAdministrativaBanco.setServidor(servidor);

		// unidadeAdministrativa.setServidor(servidor);
		unidadeAdministrativaManager.salvar(unidadeAdministrativaBanco);
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		unidadeAdministrativa = new UnidadeAdministrativa();
		listUnidadeAdministrativa = new ArrayList<UnidadeAdministrativa>();
		listNodes = new ArrayList<UnidadeAdministrativa>();
		listUnidadeAdministrativa = new ArrayList<UnidadeAdministrativa>();
		unidadeAdministrativaManager.getEntityManager().clear();
		return "sucesso_salvar";
	}

	/**
	 * Metodo responsável por tratar e realizar a ações de exclusão da entidade
	 * UnidadeAdministrativa.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void excluir() {
		listUnidadeAdministrativa.remove(unidadeAdministrativa);
		unidadeAdministrativaManager.excluir(unidadeAdministrativa);
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		unidadeAdministrativa = new UnidadeAdministrativa();
	}

	/**
	 * Metodo responsável por promover e realizar a ações de pesquisa da
	 * entidade UnidadeAdministrativa.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void procurar() {
		listNodes = new ArrayList<UnidadeAdministrativa>();
		listUnidadeAdministrativa = new ArrayList<UnidadeAdministrativa>();
		listUnidadeAdministrativa = unidadeAdministrativaManager.consultarUnidadeAdministrativa(unidadeAdministrativa);
		if (listUnidadeAdministrativa == null || listUnidadeAdministrativa.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		} else {
			if (unidadeAdministrativa.getNomUnidadeAdministrativa().trim().equals("")
					&& unidadeAdministrativa.getUnidadeAdministrativa().getNomUnidadeAdministrativa().trim().equals("")
					&& unidadeAdministrativa.getSiglaUnidade().trim().equals("") && unidadeAdministrativa.getCodUf() == null) {
				for (UnidadeAdministrativa adm : listUnidadeAdministrativa) {
					if (adm.getUnidadeAdministrativa() == null) {
						listNodes.add(adm);
					}
				}
			} else {
				for (UnidadeAdministrativa adm : listUnidadeAdministrativa) {
					if (adm.getUnidadeAdministrativa() != null) {
						// #TODO Ver se pode tirar essa idiotice
						// UnidadeAdministrativa administrativa =
						// recursivo(adm);
						UnidadeAdministrativa administrativa = adm;
						if (!listNodes.contains(administrativa)) {
							listNodes.add(adm);
						}
					}
				}
			}

			if (unidadeAdministrativa.getCodUf() != null) {
				List<UnidadeAdministrativa> listNodes2 = new ArrayList<UnidadeAdministrativa>();
				listNodes2.addAll(listNodes);
				for (UnidadeAdministrativa ad : listNodes2) {
					if (ad.getUnidadeAdministrativas() != null) {
						listNodes.removeAll(ad.getUnidadeAdministrativas());
					}
				}
			}
		}
		unidadeAdministrativa = new UnidadeAdministrativa();
	}

	/**
	 * Metodo montar a arvore de unidades organizacional
	 * 
	 * @param UnidadeAdministrativa
	 *            adm
	 * @return UnidadeAdministrativa
	 * @author Thiago Nunes Vieira
	 **/
	public UnidadeAdministrativa recursivo(UnidadeAdministrativa adm) {
		UnidadeAdministrativa administrativa = adm;
		if (administrativa.getUnidadeAdministrativa() != null && administrativa.getUnidadeAdministrativa().getUnidadeAdministrativa() != null) {
			recursivo(administrativa.getUnidadeAdministrativa());
		}
		return administrativa;
	}

	/**
	 * Metodo responsável por atribuir a UnidadeAdministrativa Pai.
	 * 
	 * @param unidadeAdministrativa
	 *            Unidade Administrativa pai.
	 * @author Thiago Nunes Vieira
	 **/
	public void vincularUnidadeAdministrativaPai(UnidadeAdministrativa unidadeAdministrativaVinculo) {
		unidadeAdministrativa.setUnidadeAdministrativa(unidadeAdministrativaVinculo);
		reRenderModal = false;
	}

	/**
	 * Metodo responsável por atribuir o Servidor Responsavel a Unidade.
	 * 
	 * @param unidadeAdministrativa
	 *            Unidade Administrativa pai.
	 * @author Thiago Nunes Vieira
	 **/
	public void vincularServidorUnidade(Servidor servidor) {
		unidadeAdministrativa.setServidor(servidor);
		reRenderModal = false;
	}

	/**
	 * Metodo responsável por preparar a consulta de Unidades Adminstrativas
	 * pais.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void preparaModalConsulta() {
		listNodesModal = new ArrayList<UnidadeAdministrativa>();
		unidadeAdminConsultaModal = new UnidadeAdministrativa();
		unidadeAdminConsultaModal.setUnidadeAdministrativa(new UnidadeAdministrativa());
		listUnidadeAdministrativaModal = new ArrayList<UnidadeAdministrativa>();
		reRenderModal = true;
	}

	/**
	 * Metodo responsável por preparar a consulta de Unidades Adminstrativas
	 * pais.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void preparaModalConsultaServidor() {
		servidor = new Servidor();
		listServidor = new ArrayList<Servidor>();
		reRenderModal = true;
	}

	/**
	 * Metodo responsável por promover e realizar a ação de pesquisa das
	 * Unidades Administrativas pais.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public void procurarModal() {
		listNodesModal = new ArrayList<UnidadeAdministrativa>();
		listUnidadeAdministrativaModal = new ArrayList<UnidadeAdministrativa>();

		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select o ");
		hql.append(" from UnidadeAdministrativa o where 0=0 ");
		if (unidadeAdminConsultaModal != null) {
			if (unidadeAdminConsultaModal.getNomUnidadeAdministrativa() != null && !unidadeAdminConsultaModal.getNomUnidadeAdministrativa().trim().equals("")) {
				hql.append(" and lower( o.nomUnidadeAdministrativa )  like lower( ? ) ");
				params.add("%" + unidadeAdminConsultaModal.getNomUnidadeAdministrativa() + "%");
			}
			if (unidadeAdminConsultaModal.getSiglaUnidade() != null && !unidadeAdminConsultaModal.getSiglaUnidade().trim().equals("")) {
				hql.append(" and lower( o.siglaUnidade )  like lower( ? ) ");
				params.add("%" + unidadeAdminConsultaModal.getSiglaUnidade() + "%");
			}
			if (unidadeAdminConsultaModal.getUnidadeAdministrativa() != null) {
				if (unidadeAdminConsultaModal.getUnidadeAdministrativa().getNomUnidadeAdministrativa() != null
						&& !unidadeAdminConsultaModal.getUnidadeAdministrativa().getNomUnidadeAdministrativa().trim().equals("")) {
					hql.append(" and lower( o.unidadeAdministrativa.nomUnidadeAdministrativa )  like lower( ? ) ");
					params.add("%" + unidadeAdminConsultaModal.getUnidadeAdministrativa().getNomUnidadeAdministrativa() + "%");
				}
			}
			if (unidadeAdminConsultaModal.getCodUf() != null) {
				if (unidadeAdminConsultaModal.getCodUf().getId() != null) {
					hql.append(" and o.codUf.id = ? ");
					params.add(unidadeAdminConsultaModal.getCodUf().getId());
				}
			}
		}

		Query query = unidadeAdministrativaManager.getEntityManager().createQuery(hql.toString());

		int i = 1;
		for (Object o : params) {
			query.setParameter(i, o);
			i++;
		}
		listUnidadeAdministrativaModal = query.getResultList();

		if (listUnidadeAdministrativaModal == null || listUnidadeAdministrativaModal.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		} else {
			if (unidadeAdminConsultaModal.getNomUnidadeAdministrativa().trim().equals("")
					&& unidadeAdminConsultaModal.getUnidadeAdministrativa().getNomUnidadeAdministrativa().trim().equals("")
					&& unidadeAdminConsultaModal.getSiglaUnidade() == null && unidadeAdminConsultaModal.getCodUf() == null) {
				for (UnidadeAdministrativa adm : listUnidadeAdministrativaModal) {
					if (adm.getUnidadeAdministrativa() == null) {
						listNodesModal.add(adm);
					}
				}
			} else {
				for (UnidadeAdministrativa adm : listUnidadeAdministrativaModal) {
					if (adm.getUnidadeAdministrativa() != null) {
						// #TODO Ver se pode tirar essa idiotice
						// UnidadeAdministrativa administrativa =
						// recursivo(adm);
						UnidadeAdministrativa administrativa = adm;
						if (!listNodesModal.contains(administrativa)) {
							listNodesModal.add(adm);
						}
					}
				}
			}

			if (unidadeAdminConsultaModal.getCodUf() != null) {
				List<UnidadeAdministrativa> listNodes2 = new ArrayList<UnidadeAdministrativa>();
				listNodes2.addAll(listNodesModal);
				for (UnidadeAdministrativa ad : listNodes2) {
					if (ad.getUnidadeAdministrativas() != null) {
						listNodesModal.removeAll(ad.getUnidadeAdministrativas());
					}
				}
			}
		}
		unidadeAdminConsultaModal = new UnidadeAdministrativa();
		unidadeAdminConsultaModal.setUnidadeAdministrativa(new UnidadeAdministrativa());
	}

	/**
	 * Metodo responsável por promover e realizar a ação de pesquisa dos
	 * Servidores.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void procurarModalServidor() {
		listServidor = servidorManager.consultarServidor(servidor);
		if (listServidor == null || listServidor.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
		servidor = new Servidor();
	}

	/**
	 * Metodo responsável por preparar a entidade UnidadeAdministrativa para
	 * inclusão.
	 * 
	 * @return String contendo o indentificador do redirect para a interface de
	 *         inclusão de UnidadeAdministrativa.
	 * @author Thiago Nunes Vieira
	 **/
	public String irIncluir() {
		limparObjetos();
		this.isIncluindo = true;
		this.isVisualizando = false;
		this.isEditando = false;

		this.isIncluir = true;
		this.isEditar = false;
		this.isVisualizar = false;

		return "ir_incluir";
	}

	public String cancelar() {
		unidadeAdministrativa = new UnidadeAdministrativa();
		listUnidadeAdministrativa = new ArrayList<UnidadeAdministrativa>();
		return "cancelar";
	}

	/**
	 * Metodo responsável por preparar a entidade UnidadeAdministrativa para
	 * edição.
	 * 
	 * @return String contendo o indentificador do redirect para a interface de
	 *         edição de UnidadeAdministrativa.
	 * @author Thiago Nunes Vieira
	 **/
	public String irEditar(UnidadeAdministrativa unidadeAdministrativa) {
		limparObjetos();
		this.unidadeAdministrativa = unidadeAdministrativa;

		this.isIncluindo = false;
		this.isVisualizando = false;
		this.isEditando = true;

		this.isIncluir = false;
		this.isEditar = true;
		this.isVisualizar = false;
		controllerHelper.setRedirect("?Page=Editar_Unidade_Organizacional");
		return "ir_editar";
	}

	/**
	 * Metodo responsável por preparar a entidade UnidadeAdministrativa para
	 * visualização.
	 * 
	 * @return String contendo o indentificador do redirect para a interface de
	 *         visualização de UnidadeAdministrativa.
	 * @author Thiago Nunes Vieira
	 **/
	public String irVisualizar(UnidadeAdministrativa unidadeAdministrativa) {
		this.unidadeAdministrativa = unidadeAdministrativa;

		this.isIncluindo = false;
		this.isVisualizando = true;
		this.isEditando = false;

		this.isIncluir = false;
		this.isEditar = false;
		this.isVisualizar = true;
		controllerHelper.setRedirect("?Page=Visualizar_Unidade_Organizacional");
		return "ir_visualizar";
	}

	/**
	 * Metodo responsável por preparar a entidade UnidadeAdministrativa para
	 * exclusão.
	 * 
	 * @return String contendo o indentificador do redirect para a interface de
	 *         exclusão de UnidadeAdministrativa.
	 * @author Thiago Nunes Vieira
	 **/
	public String preparExclusao(UnidadeAdministrativa unidadeAdministrativa) {
		this.unidadeAdministrativa = unidadeAdministrativa;
		return null;
	}

	/**
	 * Metodo responsável por limpar os atributos dos objetos.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	private void limparObjetos() {
		unidadeAdministrativa = new UnidadeAdministrativa();
		listUnidadeAdministrativa = new ArrayList<UnidadeAdministrativa>();
		isVisualizando = false;
		isIncluindo = false;
		isEditando = false;
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

	public UnidadeAdministrativa getUnidadeAdminConsultaModal() {
		return unidadeAdminConsultaModal;
	}

	public void setUnidadeAdminConsultaModal(UnidadeAdministrativa unidadeAdminConsultaModal) {
		this.unidadeAdminConsultaModal = unidadeAdminConsultaModal;
	}

}