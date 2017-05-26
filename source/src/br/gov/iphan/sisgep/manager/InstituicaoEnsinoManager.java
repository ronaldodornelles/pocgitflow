package br.gov.iphan.sisgep.manager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.InstituicaoEnsino;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade InstituicaoEnsino. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("instituicaoEnsinoManager")
@AutoCreate
public class InstituicaoEnsinoManager extends BaseManagerImpl<InstituicaoEnsino>{
	
	/**
	 * Realiza a pesquisa de todos as Instituições de Ensino.
	 * @return 	Lista de todoas Instituições de Ensino encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<InstituicaoEnsino> listarTodos(){
		return (List<InstituicaoEnsino>) listarTodos(InstituicaoEnsino.class);
	}

	/**
	 * Realiza a pesquisa de Instituição de Ensino.
	 * @param instituicaoEnsino	Instituição de Ensino com os parametros de consulta.
	 * @return 				Lista de todas Instituições de Ensino encontrados.
	 * @author 				Thiago Nunes Vieira
	 */
	public List<InstituicaoEnsino> consultarInstituicaoEnsino(InstituicaoEnsino instituicaoEnsino){
		List<String> query = new ArrayList<String>();

		query.add(" lower( nomInstituicaoEnsino )  like lower( concat('%',#{instituicaoEnsino.nomInstituicaoEnsino},'%') ) ");
		query.add(" lower( desInstituicaoEnsino )  like lower( concat('%',#{instituicaoEnsino.desInstituicaoEnsino},'%') ) ");
		query.add(" lower( sigInstituicaoEnsino )  like lower( concat('%',#{instituicaoEnsino.sigInstituicaoEnsino},'%') ) ");

		return obtemLista(InstituicaoEnsino.class, query);
	}

	public List<InstituicaoEnsino> listarInstituicoes() {
		StringBuilder hql = new StringBuilder();
		List<Object> params = new ArrayList<Object>();
		hql.append("select o from InstituicaoEnsino o order by o.nomInstituicaoEnsino ASC");
			
		Query query = getEntityManager().createQuery(hql.toString());
			
		int i=1;
		for( Object o: params ){
			query.setParameter(i, o);
			i++;
		}
			
		List<InstituicaoEnsino> instituicoes = query.getResultList();
			
		return instituicoes;
		
		
	}
	
}
