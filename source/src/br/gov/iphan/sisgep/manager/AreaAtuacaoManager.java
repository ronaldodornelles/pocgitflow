package br.gov.iphan.sisgep.manager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.AreaAtuacao;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para
 * entidade AreaAtuacao.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("areaAtuacaoManager")
@AutoCreate
public class AreaAtuacaoManager extends BaseManagerImpl<AreaAtuacao> {

	/**
	 * Realiza a pesquisa de todos as Areas de Atuação.
	 * 
	 * @return Lista de todoas Areas de Atuação encontrados.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<AreaAtuacao> listarTodos() {
		return (List<AreaAtuacao>) listarTodos(AreaAtuacao.class);
	}

	/**
	 * Realiza a pesquisa de Area de Atuação.
	 * 
	 * @param areaAtuacao
	 *            Area de Atuação com os parametros de consulta.
	 * @return Lista de todas Areas de Atuação encontrados.
	 * @author Thiago Nunes Vieira
	 */
	public List<AreaAtuacao> consultarAreaAtuacao(AreaAtuacao areaAtuacao) {
		List<String> query = new ArrayList<String>();

		query.add(" lower( nomAreaAtuacao )  like lower( concat('%',#{areaAtuacao.nomAreaAtuacao},'%') ) ");
		query.add(" ativo  = #{areaAtuacao.ativo}");

		return obtemLista(AreaAtuacao.class, query);
	}

	/**
	 * Realiza a pesquisa para verificar a existênia de AreaAtuacao com o mesmo
	 * nome.
	 * 
	 * @param AreaAtuacao
	 *            AreaAtuacao com os parametros de consulta.
	 * @return Quatidade do resultado
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<AreaAtuacao> verificarDuplicidade(AreaAtuacao areaAtuacao) {
		List<AreaAtuacao> retorno = new ArrayList<AreaAtuacao>();
		try {
			retorno = (List<AreaAtuacao>) getEntityManager().createNamedQuery("areaAtuacao.findDuplicidade")
					.setParameter("nomAreaAtuacao", areaAtuacao.getNomAreaAtuacao()).getResultList();
		} catch (NoResultException e) {
			retorno = new ArrayList<AreaAtuacao>();
		}
		return retorno;
	}

	@SuppressWarnings("unchecked")
	public AreaAtuacao buscarAreaPorNome(String nomeAreaAtuacao) {
		AreaAtuacao retorno = null;

		String hql = "SELECT o from AreaAtuacao o where o.nomAreaAtuacao like ?";
		List<AreaAtuacao> areas = getEntityManager().createQuery(hql).setParameter(1, nomeAreaAtuacao).getResultList();
		
		if (areas != null && areas.size() > 0) {
			retorno = areas.get(0);
		}
		
		return retorno;
	}
	
}
