package br.gov.iphan.sisgep.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import net.sourceforge.jtds.jdbc.DateTime;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.Transactional;

import sun.print.resources.serviceui;
import br.gov.iphan.sisgep.entity.Avaliacao;
import br.gov.iphan.sisgep.entity.Equipe;
import br.gov.iphan.sisgep.entity.EquipeAvaliacao;
import br.gov.iphan.sisgep.entity.Servidor;
import br.gov.iphan.sisgep.entity.ServidorAvaliacao;
import br.gov.iphan.sisgep.entity.Sincronizacao;
import br.gov.iphan.sisgep.entity.StatusAvaliacao;
import br.gov.iphan.sisgep.entity.Subcategoria;
import br.gov.iphan.sisgep.entity.Subfator;
import br.gov.iphan.sisgep.entity.TipoAvaliacao;
import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;

@Name("avaliacaoManager")
@AutoCreate
@Transactional
@Scope(ScopeType.CONVERSATION)
public class AvaliacaoManager extends BaseManagerImpl<Avaliacao> {

	@SuppressWarnings("unchecked")
	public List<Avaliacao> listarTodos() {
		return (List<Avaliacao>) listarTodos(Avaliacao.class);
	}

	@SuppressWarnings("unchecked")
	public List<Avaliacao> consultarAvaliacao(Avaliacao avaliacao) {

		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select o ");
		hql.append(" from Avaliacao o where 0=0 ");

		if (avaliacao != null) {
			if (avaliacao.getTipoAvaliacao() != null) {
				hql.append(" and lower ( o.tipoAvaliacao.titulo ) like lower( ? ) ");
				params.add("%" + avaliacao.getTipoAvaliacao().getTitulo() + "%");
			}
			if (avaliacao.getStatusAvaliacao() != null) {
				hql.append(" and lower ( o.statusAvaliacao.descricao ) like lower( ? ) ");
				params.add("%" + avaliacao.getStatusAvaliacao().getDescricao()
						+ "%");
			}
			if (avaliacao.getPeriodoInicio() != null
					&& avaliacao.getPeriodoFim() != null) {
				hql.append(" and  o.periodoInicio >= ? ");
				params.add(avaliacao.getPeriodoInicio());
				hql.append(" and  o.periodoFim <= ? ");
				params.add(avaliacao.getPeriodoFim());
			}
			if (avaliacao.getPeriodoInicio() != null
					&& avaliacao.getPeriodoFim() == null) {
				hql.append(" and  o.periodoInicio >= ? ");
				params.add(avaliacao.getPeriodoInicio());
			}
			if (avaliacao.getPeriodoInicio() == null
					&& avaliacao.getPeriodoFim() != null) {
				hql.append(" and  o.periodoFim <= ? ");
				params.add(avaliacao.getPeriodoFim());
			}
			if (avaliacao.getUnidadeOrganizacional() != null && avaliacao.getUnidadeOrganizacional().getNomUnidadeAdministrativa() != null && !avaliacao.getUnidadeOrganizacional().getNomUnidadeAdministrativa().equals("")) {
				hql.append(" and lower (o.unidadeOrganizacional.nomUnidadeAdministrativa) like lower( ? ) ");
				params.add("%" + avaliacao.getUnidadeOrganizacional().getNomUnidadeAdministrativa() + "%");
			}

			Query query = getEntityManager().createQuery(hql.toString());
			query.setMaxResults(100);

			int i = 1;
			for (Object o : params) {
				query.setParameter(i, o);
				i++;
			}

			List<Avaliacao> avaliacaoResult = query.getResultList();
			return avaliacaoResult;
		} else {
			Query query = getEntityManager().createQuery(hql.toString());
			List<Avaliacao> avaliacaoResult = query.getResultList();
			return avaliacaoResult;
		}
	}

