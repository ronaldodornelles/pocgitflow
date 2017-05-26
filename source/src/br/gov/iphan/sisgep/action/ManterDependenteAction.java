package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

import br.gov.iphan.sisgep.entity.Dependente;
import br.gov.iphan.sisgep.entity.FimDependente;
import br.gov.iphan.sisgep.manager.DependenteManager;
import br.gov.iphan.sisgep.manager.FimDependenteManager;
import br.gov.iphan.sisgep.util.Mensagens;

/**
 * Classe responsável por promover e tratar ações pertinentes a entidade
 * Dependente e as entidade associadas a ela.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("manterDependenteAction")
@Scope(ScopeType.CONVERSATION)
public class ManterDependenteAction extends ManterServidorAction {
	private static final long serialVersionUID = -7409735643659325694L;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isIncluirDependente;

	public boolean novaCertidao = false;

	public boolean prechidoCertidao = true;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isEditarDependente;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isVisualizarDependente;

	@In(required = false, create = true)
	@Out(required = false)
	private Dependente dependente;

	@In(required = false, create = true)
	@Out(required = false)
	DependenteManager dependenteManager;

	@In(required = false, create = true)
	@Out(required = false)
	FimDependenteManager fimDependenteManager;
	
	@In(required = false, create = true)
	@Out(required = false)
	private List<Dependente> listaDependente;

	public List<FimDependente> listFimDependente;

	/**
	 * Metodo responsável por tratar e realizar as ações de Inserção e
	 * Atualização da entidade dependente.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void salvarDependente() {
		if (!validarRegras()) {
			return;
		}
		
		String hoje = formataData(new Date(), "yyyyMMdd");
		String nascimento = formataData(dependente.getDatNascimento(), "yyyyMMdd");
		
		if(Integer.parseInt(nascimento) > Integer.parseInt(hoje)){
			mensagemWarn(Mensagens.MSGW004.retornaMensagem("data de nascimento"));
			return;
		}
		
		reRenderModal = false;
		if(getServidor().getUnidadeAdmLotacao().getId()==null){
			getServidor().setUnidadeAdmLotacao(null);
		}
		dependente.setServidor(getServidor());
		if (dependente.getId() == null) {
			isEditarDependente = false;
		} else {
			isEditarDependente = true;
		}
		dependenteManager.salvar(dependente);
		if (getServidor().getDependentes() == null) {
			getServidor().setDependentes(new HashSet<Dependente>());
		}
		if (!isEditarDependente) {
			getServidor().getDependentes().add(dependente);
		}
		getServidor().getDependentes();
	}

	/**
	 * Metodo responsável por tratar e realizar a ação de Exclusão da entidade
	 * dependente.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void excluirDependente() {
		validarRegras();
		if(getServidor().getUnidadeAdmLotacao().getId()==null){
			getServidor().setUnidadeAdmLotacao(null);
		}
		getServidor().getDependentes().remove(dependente);
		dependenteManager.excluir(dependente);
	}

	/**
	 * Metodo responsável por preparar a exclusão da entidade dependente.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void prepararExclusao(Dependente dependente) {
		this.dependente = dependente;
	}

	/**
	 * Metodo responsável por limpar a entidade dependente após fecha a modal.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void voltarModal() {
		this.dependente = null;
	}

	/**
	 * Metodo responsável por preparar a entidade dependente para inclusão.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void incluirDependentes() {
		this.dependente = new Dependente();
		isIncluirDependente = true;
		isEditarDependente = false;
		isVisualizarDependente = false;
		reRenderModal = true;
	}

	/**
	 * Metodo responsável por preparar a entidade dependente para edição.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void irEditarDependente(Dependente dependente) {
		this.dependente = new Dependente();
		dependenteManager.getEntityManager().clear();
		this.dependente = (Dependente) dependenteManager.recuperarPorId(
				Dependente.class, dependente.getId());
		isIncluirDependente = false;
		isEditarDependente = true;
		isVisualizarDependente = false;
		reRenderModal = true;
		novaCertidao = false;
	}

	/**
	 * Metodo responsável por preparar a entidade dependente para visualização.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void irVisualizarDependente(Dependente dependente) {
		this.dependente = new Dependente();
		dependenteManager.getEntityManager().clear();
		this.dependente = (Dependente) dependenteManager.recuperarPorId(
				Dependente.class, dependente.getId());
		isIncluirDependente = false;
		isEditarDependente = false;
		isVisualizarDependente = true;
	}

	/**
	 * Metodo responsável por desabilitar os campos número de folha e livro da
	 * certidão de nascimento quando o tipo for igual a Nova.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void verificarTipoCertidao() {
		if (dependente != null) {
			prechidoCertidao = false;
			if (dependente.getIndTipoCertidaoNasc() != null
					&& dependente.getIndTipoCertidaoNasc().trim().equals("N")) {
				dependente.setNumFolhaLivroCertidao(null);
				dependente.setDesLivroCertidao(null);
				novaCertidao = true;
			} else {
				novaCertidao = false;
			}
		}
	}

	/**
	 * Metodo responsável por listar os fins de dependencia
	 * @return			  List<FimDependente>
	 * @author            Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<FimDependente> getListFimDependente() {
		listFimDependente = fimDependenteManager
				.listarTodos(FimDependente.class);
		if (!listFimDependente.isEmpty()
				&& dependente.getFimDependentes() != null) {
			listFimDependente.removeAll(dependente.getFimDependentes());
		}
		return listFimDependente;
	}


	/**
	 * Metodo responsável por listar os dependentes
	 * @return			  List<Dependente>
	 * @author            Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<Dependente> listarDependentes() {
		if(getServidor()!=null){	
			if(getServidor().getId()!=null){
				listaDependente = cessaoRequisicaoManager.getEntityManager()
						.createQuery("select d from Dependente d where d.servidor.id = :idSevidor ")
						.setParameter("idSevidor", getServidor().getId())
						.getResultList();
			}
		}
		else{
			listaDependente= new ArrayList<Dependente>();
		}
		return listaDependente;
	}
	
	public void setListFimDependente(List<FimDependente> listFimDependente) {
		this.listFimDependente = listFimDependente;
	}

	public boolean isNovaCertidao() {
		return novaCertidao;
	}

	public void setNovaCertidao(boolean novaCertidao) {
		this.novaCertidao = novaCertidao;
	}

	public boolean isPrechidoCertidao() {
		return prechidoCertidao;
	}

	public void setPrechidoCertidao(boolean prechidoCertidao) {
		this.prechidoCertidao = prechidoCertidao;
	}

	public Dependente getDependente() {
		return dependente;
	}

	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}

}