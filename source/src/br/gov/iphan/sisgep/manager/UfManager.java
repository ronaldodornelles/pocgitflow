package br.gov.iphan.sisgep.manager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.corp.Uf;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para
 * entidade Uf.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("ufManager")
@AutoCreate
public class UfManager extends BaseManagerImpl<Uf> {

	/**
	 * Realiza a pesquisa de todos os Estados/Unidades Federação.
	 * 
	 * @return Lista de todos Estados/Unidades Federação encontrados.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<Uf> listarTodos() {
		return (List<Uf>) listarTodos(Uf.class);
	}

	public List<Uf> consultarUf(Uf uf) {
		List<String> query = new ArrayList<String>();

		query.add(" lower( desSigla )  like lower( concat('%',#{uf.desSigla},'%') ) ");

		return obtemLista(Uf.class, query);
	}

	public Uf consultarUfPorSigla(String desSigla) {
		String hql = " select o from Uf o where lower( desSigla ) like lower( ? ) ";

		Query query = getEntityManager().createQuery(hql.toString());
		query.setParameter(1, desSigla);

		return (Uf) query.getSingleResult();
	}
}
