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

import br.gov.iphan.sisgep.entity.Escala;
import br.gov.iphan.sisgep.entity.FatorSubfator;
import br.gov.iphan.sisgep.entity.Sincronizacao;
import br.gov.iphan.sisgep.entity.Subfator;
import br.gov.iphan.sisgep.entity.corp.EstadoCivil;
import br.gov.iphan.sisgep.manager.SubfatorManager;
import br.gov.iphan.sisgep.util.Mensagens;
	   
@Name("manterSubfatorAction")
@Scope(ScopeType.CONVERSATION)
public class ManterSubfatorAction extends ManterFatorAction {
	
	private static final long serialVersionUID = -7409735643659325694L;

	private Boolean isIncluindo;
	private Boolean isEditando;
	private Boolean isVisualizando;
	
	private Boolean todosSelecionados = false;

	@In Credentials credentials;

	@In(required = false, create = true)
	private SubfatorManager subfatorManager;

	@In(required = false, create = true)
	@Out(required = false)
	public Subfator subFator;

	@In(required = false, create = true)
	@Out(required = false)
	private List<Subfator> listSubfator;
	


	@In(required = false, create = true)
	@Out(required = false)
	private Map<Subfator, Boolean> subfatoresSelecionados = new HashMap<Subfator, Boolean>(0);
	
	
	@In(value = "#{facesContext.externalContext}")
    private ExternalContext extCtx;

    @In(value = "#{facesContext}")
    private FacesContext facesContext;
    
	@In(create=true)
	private Renderer renderer;
	
	@In(required = false, create = true)
	@Out(required = false)
	private String palavraBusca;
	
	@In(required = false, create = true)
	@Out(required = false)
	public Float somaEscalas;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<Escala> escalas;

	@End
	public String salvarEInserirNovo(){
		if(!(this.subFator.getEscalaMaxima() > this.getSomaEscalas()) && !(this.subFator.getEscalaMaxima() < this.getSomaEscalas())){
				this.subFator.setEscalas(new ArrayList<Escala>());
				for (Escala escala : escalas) {
					escala.setSubfator(this.subFator);
				}
				this.subFator.setEscalas(this.escalas);
				subfatorManager.salvarSubfator(this.subFator);
				limparObjetos();
			}else{
				mensagemErro(Mensagens.MSGW012.retornaMensagem());
				return "ir_incluir";
			}
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		return "salvo_sucesso_inserir_novo";
	}
	
	@End
	public String salvarEVoltar(){ 
		if(!(this.subFator.getEscalaMaxima() > this.getSomaEscalas()) && !(this.subFator.getEscalaMaxima() < this.getSomaEscalas())){
				this.subFator.setEscalas(new ArrayList<Escala>());
				for (Escala escala : escalas) {
					escala.setSubfator(this.subFator);
				}
				this.subFator.setEscalas(this.escalas);
				subfatorManager.salvarSubfator(this.subFator);
				limparObjetos();
		}else{
			mensagemErro(Mensagens.MSGW012.retornaMensagem());
			return "ir_incluir";
		}
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		return "salvo_sucesso";	
	}
	
	@End
	public String editar(){ 
		if(!(this.subFator.getEscalaMaxima() > this.getSomaEscalas()) && !(this.subFator.getEscalaMaxima() < this.getSomaEscalas())){
				subfatorManager.excluirEscalas(this.subFator);
				this.subFator.setEscalas(new ArrayList<Escala>());
				for (Escala escala : escalas) {
					escala.setSubfator(this.subFator);
				}
				this.subFator.setEscalas(this.escalas);
				subfatorManager.editarSubfator(this.subFator);
				limparObjetos();
				listSubfator.clear();
				
		}else{
			mensagemErro(Mensagens.MSGW012.retornaMensagem());
			return "ir_incluir";
		}
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		return "salvo_sucesso";	
	}

	public String excluir() {
		subfatorManager.excluir(subFator);
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		limparObjetos();
		this.procurar();
		return null;
	}

