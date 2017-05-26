package br.gov.iphan.sisgep.manager;
import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.ClasseFuncionario;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade ClasseFuncionario. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("classeFuncionarioManager")
@AutoCreate
public class ClasseFuncionarioManager extends BaseManagerImpl<ClasseFuncionario> {
	
	/**
	 * Realiza a pesquisa de todos os Classes de Funcionários.
	 * @return 	Lista de todas Classes de Funcionários encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<ClasseFuncionario> listarTodos(){
		return (List<ClasseFuncionario>) listarTodos(ClasseFuncionario.class);
	}
}