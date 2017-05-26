package br.gov.iphan.sisgep.manager;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.FimDependente;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade FimDependente. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("fimDependenteManager")
@AutoCreate
public class FimDependenteManager extends BaseManagerImpl<FimDependente>{
	
	/**
	 * Realiza a pesquisa de todos os Fins de Dependência.
	 * @return 	Lista de todoas os Fins de Dependência encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<FimDependente> listarTodos(){
		return (List<FimDependente>) listarTodos(FimDependente.class);
	}
	
}
