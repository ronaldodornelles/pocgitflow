package br.gov.iphan.sisgep.util;

import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.intercept.BypassInterceptors;

/**
 * Classe Utilitária para auxiliar na criação de Expression Linguage
 * @author 	Thiago Nunes Vieira
 **/
@Name("elActionRedirect")
@BypassInterceptors
public class ElActionRedirect {
	
	/**
	 * Metodo responsavel pela criação de uma expression linguage
	 * @param  String el
	 * @author 	Thiago Nunes Vieira
	 **/
	public void evaluateMethodBinding(String el) {
		
		FacesContext faces = FacesContext.getCurrentInstance();
		
		@SuppressWarnings("unused")
		ValueExpression ve = faces.getApplication()
		.getExpressionFactory()
		.createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + el + "}", Object.class);

	}
	
	/**
	 * Metodo responsavel pela criação de uma expression linguage e retorna-la em forma de string
	 * @param  	String el
	 * @return  String
	 * @author 	Thiago Nunes Vieira
	 **/
	public String evaluateMethodBindingString(String el) {

		
		 FacesContext context = FacesContext.getCurrentInstance();
	        Application app = context.getApplication();
	        ValueExpression expression = app.getExpressionFactory().createValueExpression(context.getELContext(),
	                String.format("#{%s}", el), Object.class);
	        
       
	        String retorno = expression.getValue(context.getELContext()).toString();

		return retorno;
        
	}
}
