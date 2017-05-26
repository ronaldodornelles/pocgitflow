package br.gov.iphan.sisgep.manager;

import java.util.List;

import javax.ejb.Stateless;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.TipoCargoComissinado;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade TipoCargoComissionado. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("tipoCargoComissionadoManager")
@AutoCreate
public class TipoCargoComissionadoManager extends BaseManagerImpl<TipoCargoComissinado>{
	
	/**
	 * Realiza a pesquisa de todos as Tipos de Cargos Comissionados.
	 * @return 	Lista de todo os Tipos de Cargos Comissionados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<TipoCargoComissinado> listarTodos(){
		return (List<TipoCargoComissinado>) listarTodos(TipoCargoComissinado.class);
	}	
	
	/**
	 * Realiza a pesquisa de todos os TipoCargoComissinado filtrados pelo CodSiap.
	 * @return 	Lista de todo os codigos de Cargos Comissionados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<String> listarTodosCodSiage() {
		return getEntityManager().createNamedQuery("tipoCargoComissinado.listarTodosCodSiage").getResultList();
	}
	
	
	/**
	 * Realiza a pesquisa de todos os TipoCargoComissinado filtrados pelo CodSiap.
	 * @return 	Lista de todo os Tipos de Cargos Comissionados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<TipoCargoComissinado> findTipoCargoComissinado(String codSiap) {

		return getEntityManager()
					.createNamedQuery("tipoCargoComissinado.findTipoCargoComissinado")
					.setParameter("codSiapeCargoComissionado", codSiap)
					.getResultList();
	}
}
