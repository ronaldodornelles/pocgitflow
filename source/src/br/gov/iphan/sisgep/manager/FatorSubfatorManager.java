package br.gov.iphan.sisgep.manager;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.Fator;
import br.gov.iphan.sisgep.entity.FatorSubfator;
import br.gov.iphan.sisgep.entity.Subfator;

@Name("fatorSubfatorManager")
@AutoCreate
@Transactional
public class FatorSubfatorManager extends BaseManagerImpl<FatorSubfator> {
	@SuppressWarnings("unchecked")
	public List<FatorSubfator> listarTodos(){
		return (List<FatorSubfator>) listarTodos(FatorSubfator.class);
	}
	
	public void salvarSubfator(FatorSubfator fatorSubfator) {
		try {
			
			if(fatorSubfator.getId() != null) {
				getEntityManager().merge(fatorSubfator);
				getEntityManager().flush();
			} else {
				getEntityManager().persist(fatorSubfator);
				getEntityManager().flush();
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
