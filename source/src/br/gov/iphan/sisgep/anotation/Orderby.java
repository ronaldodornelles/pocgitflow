package br.gov.iphan.sisgep.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation resposável criar mecanismo de ordenação paras todos 
 * os POJO's da Aplicação.
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Orderby {

	String ordenacao();
	
	
}
