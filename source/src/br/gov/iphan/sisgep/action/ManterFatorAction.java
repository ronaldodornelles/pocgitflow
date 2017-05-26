package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import br.gov.iphan.sisgep.entity.Fator;
import br.gov.iphan.sisgep.entity.FatorSubfator;
import br.gov.iphan.sisgep.entity.TipoAvaliacao;
import br.gov.iphan.sisgep.manager.FatorManager;
import br.gov.iphan.sisgep.util.Mensagens;

/**
 * Classe responsável por promover e tratar ações pertinentes a entidade Servidor e as entidade
 * associadas a ela. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("manterFatorAction")
@Scope(ScopeType.CONVERSATION)
public class ManterFatorAction extends ManterTipoAvaliacaoAction {
	
	private static final long serialVersionUID = -7409735643659325694L;
	
	public ManterFatorAction (){
		super();
	}
	
	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isIncluirFator;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isEditarFator;
	
	@In(create = true, required = false)
	@Out(required = false)
	private Boolean isVisualizarFator;
	

	@In(required = false, create = true)
	@Out(required = false)
	private Fator fator;
	
	@In(required = false, create = true)
	private FatorManager fatorManager;
	
	public void irIncluirFator(TipoAvaliacao tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
		limparObjetosFator();
		this.setIsIncluirFator(true);
	}
	
	public void irEditarFator(Fator fator) {
		this.setIsIncluirFator(false);
		this.setIsEditarFator(false);
		this.setIsVisualizarFator(false);
		this.setFator(fator);
		this.setIsEditarFator(true);
	}
	
	public void irVisualizarFator(Fator fator) {
		this.setIsIncluirFator(false);
		this.setIsEditarFator(false);
		this.setIsVisualizarFator(false);
		this.setFator(fator);
		this.setIsVisualizarFator(true);
	}
	
	public void prepararExclusao(Fator fator) {
		this.fator = fator;
	}
	
	public void limparObjetosFator() {
		this.fator = null;
		this.fator = new Fator();
		this.setIsIncluirFator(false);
		this.setIsEditarFator(false);
		this.setIsVisualizarFator(false);
	}

	public boolean adicionarFator(TipoAvaliacao tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
		
		if(this.getFator().getFatorSubfatores() == null) {
			mensagemErro("Selecione ao menos um Subfator");
			return false;
		} else if(this.getFator().getFatorSubfatores().size() < 1) {
			mensagemErro("Selecione ao menos um Subfator");
			return false;
		}
		
		if(this.getFator().getId() == null) {
			if(this.getTipoAvaliacao() != null) {
				if(this.getTipoAvaliacao().getFatores() == null) {
					this.getTipoAvaliacao().setFatores(new ArrayList<Fator>());
				}
				this.getFator().setTipoAvaliacao(this.getTipoAvaliacao());
				this.getTipoAvaliacao().getFatores().add(this.getFator());
			}
		}
		mensagemInfo("Fator adicionado com sucesso");
		return true;
	}
	
	public String excluir() {
		this.getTipoAvaliacao().getFatores().remove(this.fator);
		//this.tipoAvaliacaoManager.salvar(getTipoAvaliacao());
		//this.fatorManager.excluir(this.fator);
		
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		this.setFator(new Fator());
		return null;
	}

	public void  excluirFatorSubfator(FatorSubfator fatorSubfator) {
		if(this.fator.getFatorSubfatores() != null) {
			this.fator.getFatorSubfatores().remove(fatorSubfator);
		}
	}
	
	public void cancelarExclusao(){
		this.fator = new Fator();
	}

	public Fator getFator() {
		return fator;
	}

	public void setFator(Fator fator) {
		this.fator = fator;
	}

	public Boolean getIsIncluirFator() {
		return isIncluirFator;
	}

	public void setIsIncluirFator(Boolean isIncluirFator) {
		this.isIncluirFator = isIncluirFator;
	}

	public Boolean getIsEditarFator() {
		return isEditarFator;
	}

	public void setIsEditarFator(Boolean isEditarFator) {
		this.isEditarFator = isEditarFator;
	}

	public Boolean getIsVisualizarFator() {
		return isVisualizarFator;
	}

	public void setIsVisualizarFator(Boolean isVisualizarFator) {
		this.isVisualizarFator = isVisualizarFator;
	}


	
}