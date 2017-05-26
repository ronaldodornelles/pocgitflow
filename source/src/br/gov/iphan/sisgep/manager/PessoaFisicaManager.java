package br.gov.iphan.sisgep.manager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.corp.PessoaFisica;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para
 * entidade PessoaFisica.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("pessoaFisicaManager")
@AutoCreate
public class PessoaFisicaManager extends BaseManagerImpl<PessoaFisica> {

	/**
	 * Realiza a pesquisa de todos as Pessoas Físicas.
	 * 
	 * @return Lista de todas Pessoas Físicas encontrados.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<PessoaFisica> listarTodos() {
		return (List<PessoaFisica>) listarTodos(PessoaFisica.class);
	}

	/**
	 * Realiza a pesquisa de Pessoas Físicas.
	 * 
	 * @param pessoaFisica
	 *            Pessoa com os parametros de consulta.
	 * @return Lista de todas Pessoas Físicas encontrados.
	 * @author Thiago Nunes Vieira
	 */
	public List<PessoaFisica> consultarPessoaFisica(PessoaFisica pessoaFisica) {
		List<String> query = new ArrayList<String>();

		query.add(" lower( nomPessoaFisica )  like lower( concat('%',#{pessoaFisica.nomPessoaFisica},'%') ) ");
		query.add(" numCpf =  #{pessoaFisica.numCpf}");

		return obtemLista(PessoaFisica.class, query);
	}

	/**
	 * Realiza a pesquisa de Pessoas Físicas atrvés no numero do CPF.
	 * 
	 * @param numCPF
	 *            número do CPF.
	 * @return Pessoa Física encontrada.
	 * @author Thiago Nunes Vieira
	 */
	public PessoaFisica getPessoaFisicaByCPF(String numCPF) {
		try {
			return (PessoaFisica) getEntityManager().createNamedQuery("pessoaFisica.findByCPF").setParameter("cpf", numCPF).getSingleResult();
		} catch (NoResultException e) {
			return null;
		} catch (NonUniqueResultException e) {
			return (PessoaFisica) getEntityManager().createNamedQuery("pessoaFisica.findByCPF").setParameter("cpf", numCPF).getResultList().get(0);
		}
	}

	/**
	 * Realiza a pesquisa para verificar a existênia de Pessoa Física com o nome
	 * idêntico.
	 * 
	 * @param pessoaFisica
	 *            Pessoa com os parametros de consulta.
	 * @return Pessoa Física encontrada.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public PessoaFisica verificarDuplicidadeNome(PessoaFisica pessoaFisica) {
		List<PessoaFisica> listaPessoaFisicas = new ArrayList<PessoaFisica>();
		PessoaFisica retorno = new PessoaFisica();
		try {
			listaPessoaFisicas = getEntityManager().createNamedQuery("pessoaFisica.verificarDuplicidadeNome")
					.setParameter("nomPessoaFisica", pessoaFisica.getNomPessoaFisica()).setParameter("datNascimento", pessoaFisica.getDatNascimento())
					.setParameter("id", pessoaFisica.getId()).setParameter("nomMae", pessoaFisica.getNomMae()).getResultList();

			if (listaPessoaFisicas != null && listaPessoaFisicas.size() > 0) {
				retorno = listaPessoaFisicas.get(0);
			}
		} catch (NoResultException e) {
			retorno = null;
		}
		return retorno;
	}

	/**
	 * Realiza a pesquisa para verificar a existênia de Pessoa Física com o
	 * mesmo CPF.
	 * 
	 * @param pessoaFisica
	 *            Pessoa com os parametros de consulta.
	 * @return Pessoa Física encontrada.
	 * @author Thiago Nunes Vieira
	 */
	public PessoaFisica verificarDuplicidadeCpf(PessoaFisica pessoaFisica) {
		PessoaFisica retorno = new PessoaFisica();
		try {
			retorno = (PessoaFisica) getEntityManager().createNamedQuery("pessoaFisica.verificarDuplicidadeCpf")
					.setParameter("numCpf", pessoaFisica.getNumCpf()).setParameter("id", pessoaFisica.getId()).getSingleResult();
		} catch (NoResultException e) {
			retorno = null;
		} catch (NonUniqueResultException e) {
			retorno = (PessoaFisica) getEntityManager().createNamedQuery("pessoaFisica.verificarDuplicidadeCpf")
					.setParameter("numCpf", pessoaFisica.getNumCpf()).setParameter("id", pessoaFisica.getId()).getResultList().get(0);
		}
		return retorno;
	}

