package br.gov.iphan.sisgep.manager;
import java.util.ArrayList;
import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.corp.PessoaContato;
import br.gov.iphan.sisgep.entity.corp.PessoaFisica;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade PessoaContato. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("pessoaContatoManager")
@AutoCreate
public class PessoaContatoManager extends BaseManagerImpl<PessoaContato> {
	
	/**
	 * Realiza a pesquisa de todos os Contatos de uma Pessoa.
	 * @return 	Lista de todos Contatos de uma Pessoa encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<PessoaContato> listarTodos(){
		return (List<PessoaContato>) listarTodos(PessoaContato.class);
	}
	
	/**
	 * Realiza a pesquisa para verificar a existêcia de registros de Contatos de Pessoa duplicados.
	 * @return 	boolean para indicar a existência ou não de registros duplicados.
	 * @author 	Thiago Nunes Vieira
	 */
	public boolean verificaDuplicidade(){
		List<String> query = new ArrayList<String>();
		
		query.add(" id != #{pessoaContato.id}");
		query.add(" pessoaFisica.id = #{pessoaFisica.id}");
		query.add(" indContato = #{pessoaContato.indContato}");
		query.add(" txtContato = #{pessoaContato.txtContato}");
		query.add(" numDdd = #{pessoaContatoTemp.numDdd}");
		
		if(obtemLista(PessoaContato.class, query).size() > 0) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * Realiza a pesquisa de todos os Contatos de uma Pessoa.
	 * @param pessoaFisica	 Pessoa Física que deseje os contatos
	 * @return 				 Lista de todos Contatos de uma Pessoa encontrados.
	 * @author 				 Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<PessoaContato> findByPessoa(PessoaFisica pessoaFisica) {

		return getEntityManager()
					.createNamedQuery("pessoaContato.findByPessoa")
					.setParameter("id", pessoaFisica.getId())
					.getResultList();
	}
	
}