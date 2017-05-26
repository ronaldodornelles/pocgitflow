package br.gov.iphan.sisgep.manager;
import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.ClasseFuncionario;
import br.gov.iphan.sisgep.entity.PadraoCargo;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade PadraoCargo. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("padraoCargoManager")
@AutoCreate
public class PadraoCargoManager extends BaseManagerImpl<PadraoCargo> {
	
	/**
	 * Realiza a pesquisa de todos os Padrões de Cargos.
	 * @return 	Lista de todos Padrões de Cargos encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<PadraoCargo> listarTodos(){
		return (List<PadraoCargo>) listarTodos(PadraoCargo.class);
	}

	/**
	 * Realiza a pesquisa de Padrões de Cargos.
	 * @param  classeFuncionario Classe de funcionarios
	 * @return 					Lista de todos Padrões de Cargos encontrados.
	 * @author 					Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<PadraoCargo> consultarPadraoCargo(ClasseFuncionario classeFuncionario){
			return getEntityManager()
					.createNamedQuery("padraoCargo.findByClasse")
					.setParameter("codClasse", classeFuncionario.getId())
					.getResultList();
	}
}