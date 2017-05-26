package br.gov.iphan.sisgep.manager;
import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.corp.GrupoSanguineo;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade GrupoSanguineo. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("grupoSanguineoManager")
@AutoCreate
public class GrupoSanguineoManager extends BaseManagerImpl<GrupoSanguineo> {
	
	/**
	 * Realiza a pesquisa de todos os Grupos Sanguineos.
	 * @return 	Lista de todos Grupos Sanguineos encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<GrupoSanguineo> listarTodos(){
		return (List<GrupoSanguineo>) listarTodos(GrupoSanguineo.class);
	}
}