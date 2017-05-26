package br.gov.iphan.sisgep.manager;
import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.corp.CorRaca;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade CorRaca. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("corRacaManager")
@AutoCreate
public class CorRacaManager extends BaseManagerImpl<CorRaca> {
	
	/**
	 * Realiza a pesquisa de todos as Cores/Raças.
	 * @return 	Lista de todas Cores/Raças encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<CorRaca> listarTodos(){
		return (List<CorRaca>) listarTodos(CorRaca.class);
	}
}