package br.gov.iphan.sisgep.manager;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.Afastamento;
import br.gov.iphan.sisgep.entity.Servidor;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade Afastamento. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("afastamentoManager")
@AutoCreate
public class AfastamentoManager extends BaseManagerImpl<Afastamento>{
	
	/**
	 * Realiza a pesquisa de todos os Afastamentos de um Servidor.
	 * @param Servidor		 Servidor que deseje os afastamentos
	 * @return 				 Lista de todos afastamentos de uma servidor encontrados.
	 * @author 				 Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<Afastamento> findByServidor(Servidor servidor) {

		return getEntityManager()
					.createNamedQuery("afastamento.findByServidor")
					.setParameter("id", servidor.getId())
					.getResultList();
	}
		
}
