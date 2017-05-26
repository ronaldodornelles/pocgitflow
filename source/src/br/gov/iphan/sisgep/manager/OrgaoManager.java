package br.gov.iphan.sisgep.manager;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.Orgao;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade Orgao. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("orgaoManager")
@AutoCreate
public class OrgaoManager extends BaseManagerImpl<Orgao>{
	/**
	 * Realiza a pesquisa de todos os Órgãos.
	 * @return 	Lista de todas Órgãos encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<Orgao> listarTodos(){
		return (List<Orgao>) listarTodos(Orgao.class);
	}
	
}
