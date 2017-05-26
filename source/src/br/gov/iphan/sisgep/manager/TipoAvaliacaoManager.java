package br.gov.iphan.sisgep.manager;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.apache.commons.lang.StringUtils;
import org.hibernate.SessionFactory;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.Avaliacao;
import br.gov.iphan.sisgep.entity.Subcategoria;
import br.gov.iphan.sisgep.entity.TipoAvaliacao;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade Servidor. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("tipoAvaliacaoManager")
@AutoCreate
@Transactional
public class TipoAvaliacaoManager extends BaseManagerImpl<TipoAvaliacao> {
	

	@SuppressWarnings("unchecked")
	public List<TipoAvaliacao> listarTodos(){
		return (List<TipoAvaliacao>) listarTodos(TipoAvaliacao.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoAvaliacao> consultarTipoAvaliacao(TipoAvaliacao tipoAvaliacao){
		
		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select distinct o ");
		hql.append(" from TipoAvaliacao o left join o.fatores as fs where 0=0");
		
		if(tipoAvaliacao != null){
			if(!StringUtils.isBlank(tipoAvaliacao.getPalavraChave())){
				hql.append(" and lower ( o.titulo ) like lower( ? ) ");
				//hql.append(" or lower ( fs.nome ) like lower( ? ) ");
				//hql.append(" or lower ( fs.descricao ) like lower( ? ) ");
				params.add("%"+tipoAvaliacao.getPalavraChave()+"%");
				//params.add("%"+tipoAvaliacao.getPalavraChave()+"%");
				//params.add("%"+tipoAvaliacao.getPalavraChave()+"%");
			}
			if(tipoAvaliacao.getSubcategoria() != null) {
				if(tipoAvaliacao.getSubcategoria().getId() != null) {
					hql.append(" and o.subcategoria.id = ? ");
					params.add(tipoAvaliacao.getSubcategoria().getId());
				}
				if(tipoAvaliacao.getSubcategoria().getCategoria() != null && tipoAvaliacao.getSubcategoria().getCategoria().getId() != null) {
					hql.append(" and o.subcategoria.categoria.id = ? ");
					params.add(tipoAvaliacao.getSubcategoria().getCategoria().getId());
				}
			}
			
		
			Query query = getEntityManager().createQuery(hql.toString());
			query.setMaxResults(100);
			
			int i=1;
			for( Object o: params ){
				query.setParameter(i, o);
				i++;
			}
			
			List<TipoAvaliacao> tipoAvaliacaoResult = query.getResultList();
	
			return tipoAvaliacaoResult;
		} else {
			Query query = getEntityManager().createQuery(hql.toString());
			List<TipoAvaliacao> tipoAvaliacaoResult = query.getResultList();
			return tipoAvaliacaoResult;
		}
	}
	
	public List<TipoAvaliacao> consultarPorSubcategoria(Subcategoria subcategoria){

		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select distinct o ");
		hql.append(" from TipoAvaliacao o left join o.fatores as fs where 0=0");
		hql.append(" and o.subcategoria.id = ? ");
		params.add(subcategoria.getId());
		
		Query query = getEntityManager().createQuery(hql.toString());
		query.setMaxResults(100);
			
		int i=1;
		for( Object o: params ){
			query.setParameter(i, o);
			i++;
		}
			
		List<TipoAvaliacao> tipoAvaliacaoResult = query.getResultList();
	
		return tipoAvaliacaoResult;
	}
	
	public void salvarTipoAvaliacao(TipoAvaliacao tipoAvaliacao) {
		try {
			
			if(tipoAvaliacao.getId() != null) {
				getEntityManager().merge(tipoAvaliacao);
				getEntityManager().flush();
			} else {
				getEntityManager().persist(tipoAvaliacao);
				getEntityManager().flush();
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

		
}