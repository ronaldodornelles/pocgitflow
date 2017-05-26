package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

import br.gov.iphan.sisgep.entity.CessaoRequisicao;
import br.gov.iphan.sisgep.manager.CessaoRequisicaoManager;

/**
 * Classe responsável por promover e tratar ações pertinentes a entidade
 * CessaoRequisicao e as entidade associadas a ela.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("manterCessaoRequisicaoAction")
@Scope(ScopeType.CONVERSATION)
public class ManterCessaoRequisicaoAction extends ManterServidorAction {
	private static final long serialVersionUID = -7409735643659325694L;

	@In(create = true, required = false)
	@Out(required = false, scope = ScopeType.EVENT)
	public Boolean isIncluirCessaoRequisicao;

	@In(create = true, required = false)
	@Out(required = false, scope = ScopeType.EVENT)
	public Boolean isEditarCessaoRequisicao;

	@In(create = true, required = false)
	@Out(required = false, scope = ScopeType.EVENT)
	public Boolean isVisualizarCessaoRequisicao;
	
	@In(required = false, create = true)
	@Out(required = false, scope = ScopeType.EVENT)
	private CessaoRequisicao cessaoRequisicao;
	
	@In(required = false, create = true)
	CessaoRequisicaoManager cessaoRequisicaoManager;
	
	@In(required = false, create = true)
	@Out(required = false)
	private List<CessaoRequisicao> listaCessaoRequisicao;
	 
	/**
	 * Metodo responsável por tratar e realizar as ações de Inserção e Atualização da entidade CessaoRequisicao.
	 * @author            Thiago Nunes Vieira
	 **/
	public void salvarCessaoRequisicao() {
		if(!validarRegras()){
			return;
		}
		if(getServidor().getUnidadeAdmLotacao().getId()==null){
			getServidor().setUnidadeAdmLotacao(null);
		}
		cessaoRequisicao.setServidor(getServidor());
		if(cessaoRequisicao.getId()==null){
			isEditarCessaoRequisicao=false;
		}
		else{
			isEditarCessaoRequisicao=true;
		}
		cessaoRequisicaoManager.salvar(cessaoRequisicao);
		reRenderModal=false;
		if(getServidor().getCessaoRequisicaos()==null){
			getServidor().setCessaoRequisicaos(new HashSet<CessaoRequisicao>());
		}
		if(!isEditarCessaoRequisicao){
			getServidor().getCessaoRequisicaos().add(cessaoRequisicao);
		}
		cessaoRequisicao = new CessaoRequisicao();
		listarCessaoRequisicaos();
	}
	
	/**
	 * Metodo responsável por tratar e realizar a ação de Exclusão da entidade CessaoRequisicao.
	 * @author            Thiago Nunes Vieira
	 **/
	public void excluirCessaoRequisicao() {
		validarRegras();
		if(getServidor().getUnidadeAdmLotacao().getId()==null){
			getServidor().setUnidadeAdmLotacao(null);
		}
		cessaoRequisicaoManager.excluir(cessaoRequisicao);
		cessaoRequisicao = new CessaoRequisicao();
	}

	/**
	 * Metodo responsável por preparar a exclusão da entidade CessaoRequisicao.
	 * @author            Thiago Nunes Vieira
	 **/
	public void prepararExclusao(CessaoRequisicao cessaoRequisicao){
		this.cessaoRequisicao = cessaoRequisicao;
	}
	
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
	public void cancelarModal() {
		this.cessaoRequisicao = new CessaoRequisicao();
	}

	/**
	 * Metodo responsável por preparar a entidade CessaoRequisicao para inclusão.
	 * @author            Thiago Nunes Vieira
	 **/
	public void incluirCessaoRequisicao(){
		this.cessaoRequisicao = new CessaoRequisicao();
		isIncluirCessaoRequisicao = new Boolean(true);
		isEditarCessaoRequisicao = false;
		isVisualizarCessaoRequisicao = false;
		reRenderModal=true;
	}
	
	/**
	 * Metodo responsável por preparar a entidade CessaoRequisicao para edição.
	 * @author            Thiago Nunes Vieira
	 **/
	public void irEditarCessaoRequisicao(CessaoRequisicao cessaoRequisicao) {
		this.cessaoRequisicao = cessaoRequisicao;
		isIncluirCessaoRequisicao = false;
		isEditarCessaoRequisicao = true;
		isVisualizarCessaoRequisicao = false;
		reRenderModal=true;
	}

	/**
	 * Metodo responsável por preparar a entidade CessaoRequisicao para visualização.
	 * @author            Thiago Nunes Vieira
	 **/
	public void irVisualizarCessaoRequisicao(CessaoRequisicao cessaoRequisicao) {
		this.cessaoRequisicao = cessaoRequisicao;
		isIncluirCessaoRequisicao = false;
		isEditarCessaoRequisicao = false;
		isVisualizarCessaoRequisicao = true;
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
	 * Metodo responsável por listar as cessões e requisições
	 * @return			  List<CessaoRequisicao>
	 * @author            Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<CessaoRequisicao> listarCessaoRequisicaos() {
		if(getServidor().getId()!=null){
			listaCessaoRequisicao=cessaoRequisicaoManager.getEntityManager()
					.createQuery("select c from CessaoRequisicao c where c.servidor.id = :idSevidor ")
					.setParameter("idSevidor", getServidor().getId())
					.getResultList();
		}
		else{
			listaCessaoRequisicao= new ArrayList<CessaoRequisicao>();
		}
		return listaCessaoRequisicao;
	}
}