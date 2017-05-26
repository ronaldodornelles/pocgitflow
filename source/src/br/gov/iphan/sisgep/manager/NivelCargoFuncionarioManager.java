package br.gov.iphan.sisgep.manager;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.NivelCargoFuncionario;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para
 * entidade NivelCargoFuncionario.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("nivelCargoFuncionarioManager")
@AutoCreate
public class NivelCargoFuncionarioManager extends BaseManagerImpl<NivelCargoFuncionario> {

	/**
	 * Realiza a pesquisa de todos os Niveis de Cargos de Funcionários.
	 * 
	 * @return Lista de todos Niveis de Cargos de Funcionários encontrados.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<NivelCargoFuncionario> listarTodos() {
		return (List<NivelCargoFuncionario>) listarTodos(NivelCargoFuncionario.class);
	}

	@SuppressWarnings("unchecked")
	public NivelCargoFuncionario buscarNivelPorNome(String txtDescricao) {
		NivelCargoFuncionario retorno = null;

		String hql = "SELECT o from NivelCargoFuncionario o where o.txtDescricao like ?";
		List<NivelCargoFuncionario> niveis = getEntityManager().createQuery(hql).setParameter(1, txtDescricao).getResultList();
		
		if (niveis != null && niveis.size() > 0) {
			retorno = niveis.get(0);
		}
		
		return retorno;
	}

}