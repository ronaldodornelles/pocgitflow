package br.gov.iphan.sisgep.manager;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.CondicaoDependente;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade CondicaoDependente. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("condicaoDependenteManager")
@AutoCreate
public class CondicaoDependenteManager extends BaseManagerImpl<CondicaoDependente>{
	
	/**
	 * Realiza a pesquisa de todos as Condições de Dependência
	 * @return 	Lista de todoas Condições de Dependência encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<CondicaoDependente> listarTodos(){
		return (List<CondicaoDependente>) listarTodos(CondicaoDependente.class);
	}
}
