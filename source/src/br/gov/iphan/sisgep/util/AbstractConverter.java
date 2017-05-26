package br.gov.iphan.sisgep.util;

import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.apache.commons.lang3.StringUtils;
/**
 * Classe abstract Utilitária para converter um string vazia em um object de valor igual a null  
 * @author 	Thiago Nunes Vieira
 **/
public abstract class AbstractConverter implements Converter, Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final String noSelectionValue = "org.jboss.seam.ui.NoSelectionConverter.noSelectionValue";

    /**
     * Medoto responsável por tranforma um string vazia em um valor NULL
     * @param   FacesContext ctx, UIComponent ui, String valor
     * @return  Object 
     * @author 	Thiago Nunes Vieira
     **/
	public Object getAsObject(FacesContext ctx, UIComponent ui, String valor) {
		if (StringUtils.isEmpty(valor)) {
			return null;
		}
		
		if (valor != null && valor.equals(noSelectionValue)) {
		    return null;
		}
		
		return getAsObject(valor);
	}

	public abstract Object getAsObject(String valor);

    /**
     * Medoto responsável por tranforma um string vazia em um valor NULL
     * @param   FacesContext ctx, UIComponent ui, Object valor
     * @return  String 
     * @author 	Thiago Nunes Vieira
     **/
	public String getAsString(FacesContext ctx, UIComponent ui, Object valor) {
		return getAsString(valor);
	}

	public String getAsString(Object valor) {
		return valor.toString();
	}

}