	/**
	 * Realiza a pesquisa para verificar a existênia de Pessoa Física com o
	 * mesmo CPF no momento da inserção de uma pessoa nova.
	 * 
	 * @param pessoaFisica
	 *            Pessoa com os parametros de consulta.
	 * @return Pessoa Física encontrada.
	 * @author Thiago Nunes Vieira
	 */
	public PessoaFisica verificarDuplicidadeCpfNovo(PessoaFisica pessoaFisica) {
		PessoaFisica retorno = new PessoaFisica();
		try {
			@SuppressWarnings("unchecked")
			List<PessoaFisica> listaPessoaFisicas = getEntityManager().createNamedQuery("pessoaFisica.verificarDuplicidadeCpfNovo")
					.setParameter("numCpf", pessoaFisica.getNumCpf()).getResultList();

			if (listaPessoaFisicas != null && !listaPessoaFisicas.isEmpty()) {
				retorno = listaPessoaFisicas.get(0);
			} else {
				return retorno;
			}

		} catch (NoResultException e) {
			retorno = null;
		} catch (NonUniqueResultException e) {
			retorno = (PessoaFisica) getEntityManager().createNamedQuery("pessoaFisica.verificarDuplicidadeCpfNovo")
					.setParameter("numCpf", pessoaFisica.getNumCpf()).getResultList().get(0);
		}
		return retorno;
	}

	/**
	 * Realiza a pesquisa para verificar a existênia de Pessoa Física com o nome
	 * idêntico no momento da Inserção de uma pessoa nova.
	 * 
	 * @param pessoaFisica
	 *            Pessoa com os parametros de consulta.
	 * @return Pessoa Física encontrada.
	 * @author Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public PessoaFisica verificarDuplicidadeNomeNovo(PessoaFisica pessoaFisica) {
		List<PessoaFisica> listaPessoaFisicas = new ArrayList<PessoaFisica>();
		PessoaFisica retorno = new PessoaFisica();
		try {
			listaPessoaFisicas = getEntityManager().createNamedQuery("pessoaFisica.verificarDuplicidadeNomeNovo")
					.setParameter("nomPessoaFisica", pessoaFisica.getNomPessoaFisica()).setParameter("datNascimento", pessoaFisica.getDatNascimento())
					.setParameter("nomMae", pessoaFisica.getNomMae()).getResultList();

			if (listaPessoaFisicas != null && listaPessoaFisicas.size() > 0) {
				retorno = listaPessoaFisicas.get(0);
			}

		} catch (NoResultException e) {
			retorno = null;
		}
		return retorno;
	}

	/**
	 * Realiza a pesquisa para verificar a existênia de Pessoa(s) Física(s) com
	 * o(s) mesmo(s) valor(es) de documto(s).
	 * 
	 * @param pessoaFisica
	 *            Pessoa com os parametros de consulta.
	 * @return Pessoa Física encontrada.
	 * @author Thiago Nunes Vieira
	 */
	public String verificaDuplicidadeDocumentacao(PessoaFisica pessoaFisica) {
		List<String> query = new ArrayList<String>();

		query.add(" numRg = #{pessoaFisica.numRg} ");
		query.add(" numTituloEleitoral = #{pessoaFisica.numTituloEleitoral} ");
		query.add(" numNis = #{pessoaFisica.numNis} ");
		query.add(" numCpf = #{pessoaFisica.numCpf} ");

		List<PessoaFisica> listaPessoaFisica = obtemLista(PessoaFisica.class, query, "or");
		String campos = new String();
		for (PessoaFisica pessoaFisicaObj : listaPessoaFisica) {
			if (pessoaFisicaObj.getId() != pessoaFisica.getId()) {
				if (pessoaFisica.getNumRg() != null) {
					if (pessoaFisicaObj.getNumRg() != null && pessoaFisicaObj.getNumRg().equals(pessoaFisica.getNumRg())) {
						if (!campos.contains("RG"))
							campos += " 'RG' ";
					}
				}
				if (pessoaFisica.getNumTituloEleitoral() != null) {
					if (pessoaFisicaObj.getNumTituloEleitoral() != null && pessoaFisicaObj.getNumTituloEleitoral().equals(pessoaFisica.getNumTituloEleitoral())) {
						if (!campos.contains("Título Eleitoral"))
							campos += " 'Título Eleitoral' ";
					}
				}
				if (pessoaFisica.getNumNis() != null) {
					if (pessoaFisicaObj.getNumNis() != null && pessoaFisicaObj.getNumNis().equals(pessoaFisica.getNumNis())) {
						if (!campos.contains("NIS"))
							campos += " 'NIS' ";
					}
				}
			}
		}
		return campos;
	}

	@Transactional
	public void salvar(PessoaFisica pessoaFisica) {
		super.salvar(pessoaFisica);
	}

}