package br.gov.iphan.sisgep.util;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.faces.Converter;
import org.jboss.seam.annotations.intercept.BypassInterceptors;

/**
 * Classe Utilitária para converter um string vazia em um object de valor igual a null  
 * @author 	Thiago Nunes Vieira
 **/
@Converter
@Name("emptyStringToNullConverterSisgep")
@BypassInterceptors
public class EmptyStringToNullConverterSisgep extends AbstractConverter {

    private static final long serialVersionUID = 1L;

    /**
     * Medoto responsável por tranforma um string vazia em um valor NULL  
     * @author 	Thiago Nunes Vieira
     **/
    @Override
    public Object getAsObject(String valor) {
        return valor;
    }
}