	public void procurar() {
		if(this.subFator == null) {
			this.subFator = new Subfator();
		} 
		if(palavraChave != null || palavraChave != ""){
			this.subFator.setDescricao(this.palavraChave);
		}

		setListSubfator(subfatorManager.consultarSubfator(this.subFator));
		if (getListSubfator() == null || getListSubfator().isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
		
		this.subfatoresSelecionados = new HashMap<Subfator, Boolean>();
		
		for (Subfator subfator : this.listSubfator) {
			this.subfatoresSelecionados.put(subfator, false);
		}
		
		if(this.getFator().getFatorSubfatores() != null) {
			for (FatorSubfator fatorSubfator : this.getFator().getFatorSubfatores()) {
				for (Iterator<Subfator> iter = this.getListSubfator().iterator(); iter.hasNext();) {
					Subfator sub = iter.next();
					if(sub.getId() == fatorSubfator.getSubfator().getId()) {
						iter.remove();
					}
				}
			}
		}
	}
	
	public void incluirEscala(){
		this.escalas.add(new Escala());
	}
	
	public Integer getSomaEscalas(){
		Integer soma = 0;
		for (Escala escala : escalas) {
			if(escala.getPontos() != null && escala.getPontos() > 0){
			soma = soma + escala.getPontos();
			}
		}	
		return soma;
	}
	
	public String irTipo() {
		controllerHelper.setRedirect("?Page=Incluir_Subfator");
		return "ir_incluir";
	}
	
	public String irIncluir() {
		limparObjetos();
		
		this.isIncluindo = true;
		this.isVisualizando = false;
		this.isEditando= false;
		this.isVisualizando= false;
		
		this.isIncluir = true;
		this.isEditar = false;
		this.isVisualizar = false;
		
		controllerHelper.setRedirect("?Page=Incluir_Subfator");
		
		return "ir_incluir";
	}
	
	public void cancelarExclusao() {
		subFator = new Subfator();
	}
	
	public String cancelar() {
		subFator = new Subfator();
		setListSubfator(new ArrayList<Subfator>());
		return "cancelar";
	}

	public String irEditar(Subfator subFator) {
		limparObjetos();
		this.subFator = subFator;
		if(this.subFator.getEscalas() != null && this.subFator.getEscalas().size() >= 1) { 
			this.escalas = this.subFator.getEscalas();
		}
		this.isIncluindo = false;
		this.isVisualizando = false;
		this.isEditando= true;
		
		this.isIncluir = false;
		this.isEditar = true;
		this.isVisualizar = false;
		
		controllerHelper.setRedirect("?Page=Editar_Subfator");
		
		return "ir_editar";
	}

	public String irVisualizar(Subfator subFator) {
		this.subFator = subFator;
		if(this.subFator.getEscalas() != null && this.subFator.getEscalas().size() >= 1) { 
			this.escalas = this.subFator.getEscalas();
		}

		this.isIncluindo = false;
		this.isVisualizando = true;
		this.isEditando= false;
		
		this.isIncluir = false;
		this.isEditar = false;
		this.isVisualizar = true;
		
		controllerHelper.setRedirect("?Page=Visualizar_Subfator");
		
		return "ir_visualizar";
	}
	
	public String irIncluirr(){
		return "teste";
	}
	public void preparExclusao(Subfator subFator) {
		this.subFator = subFator;
	}

	private void limparObjetos() {
		escalas = new ArrayList<Escala>();
		escalas.add(new Escala());
		subFator = new Subfator();
		setListSubfator(new ArrayList<Subfator>());
		isVisualizando = false;
		isIncluindo = false;
		isEditando = false;
	}
	
	public void irSelecionar(){
		limparObjetos();
		this.setPalavraBusca(null);
		this.procurar();
	}
	
	public void selecionarTodos(){
		if(!this.todosSelecionados) {
			for (Map.Entry<Subfator, Boolean> entry : this.subfatoresSelecionados.entrySet())		{
				entry.setValue(true);
			}
			this.todosSelecionados = true;
		} else {
			for (Map.Entry<Subfator, Boolean> entry : this.subfatoresSelecionados.entrySet())		{
				entry.setValue(false);
			}
			this.todosSelecionados = false;
		}
	}
	
	public void salvarSelecionados() {
		if(this.getFator().getFatorSubfatores() == null) {
			this.getFator().setFatorSubfatores(new ArrayList<FatorSubfator>());
		}
		
        for (Subfator subfator : this.subfatoresSelecionados.keySet()) {           
            if(this.subfatoresSelecionados.get(subfator) == true){
            	FatorSubfator fatorSubfator = new FatorSubfator();
            	fatorSubfator.setFator(this.getFator());
            	fatorSubfator.setSubfator(subfator);
            	this.getFator().getFatorSubfatores().add(fatorSubfator);
            }
        }
	}
	
	
	
	
	public boolean habilitarBotaoRemove(){
		int tam = escalas.size();
		if(tam > 1){
			return true;
		}else{
			return false;
		}
	} 
	
	public boolean habilitarMensagem(boolean maiorIgual){
		Integer somaEscalas = this.getSomaEscalas();
		if(subFator.getEscalaMaxima() != null){
			Integer valorMaximo = subFator.getEscalaMaxima();
			if(maiorIgual) {
				if(somaEscalas >= valorMaximo){
					return true;
				}else{
					return false;
				}
			} else {		
				if(somaEscalas > valorMaximo){
					return true;
				}else{
					return false;
				}
			}
		}
		return false;
	} 
	public void excluirEscala(Escala escala){
		this.escalas.remove(escala);
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
	public Subfator getSubFator() {
		return subFator;
	}

	public void setSubFator(Subfator subFator) {
		this.subFator = subFator;
	}

	public List<Escala> getEscalas() {
		return escalas;
	}

	public void setEscalas(List<Escala> escalas) {
		this.escalas = escalas;
	}

	public void setSomaEscalas(Float somaEscalas) {
		this.somaEscalas = somaEscalas;
	}

	public Map<Subfator, Boolean> getSubfatoresSelecionados() {
		return subfatoresSelecionados;
	}

	public void setSubfatoresSelecionados(Map<Subfator, Boolean> subfatoresSelecionados) {
		this.subfatoresSelecionados = subfatoresSelecionados;
	}

	public Boolean getTodosSelecionados() {
		return todosSelecionados;
	}

	public void setTodosSelecionados(Boolean todosSelecionados) {
		this.todosSelecionados = todosSelecionados;
	}

	public List<Subfator> getListSubfator() {
		return listSubfator;
	}

	public void setListSubfator(List<Subfator> listSubfator) {
		this.listSubfator = listSubfator;
	}

	public String getPalavraBusca() {
		return palavraBusca;
	}

	public void setPalavraBusca(String palavraBusca) {
		this.palavraBusca = palavraBusca;
	}
	
}