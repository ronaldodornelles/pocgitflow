package br.gov.iphan.sisgep.manager;
import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.corp.EstadoCivil;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade EstadoCivil. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("estadoCivilManager")
@AutoCreate
public class EstadoCivilManager extends BaseManagerImpl<EstadoCivil> {
	
	/**
	 * Realiza a pesquisa de todos os Estados Civis.
	 * @return 	Lista de todos Estados Civis encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<EstadoCivil> listarTodos(){
		return (List<EstadoCivil>) listarTodos(EstadoCivil.class);
	}
}