package br.gov.iphan.sisgep.manager;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.Escala;
import br.gov.iphan.sisgep.entity.Servidor;
import br.gov.iphan.sisgep.entity.Subfator;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade Servidor. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("escalaManager")
@AutoCreate
@Transactional
public class EscalaManager extends BaseManagerImpl<Servidor> {
	

	@SuppressWarnings("unchecked")
	public List<Escala> listarTodos(){
		return (List<Escala>) listarTodos(Escala.class);
	}
	
	public void salvarEscala(Escala escala) {
		try {
			
			if(escala.getId() != null) {
				getEntityManager().merge(escala);
				getEntityManager().flush();
			} else {
				getEntityManager().persist(escala);
				getEntityManager().flush();
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
		
}