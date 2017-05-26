package br.gov.iphan.sisgep.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.Equipe;
import br.gov.iphan.sisgep.entity.Servidor;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para
 * entidade Servidor.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("servidorManager")
@AutoCreate
public class ServidorManager extends BaseManagerImpl<Servidor> {

	/**
	 * Realiza a pesquisa de todos os Servidores.
	 * 
	 * @return Lista de todos Servidores encontrados.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<Servidor> listarTodos() {
		return (List<Servidor>) listarTodos(Servidor.class);
	}

	/**
	 * Realiza a pesquisa de Servidores.
	 * 
	 * @param servidor
	 *            Servidor com os parametros de consulta.
	 * @return Lista de todos Servidores encontrados.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<Servidor> consultarServidor(Servidor servidor) {
		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select o ");
		hql.append(" from Servidor o where 0=0 ");

		if (servidor != null) {
			if (servidor.getPessoaFisica() != null && servidor.getPessoaFisica().getNomPessoaFisica() != null
					&& !servidor.getPessoaFisica().getNomPessoaFisica().trim().equals("") && servidor.getPessoaFisica().getNomPessoaFisica().length() > 0) {
				hql.append(" and lower ( o.pessoaFisica.nomPessoaFisica ) like lower( ? ) ");
				params.add("%" + servidor.getPessoaFisica().getNomPessoaFisica() + "%");
			}
			if (servidor.getNumMatricula() != null) {
				hql.append(" and o.numMatricula =  ? ");
				params.add(servidor.getNumMatricula());
			}
			if (servidor.getSituacaoFuncional() != null && servidor.getSituacaoFuncional().getId() != null) {
				hql.append(" and o.situacaoFuncional.id =  ? ");
				params.add(servidor.getSituacaoFuncional().getId());
			}
			if (servidor.getPessoaFisica() != null && servidor.getPessoaFisica().getNumCpf() != null
					&& !servidor.getPessoaFisica().getNumCpf().trim().equals("")) {
				hql.append(" and o.pessoaFisica.numCpf like ?  ");
				params.add(servidor.getPessoaFisica().getNumCpf());
			}
			if (servidor.getDatIngressoOrgaoInicio() != null && servidor.getDatIngressoOrgaoFim() != null) {
				hql.append(" and  o.formaIngressoAposentacao1.datIngressoApos >= ? ");
				params.add(servidor.getDatIngressoOrgaoInicio());
				hql.append(" and  o.formaIngressoAposentacao1.datIngressoApos <= ? ");
				params.add(servidor.getDatIngressoOrgaoFim());
			}

			if (servidor.getStatus()) {
				hql.append(" and o.formaSaida.id IS NOT NULL ");
				hql.append(" and o.formaSaida.formaPassagemServ.id IS NOT NULL ");
			}

			hql.append(" order by o.pessoaFisica.nomPessoaFisica ASC");

			Query query = getEntityManager().createQuery(hql.toString());
			query.setMaxResults(100);

			int i = 1;
			for (Object o : params) {
				query.setParameter(i, o);
				i++;
			}

			List<Servidor> servidores = query.getResultList();

			List<Servidor> servidoresNew = new ArrayList<Servidor>();
			for (Servidor servidorAjuste : servidores) {
				if (servidorAjuste.getPessoaFisica().getServidors().size() > 1) {
					if (!(servidorAjuste.getFormaSaida() != null && servidorAjuste.getFormaSaida().getDatSaida() != null)) {
						servidoresNew.add(servidorAjuste);
					}
				} else {
					servidoresNew.add(servidorAjuste);
				}

			}

			return servidoresNew;
		}
		return new ArrayList<Servidor>();
	}

	/**
	 * Realiza a pesquisa de Servidores.
	 * 
	 * @param servidor
	 *            Servidor com os parametros de consulta.
	 * @return Lista de todos Servidores encontrados.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<Servidor> consultarServidorSemEquipe(Servidor servidor) {
		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select o ");
		hql.append(" from Servidor o where 0=0 ");

		if (servidor != null) {
			if (servidor.getPessoaFisica() != null && servidor.getPessoaFisica().getNomPessoaFisica() != null
					&& !servidor.getPessoaFisica().getNomPessoaFisica().trim().equals("") && servidor.getPessoaFisica().getNomPessoaFisica().length() > 0) {
				hql.append(" and lower ( o.pessoaFisica.nomPessoaFisica ) like lower( ? ) ");
				params.add("%" + servidor.getPessoaFisica().getNomPessoaFisica() + "%");
			}
			if (servidor.getNumMatricula() != null) {
				hql.append(" and o.numMatricula =  ? ");
				params.add(servidor.getNumMatricula());
			}
			if (servidor.getSituacaoFuncional() != null && servidor.getSituacaoFuncional().getId() != null) {
				hql.append(" and o.situacaoFuncional.id =  ? ");
				params.add(servidor.getSituacaoFuncional().getId());
			}
			if (servidor.getPessoaFisica() != null && servidor.getPessoaFisica().getNumCpf() != null
					&& !servidor.getPessoaFisica().getNumCpf().trim().equals("")) {
				hql.append(" and o.pessoaFisica.numCpf like ?  ");
				params.add(servidor.getPessoaFisica().getNumCpf());
			}
			if (servidor.getDatIngressoOrgaoInicio() != null && servidor.getDatIngressoOrgaoFim() != null) {
				hql.append(" and  o.formaIngressoAposentacao1.datIngressoApos >= ? ");
				params.add(servidor.getDatIngressoOrgaoInicio());
				hql.append(" and  o.formaIngressoAposentacao1.datIngressoApos <= ? ");
				params.add(servidor.getDatIngressoOrgaoFim());
			}

			if (servidor.getStatus()) {
				hql.append(" and o.formaSaida.id IS NOT NULL ");
				hql.append(" and o.formaSaida.formaPassagemServ.id IS NOT NULL ");
			}

			hql.append(" order by o.pessoaFisica.nomPessoaFisica ASC");

			Query query = getEntityManager().createQuery(hql.toString());
			query.setMaxResults(100);

			int i = 1;
			for (Object o : params) {
				query.setParameter(i, o);
				i++;
			}

			List<Servidor> servidores = query.getResultList();

			List<Servidor> servidoresNew = new ArrayList<Servidor>();
			for (Servidor servidorAjuste : servidores) {
				if (servidorAjuste.getPessoaFisica().getServidors().size() > 1) {
					if (!(servidorAjuste.getFormaSaida() != null && servidorAjuste.getFormaSaida().getDatSaida() != null)) {
						servidoresNew.add(servidorAjuste);
					}
				} else {
					servidoresNew.add(servidorAjuste);
				}

			}

			StringBuilder hqlEquipe = new StringBuilder();

			hqlEquipe.append(" select equipe ");
			hqlEquipe.append(" from Equipe equipe");
			Query queryEquipe = getEntityManager().createQuery(hqlEquipe.toString());
			List<Equipe> equipes = queryEquipe.getResultList();

			for (Equipe equipe : equipes) {
				for (Servidor serviEquipe : equipe.getServidores()) {
					Iterator<Servidor> serv = servidoresNew.iterator();
					while (serv.hasNext()) {
						Servidor servidorNext = serv.next();
						if (servidorNext.getId() == serviEquipe.getId()) {
							serv.remove();
						}
					}

				}
			}

			return servidoresNew;
		}
		return new ArrayList<Servidor>();
	}

	@SuppressWarnings("unchecked")
	public List<Servidor> consultarServidorPorMatricula(Servidor servidor) {
		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select o ");
		hql.append(" from Servidor o where 0=0 ");

		if (servidor != null) {
			if (servidor.getNumMatricula() != null) {
				hql.append(" and o.numMatricula =  ? ");
				params.add(servidor.getNumMatricula());
			}

			Query query = getEntityManager().createQuery(hql.toString());
			query.setMaxResults(100);

			int i = 1;
			for (Object o : params) {
				query.setParameter(i, o);
				i++;
			}

			return query.getResultList();
		}
		return new ArrayList<Servidor>();
	}

	public Servidor consultaServidorPorMatricula(Long numeroMatricula) {
		String hql = "SELECT o FROM Servidor o where o.numMatricula =  ? ";

		return (Servidor) getEntityManager().createQuery(hql).setParameter(1, numeroMatricula).getSingleResult();
	}

	/**
	 * Realiza a pesquisa de Servidore para verificar a duplicidade.
	 * 
	 * @param servidor
	 *            Servidor com os parametros de consulta.
	 * @return Long com a quantidade de registros encontrados.
	 * @author Thiago Nunes Vieira
	 */
	public Long verificarDuplicidade(Servidor servidor) {

		return (Long) getEntityManager().createNamedQuery("servidor.verificarDuplicidade").setParameter("numMatricula", servidor.getNumMatricula())
				.getSingleResult();
	}

	/**
	 * Realiza a pesquisa de Servidores por meio da Pessoa Física.
	 * 
	 * @param pessoaFisica
	 *            Servidor com os parametros de consulta.
	 * @return Lista de todos Servidores de uma Pessoa associado a pessoa
	 *         física.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<Servidor> findByPessoa(Servidor servidor) {

		return getEntityManager().createNamedQuery("servidor.findByPessoa").setParameter("id", servidor.getPessoaFisica().getId()).getResultList();
	}
	
	@Transactional
	public void salvarServidor(Servidor servidor) {
		try {

			if (servidor.getId() != null) {
				getEntityManager().merge(servidor);
				getEntityManager().flush();
			} else {
				getEntityManager().persist(servidor);
				getEntityManager().flush();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	public void salvar(Servidor servidor) {
		super.salvar(servidor);
	}
	
}