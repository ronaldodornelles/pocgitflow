package br.gov.iphan.sisgep.util;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Classe Utilitária para para validar datas
 * @author 	Thiago Nunes Vieira
 **/
public class DateValidator implements Validator {

	 /**
	  * Metodo responsável por recuperar o estado e o valor do componente e valuida-lo
	  * @param 		FacesContext context, UIComponent component, Object value
	  * @return 	Object
	  * @author 	Thiago Nunes Vieira
	  **/
	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value)
			throws ValidatorException {
		Date imputDate= (Date) value;
		Calendar dateInicio = Calendar.getInstance();
		dateInicio.setTimeZone(TimeZone.getTimeZone("GMT-03:00"));
		dateInicio.set(1753, 0, 1, 0, 0, 0);
		
		if(imputDate.before(dateInicio.getTime())){
			FacesMessage message = new FacesMessage("Apenas datas entre 01/01/1753 e 31/12/9999 são aceitas.", "Apenas datas maiores que 01/01/1753 são aceitas.");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
		}

	}

}
