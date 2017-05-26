package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.apache.commons.lang.StringUtils;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.faces.Renderer;
import org.jboss.seam.security.Credentials;

import br.gov.iphan.sisgep.entity.Avaliacao;
import br.gov.iphan.sisgep.entity.Categoria;
import br.gov.iphan.sisgep.entity.Escala;
import br.gov.iphan.sisgep.entity.Fator;
import br.gov.iphan.sisgep.entity.Sincronizacao;
import br.gov.iphan.sisgep.entity.Subcategoria;
import br.gov.iphan.sisgep.entity.Subfator;
import br.gov.iphan.sisgep.entity.TipoAvaliacao;
import br.gov.iphan.sisgep.manager.AvaliacaoManager;
import br.gov.iphan.sisgep.manager.CategoriaManager;
import br.gov.iphan.sisgep.manager.SubfatorManager;
import br.gov.iphan.sisgep.manager.TipoAvaliacaoManager;
import br.gov.iphan.sisgep.util.Mensagens;
	   
@Name("manterTipoAvaliacaoAction")
@Scope(ScopeType.CONVERSATION)
public class ManterTipoAvaliacaoAction extends BaseAction {
	
	private static final long serialVersionUID = 1L;

	private Boolean isIncluindo;
	private Boolean isEditando;
	private Boolean isVisualizando;

	@In Credentials credentials;
	
	
	@In(create=true)
	private Renderer renderer;

	@In(required = false, create = true)
	@Out(required = false)
	public TipoAvaliacao tipoAvaliacao;

	@In(required = false, create = true)
	@Out(required = false)
	private Categoria categoriaTipoBusca;
	
	@In(required = false, create = true)
	@Out(required = false)
	private Subcategoria subcategoriaBusca;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<TipoAvaliacao> listTipoAvaliacao;
	
	@In(required = false, create = true)
	@Out(required = false)
	private List<Categoria> listCategoria;
	
	
	@In(required = false, create = true)
	public TipoAvaliacaoManager tipoAvaliacaoManager;
	
	@In(required = false, create = true)
	public CategoriaManager categoriaManager;
	
	@In(required = false, create = true)
	public AvaliacaoManager avaliacaoManager;

	@In(required = false, create = true)
	@Out(required = false)
	public String palavraChave;

	public String irTipoAvaliacao(){
		return "tipoAvaliacao";
	}
	
	public String salvar(){ 
		if(this.tipoAvaliacao.getFatores() == null) {
			mensagemErro("Você deve inserir ao menos um Fator");
			return "ir_incluir";
		}
		
		if(!StringUtils.isBlank(this.tipoAvaliacao.getTitulo()) && this.tipoAvaliacao.getFatores().size() > 0){
			tipoAvaliacaoManager.salvarTipoAvaliacao(this.tipoAvaliacao);
		}else{
			mensagemErro("Você deve inserir ao menos um Fator");
			return "ir_incluir";
		}
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		controllerHelper.setRedirect("?Page=salvo_sucesso_tipo");
		return "tipoAvaliacao";	
	}
	
	public String cancelar() {
		this.tipoAvaliacao = new TipoAvaliacao();
		return "cancelar";
	}

	@End
	public String excluir() {
		
		List<Avaliacao> list = new ArrayList<Avaliacao>();
		list = avaliacaoManager.consultarPorTipo(this.tipoAvaliacao);
		if(list.size() > 0){
			mensagemErro("Não é possível excluir o Tipo de Avaliação pois está relacionado à uma avaliação");
		}else{
			try {
				tipoAvaliacaoManager.excluir(this.tipoAvaliacao);
				mensagemInfo(Mensagens.MSGI001.retornaMensagem());
			} catch (Exception e) {
				mensagemErro("Não é possível excluir o Tipo de Avaliação pois está relacionado à uma avaliação");
			}
		}

		limparObjetos();
		this.procurar();
		controllerHelper.setRedirect("?Page=salvo_sucesso_tipo");
		return "tipoAvaliacao";	
		
	}

