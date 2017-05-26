package br.gov.iphan.sisgep.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.Equipe;
import br.gov.iphan.sisgep.entity.EquipeAvaliacao;
import br.gov.iphan.sisgep.entity.Servidor;
import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;

@Name("equipeManager")
@AutoCreate
@Transactional
public class EquipeManager extends BaseManagerImpl<Equipe> {

	@SuppressWarnings("unchecked")
	public List<Equipe> listarTodos() {
		return (List<Equipe>) listarTodos(Equipe.class);
	}

	@Transactional
	public Equipe salvar(Equipe equipe) {
		getEntityManager().clear();
		
		List<Servidor> servidores = new ArrayList<Servidor>();
		servidores = equipe.getServidores();
		
		if (equipe.getId() != null) {
			Equipe newEquipe = getEntityManager().find(Equipe.class, equipe.getId());
			newEquipe.setUnidadeAdministrativa(equipe.getUnidadeAdministrativa());
			
			getEntityManager().persist(newEquipe);
			
			getEntityManager().createNativeQuery("delete from SISGEP.EQUIPE_SERVIDOR where id_equipe = ?").setParameter(1, newEquipe.getId()).executeUpdate();
			
			equipe = newEquipe;
		} else {
			if (equipe.getUnidadeAdministrativa() != null) {
				UnidadeAdministrativa unidadeAdministrativa = getEntityManager().find(UnidadeAdministrativa.class, equipe.getUnidadeAdministrativa().getId());
				equipe.setUnidadeAdministrativa(unidadeAdministrativa);
			}

			getEntityManager().persist(equipe);
		}

		for (Iterator<Servidor> iter = servidores.iterator(); iter.hasNext();) {
			Servidor servidor = iter.next();
			getEntityManager().createNativeQuery("insert into SISGEP.EQUIPE_SERVIDOR (id_equipe, cod_servidor) values (?, ?)")
				.setParameter(1, equipe.getId())
				.setParameter(2, servidor.getId())
				.executeUpdate();
		}

		return equipe;
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Equipe> consultarEquipe(String palavraChave) {
		StringBuilder sql = new StringBuilder();
		sql.append(" select DISTINCT equipe.* from SISGEP.EQUIPE equipe ");
		sql.append(" inner join SISGEP.EQUIPE_SERVIDOR equipe_servidor on equipe.id = equipe_servidor.id_equipe ");
		sql.append(" inner join SISGEP.GPT_SERVIDOR servidor on equipe_servidor.cod_servidor = servidor.COD_SERVIDOR ");
		sql.append(" inner join CORP.CRP_PESSOA_FISICA pessoa on servidor.COD_PESSOA_FISICA = pessoa.cod_pessoa_fisica ");
		sql.append(" where lower(pessoa.nom_pessoa_fisica) like lower('%" + palavraChave + "%') ");

		return getEntityManager().createNativeQuery(sql.toString(), Equipe.class).getResultList();
	}
	
	@Transactional
	public void excluir(Equipe equipe) {
		getEntityManager().createNativeQuery("delete from SISGEP.EQUIPE_SERVIDOR where id_equipe = ?").setParameter(1, equipe.getId()).executeUpdate();
		getEntityManager().createNativeQuery("delete from SISGEP.EQUIPE where id = ?").setParameter(1, equipe.getId()).executeUpdate();
	}

	public Boolean verificaEquipeAvalicao(Equipe equipe) {
		String hql = "select o from EquipeAvaliacao o where equipe =  ? ";
		List<EquipeAvaliacao> equipes = getEntityManager().createQuery(hql.toString()).setParameter(1, equipe).getResultList();
		
		if (equipes != null && equipes.size() > 0) {
			return true;
		}
		
		return false;
	}

	public List<Equipe> consultarEquipe(String palavraChave, UnidadeAdministrativa unidadeAdministrativa) {
		StringBuilder sql = new StringBuilder();
		sql.append(" select DISTINCT equipe.* from SISGEP.EQUIPE equipe ");
		sql.append(" inner join SISGEP.EQUIPE_SERVIDOR equipe_servidor on equipe.id = equipe_servidor.id_equipe ");
		sql.append(" inner join SISGEP.GPT_SERVIDOR servidor on equipe_servidor.cod_servidor = servidor.COD_SERVIDOR ");
		sql.append(" inner join CORP.CRP_PESSOA_FISICA pessoa on servidor.COD_PESSOA_FISICA = pessoa.cod_pessoa_fisica ");
		sql.append(" where lower(pessoa.nom_pessoa_fisica) like lower('%" + palavraChave + "%') ");
		
		if (unidadeAdministrativa != null) {
			sql.append(" and equipe.cod_unidade_administrativa = " + unidadeAdministrativa.getId());
		}

		return getEntityManager().createNativeQuery(sql.toString(), Equipe.class).getResultList();
	}

	public List<Servidor> buscarServidoresTodasEquipes() {
		String hql = "select servidores from Equipe";
		return getEntityManager().createQuery(hql.toString()).getResultList();
	}
	
}
