package br.gov.iphan.sisgep.manager;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.FormaPassagemServ;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade FormaPassagemServ. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("formaPassagemServManager")
@AutoCreate
public class FormaPassagemServManager extends BaseManagerImpl<FormaPassagemServ>{
	
	/**
	 * Realiza a pesquisa de todos os tipos de Formas de Passagens de Servidor.
	 * @return 	Lista de todos tipos de Formas de Passagens de Servidor.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<FormaPassagemServ> listarTodos(){
		return (List<FormaPassagemServ>) listarTodos(FormaPassagemServ.class);
	}
	
	/**
	 * Realiza a pesquisa de todos oa Formas de Passagem de Servidor.
	 * @param tipo	Tipo da Forma de passagem S/A/E
	 * @return 		Lista de todas formas de passegens encontradas de um tipo.
	 * @author 		Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<FormaPassagemServ> findByTipo(String tipo) {

		return getEntityManager()
					.createNamedQuery("formaPassagemServ.findByTipo")
					.setParameter("tipFormaPassServ", tipo)
					.getResultList();
	}
		
}
