package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

import br.gov.iphan.sisgep.entity.InstituicaoEnsino;
import br.gov.iphan.sisgep.manager.InstituicaoEnsinoManager;
import br.gov.iphan.sisgep.util.Mensagens;

/**
 * Classe responsável por promover e tratar ações pertinentes a entidade
 * InstituicaoEnsino e as entidade associadas a ela.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("manterInstituicaoEnsinoAction")
@Scope(ScopeType.CONVERSATION)
public class ManterInstituicaoEnsinoAction extends BaseAction {
	private static final long serialVersionUID = -7409735643659325694L;

	private Boolean isIncluindo;
	private Boolean isEditando;
	private Boolean isVisualizando;

	@In(required = false, create = true)
	private InstituicaoEnsinoManager instituicaoEnsinoManager;

	@In(required = false, create = true)
	@Out(required = false)
	private InstituicaoEnsino instituicaoEnsino;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<InstituicaoEnsino> listInstituicaoEnsino;
	
	/**
	 * Metodo responsável por tratar e realizar as ações de Inserção e Atualização da entidade Instituição de Ensino.
	 * @return 			  String contendo o indentificador do redirect que aplicação deve realizar.
	 * @author            Thiago Nunes Vieira
	 **/
	@End
	public String salvar() {
		instituicaoEnsinoManager.salvar(instituicaoEnsino);
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		instituicaoEnsino = new InstituicaoEnsino();
		return "salvo_sucesso";
	}

		
	/**
	 * Metodo responsável por tratar e realizar a ação de inserção na modal
	 * @return 			  void
	 * @author            Erick Xavier
	 **/
	public void salvarInstituicaoEnsino() {
		instituicaoEnsinoManager.salvar(instituicaoEnsino);
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		
	}

	
	/**
	 * Metodo responsável por tratar e realizar a ações de exclusão da entidade Instituição de Ensino.
	 * @author            Thiago Nunes Vieira
	 **/
	public void excluir() {
		if(instituicaoEnsino.getFormacaoAcademicas()!=null && 
				!instituicaoEnsino.getFormacaoAcademicas().isEmpty()){
			mensagemInfo(Mensagens.MSGW001.retornaMensagem());
			instituicaoEnsino = new InstituicaoEnsino();
		}
		else{
			listInstituicaoEnsino.remove(instituicaoEnsino);
			instituicaoEnsinoManager.excluir(instituicaoEnsino);
			mensagemInfo(Mensagens.MSGI001.retornaMensagem());
			instituicaoEnsino = new InstituicaoEnsino();
		}
	}

	/**
	 * Metodo responsável por promover e realizar a ações de pesquisa da entidade Instituição de Ensino.
	 * @author            Thiago Nunes Vieira
	 **/
	public void procurar() {
		listInstituicaoEnsino = instituicaoEnsinoManager.consultarInstituicaoEnsino(instituicaoEnsino);
		if (listInstituicaoEnsino == null || listInstituicaoEnsino.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}	
	
	/**
	 * Metodo responsável por preparar a entidade Instituição de Ensino para inclusão.
	 * @return 			  String contendo o indentificador do redirect para a interface de inclusão de Instituição de Ensino.
	 * @author            Thiago Nunes Vieira
	 **/
	public String irIncluir() {
		limparObjetos();
		this.isIncluindo = true;
		this.isVisualizando = false;
		this.isEditando= false;
		this.isVisualizando= false;
		
		this.isIncluir = true;
		this.isEditar = false;
		this.isVisualizar = false;
		controllerHelper.setRedirect("?Page=Incluir_Institui_ao_de_Ensino");
		return "ir_incluir";
	}
	
	/**
	 * Metodo responsável por cancelamento CSU de Instituição de Ensino
	 * @author            Thiago Nunes Vieira
	 **/
	public String cancelar() {
		instituicaoEnsino = new InstituicaoEnsino();
		listInstituicaoEnsino = new ArrayList<InstituicaoEnsino>();
		return "cancelar";
	}
	
	/**
	 * Metodo responsável por cancelamento a exclusão de Instituição de Ensino
	 * @author            Thiago Nunes Vieira
	 **/
	public void cancelarExclusao() {
		instituicaoEnsino = new InstituicaoEnsino();
	}
	
	/**
	 * Metodo responsável por preparar a entidade Instituição de Ensino para edição.
	 * @return 			  String contendo o indentificador do redirect para a interface de edição de Instituição de Ensino.
	 * @author            Thiago Nunes Vieira
	 **/
	public String irEditar(InstituicaoEnsino instituicaoEnsino) {
		limparObjetos();
		this.instituicaoEnsino = instituicaoEnsino;
		this.isIncluindo = false;
		this.isVisualizando = false;
		this.isEditando= true;
		
		this.isIncluir = false;
		this.isEditar = true;
		this.isVisualizar = false;
		controllerHelper.setRedirect("?Page=Editar_Institui_ao_de_Ensino");
		return "ir_editar";
	}

	/**
	 * Metodo responsável por preparar a entidade InstituicaoEnsino para visualização.
	 * @return 			  String contendo o indentificador do redirect para a interface de visualização de Instituição de Ensino.
	 * @author            Thiago Nunes Vieira
	 **/
	public String irVisualizar(InstituicaoEnsino instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;

		this.isIncluindo = false;
		this.isVisualizando = true;
		this.isEditando= false;
		
		this.isIncluir = false;
		this.isEditar = false;
		this.isVisualizar = true;
		controllerHelper.setRedirect("?Page=Visualizar_Institui_ao_de_Ensino");
		return "ir_visualizar";
	}

	/**
	 * Metodo responsável por preparar a entidade InstituicaoEnsino para exclusão.
	 * @author            Thiago Nunes Vieira
	 **/
	public void preparExclusao(InstituicaoEnsino instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}

	/**
	 * Metodo responsável por limpar os atributos dos objetos.
	 * @author            Thiago Nunes Vieira
	 **/
	private void limparObjetos() {
		instituicaoEnsino = new InstituicaoEnsino();
		listInstituicaoEnsino= new ArrayList<InstituicaoEnsino>();
		isVisualizando = false;
		isIncluindo = false;
		isEditando = false;
		
		this.isIncluir = false;
		this.isEditar = false;
		this.isVisualizar = false;
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
	
}