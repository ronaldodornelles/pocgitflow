package br.gov.iphan.sisgep.manager;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.Cbo;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade Cbo. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("cboManager")
@AutoCreate
public class CboManager extends BaseManagerImpl<Cbo>{
	
	/**
	 * Realiza a pesquisa de todos os Codigos Brasileiro de Ocupação.
	 * @return 	Lista de todo os Codigos Brasileiro de Ocupação.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<Cbo> listarTodos(){
		return (List<Cbo>) listarTodos(Cbo.class);
	}
	
}
