package br.gov.iphan.sisgep.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Classe Utilitária para para validar campos vazios "com valor somente com espaçamento",
 * validação em nivel de visão
 * @author 	Thiago Nunes Vieira
 **/
public class CampoVazioValidator implements Validator {

	 /**
	  * Metodo responsável por recuperar o estado e o valor do componente e valuida-lo
	  * @param 		FacesContext context, UIComponent component, Object value
	  * @return 	Object
	  * @author 	Thiago Nunes Vieira
	  **/
	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value)
			throws ValidatorException {
		String imputText= (String) value;
		if(imputText.toString().trim().length() ==0){
			FacesMessage message = new FacesMessage("Campo vazio.", "Campo vazio.");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
		}

	}

}
