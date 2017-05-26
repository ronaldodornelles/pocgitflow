package br.gov.iphan.sisgep.manager;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.CessaoRequisicao;
import br.gov.iphan.sisgep.entity.Servidor;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade CessaoRequisicao. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("cessaoRequisicaoManager")
@AutoCreate
public class CessaoRequisicaoManager extends BaseManagerImpl<CessaoRequisicao>{
	
	/**
	 * Realiza a pesquisa de todos as CessaoRequisicaos de um Servidor.
	 * @param Servidor		 Servidor que deseje os CessaoRequisicaos
	 * @return 				 Lista de todas CessaoRequisicaos de uma servidor encontrados.
	 * @author 				 Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<CessaoRequisicao> findByServidor(Servidor servidor) {

		return getEntityManager()
					.createNamedQuery("cessaoRequisicao.findByServidor")
					.setParameter("id", servidor.getId())
					.getResultList();
	}
}
