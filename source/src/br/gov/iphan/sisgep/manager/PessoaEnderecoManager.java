package br.gov.iphan.sisgep.manager;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.corp.PessoaEndereco;
import br.gov.iphan.sisgep.entity.corp.PessoaFisica;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade PessoaEndereco. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("pessoaEnderecoManager")
@AutoCreate
public class PessoaEnderecoManager extends BaseManagerImpl<PessoaEndereco> {
	
	/**
	 * Realiza a pesquisa de todos os Endereços de uma Pessoa.
	 * @return 	Lista de todos Endereços de uma Pessoa encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<PessoaEndereco> listarTodos(){
		return (List<PessoaEndereco>) listarTodos(PessoaEndereco.class);
	}
	
	/**
	 * Realiza a pesquisa para verificar a existêcia de registros de Endereços de Pessoa duplicados.
	 * @param pessoaEndereco 	Endereço que deseje verificar a existência.
	 * @return 					boolean para indicar a existência ou não de registros duplicados.
	 * @author 					Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public Boolean verificaDuplicidade(PessoaEndereco pessoaEndereco) {

		List<PessoaEndereco> pessoaEnderecos = new ArrayList<PessoaEndereco>();
		try{
			pessoaEnderecos = getEntityManager()
				.createNamedQuery("pessoaEndereco.verificarDuplicidade")
				.setParameter("codCep", pessoaEndereco.getCodCep())
				.setParameter("numEndereco", pessoaEndereco.getNumEndereco())
				.setParameter("id", pessoaEndereco.getPessoaFisica().getId())
				.getResultList();
			
			if(pessoaEnderecos.isEmpty()){
				return false;
			}
		}catch (NoResultException e) {
			return true;
		}
		return true;
	}
	
	/**
	 * Realiza a pesquisa de todos os Endereços de uma Pessoa.
	 * @param pessoaFisica	 Pessoa Física que deseje os endereços.
	 * @return 				 Lista de todos Endereços de uma Pessoa encontrados.
	 * @author 				 Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<PessoaEndereco> findByPessoa(PessoaFisica pessoaFisica) {

		return getEntityManager()
					.createNamedQuery("pessoaEndereco.findByPessoa")
					.setParameter("id", pessoaFisica.getId())
					.getResultList();
	}
	
}