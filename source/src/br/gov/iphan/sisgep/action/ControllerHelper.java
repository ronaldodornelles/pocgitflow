package br.gov.iphan.sisgep.action;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

/**
 * Classe responsável por controlar o redirecionamento do   menu do  manual de  ajuda
 * @author Thiago Nunes Vieira
 **/
@Name("controllerHelper")
@Scope(ScopeType.CONVERSATION)
public class ControllerHelper extends BaseAction {
	private static final long serialVersionUID = -7409735643659325694L;

	@In(create = true, required = false)
	@Out(required = false)
	public String endereco;
	
	private String redirect;
	
	/**
	 * Metodo construtor da classe controle,realiza a montagem do endereco
	 * @author Thiago Nunes Vieira
	 **/
	public String controle(){
		if(redirect!=null){
			endereco = link + redirect;
		}
		else{
			endereco = link; 
		}
		
		return endereco;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}
}