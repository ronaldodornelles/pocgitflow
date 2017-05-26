package br.gov.iphan.sisgep.manager;
import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.FormaSaida;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade FormaSaida. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("formaSaidaManager")
@AutoCreate
public class FormaSaidaManager extends BaseManagerImpl<FormaSaida> {
	
	/**
	 * Realiza a pesquisa de todos os tipos de Formas de Saída.
	 * @return 	Lista de todos tipos de Formas de Saída encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<FormaSaida> listarTodos(){
		return (List<FormaSaida>) listarTodos(FormaSaida.class);
	}
}