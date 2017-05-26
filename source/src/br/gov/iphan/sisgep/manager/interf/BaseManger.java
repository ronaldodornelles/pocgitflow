package br.gov.iphan.sisgep.manager.interf;

import java.util.List;

import br.gov.iphan.sisgep.entity.EntidadeBase;

/**
 * Interface responsável por padronização as transações mais utilizadas da aplicação.
 * @author Thiago Nunes Vieira
 *
 */
public interface BaseManger<T> {

	@SuppressWarnings("rawtypes")
	List listarTodos(Class<?extends EntidadeBase> kClass);

	EntidadeBase recuperarPorId(Class<?extends EntidadeBase> kClass, Long id);

	void flush();

	T salvar(EntidadeBase entity);

	void excluir(EntidadeBase entity);
	
	List<T>  obtemLista(
			Class<? extends EntidadeBase> kClass, List<String> query);

}
