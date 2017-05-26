package br.gov.iphan.sisgep.manager;
import java.util.List;

import javax.persistence.Query;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.CargoFuncionario;
import br.gov.iphan.sisgep.entity.GrupoFuncionario;
import br.gov.iphan.sisgep.entity.NivelCargoFuncionario;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade GrupoFuncionario. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("grupoFuncionarioManager")
@AutoCreate
public class GrupoFuncionarioManager extends BaseManagerImpl<GrupoFuncionario> {
	
	/**
	 * Realiza a pesquisa de todos os Grupos de Funcionários.
	 * @return 	Lista de todos Grupos de Funcionários encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<GrupoFuncionario> listarTodos(){
		return (List<GrupoFuncionario>) listarTodos(GrupoFuncionario.class);
	}
	
	
	/**
	 * Realiza a pesquisa de Grupo de Funcionário.
	 * @param nivelCargoFuncionario	Nivel de Cargo funcionario com os parametros de consulta.
	 * @return 						Lista de todos Grupos de Funcionários.
	 * @author 						Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<GrupoFuncionario> consultarGrupoFuncionario(GrupoFuncionario grupoFuncionario){
		return getEntityManager()
					.createNamedQuery("grupoFuncionario.findByNivel")
					.setParameter("codNivel", grupoFuncionario.getNivelCargoFuncionario().getId())
					.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public GrupoFuncionario consultarGrupoFuncionarioPeloNivel(NivelCargoFuncionario nivelCargoFuncionario) {
		String hql = "select o from GrupoFuncionario o where o.nivelCargoFuncionario.id =  ? and o.txtDescricao = ?";
		Query query = getEntityManager().createQuery(hql.toString());
		query.setParameter(1, nivelCargoFuncionario.getId());
		query.setParameter(2, "SEM GRUPO");
		return (GrupoFuncionario) query.getSingleResult();
	}
}