package br.gov.iphan.sisgep.manager;

import java.util.List;

import javax.persistence.Query;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.AreaAtuacao;
import br.gov.iphan.sisgep.entity.CargoEfetivo;
import br.gov.iphan.sisgep.entity.CargoFuncionario;
import br.gov.iphan.sisgep.entity.GrupoFuncionario;
import br.gov.iphan.sisgep.entity.NivelCargoFuncionario;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para
 * entidade CargoFuncionario.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("cargoFuncionarioManager")
@AutoCreate
public class CargoFuncionarioManager extends BaseManagerImpl<CargoFuncionario> {

	/**
	 * Realiza a pesquisa de todos os Cargos de Funcionários.
	 * 
	 * @return Lista de todos Cargos de Funcionários encontrados.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<CargoFuncionario> listarTodos() {
		return (List<CargoFuncionario>) listarTodos(CargoFuncionario.class);
	}

	/**
	 * Realiza a pesquisa de Grupo de Funcionário.
	 * 
	 * @param grupoFuncionario
	 *            Cargo de funcionario com os parametros de consulta.
	 * @return Lista de todos Cargos de Funcionários.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<CargoFuncionario> consultarCargoFuncionario(GrupoFuncionario grupoFuncionario) {
		return getEntityManager().createNamedQuery("cargoFuncionario.findByGrupo").setParameter("codGrupo", grupoFuncionario.getId()).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public CargoFuncionario consultarCargoFuncionarioPeloGrupo(GrupoFuncionario grupoFuncionario) {
		String hql = "select o from CargoFuncionario o where o.grupoFuncionario.id = ? and o.txtDescricao = ?";
		Query query = getEntityManager().createQuery(hql.toString());
		query.setParameter(1, grupoFuncionario.getId());
		query.setParameter(2, "SEM CARGO");
		return (CargoFuncionario) query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	public List<CargoFuncionario> consultarCargoFuncionarioSiape(Long codSiapeCargo, Long codSiapeGrupoFunc) {
		String hql = "select o from CargoFuncionario o where o.codSiapeCargo = ? and o.grupoFuncionario.codSiapeGrupoFunc = ?";
		Query query = getEntityManager().createQuery(hql.toString());
		query.setParameter(1, codSiapeCargo);
		query.setParameter(2, codSiapeGrupoFunc);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<CargoEfetivo> consultarCargoEfetivoPelaAreaAtuacao(AreaAtuacao areaAtuacao) {
		String hql = "select o from CargoEfetivo o where o.areaAtuacao.id = ? ";
		Query query = getEntityManager().createQuery(hql.toString());
		query.setParameter(1, areaAtuacao.getId());
		return query.getResultList();
	}
}