package br.gov.iphan.sisgep.manager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.Avaliacao;
import br.gov.iphan.sisgep.entity.HistoricoSincronizacao;
import br.gov.iphan.sisgep.entity.Sincronizacao;

@Name("sincronizacaoManager")
@AutoCreate
@Transactional
public class SincronizacaoManager extends BaseManagerImpl<Sincronizacao> {
	
	/**
	 * Realiza a pesquisa de todos os Servidores.
	 * @return 	Lista de todos Servidores encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<Sincronizacao> listarTodos(){
		return (List<Sincronizacao>) listarTodos(Sincronizacao.class);
	}

	@Transactional
	public Sincronizacao salvar(Sincronizacao entity) {
		return (Sincronizacao) super.salvar(entity);
		//super.getEntityManager().getTransaction().commit();
	}

	public Sincronizacao recuperarPorId(Long id) {
		return (Sincronizacao) super.recuperarPorId(Sincronizacao.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Sincronizacao> consultarSincronizacao(Sincronizacao sincronizacao) {

		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select o ");
		hql.append(" from Sincronizacao o where 0=0 ");

		if (sincronizacao != null) {
			if (sincronizacao.getNomeUsuario() != null && sincronizacao.getNomeUsuario() != "") {
				hql.append(" and lower ( o.nomeUsuario ) like lower( ? ) ");
				params.add("%" + sincronizacao.getNomeUsuario() + "%");
			}
			if (sincronizacao.getStatus() != null) {
				hql.append(" and lower ( o.status ) like lower( ? ) ");
				params.add("%"+sincronizacao.getStatus()+"%");
			}
			if (sincronizacao.getDataHoraInicio() != null
					&& sincronizacao.getDataHoraFim() != null) {
				hql.append(" and  o.dataHoraInicio >= ? ");
				params.add(sincronizacao.getDataHoraInicio());
				hql.append(" and  o.dataHoraFim <= ? ");
				params.add(sincronizacao.getDataHoraFim());
			}
			if (sincronizacao.getDataHoraInicio() != null
					&& sincronizacao.getDataHoraFim() == null) {
				hql.append(" and  o.dataHoraInicio >= ? ");
				params.add(sincronizacao.getDataHoraInicio());
			}
			if (sincronizacao.getDataHoraInicio() == null
					&& sincronizacao.getDataHoraFim() != null) {
				hql.append(" and  o.dataHoraFim <= ? ");
				params.add(sincronizacao.getDataHoraFim());
			}
			hql.append(" ORDER BY o.id DESC ");
			Query query = getEntityManager().createQuery(hql.toString());
			query.setMaxResults(100);

			int i = 1;
			for (Object o : params) {
				query.setParameter(i, o);
				i++;
			}

			List<Sincronizacao> result = query.getResultList();
			return result;
		} else {
			Query query = getEntityManager().createQuery(hql.toString());
			List<Sincronizacao> result = query.getResultList();
			return result;
		}
	}
	
	public String buscarEmailUsuario() {
		StringBuilder hql = new StringBuilder();
		hql.append(" SELECT MAX(emailUsuario) FROM Sincronizacao ");
		Query query = getEntityManager().createQuery(hql.toString());
		String result = (String) query.getSingleResult();
		return result;
	}
}