	@Transactional
	public void salvarAvaliacao(Avaliacao avaliacao) {
		getEntityManager().clear();

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");

		Date periodoInicio = avaliacao.getPeriodoInicio();
		Date periodoFim = avaliacao.getPeriodoFim();
		Date periodoProcessoInicio = avaliacao.getPeriodoProcessoInicio();
		Date periodoProcessoFim = avaliacao.getPeriodoProcessoFim();

		String periodoInicio1 = sdf.format(periodoInicio);
		String periodoFim1 = sdf.format(periodoFim);
		String periodoProcessoInicio1 = sdf.format(periodoProcessoInicio);
		String periodoProcessoFim1 = sdf.format(periodoProcessoFim);

		// String descricao = "Iniciado";
		// avaliacao.getStatusAvaliacao().setDescricao(descricao);
		// avaliacao.getStatusAvaliacao().setAtivo(true);
		// Long status = avaliacao.getStatusAvaliacao().getId();

		Long condutor = avaliacao.getCondutor().getId();
		List<EquipeAvaliacao> equipeAvaliacao = avaliacao.getEquipeAvaliacao();
		Long tipoAvaliacao = avaliacao.getTipoAvaliacao().getId();
		Long unidadeOrganizacional = avaliacao.getUnidadeOrganizacional()
				.getId();
		List<ServidorAvaliacao> servidoresAvaliados = avaliacao
				.getServidoresAvaliacao();

		// AVALIACAO
		Avaliacao newAvaliacao = new Avaliacao();
		getEntityManager().persist(newAvaliacao);
		Long idAvaliacao = newAvaliacao.getId();

		String sql = "update SISGEP.AVALIACAO set id_tipo_avaliacao = "
				+ tipoAvaliacao + ", periodo_inicio = '" + periodoInicio1
				+ "', periodo_fim = '" + periodoFim1 + "', "
				+ "periodo_processo_inicio = '" + periodoProcessoInicio1
				+ "', periodo_processo_fim = '" + periodoProcessoFim1 + "', "
				+ "id_unidade_organizacional = " + unidadeOrganizacional
				+ ", id_condutor = " + condutor + " " + "where id = "
				+ idAvaliacao + ";";

		// System.out.println("--------------------------" + sql);

		getEntityManager().createNativeQuery(sql).executeUpdate();

		// EQUIPE_AVALIACAO
		List<EquipeAvaliacao> servidoresEquipe = new ArrayList<EquipeAvaliacao>();
		servidoresEquipe = equipeAvaliacao;

		for (Iterator<EquipeAvaliacao> iter = servidoresEquipe.iterator(); iter
				.hasNext();) {
			EquipeAvaliacao equipe = iter.next();
			getEntityManager()
					.createNativeQuery(
							"insert into SISGEP.EQUIPE_AVALIACAO (id_equipe, id_avaliacao) values (?, ?)")
					.setParameter(1, equipe.getEquipe().getId())
					.setParameter(2, idAvaliacao).executeUpdate();
		}

		// SERVIDOR_AVALIACAO
		List<ServidorAvaliacao> servidores = new ArrayList<ServidorAvaliacao>();
		servidores = servidoresAvaliados;

		for (Iterator<ServidorAvaliacao> iter = servidores.iterator(); iter
				.hasNext();) {
			ServidorAvaliacao servidor = iter.next();
			if (servidor.getServidor().getChefia() != null) {
				getEntityManager()
						.createNativeQuery(
								"insert into SISGEP.SERVIDOR_AVALIACAO (id_servidor, id_avaliacao, id_chefia) values (?, ?, ?)")
						.setParameter(1, servidor.getServidor().getId())
						.setParameter(2, idAvaliacao)
						.setParameter(3, servidor.getServidor().getChefia())
						.executeUpdate();
			}
			if (servidor.getServidor().getChefia() == null) {
				getEntityManager()
						.createNativeQuery(
								"insert into SISGEP.SERVIDOR_AVALIACAO (id_servidor, id_avaliacao) values (?, ?)")
						.setParameter(1, servidor.getServidor().getId())
						.setParameter(2, idAvaliacao).executeUpdate();
			}
		}

		getEntityManager().flush();
		// STATUS_AVALIACAO
		// getEntityManager().createNativeQuery("insert into SISGEP.STATUS_AVALIACAO (id, descricao, ativo) values (?, ?, ?)")
		// .setParameter(1, avaliacao.getStatusAvaliacao().getId())
		// .setParameter(2, avaliacao.getStatusAvaliacao().getDescricao())
		// .setParameter(3, avaliacao.getStatusAvaliacao().isAtivo())
		// .executeUpdate();

		// getEntityManager().persist(equipe);
	}

