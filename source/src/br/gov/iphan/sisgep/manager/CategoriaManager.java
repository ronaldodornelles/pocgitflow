package br.gov.iphan.sisgep.manager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.Categoria;
import br.gov.iphan.sisgep.entity.Subcategoria;
import br.gov.iphan.sisgep.entity.Subfator;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade Servidor. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("categoriaManager")
@AutoCreate
@Transactional
public class CategoriaManager extends BaseManagerImpl<Categoria> {
	

	@SuppressWarnings("unchecked")
	public List<Categoria> listarTodos(){
		return (List<Categoria>) listarTodos(Categoria.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Categoria> consultarCategoria(Categoria categoria){

		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append(" select o ");
		hql.append(" from Categoria o where 0=0 ");
		
		if(categoria != null){
			if(categoria.getTitulo() != null){
				hql.append(" and lower ( o.titulo ) like lower( ? ) ");
				params.add("%"+categoria.getTitulo()+"%");
			}
		
			Query query = getEntityManager().createQuery(hql.toString());
			query.setMaxResults(100);
			
			int i=1;
			for( Object o: params ){
				query.setParameter(i, o);
				i++;
			}
			
			List<Categoria> categoriaResult = query.getResultList();
	
			return categoriaResult;
		} else {
			Query query = getEntityManager().createQuery(hql.toString());
			List<Categoria> categoriaResult = query.getResultList();
			return categoriaResult;
		}
	}
	
	public void salvarCategoria(Categoria categoria) {
		try {
			
			if(categoria.getId() != null) {
				getEntityManager().merge(categoria);
				getEntityManager().flush();
			} else {
				getEntityManager().persist(categoria);
				getEntityManager().flush();
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public void excluirSubcategorias(Subcategoria subcategoria) throws SQLException{
		try {
			getEntityManager().createNativeQuery("delete from SISGEP.SUBCATEGORIA where id = ?")
			.setParameter(1, subcategoria.getId()).executeUpdate();
			getEntityManager().flush();
		} catch (Exception e) {
			throw new SQLException();
		}
	}
}