package br.gov.iphan.sisgep.manager;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.Fator;
import br.gov.iphan.sisgep.entity.Subfator;

@Name("fatorManager")
@AutoCreate
@Transactional
public class FatorManager extends BaseManagerImpl<Fator> {
	@SuppressWarnings("unchecked")
	public List<Fator> listarTodos(){
		return (List<Fator>) listarTodos(Fator.class);
	}
	
	public void salvarSubfator(Fator fator) {
		try {
			
			if(fator.getId() != null) {
				getEntityManager().merge(fator);
				getEntityManager().flush();
			} else {
				getEntityManager().persist(fator);
				getEntityManager().flush();
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