	@Transactional
	public void editarAvaliacao(Avaliacao avaliacao) {
		getEntityManager().clear();

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");

		Date periodoInicio = avaliacao.getPeriodoInicio();
		Date periodoFim = avaliacao.getPeriodoFim();
		Date periodoProcessoInicio = avaliacao.getPeriodoProcessoInicio();
		Date periodoProcessoFim = avaliacao.getPeriodoProcessoFim();

		String periodoInicio1 = sdf.format(periodoInicio);
		String periodoFim1 = sdf.format(periodoFim);
		String periodoProcessoInicio1 = sdf.format(periodoProcessoInicio);
		String periodoProcessoFim1 = sdf.format(periodoProcessoFim);

		// String descricao = "Iniciado";
		// avaliacao.getStatusAvaliacao().setDescricao(descricao);
		// avaliacao.getStatusAvaliacao().setAtivo(true);
		// Long status = avaliacao.getStatusAvaliacao().getId();

		Long condutor = avaliacao.getCondutor().getId();
		List<EquipeAvaliacao> equipeAvaliacao = avaliacao.getEquipeAvaliacao();
		Long tipoAvaliacao = avaliacao.getTipoAvaliacao().getId();
		Long unidadeOrganizacional = avaliacao.getUnidadeOrganizacional()
				.getId();
		List<ServidorAvaliacao> servidoresAvaliados = avaliacao
				.getServidoresAvaliacao();

		// AVALIACAO

		String sql = "update SISGEP.AVALIACAO set id_tipo_avaliacao = "
				+ tipoAvaliacao + ", periodo_inicio = '" + periodoInicio1
				+ "', periodo_fim = '" + periodoFim1 + "', "
				+ "periodo_processo_inicio = '" + periodoProcessoInicio1
				+ "', periodo_processo_fim = '" + periodoProcessoFim1 + "', "
				+ "id_unidade_organizacional = " + unidadeOrganizacional
				+ ", id_condutor = " + condutor + " " + "where id = "
				+ avaliacao.getId() + ";";

		// System.out.println("--------------------------" + sql);

		getEntityManager().createNativeQuery(sql).executeUpdate();

		// EQUIPE_AVALIACAO
		getEntityManager()
				.createNativeQuery(
						"delete from SISGEP.EQUIPE_AVALIACAO where id_avaliacao = ?")
				.setParameter(1, avaliacao.getId()).executeUpdate();

		List<EquipeAvaliacao> servidoresEquipe = new ArrayList<EquipeAvaliacao>();
		servidoresEquipe = equipeAvaliacao;

		for (Iterator<EquipeAvaliacao> iter = servidoresEquipe.iterator(); iter
				.hasNext();) {
			EquipeAvaliacao equipe = iter.next();
			getEntityManager()
					.createNativeQuery(
							"insert into SISGEP.EQUIPE_AVALIACAO (id_equipe, id_avaliacao) values (?, ?)")
					.setParameter(1, equipe.getEquipe().getId())
					.setParameter(2, avaliacao.getId()).executeUpdate();
		}

		// SERVIDOR_AVALIACAO
		getEntityManager()
				.createNativeQuery(
						"delete from SISGEP.SERVIDOR_AVALIACAO where id_avaliacao = ?")
				.setParameter(1, avaliacao.getId()).executeUpdate();

		List<ServidorAvaliacao> servidores = new ArrayList<ServidorAvaliacao>();
		servidores = servidoresAvaliados;

		for (Iterator<ServidorAvaliacao> iter = servidores.iterator(); iter
				.hasNext();) {
			ServidorAvaliacao servidorAvaliacao = iter.next();
			if (servidorAvaliacao.getServidor().getChefia() != null) {
				getEntityManager()
						.createNativeQuery(
								"insert into SISGEP.SERVIDOR_AVALIACAO (id_servidor, id_avaliacao, id_chefia) values (?, ?, ?)")
						.setParameter(1,
								servidorAvaliacao.getServidor().getId())
						.setParameter(2, avaliacao.getId())
						.setParameter(3,
								servidorAvaliacao.getServidor().getChefia())
						.executeUpdate();
			}
			if (servidorAvaliacao.getServidor().getChefia() == null) {
				getEntityManager()
						.createNativeQuery(
								"insert into SISGEP.SERVIDOR_AVALIACAO (id_servidor, id_avaliacao) values (?, ?)")
						.setParameter(1,
								servidorAvaliacao.getServidor().getId())
						.setParameter(2, avaliacao.getId()).executeUpdate();
			}
		}

		// STATUS_AVALIACAO
		// getEntityManager().createNativeQuery("insert into SISGEP.STATUS_AVALIACAO (id, descricao, ativo) values (?, ?, ?)")
		// .setParameter(1, avaliacao.getStatusAvaliacao().getId())
		// .setParameter(2, avaliacao.getStatusAvaliacao().getDescricao())
		// .setParameter(3, avaliacao.getStatusAvaliacao().isAtivo())
		// .executeUpdate();

		// getEntityManager().persist(equipe);
	}

