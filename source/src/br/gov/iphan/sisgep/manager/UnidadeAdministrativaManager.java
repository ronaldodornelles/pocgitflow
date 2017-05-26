package br.gov.iphan.sisgep.manager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.apache.commons.lang.StringUtils;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.Servidor;
import br.gov.iphan.sisgep.entity.corp.Uf;
import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para
 * Unidade Administrativa.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("unidadeAdministrativaManager")
@AutoCreate
public class UnidadeAdministrativaManager extends BaseManagerImpl<UnidadeAdministrativa> {

	/**
	 * Realiza a pesquisa de todos as Unidades Administrativas.
	 * 
	 * @return Lista de todas Unidades Administrativas encontrados.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<UnidadeAdministrativa> listarTodos() {
		return (List<UnidadeAdministrativa>) listarTodos(UnidadeAdministrativa.class);
	}

	/**
	 * Realiza a pesquisa de Unidades Administrativas.
	 * 
	 * @param unidadeAdministrativa
	 *            Unidade Administrativa com os parametros de consulta.
	 * @return Lista de todas Unidades Administrativas encontrados.
	 * @author Thiago Nunes Vieira
	 */
	public List<UnidadeAdministrativa> consultarUnidadeAdministrativa(UnidadeAdministrativa unidadeAdministrativa) {
		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select o ");
		hql.append(" from UnidadeAdministrativa o where 0=0 ");

		if (unidadeAdministrativa != null) {
			if (!StringUtils.isBlank(unidadeAdministrativa.getSiglaUnidade())) {
				hql.append("and lower( siglaUnidade )  like lower( concat('%',?,'%') ) ");
				params.add(unidadeAdministrativa.getSiglaUnidade());
			}
			if (!StringUtils.isBlank(unidadeAdministrativa.getNomUnidadeAdministrativa())) {
				hql.append("and lower( o.nomUnidadeAdministrativa )  like lower( concat('%',?,'%') ) ");
				params.add(unidadeAdministrativa.getNomUnidadeAdministrativa());
			}
			if (unidadeAdministrativa.getUnidadeAdministrativa() != null
					&& !StringUtils.isBlank(unidadeAdministrativa.getUnidadeAdministrativa().getNomUnidadeAdministrativa())) {
				hql.append("and lower( unidadeAdministrativa.nomUnidadeAdministrativa ) like lower( concat('%',?,'%') ) ");
				params.add(unidadeAdministrativa.getUnidadeAdministrativa().getNomUnidadeAdministrativa());
			}
			if (unidadeAdministrativa.getCodUf() != null && unidadeAdministrativa.getCodUf().getId() != null) {
				hql.append("and codUf.id = ?");
				params.add(unidadeAdministrativa.getCodUf().getId());
			}

			Query query = getEntityManager().createQuery(hql.toString());

			int i = 1;
			for (Object o : params) {
				query.setParameter(i, o);
				i++;
			}

			@SuppressWarnings("unchecked")
			List<UnidadeAdministrativa> unidades = query.getResultList();

			for (UnidadeAdministrativa unidade : unidades) {
				List<UnidadeAdministrativa> unidadeAdministrativas = consultaUnidadesFilhas(unidade);
				unidade.setUnidadeAdministrativas(unidadeAdministrativas);
			}

			return unidades;
		}
		return new ArrayList<UnidadeAdministrativa>();
	}

	@SuppressWarnings("unchecked")
	private List<UnidadeAdministrativa> consultaUnidadesFilhas(UnidadeAdministrativa unidade) {
		String hql = "Select o from UnidadeAdministrativa o where o.unidadeAdministrativa = ?";

		return getEntityManager().createQuery(hql).setParameter(1, unidade).getResultList();
	}

	/**
	 * Realiza a pesquisa de Unidades Administrativas.
	 * 
	 * @param servidor
	 *            Servidor com os parametros de consulta.
	 * @return Lista de todas Unidades Administrativas encontrados.
	 * @author Thiago Nunes Vieira
	 */
	public List<UnidadeAdministrativa> consultarUnidadeAdministrativa(Servidor servidor) {
		List<String> query = new ArrayList<String>();
		query.add(" lower( siglaUnidade )  like lower( concat('%',#{servidor.unidadeAdministrativa.siglaUnidade},'%') ) ");
		query.add(" lower( nomUnidadeAdministrativa )  like lower( concat('%',#{servidor.unidadeAdministrativa.nomUnidadeAdministrativa},'%') ) ");
		query.add(" lower( unidadeAdministrativa.nomUnidadeAdministrativa )  like lower( concat('%',#{servidor.unidadeAdministrativa.unidadeAdministrativa.nomUnidadeAdministrativa},'%') ) ");
		query.add(" codUf.id =  #{servidor.unidadeAdministrativa.codUf.id}");

		return obtemLista(UnidadeAdministrativa.class, query);
	}

	/**
	 * Realiza a pesquisa de Unidades Administrativas.
	 * 
	 * @param unidade
	 *            Unidade Administrativa com os parametros de consulta fora de
	 *            sessão.
	 * @return Lista de todas Unidades Administrativas encontrados.
	 * @author Thiago Nunes Vieira
	 */
	public List<UnidadeAdministrativa> consultarUnidadeAdministrativaComuns(UnidadeAdministrativa unidade) {
		List<String> query = new ArrayList<String>();
		query.add(" lower( nomUnidadeAdministrativa )  like lower( concat('%',#{unidade.nomUnidadeAdministrativa},'%') ) ");
		query.add(" lower( unidadeAdministrativa.nomUnidadeAdministrativa )  like lower( concat('%',#{unidade.unidadeAdministrativa.nomUnidadeAdministrativa},'%') ) ");
		query.add(" codUf.id =  #{unidade.codUf.id}");
		query.add(" id  != #{unidadeAdministrativa.id}");

		return obtemLista(UnidadeAdministrativa.class, query);
	}

	/**
	 * Realiza a pesquisa de todas as Unidades Administrativas de um
	 * Estado/Unidade Federação.
	 * 
	 * @param uf
	 *            Estado/Unidade Federação
	 * @return Lista de todoas as Unidades Administrativas encontrados de um
	 *         determinado Estado/Unidade Federação.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<UnidadeAdministrativa> findByUf(Uf uf) {

		return getEntityManager().createNamedQuery("unidadeAdministrativa.findByUf").setParameter("codUf", uf.getId()).getResultList();
	}
}
