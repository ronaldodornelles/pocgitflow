package br.gov.iphan.sisgep.manager;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.apache.commons.lang.StringUtils;
import org.hibernate.SessionFactory;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.Avaliacao;
import br.gov.iphan.sisgep.entity.Categoria;
import br.gov.iphan.sisgep.entity.EquipeAvaliacao;
import br.gov.iphan.sisgep.entity.Escala;
import br.gov.iphan.sisgep.entity.Servidor;
import br.gov.iphan.sisgep.entity.ServidorAvaliacao;
import br.gov.iphan.sisgep.entity.Subfator;
import br.gov.iphan.sisgep.util.Mensagens;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade Servidor. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("subfatorManager")
@AutoCreate
@Transactional
public class SubfatorManager extends BaseManagerImpl<Subfator> {
	

	@SuppressWarnings("unchecked")
	public List<Subfator> listarTodos(){
		return (List<Subfator>) listarTodos(Subfator.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Subfator> consultarSubfator(Subfator subfator){
		
		
		
		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		
		if(subfator != null){
			
			if(StringUtils.isBlank(subfator.getDescricao())) {
				
				hql.append(" select o ");
				hql.append(" from Subfator o where 0=0 ");
				
			} else { 	
				if(subfator.getDescricao() != "" && subfator.getDescricao().length() >= 1){
					hql.append(" select distinct o ");
					hql.append(" from Subfator o left join o.escalas as es where 0=0 ");
					
					if(subfator.getDescricao() != null && subfator.getDescricao().length() >= 1) {
						hql.append(" and lower ( o.descricao ) like lower( ? ) ");
						params.add("%"+subfator.getDescricao()+"%");
						hql.append(" or lower ( es.descricao ) like lower( ? ) ");
						params.add("%"+subfator.getDescricao()+"%");
					}
				}
			}
			
			Query query = getEntityManager().createQuery(hql.toString());
			query.setMaxResults(100);
			
			int i=1;
			for( Object o: params ){
				query.setParameter(i, o);
				i++;
			}
			
			List<Subfator> subFatorResult = query.getResultList();
			Integer posicao = 0;
			
			for (Iterator<Subfator> subfator2 = subFatorResult.iterator(); subfator2.hasNext();) {
				posicao++;
				Subfator subfator3 = subfator2.next();
				subfator3.setPosicao(posicao);
			}
	
			return subFatorResult;
		} else {
			Query query = getEntityManager().createQuery(hql.toString());
			List<Subfator> subFatorResult = query.getResultList();
			return subFatorResult;
		}
	}
	
	public void salvarSubfator(Subfator subfator) {
		try {
			
			if(subfator.getId() != null) {
				getEntityManager().merge(subfator);
				getEntityManager().flush();
			} else {
				getEntityManager().persist(subfator);
				getEntityManager().flush();
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Transactional
	public void editarSubfator(Subfator subfator) {
			getEntityManager().clear();
			
			// SUBFATOR
			String sql = "update SISGEP.SUBFATOR set descricao = '"+subfator.getDescricao()+"', escala_maxima = '"+subfator.getEscalaMaxima()+"' "
					+ "where id = "+subfator.getId()+";";
			System.out.println("---------------------------- " + sql);
			getEntityManager().createNativeQuery(sql)
			.executeUpdate();
			
			// ESCALAS	
			for (Iterator<Escala> iter = subfator.getEscalas().iterator(); iter.hasNext();) {
				Escala escala = iter.next();
					getEntityManager().createNativeQuery("insert into SISGEP.ESCALA (id_subfator, descricao, pontos) values (?, ?, ?)")
					.setParameter(1, subfator.getId())
					.setParameter(2, escala.getDescricao())
					.setParameter(3, escala.getPontos())
					.executeUpdate();
			}

		}
	
	public void excluirEscalas(Subfator subfator){
		getEntityManager().createNativeQuery("delete from SISGEP.ESCALA where id_subfator = ?")
		.setParameter(1, subfator.getId()).executeUpdate();
	}
	
		
}