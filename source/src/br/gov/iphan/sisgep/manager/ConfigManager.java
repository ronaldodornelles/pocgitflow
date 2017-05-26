package br.gov.iphan.sisgep.manager;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.Config;

@Name("configManager")
@AutoCreate
public class ConfigManager extends BaseManagerImpl<Config> {

	/**
	 * Realiza a pesquisa de todos os Servidores.
	 * 
	 * @return Lista de todos Servidores encontrados.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<Config> listarTodos() {
		return (List<Config>) listarTodos(Config.class);
	}

	public String getValor(String chave) {
		try {
			Config retorno = (Config) getEntityManager().createNamedQuery("config.findBychave").setParameter("chave", chave).getSingleResult();
			return retorno.getValor();
		} catch (NoResultException e) {
			return null;
		} catch (NonUniqueResultException e) {
			Config retorno = (Config) getEntityManager().createNamedQuery("config.findBychave").setParameter("chave", chave).getResultList().get(0);
			return retorno.getValor();
		}
	}

}