	@Transactional
	public void excluirAvaliacao(Avaliacao avaliacao) {
		getEntityManager()
				.createNativeQuery(
						"delete from SISGEP.SERVIDOR_AVALIACAO where id_avaliacao = ?")
				.setParameter(1, avaliacao.getId()).executeUpdate();
		getEntityManager()
				.createNativeQuery(
						"delete from SISGEP.EQUIPE_AVALIACAO where id_avaliacao = ?")
				.setParameter(1, avaliacao.getId()).executeUpdate();
		getEntityManager()
				.createNativeQuery("delete from SISGEP.AVALIACAO where id = ?")
				.setParameter(1, avaliacao.getId()).executeUpdate();
	}

	public Avaliacao recuperarPorId(Long id) {
		return (Avaliacao) super.recuperarPorId(Avaliacao.class, id);
	}

	public void salvarServidorAvaliacao(Servidor servidorSelecionado,
			Servidor servidorChefia, Avaliacao avaliacao) {
		String sql = "update SISGEP.SERVIDOR_AVALIACAO set id_chefia = "
				+ servidorChefia.getId() + " " + "where id_servidor = "
				+ servidorSelecionado.getId() + " and id_avaliacao = "
				+ avaliacao.getId() + ";";

		getEntityManager().createNativeQuery(sql).executeUpdate();
	}

	public List<Servidor> buscarChefiaServidor(Servidor servidor) {
		String hql = "select o from ServidorAvaliacao o where id_servidor = ?";
		List<Servidor> servidores = getEntityManager().createQuery(hql)
				.setParameter(1, servidor).getResultList();
		return servidores;
	}

	public List<Avaliacao> consultarPorTipo(TipoAvaliacao tipoAvaliacao) {
		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select o ");
		hql.append(" from Avaliacao o where 0=0 ");

		if (tipoAvaliacao != null) {
			if (tipoAvaliacao.getId() != null) {
				hql.append(" and o.tipoAvaliacao.id = ?  ");
				params.add(tipoAvaliacao.getId());
			}

			Query query = getEntityManager().createQuery(hql.toString());
			query.setMaxResults(100);

			int i = 1;
			for (Object o : params) {
				query.setParameter(i, o);
				i++;
			}

			List<Avaliacao> avaliacaoResult = query.getResultList();
			return avaliacaoResult;
		} else {
			Query query = getEntityManager().createQuery(hql.toString());
			List<Avaliacao> avaliacaoResult = query.getResultList();
			return avaliacaoResult;
		}	
	}
}
