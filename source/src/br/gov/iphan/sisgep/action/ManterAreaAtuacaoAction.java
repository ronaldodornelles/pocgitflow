package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

import br.gov.iphan.sisgep.entity.AreaAtuacao;
import br.gov.iphan.sisgep.entity.CargoEfetivo;
import br.gov.iphan.sisgep.entity.TipoAvaliacao;
import br.gov.iphan.sisgep.manager.AreaAtuacaoManager;
import br.gov.iphan.sisgep.manager.CargoFuncionarioManager;
import br.gov.iphan.sisgep.util.Mensagens;

/**
 * Classe responsável por promover e tratar ações pertinentes a entidade
 * AreaAtuacao e as entidade associadas a ela.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("manterAreaAtuacaoAction")
@Scope(ScopeType.CONVERSATION)
public class ManterAreaAtuacaoAction extends BaseAction {
	private static final long serialVersionUID = -7409735643659325694L;

	private Boolean isIncluindo;
	private Boolean isEditando;
	private Boolean isVisualizando;

	@In(required = false, create = true)
	private AreaAtuacaoManager areaAtuacaoManager;
	
	@In(required = false, create = true)
	@Out(required = false)
	private CargoFuncionarioManager cargoFuncionarioManager;

	@In(required = false, create = true)
	@Out(required = false)
	private AreaAtuacao areaAtuacao;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<AreaAtuacao> listAreaAtuacao;
	
	/**
	 * Metodo responsável por tratar e realizar as ações de Inserção e Atualização da entidade Area Atuação.
	 * @return 			  String contendo o indentificador do redirect que aplicação deve realizar.
	 * @author            Thiago Nunes Vieira
	 **/
	@End
	public String salvar(){ 
		if(areaAtuacao.getId()==null){
			if(areaAtuacaoManager.verificarDuplicidade(areaAtuacao).size()>=1){
				mensagemWarn(Mensagens.MSGW002.retornaMensagem(areaAtuacao.getNomAreaAtuacao()));
				return "";
			}
		}
		else{
			if(areaAtuacaoManager.verificarDuplicidade(areaAtuacao).size()>1){
				mensagemWarn(Mensagens.MSGW002.retornaMensagem(areaAtuacao.getNomAreaAtuacao()));
				return "";
			}
		}
		areaAtuacaoManager.salvar(areaAtuacao);
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		limparObjetos();
		return "salvo_sucesso";
	}

	/**
	 * Metodo responsável por tratar e realizar a ações de exclusão da entidade Area Atuação.
	 * @author            Thiago Nunes Vieira
	 **/
	
	public void excluir() {
		List<CargoEfetivo> list = new ArrayList<CargoEfetivo>();
		list = cargoFuncionarioManager.consultarCargoEfetivoPelaAreaAtuacao(this.areaAtuacao);
		if(list.size() > 0){
			mensagemWarn(Mensagens.MSGW019.retornaMensagem());
		}else{
			try{
				areaAtuacaoManager.excluir(areaAtuacao);
				mensagemInfo(Mensagens.MSGI001.retornaMensagem());
				limparObjetos();
			} catch (Exception e) {
				mensagemWarn(Mensagens.MSGW019.retornaMensagem());
			}
		}
	}

	/**
	 * Metodo responsável por promover e realizar a ações de pesquisa da entidade Area Atuação.
	 * @author            Thiago Nunes Vieira
	 **/
	public void procurar() {
		listAreaAtuacao = areaAtuacaoManager.consultarAreaAtuacao(areaAtuacao);
		if (listAreaAtuacao == null || listAreaAtuacao.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}	
	
	/**
	 * Metodo responsável por preparar a entidade Area Atuação para inclusão.
	 * @return 			  String contendo o indentificador do redirect para a interface de inclusão de Area Atuação.
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
		
		controllerHelper.setRedirect("?Page=Incluir_Area_de_Atua_ao");
		
		return "ir_incluir";
	}
	
	/**
	 * Metodo responsável por cancelar a exclusao
	 * @author            Thiago Nunes Vieira
	 **/
	public void cancelarExclusao() {
		areaAtuacao = new AreaAtuacao();
	}
	
	/**
	 * Metodo responsável por cancelar o caso de uso.
	 * @return			  String contendo o indentificador do redirect para a interface de consulta de Area Atuação.
	 * @author            Thiago Nunes Vieira
	 **/
	public String cancelar() {
		areaAtuacao = new AreaAtuacao();
		listAreaAtuacao = new ArrayList<AreaAtuacao>();
		return "cancelar";
	}

	/**
	 * Metodo responsável por preparar a entidade Area Atuação para edição.
	 * @return 			  String contendo o indentificador do redirect para a interface de edição de Area Atuação.
	 * @author            Thiago Nunes Vieira
	 **/
	public String irEditar(AreaAtuacao areaAtuacao) {
		limparObjetos();
		this.areaAtuacao = areaAtuacao;
		this.isIncluindo = false;
		this.isVisualizando = false;
		this.isEditando= true;
		
		this.isIncluir = false;
		this.isEditar = true;
		this.isVisualizar = false;
		
		controllerHelper.setRedirect("?Page=Editar_Area_de_Atua_ao");
		
		return "ir_editar";
	}

	/**
	 * Metodo responsável por preparar a entidade AreaAtuacao para visualização.
	 * @return 			  String contendo o indentificador do redirect para a interface de visualização de Area Atuação.
	 * @author            Thiago Nunes Vieira
	 **/
	public String irVisualizar(AreaAtuacao areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
		this.isIncluindo = false;
		this.isVisualizando = true;
		this.isEditando= false;
		
		this.isIncluir = false;
		this.isEditar = false;
		this.isVisualizar = true;
		
		controllerHelper.setRedirect("?Page=Visualizar_Area_de_Atua_ao");
		
		return "ir_visualizar";
	}

	/**
	 * Metodo responsável por preparar a entidade AreaAtuacao para exclusão.
	 * @return 			  String contendo o indentificador do redirect para a interface de exclusão de Area Atuação.
	 * @author            Thiago Nunes Vieira
	 **/
	public void preparExclusao(AreaAtuacao areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	/**
	 * Metodo responsável por limpar os atributos dos objetos.
	 * @author            Thiago Nunes Vieira
	 **/
	private void limparObjetos() {
		areaAtuacao = new AreaAtuacao();
		listAreaAtuacao= new ArrayList<AreaAtuacao>();
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
	
}