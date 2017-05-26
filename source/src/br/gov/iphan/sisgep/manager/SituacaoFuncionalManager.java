package br.gov.iphan.sisgep.manager;

import java.util.List;

import javax.persistence.Query;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.SituacaoFuncional;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para
 * entidade SituacaoFuncional.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("situacaoFuncionalManager")
@AutoCreate
public class SituacaoFuncionalManager extends BaseManagerImpl<SituacaoFuncional> {

	public SituacaoFuncional consultarPorCodigoSiape(Long codigoSiape) {
		String hql = " select o from SituacaoFuncional o where codSiapeSituacaoFunc = ? ";

		Query query = getEntityManager().createQuery(hql.toString());
		query.setParameter(1, codigoSiape);
		
		List<SituacaoFuncional> situacoes = query.getResultList();
		
		if (situacoes != null && situacoes.size() > 0) {
			return situacoes.get(0);
		}

		return null;
	}

}
