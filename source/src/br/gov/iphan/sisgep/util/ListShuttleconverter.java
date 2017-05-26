package br.gov.iphan.sisgep.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

import br.gov.iphan.sisgep.entity.FimDependente;

/**
 * Classe Utilitária para converter os valores para o componente <listShuttle>
 * @author 	Thiago Nunes Vieira
 **/
@Name("listShuttleconverter")
@Scope(ScopeType.APPLICATION)
public class ListShuttleconverter implements Converter {
	
	 private EntityManager entityManager;
	 EntityManagerFactory emf;
	
	 /**
	  * Metodo responsável por recuperar o estado e o valor do componente e tranforma-lo em um valor valido um
	  * objecto do tipo FimDependente
	  * @param 		FacesContext context, UIComponent component, String value
	  * @return 	Object
	  * @author 	Thiago Nunes Vieira
	  **/
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		emf = Persistence.createEntityManagerFactory("sisgep");
		entityManager = emf.createEntityManager();
		if (value == null || (value.trim().length() == 0)) {  
            return null;  
        }  
        String [] str = value.split(":");
        FimDependente fimDependente = entityManager.find(FimDependente.class, new Long(str[0]));
        emf.close();
        entityManager.close();
        return fimDependente;
	}

	 /**
	  * Metodo responsável por transforma um objecto do tipo FimDependente para um string
	  * @param 		FacesContext context, UIComponent component, Object value
	  * @return 	String
	  * @author 	Thiago Nunes Vieira
	  **/
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null) {  
            return null;  
        }  
  
         if(value instanceof FimDependente){  
    	 FimDependente fimDependente = (FimDependente) value;  
            return fimDependente.getId()+":"+fimDependente.getDesFimDependente();          
         }else{  
             throw new IllegalArgumentException(  
                     "Objeto: " + value + "do tipo: " + value.getClass().getName());  
         } 
	}

}
