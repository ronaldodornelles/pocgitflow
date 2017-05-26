package br.gov.iphan.sisgep.manager;
import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.FormaIngressoAposentacao;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade FormaIngresso. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("formaIngressoManager")
@AutoCreate
public class FormaIngressoManager extends BaseManagerImpl<FormaIngressoAposentacao> {
	
	/**
	 * Realiza a pesquisa de todos os tipos de Forma de Ingresso.
	 * @return 	Lista de todos tipos de Forma de Ingresso encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<FormaIngressoAposentacao> listarTodos(){
		return (List<FormaIngressoAposentacao>) listarTodos(FormaIngressoAposentacao.class);
	}
}