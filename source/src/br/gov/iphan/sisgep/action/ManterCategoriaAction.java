package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.hibernate.exception.ConstraintViolationException;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.faces.Renderer;
import org.jboss.seam.security.Credentials;

import br.gov.iphan.sisgep.entity.Categoria;
import br.gov.iphan.sisgep.entity.Subcategoria;
import br.gov.iphan.sisgep.entity.TipoAvaliacao;
import br.gov.iphan.sisgep.manager.CategoriaManager;
import br.gov.iphan.sisgep.manager.SubfatorManager;
import br.gov.iphan.sisgep.manager.TipoAvaliacaoManager;
import br.gov.iphan.sisgep.util.Mensagens;
	   
@Name("manterCategoriaAction")
@Scope(ScopeType.CONVERSATION)
public class ManterCategoriaAction extends BaseAction {
	
	private static final long serialVersionUID = -7409735643659325694L;

	private Boolean isIncluindo;
	private Boolean isEditando;
	private Boolean isVisualizando;

	@In Credentials credentials;

	@In(required = false, create = true)
	private CategoriaManager categoriaManager;
	
	@In(required = false, create = true)
	private TipoAvaliacaoManager tipoAvaliacaoManager;

	@In(required = false, create = true)
	@Out(required = false)
	public Categoria categoria;

	@In(required = false, create = true)
	@Out(required = false)
	public List<Categoria> listCategoria;
	
	@In(value = "#{facesContext.externalContext}")
    private ExternalContext extCtx;

    @In(value = "#{facesContext}")
    private FacesContext facesContext;
    
	@In(create=true)
	private Renderer renderer;
	
	@In(required = false, create = true)
	@Out(required = false)
	public String palavraChave;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<Subcategoria> subcategorias;

	@End
	public String salvar(){
		if(categoria.getTitulo() != null){
				this.categoria.setSubcategorias(new ArrayList<Subcategoria>());
				for (Subcategoria subcategoria : subcategorias) {
					subcategoria.setCategoria(this.categoria);
				}
				this.categoria.setSubcategorias(this.subcategorias);
				categoriaManager.salvarCategoria(this.categoria);
				limparObjetos();
			}else{
				mensagemErro(Mensagens.MSGW012.retornaMensagem());
				return "ir_incluir";
			}
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		return "salvo_sucesso";
	}



	
	

	public void procurar() {
		if(this.categoria == null) {
			this.categoria = new Categoria();
		} 
		this.categoria.setTitulo(this.palavraChave);
		listCategoria = categoriaManager.consultarCategoria(this.categoria);
		if (listCategoria == null || listCategoria.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}
	
	public void incluirSubcategoria(){
		this.subcategorias.add(new Subcategoria());
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
		
		controllerHelper.setRedirect("?Page=Incluir_Categoria");
		
		return "ir_incluir";
	}
	
	public void cancelarExclusao() {
		categoria = new Categoria();
	}
	
	public String cancelar() {
		categoria = new Categoria();
		listCategoria = new ArrayList<Categoria>();
		return "cancelar";
	}

	public String irEditar(Categoria categoria) {
		limparObjetos();
		this.categoria = categoria;
		if(this.categoria.getSubcategorias() != null && this.categoria.getSubcategorias().size() >= 1) { 
			this.subcategorias = this.categoria.getSubcategorias();
		}
		this.isIncluindo = false;
		this.isVisualizando = false;
		this.isEditando= true;
		
		this.isIncluir = false;
		this.isEditar = true;
		this.isVisualizar = false;
		
		controllerHelper.setRedirect("?Page=Editar_Categoria");
		
		return "ir_editar";
	}

	public String irVisualizar(Categoria categoria) {
		this.categoria = categoria;
		if(this.categoria.getSubcategorias() != null && this.categoria.getSubcategorias().size() >= 1) { 
			this.subcategorias = this.categoria.getSubcategorias();
		}

		this.isIncluindo = false;
		this.isVisualizando = true;
		this.isEditando= false;
		
		this.isIncluir = false;
		this.isEditar = false;
		this.isVisualizar = true;
		
		controllerHelper.setRedirect("?Page=Visualizar_Categoria");
		
		return "ir_visualizar";
	}

	public void preparExclusao(Categoria categoria) {
		this.categoria = categoria;
	}

	private void limparObjetos() {
		subcategorias = new ArrayList<Subcategoria>();
		subcategorias.add(new Subcategoria());
		categoria = new Categoria();
		listCategoria= new ArrayList<Categoria>();
		isVisualizando = false;
		isIncluindo = false;
		isEditando = false;
		this.palavraChave = new String();
	}
	
	public boolean habilitarBotaoRemove(){
		int tam = subcategorias.size();
		if(tam > 1){
			return true;
		}else{
			return false;
		}
	} 
	
	@End
	public String excluir() {
		
		Boolean podeExcluir = true;
		
		for(Subcategoria sub : this.categoria.getSubcategorias()) {
			List<TipoAvaliacao> list = new ArrayList<TipoAvaliacao>();
			list = tipoAvaliacaoManager.consultarPorSubcategoria(sub);
			if(list.size() > 0){
				podeExcluir = false;
			}
		}
		
		if(!podeExcluir) {
			mensagemErro("Não é possível excluir o Categoria pois suas subcategorias estão associadas a Tipos de Avaliação");
		} else {
			try {
				categoriaManager.excluir(this.categoria);
				mensagemInfo(Mensagens.MSGI001.retornaMensagem());
			} catch (Exception e) {
				mensagemErro("Não é possível excluir o Categoria pois suas subcategorias estão associadas a Tipos de Avaliação");
			}
		}
		limparObjetos();
		//this.procurar();
		controllerHelper.setRedirect("?Page=salvo_sucesso_tipo");
		return "categoriaAvaliacao";	
		
	}	
	
	
	public void excluirSubcategoria(Subcategoria subcategoria){
		List<TipoAvaliacao> list = new ArrayList<TipoAvaliacao>();
		list = tipoAvaliacaoManager.consultarPorSubcategoria(subcategoria);
		if(list.size() > 0){
			mensagemWarn(Mensagens.MSGW016.retornaMensagem());
		}else{
			try {
				categoriaManager.excluirSubcategorias(subcategoria);
				this.subcategorias.remove(subcategoria);
			} catch (Exception e) {
				mensagemWarn(Mensagens.MSGW016.retornaMensagem());
			}
		}
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
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}

	public List<Subcategoria> getSubcategorias() {
		return subcategorias;
	}

	public void setSubcategorias(List<Subcategoria> subcategoria) {
		this.subcategorias = subcategoria;
	}
	
}