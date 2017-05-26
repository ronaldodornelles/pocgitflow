package br.gov.iphan.sisgep.manager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.HistoricoSincronizacao;

@Name("historicoSincronizacaoManager")
@AutoCreate
public class HistoricoSincronizacaoManager extends BaseManagerImpl<HistoricoSincronizacao> {
	
	/**
	 * Realiza a pesquisa de todos os Servidores.
	 * @return 	Lista de todos Servidores encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	
	public List<HistoricoSincronizacao> recuperarPorIdSincronizacaoEStatus(Long id_sincro, int status){
		StringBuilder hqlDistinct = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hqlDistinct.append(" SELECT DISTINCT o.cpf ");
		hqlDistinct.append(" FROM HistoricoSincronizacao o ");
		hqlDistinct.append(" WHERE 0=0 ");

		if (id_sincro != null && status != 0) {
			hqlDistinct.append(" and o.sincronizacao.id = ? ");
			params.add(id_sincro);
			hqlDistinct.append(" and o.status = ? ");
			params.add(status);

			Query queryDistinct = getEntityManager().createQuery(hqlDistinct.toString());

			int i = 1;
			for (Object o : params) {
				queryDistinct.setParameter(i, o);
				i++;
			}

			List<String> resultDistinct = queryDistinct.getResultList();
			List<HistoricoSincronizacao> result = new ArrayList<HistoricoSincronizacao>();
			
			for (String cpf : resultDistinct) {
				String hql = "SELECT o FROM HistoricoSincronizacao o WHERE o.sincronizacao.id = ? AND o.cpf = ?";
				Query query = getEntityManager().createQuery(hql).setParameter(1, id_sincro).setParameter(2, cpf);
				query.setMaxResults(1);
				List<HistoricoSincronizacao> singleResult = query.getResultList();
				result.add(singleResult.get(0));
			}
			
			return result;
		} else {
			Query query = getEntityManager().createQuery(hqlDistinct.toString());
			List<HistoricoSincronizacao> result = query.getResultList();
			return result;
		}
	}
	
	public Long recuperarTotalRegistrosPorIdSincronizacaoLong(Long id) {
		StringBuilder hqlDistinct = new StringBuilder();
		hqlDistinct.append(" SELECT COUNT(DISTINCT o.cpf) ");
		hqlDistinct.append(" FROM HistoricoSincronizacao o ");
		hqlDistinct.append(" WHERE o.sincronizacao.id = ? ");

		Query queryDistinct = getEntityManager().createQuery(hqlDistinct.toString());
		queryDistinct.setParameter(1, id);

		Long retorno = (Long) queryDistinct.getSingleResult();
		
		return retorno;
	}
	
	public List<HistoricoSincronizacao> recuperarTotalRegistrosPorIdSincronizacao(Long id) {
		StringBuilder hqlDistinct = new StringBuilder();
		hqlDistinct.append(" SELECT o ");
		hqlDistinct.append(" FROM HistoricoSincronizacao o ");
		hqlDistinct.append(" WHERE o.sincronizacao.id = ? ");

		Query queryDistinct = getEntityManager().createQuery(hqlDistinct.toString());
		queryDistinct.setParameter(1, id);

		List<HistoricoSincronizacao> result = queryDistinct.getResultList();
		
		return result;
	}
	
	public Long recuperarTotalRegistrosPorIdSincronizacaoPesquisa(Long id, String cpf) {
		StringBuilder hqlDistinct = new StringBuilder();
		hqlDistinct.append(" SELECT COUNT(DISTINCT o.cpf) ");
		hqlDistinct.append(" FROM HistoricoSincronizacao o ");
		hqlDistinct.append(" WHERE o.sincronizacao.id = ? and o.cpf = ?");

		Query queryDistinct = getEntityManager().createQuery(hqlDistinct.toString());
		queryDistinct.setParameter(1, id);
		queryDistinct.setParameter(2, cpf);

		Long retorno = (Long) queryDistinct.getSingleResult();
		
		return retorno;
	}

	public List<HistoricoSincronizacao> recuperarPorIdSincronizacaoECpf(Long id, String cpf) {
		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select o ");
		hql.append(" from HistoricoSincronizacao o where 0=0 ");

		if (id != 0) {
			hql.append(" and o.sincronizacao.id = ?  ");
			params.add(id);
			hql.append(" and o.cpf = ? ");
			params.add(cpf);

			Query query = getEntityManager().createQuery(hql.toString());

			int i = 1;
			for (Object o : params) {
				query.setParameter(i, o);
				i++;
			}

			List<HistoricoSincronizacao> result = query.getResultList();
			return result;
		} else {
			Query query = getEntityManager().createQuery(hql.toString());
			List<HistoricoSincronizacao> result = query.getResultList();
			return result;
		}	
	}
	
	@SuppressWarnings("unchecked")
	public List<HistoricoSincronizacao> consultarHistoricoSincronizacao(HistoricoSincronizacao historicoSincronizacao) {

		StringBuilder hqlDistinct = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hqlDistinct.append(" SELECT DISTINCT o.cpf ");
		hqlDistinct.append(" FROM HistoricoSincronizacao o WHERE 0=0 ");

		if (historicoSincronizacao != null) {
			if (historicoSincronizacao.getSincronizacao() != null && historicoSincronizacao.getSincronizacao().getId() != null) {
				hqlDistinct.append(" and o.sincronizacao.id = ? ");
				params.add(historicoSincronizacao.getSincronizacao().getId());
			}
			if (historicoSincronizacao.getCpf() != null && historicoSincronizacao.getCpf() != "") {
				hqlDistinct.append(" and o.cpf like ? ");
				params.add(historicoSincronizacao.getCpf());
			}
			if (historicoSincronizacao.getStatus() != null && historicoSincronizacao.getStatus() == 1) {
				hqlDistinct.append(" and o.status = ? ");
				params.add(historicoSincronizacao.getStatus());
			}
			if (historicoSincronizacao.getStatus() != null && historicoSincronizacao.getStatus() == 2) {
				hqlDistinct.append(" and o.status = ? ");
				params.add(historicoSincronizacao.getStatus());
			}

			Query queryDistinct = getEntityManager().createQuery(hqlDistinct.toString());

			int i = 1;
			for (Object o : params) {
				queryDistinct.setParameter(i, o);
				i++;
			}
			
			List<HistoricoSincronizacao> result = new ArrayList<HistoricoSincronizacao>();
			if(queryDistinct.getResultList() != null || queryDistinct.getResultList().size() > 1){
				List<String> resultDistinct = queryDistinct.getResultList();
				if(resultDistinct != null){
					for (String cpf : resultDistinct) {
						String hql = "SELECT o FROM HistoricoSincronizacao o WHERE o.sincronizacao.id = ? AND o.cpf = ?";
						Query query = getEntityManager().createQuery(hql).setParameter(1, historicoSincronizacao.getSincronizacao().getId()).setParameter(2, cpf);
						query.setMaxResults(1);
						List<HistoricoSincronizacao> singleResult = query.getResultList();
						result.add(singleResult.get(0));
					}
				}
				return result;
			}
			return result;
		} else {
			Query query = getEntityManager().createQuery(hqlDistinct.toString());
			List<HistoricoSincronizacao> result = query.getResultList();
			return result;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<HistoricoSincronizacao> consultarHistoricoSincronizacaoPesquisa(HistoricoSincronizacao historicoSincronizacao) {

		StringBuilder hqlDistinct = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hqlDistinct.append(" SELECT DISTINCT o.cpf ");
		hqlDistinct.append(" FROM HistoricoSincronizacao o WHERE 0=0 ");

		if (historicoSincronizacao != null) {
			if (historicoSincronizacao.getSincronizacao() != null && historicoSincronizacao.getSincronizacao().getId() != null) {
				hqlDistinct.append(" and o.sincronizacao.id = ? ");
				params.add(historicoSincronizacao.getSincronizacao().getId());
			}
			if (historicoSincronizacao.getCpf() != null && historicoSincronizacao.getCpf() != "") {
				hqlDistinct.append(" and o.cpf like ? ");
				params.add(historicoSincronizacao.getCpf());
			}
			if (historicoSincronizacao.getStatus() != null && historicoSincronizacao.getStatus() == 1) {
				hqlDistinct.append(" and o.status = ? ");
				params.add(historicoSincronizacao.getStatus());
			}
			if (historicoSincronizacao.getStatus() != null && historicoSincronizacao.getStatus() == 2) {
				hqlDistinct.append(" and o.status = ? ");
				params.add(historicoSincronizacao.getStatus());
			}

			Query queryDistinct = getEntityManager().createQuery(hqlDistinct.toString());

			int i = 1;
			for (Object o : params) {
				queryDistinct.setParameter(i, o);
				i++;
			}

			List<String> resultDistinct = queryDistinct.getResultList();
			List<HistoricoSincronizacao> result = new ArrayList<HistoricoSincronizacao>();
			
			for (String cpf : resultDistinct) {
				String hql = "SELECT o FROM HistoricoSincronizacao o WHERE o.sincronizacao.id = ? AND o.cpf = ?";
				Query query = getEntityManager().createQuery(hql).setParameter(1, historicoSincronizacao.getSincronizacao().getId()).setParameter(2, cpf);
				query.setMaxResults(1);
				List<HistoricoSincronizacao> singleResult = query.getResultList();
				result.add(singleResult.get(0));
			}
			
			return result;
		} else {
			Query query = getEntityManager().createQuery(hqlDistinct.toString());
			List<HistoricoSincronizacao> result = query.getResultList();
			return result;
		}
	}
	
	public List<HistoricoSincronizacao> buscarHistoricosSincronizacao(Long id) {
		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select o ");
		hql.append(" from HistoricoSincronizacao o ");
		hql.append(" where 0=0 ");

		if (id != 0) {
			hql.append(" and o.sincronizacao.id = ? ");
			params.add(id);

			Query query = getEntityManager().createQuery(hql.toString());

			int i = 1;
			for (Object o : params) {
				query.setParameter(i, o);
				i++;
			}

			List<HistoricoSincronizacao> result = query.getResultList();
			return result;
		} else {
			Query query = getEntityManager().createQuery(hql.toString());
			List<HistoricoSincronizacao> result = query.getResultList();
			return result;
		}	
	}
}
