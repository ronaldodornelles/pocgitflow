package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

import br.gov.iphan.sisgep.entity.Afastamento;
import br.gov.iphan.sisgep.entity.Servidor;
import br.gov.iphan.sisgep.manager.AfastamentoManager;
import br.gov.iphan.sisgep.util.Mensagens;

/**
 * Classe responsável por promover e tratar ações pertinentes a entidade
 * Afastamento e as entidade associadas a ela.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("manterAfastamentoAction")
@Scope(ScopeType.CONVERSATION)
public class ManterAfastamentoAction extends ManterServidorAction {
	private static final long serialVersionUID = -7409735643659325694L;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isIncluirAfastamento;
	
	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isEditarAfastamento;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isVisualizarAfastamento;
	
	@In(create = true, required = false)
	@Out(required = false)
	Long totalDias;
	
	@In(create = true, required = false)
	@Out(required = false)
	public Afastamento afastamento;
	
	private List<Afastamento> afastamentos;
	
	@In(required = false, create = true)
	AfastamentoManager afastamentoManager;

	@In(create = true, required = false)
	@Out(required = false)
	public Servidor servidor;
	
	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	/**
	 * Metodo responsável por tratar e realizar as ações de Inserção e Atualização da entidade Afastamento.
	 * @author            Thiago Nunes Vieira
	 **/
	public void salvarAfastamento() {
		if(!validarRegras()){
			return;
		}
		reRenderModal=false;
		super.setReRenderedModal(true);
		if(getServidor().getUnidadeAdmLotacao().getId()==null){
			getServidor().setUnidadeAdmLotacao(null);
		}
		afastamento.setServidor(getServidor());
		afastamentoManager.salvar(afastamento);
		if(getServidor().getAfastamentos()==null){
			getServidor().setAfastamentos(new ArrayList<Afastamento>());
		}
		getServidor().getAfastamentos().add(afastamento);
		getAfastamentos();
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
	}

	/**
	 * Metodo responsável por limpar os campos de Afastamento quando a modal for fechada.
	 * @author            Thiago Nunes Vieira
	 **/
	public void cancelarModal() {
		afastamento = new Afastamento();
	}

	/**
	 * Metodo responsável por preparar a entidade Afastamento para inclusão.
	 * @author            Thiago Nunes Vieira
	 **/
	public void incluirAfastamento(){
		totalDias=null;
		afastamento = new Afastamento();
		isIncluirAfastamento = true;
		isEditarAfastamento = false;
		isVisualizarAfastamento = false;
		reRenderModal=true;
	}
	
	/**
	 * Metodo responsável por tratar e realizar a ação de Exclusão da entidade afastamento.
	 * @author            Thiago Nunes Vieira
	 **/
	public void excluirAfastamento() {
		validarRegras();
		if(getServidor().getUnidadeAdmLotacao().getId()==null){
			getServidor().setUnidadeAdmLotacao(null);
		}
		afastamentoManager.excluir(afastamento);
		getAfastamentos();
		getServidor().getAfastamentos().remove(afastamento);
	}
	
	/**
	 * Metodo responsável por preparar a exclusão da entidade afastamento.
	 * @author            Thiago Nunes Vieira
	 **/
	public void prepararExclusao(Afastamento afastamento){
		this.afastamento = afastamento;
	}
	
	/**
	 * Metodo responsável por preparar a entidade Afastamento para edição.
	 * @author            Thiago Nunes Vieira
	 **/
	public void irEditarAfastamento(Afastamento afastamento) {
		totalDias=null;
		this.afastamento = afastamento;
		isIncluirAfastamento = false;
		isEditarAfastamento = true;
		isVisualizarAfastamento = false;
		calcularIntervaloDias();
		reRenderModal=true;
	}
	
	/**
	 * Metodo responsável por calcular o intervalo entre a data de início de afastamento e data fim de afastamento.
	 * @author            Thiago Nunes Vieira
	 **/
	public void calcularIntervaloDias(){
		if(afastamento.getDatInicioAfastmento()!=null &&
				afastamento.getDatFimAfastamento()!=null){
			Calendar dataInicio = Calendar.getInstance();
			Calendar dataFim = Calendar.getInstance();
			dataInicio.setTime(afastamento.getDatInicioAfastmento());
			dataFim.setTime(afastamento.getDatFimAfastamento());
			
			Long diferenca = dataFim.getTimeInMillis() -
							 dataInicio.getTimeInMillis();

			int tempoDia = 1000 * 60 * 60 * 24;
			totalDias = (diferenca / tempoDia)+1;
		}
	}

	/**
	 * Metodo responsável por preparar a entidade Afastamento para visualização.
	 * @author            Thiago Nunes Vieira
	 **/
	public void irVisualizarAfastamento(Afastamento afastamento) {
		totalDias=null;
		this.afastamento = afastamento;
		isIncluirAfastamento = false;
		isEditarAfastamento = false;
		isVisualizarAfastamento = true;
		calcularIntervaloDias();
	}

	/**
	 * Metodo responsavel por retorna lista de afastamento
	 * @author Thiago Nunes
	 * @return List<Afastamento>
	 */
	public List<Afastamento> getAfastamentos() {
		if(getServidor()!=null){
			if(getServidor().getId()!=null){
				afastamentos = new ArrayList<Afastamento>();
				afastamentos = afastamentoManager.findByServidor(getServidor());
				return afastamentos;
			}
			return new ArrayList<Afastamento>();
		}else{
			return new ArrayList<Afastamento>();
		}
	}

	public void setAfastamentos(List<Afastamento> afastamentos) {
		this.afastamentos = afastamentos;
	}
}
