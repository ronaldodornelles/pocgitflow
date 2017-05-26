package br.gov.iphan.sisgep.manager;
import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.Equipe;
import br.gov.iphan.sisgep.entity.EquipeAvaliacao;
import br.gov.iphan.sisgep.entity.corp.EscolaridadePessoa;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade EscolaridadePessoa. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("escolaridadePessoaManager")
@AutoCreate
public class EscolaridadePessoaManager extends BaseManagerImpl<EscolaridadePessoa> {
	
	/**
	 * Realiza a pesquisa de todos os tipos de Escolaridades.
	 * @return 	Lista de todos tipos de Escolaridades encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<EscolaridadePessoa> listarTodos(){
		return (List<EscolaridadePessoa>) listarTodos(EscolaridadePessoa.class);
	}
	
	public List<EscolaridadePessoa> buscarEscolaridade(Long codigoSiapeEscolaridade) {
		String hql = "select o from EscolaridadePessoa o where o.codigoSiapeEscolaridade =  ? ";
		return getEntityManager().createQuery(hql.toString()).setParameter(1, codigoSiapeEscolaridade).getResultList();
	}

}