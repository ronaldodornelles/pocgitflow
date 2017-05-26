package br.gov.iphan.sisgep.manager;
import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.RegistroAfastamento;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade RegistroAfastamento. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("registroAfastamentoManager")
@AutoCreate
public class RegistroAfastamentoManager extends BaseManagerImpl<RegistroAfastamento> {
	
	/**
	 * Realiza a pesquisa de todos os Registros de Afastamento.
	 * @return 	Lista de todos Registros de Afastamento encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<RegistroAfastamento> listarTodos(){
		return (List<RegistroAfastamento>) listarTodos(RegistroAfastamento.class);
	}
}