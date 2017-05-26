package br.gov.iphan.sisgep.action;

import java.util.HashSet;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

import br.gov.iphan.sisgep.entity.FormacaoAcademica;
import br.gov.iphan.sisgep.entity.InstituicaoEnsino;
import br.gov.iphan.sisgep.entity.corp.Uf;
import br.gov.iphan.sisgep.manager.FormacaoAcademicaManager;
import br.gov.iphan.sisgep.manager.InstituicaoEnsinoManager;
import br.gov.iphan.sisgep.util.Mensagens;

/**
 * Classe responsável por promover e tratar ações pertinentes a entidade
 * Formacao Academica e as entidade associadas a ela.
 * 
 * @author Erick Xavier
 **/
@Name("manterFormacaoAcademicaAction")
@Scope(ScopeType.CONVERSATION)
public class ManterFormacaoAcademicaAction extends ManterServidorAction {
	private static final long serialVersionUID = -7409735643659325694L;

	public boolean cursando = false;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isIncluirFormacaoAcademica;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isEditarFormacaoAcademica;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isVisualizarFormacaoAcademica;

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

	/**
	 * Metodo que efetua a inserção de formação academica via modal
	 * 
	 * @return void
	 * @author Erick Xavier
	 */
	public void salvarFormacaoAcademica() {
		if (!validarRegras()) {
			return;
		}
		reRenderModal = false;
		if (getServidor().getUnidadeAdmLotacao().getId() == null) {
			getServidor().setUnidadeAdmLotacao(null);
		}
		this.formacaoAcademica.setServidor(getServidor());
		formacaoAcademicaManager.salvar(this.formacaoAcademica);
		
		if (getServidor().getFormacaoAcademicas() == null) {
			getServidor().setFormacaoAcademicas(new HashSet<FormacaoAcademica>());
		}
		if (!isEditarFormacaoAcademica) {
			getServidor().getFormacaoAcademicas().add(formacaoAcademica);
		}
		formacaoAcademica = new FormacaoAcademica();
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
			this.formacaoAcademica.setInstituicaoEnsino(this.instituicaoEnsino);
			instituicaoEnsinoManager.salvar(this.instituicaoEnsino);
			mensagemInfo(Mensagens.MSGW018.retornaMensagem());
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
		if (getServidor().getUnidadeAdmLotacao().getId() == null) {
			getServidor().setUnidadeAdmLotacao(null);
		}
		if (getServidor() != null) {
			if (getServidor().getFormacaoAcademicas() != null) {
				getServidor().getFormacaoAcademicas().remove(formacaoAcademica);
			}
		}
		if (this.formacaoAcademica != null) {
			formacaoAcademicaManager.excluirFormacaoAcademica(this.formacaoAcademica);
		}
	}

	/**
	 * Metodo responsável por preparar a exclusão da entidade dependente.
	 * 
	 * @author Erick Xavier
	 **/
	public void prepararExclusaoFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	/**
	 * Metodo responsável por cancelar e fecha a inclusao de dependente
	 * 
	 * @author Erick Xavier
	 **/
	public void voltarModal() {
		formacaoAcademica = new FormacaoAcademica();
	}

	/**
	 * Metodo responsável por cancelar e fecha a inclusao de dependente
	 * 
	 * @author Erick Xavier
	 **/
	public void cancelarModal() {
		formacaoAcademica = new FormacaoAcademica();
	}

	/**
	 * Metodo responsável por preparar a inclusão da entidade dependente.
	 * 
	 * @author Erick Xavier
	 **/
	public void irIncluirFormacaoAcademica() {
		formacaoAcademica = new FormacaoAcademica();
		combosAuxiliarAction.setUfFormacaoAcademica(new Uf());
		isIncluirFormacaoAcademica = true;
		isEditarFormacaoAcademica = false;
		isVisualizarFormacaoAcademica = false;
		reRenderModal = true;
	}

	/**
	 * Metodo responsável por preparar a inclusão da entidade InstituicaoEnsino.
	 * 
	 * @author Erick Xavier
	 **/
	public void irIncluirIntituicaoEnsino() {
		this.instituicaoEnsino = new InstituicaoEnsino();

	}

	/**
	 * Metodo responsável por preparar a edição da entidade dependente.
	 * 
	 * @author Erick Xavier
	 **/
	public void irEditarFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
		if (this.formacaoAcademica != null && this.formacaoAcademica.getCodMunicipio() != null)
			combosAuxiliarAction.setUfFormacaoAcademica(this.formacaoAcademica.getCodMunicipio().getCodUf());
		verificarStatusCurso();
		isIncluirFormacaoAcademica = false;
		isEditarFormacaoAcademica = true;
		isVisualizarFormacaoAcademica = false;
		reRenderModal = true;
	}

	/**
	 * Metodo responsável por preparar a visualização da entidade dependente.
	 * 
	 * @author Erick Xavier
	 **/
	public void irVisualizarFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
		combosAuxiliarAction.setUfFormacaoAcademica(this.formacaoAcademica.getCodMunicipio().getCodUf());
		isIncluirFormacaoAcademica = false;
		isEditarFormacaoAcademica = false;
		isVisualizarFormacaoAcademica = true;
	}

	/**
	 * Metodo responsável por desabilitar os campos Data de Conclusão o
	 * dependente estiver cursando o curso.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void verificarStatusCurso() {
		if (formacaoAcademica != null) {
			if (formacaoAcademica.getIndCursando() != null && formacaoAcademica.getIndCursando().equals(0L)) {
				cursando = true;
			} else {
				cursando = false;
				formacaoAcademica.setDatConclusaoCurso(null);
			}
		}
	}

	public boolean isCursando() {
		return cursando;
	}

	public void setCursando(boolean cursando) {
		this.cursando = cursando;
	}

	public FormacaoAcademica getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public InstituicaoEnsino getInstituicaoEnsino() {
		return instituicaoEnsino;
	}

	public void setInstituicaoEnsino(InstituicaoEnsino instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}

}