	public void procurar() {
		
		this.tipoAvaliacao = new TipoAvaliacao();
		 
		this.tipoAvaliacao.setPalavraChave(this.palavraChave);
		if(this.subcategoriaBusca != null) {
			this.tipoAvaliacao.setSubcategoria(this.subcategoriaBusca);
		}
		
		if(this.categoriaTipoBusca != null) {
			if(this.tipoAvaliacao.getSubcategoria() == null) {
				this.tipoAvaliacao.setSubcategoria(new Subcategoria());
			}
			this.tipoAvaliacao.getSubcategoria().setCategoria(this.categoriaTipoBusca);
		}
		
		
		this.setListTipoAvaliacao(tipoAvaliacaoManager.consultarTipoAvaliacao(this.tipoAvaliacao));
		if (this.getListTipoAvaliacao() == null || this.getListTipoAvaliacao().isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}
	
public void procurarParaGerenciador() {
		
		this.tipoAvaliacao = new TipoAvaliacao();
		 
		this.tipoAvaliacao.setPalavraChave(this.palavraChave);
		if(this.subcategoriaBusca != null) {
			this.tipoAvaliacao.setSubcategoria(this.subcategoriaBusca);
		}
		
		if(this.categoriaTipoBusca != null) {
			if(this.tipoAvaliacao.getSubcategoria() == null) {
				this.tipoAvaliacao.setSubcategoria(new Subcategoria());
			}
			this.tipoAvaliacao.getSubcategoria().setCategoria(this.categoriaTipoBusca);
		}
		
		
		this.setListTipoAvaliacao(tipoAvaliacaoManager.consultarTipoAvaliacao(this.tipoAvaliacao));
		palavraChave = "";
		this.categoriaTipoBusca = new Categoria();
		this.subcategoriaBusca = new Subcategoria();
		if (this.getListTipoAvaliacao() == null || this.getListTipoAvaliacao().isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}
	
	public void incluirFator(){
		if(this.tipoAvaliacao.getFatores() == null) {
			this.tipoAvaliacao.setFatores(new ArrayList<Fator>());
		}
		this.tipoAvaliacao.getFatores().add(new Fator());
	}
	
	public void excluirFator(Fator fator) {
		this.tipoAvaliacao.getFatores().remove(fator);
	}
	

	public String irIncluir() {
		limparObjetos();
		this.setIsIncluindo(true);
		controllerHelper.setRedirect("?Page=Incluir_TipoAvaliacao");
		return "ir_incluir";
	}
	
	public void cancelarExclusao() {
		this.tipoAvaliacao = new TipoAvaliacao();
	}

	public String irEditar(TipoAvaliacao tipoAvaliacao) {
		limparObjetos();
		this.tipoAvaliacao = tipoAvaliacao;
		if(this.tipoAvaliacao.getSubcategoria() == null) {
			this.tipoAvaliacao.setSubcategoria(new Subcategoria());
		}
		if(this.tipoAvaliacao.getSubcategoria().getCategoria() == null) {
			this.tipoAvaliacao.getSubcategoria().setCategoria(new Categoria());
		}
		
		
		this.setIsEditando(true);
		controllerHelper.setRedirect("?Page=Editar_TipoAvaliacao");
		return "ir_editar";
	}

	public String irVisualizar(TipoAvaliacao tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
		this.setIsVisualizando(true);
		setIsIncluindo(false);
		setIsEditando(false);		
		controllerHelper.setRedirect("?Page=Visualizar_TipoAvaliacao");
		return "ir_visualizar";
	}
	
	public void preparExclusao(TipoAvaliacao tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
	}
	
	

	private void limparObjetos() {
		this.tipoAvaliacao = new TipoAvaliacao();
		Subcategoria subcategoria = new Subcategoria();
		Categoria categoria = new Categoria();
		subcategoria.setCategoria(categoria);
		this.tipoAvaliacao.setSubcategoria(subcategoria);

		setIsVisualizando(false);
		setIsIncluindo(false);
		setIsEditando(false);
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

	public TipoAvaliacao getTipoAvaliacao() {
		return tipoAvaliacao;
	}

	public void setTipoAvaliacao(TipoAvaliacao tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
	}


	public List<TipoAvaliacao> getListTipoAvaliacao() {
		return listTipoAvaliacao;
	}

	public void setListTipoAvaliacao(List<TipoAvaliacao> listTipoAvaliacao) {
		this.listTipoAvaliacao = listTipoAvaliacao;
	}

	public List<Categoria> getListCategoria() {
		this.listCategoria = this.categoriaManager.listarTodos();
		return listCategoria;
	}

	public void setListCategoria(List<Categoria> listCategoria) {
		this.listCategoria = listCategoria;
	}

	public Categoria getCategoriaTipoBusca() {
		return categoriaTipoBusca;
	}

	public void setCategoriaTipoBusca(Categoria categoriaTipoBusca) {
		this.categoriaTipoBusca = categoriaTipoBusca;
	}

	public Subcategoria getSubcategoriaBusca() {
		return subcategoriaBusca;
	}

	public void setSubcategoriaBusca(Subcategoria subcategoriaBusca) {
		this.subcategoriaBusca = subcategoriaBusca;
	}
	
}