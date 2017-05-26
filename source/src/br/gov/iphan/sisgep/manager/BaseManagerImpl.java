package br.gov.iphan.sisgep.manager;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.hibernate.validator.InvalidValue;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import br.gov.iphan.sisgep.anotation.Orderby;
import br.gov.iphan.sisgep.entity.EntidadeBase;
import br.gov.iphan.sisgep.manager.interf.BaseManger;
import br.gov.iphan.sisgep.util.CampoVazio;

/**
 * Manager que implenta a Interface BaseManger. Esta Manager é responsável por
 * implemtar a maior parte da transações entre o banco de dados e a aplicação.
 * 
 * @author Thiago Nunes Vieira
 *
 */
@Name("baseManager")
public class BaseManagerImpl<T> implements BaseManger<T> {

	@In
	private EntityManager entityManager;

	/**
	 * Metodo genérico responsável por consultar e listar todos os registros de
	 * qualquer entidade que extenda a classe EntidadeBase.
	 * 
	 * @param Class
	 *            Qualquer classe que extenda a EntidadeBase
	 * @return List com todos os registros da Entidade passada como parametro.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("rawtypes")
	public List listarTodos(Class<? extends EntidadeBase> kClass) {

		Orderby ordenacaoDesejada = kClass.getAnnotation(Orderby.class);
		String orderBY = ordenacaoDesejada == null ? " " : " order by " + ordenacaoDesejada.ordenacao();

		return entityManager.createQuery(" FROM " + kClass.getSimpleName() + orderBY).getResultList();
	}

	@SuppressWarnings("rawtypes")
	public List listarTodosDistinct(Class<? extends EntidadeBase> kClass) {

		Orderby ordenacaoDesejada = kClass.getAnnotation(Orderby.class);
		String orderBY = ordenacaoDesejada == null ? " " : " order by " + ordenacaoDesejada.ordenacao();

		return entityManager.createQuery(" count(distinct) FROM " + kClass.getSimpleName() + orderBY).getResultList();
	}

	/**
	 * Metodo genérico responsável por consultar e listar todos os registros
	 * ativos de qualquer entidade que extenda a classe EntidadeBase.
	 * 
	 * @param Class
	 *            Qualquer classe que extenda a EntidadeBase
	 * @return List com todos os registros ativos da Entidade passada como
	 *         parametro.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("rawtypes")
	public List listarTodosAtivos(Class<? extends EntidadeBase> kClass) {
		Orderby ordenacaoDesejada = kClass.getAnnotation(Orderby.class);
		String orderBY = ordenacaoDesejada == null ? " " : " order by " + ordenacaoDesejada.ordenacao();

		return entityManager.createQuery(" FROM " + kClass.getSimpleName() + " a where a.ativo = 1 " + orderBY).getResultList();
	}

	/**
	 * Metodo genérico responsável por retrona o registro com seu indetificador
	 * correspondente para qualquer entidade que extenda a classe EntidadeBase.
	 * 
	 * @param Class
	 *            Qualquer classe que extenda a EntidadeBase
	 * @param id
	 *            Long corresponde ao indenticador da entidade
	 * @return EntidadeBase que atenda os critérios da consulta
	 * @author Thiago Nunes Vieira
	 **/
	public EntidadeBase recuperarPorId(Class<? extends EntidadeBase> kClass, Long id) {
		return entityManager.find(kClass, id);

	}

	/**
	 * Metodo responsável concluir e finalizar todas as trasanções realizadas.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void flush() {
		entityManager.flush();
	}

	/**
	 * Metodo responsável por auxiliar na preparação das query's.
	 * 
	 * @param campo
	 *            Coluna/Campo da consulta
	 * @param valor
	 *            Valor da coluna/campo correspondente
	 * @return Object com o valor correspondente a query dividamente
	 *         padronizada.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("rawtypes")
	private Object executaMetodo(String campo, Object valor) {
		try {

			String nome = (String) campo.substring(0, 1).toUpperCase() + campo.substring(1);

			Class[] params = new Class[0];
			Class<? extends Object> cls = valor.getClass();

			Method meth = cls.getMethod("get" + nome, params);

			return meth.invoke(valor, params);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Metodo genérico responsável por indica a existencia de registro com
	 * campos iguais, correspondente para qualquer entidade que extenda a classe
	 * EntidadeBase.
	 * 
	 * @param Class
	 *            Qualquer classe que extenda a EntidadeBase
	 * @param campo
	 *            Nome do campo que deseja realizar a comparação
	 * @param valor
	 *            Valor do campos que deseja realizar a comparação
	 * @return boolean pra indica a existência de registros iguais
	 * @author Thiago Nunes Vieira
	 **/
	public boolean validaRegistrosIguais(Class<? extends EntidadeBase> kClass, String campo, Object valor) {

		Long id = (Long) executaMetodo("id", valor);

		List<?> list = getEntityManager().createQuery(" FROM " + kClass.getSimpleName() + " a  WHERE a." + campo + " = :campo")
				.setParameter("campo", executaMetodo(campo, valor)).getResultList();
		Long valorId;
		if (!list.isEmpty()) {
			valorId = (Long) executaMetodo("id", list.get(0));
		} else {
			valorId = null;
		}

		if (list.isEmpty())
			return true;
		else if (id == null)
			return false;
		else if (id != null && !id.equals(valorId))
			return false;
		else
			return true;

	}

	/**
	 * Metodo genérico responsável por retorna registro com campos iguais,
	 * correspondente para qualquer entidade que extenda a classe EntidadeBase.
	 * 
	 * @param Class
	 *            Qualquer classe que extenda a EntidadeBase
	 * @param campo
	 *            Nome do campo que deseja realizar a comparação
	 * @param valor
	 *            Valor do campos que deseja realizar a comparação
	 * @return Object corresponde as critéios da consulta
	 * @author Thiago Nunes Vieira
	 **/
	public Object getRegistroExistente(Class<? extends EntidadeBase> kClass, String campo, Object valor) {

		Long id = (Long) executaMetodo("id", valor);

		List<?> list = getEntityManager().createQuery(" FROM " + kClass.getSimpleName() + " a  WHERE a." + campo + " = :campo")
				.setParameter("campo", executaMetodo(campo, valor)).getResultList();
		Long valorId;
		if (!list.isEmpty()) {
			valorId = (Long) executaMetodo("id", list.get(0));
		} else {
			valorId = null;
		}

		if (list.isEmpty())
			return null;
		else if (id != null && id.equals(valorId))
			return null;
		return list.get(0);
	}

	/**
	 * Metodo responsável por garantir a comunicação de todas as trasanções
	 * realizadas.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void refresh(EntidadeBase entity) {
		entityManager.refresh(entity);
	}

	/**
	 * Metodo responsável por realizar todas as trasanções de INSERT e UPDATE da
	 * aplicação.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public T salvar(EntidadeBase entity) {
		try {
			// if (entityManager.contains(entity)) {
			// entityManager.merge(entity);
			// } else {
			// entityManager.persist(entity);
			// }

			if (entity.getId() != null) {
				entityManager.merge(entity);
			} else {
				entityManager.persist(entity);
			}
			flush();
			return (T) entity;
		} catch (PersistenceException e) {
			throw e;
		} catch (org.hibernate.validator.InvalidStateException e) {
			InvalidValue[] invalidValues = e.getInvalidValues();
			for (InvalidValue invalidValue : invalidValues) {
				System.out.println("Valor #0 inválido para  #1" + invalidValue.getPropertyName() + " " + invalidValue.getValue());
			}
			throw (e);
		}

	}

	public void persistir(EntidadeBase entity) {
		try {
			entityManager.persist(entity);
			flush();
		} catch (PersistenceException e) {
			throw e;
		} catch (org.hibernate.validator.InvalidStateException e) {
			InvalidValue[] invalidValues = e.getInvalidValues();
			for (InvalidValue invalidValue : invalidValues) {
				System.out.println("Valor #0 inválido para  #1" + invalidValue.getPropertyName() + " " + invalidValue.getValue());
			}
			throw (e);
		}

	}

	/**
	 * Metodo responsável por realizar todas as trasanções de DELETE da
	 * aplicação.
	 * 
	 * @author Thiago Nunes Vieira
	 **/
	public void excluir(EntidadeBase entity) {
		try {
			entityManager.remove(entity);
			flush();
		} catch (PersistenceException e) {
			throw e;
		}
	}

	/**
	 * Metodo responsável por intânciar a conexão entre a aplicação e o banco.
	 * 
	 * @return EntityManager entidade responsável por administrar do as
	 *         transações da aplicação
	 * @author Thiago Nunes Vieira
	 **/
	public EntityManager getEntityManager() {
		if (entityManager == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("sisgep");
			entityManager = emf.createEntityManager();
		}
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * Metodo genérico responsável por consultar e listar todos os registros de
	 * acordo com a consulta informada, para todas entidades que extenda a
	 * classe EntidadeBase.
	 * 
	 * @param Class
	 *            Qualquer classe que extenda a EntidadeBas
	 * @param query
	 *            Lista contendo todos os parametros da consulta a ser realizada
	 * @return List com todos os registros que atenda a consulta.
	 * @author Thiago Nunes Vieira
	 **/
	public List<T> obtemLista(Class<? extends EntidadeBase> kClass, List<String> query) {
		EntityQuery<T> entityQuery = new EntityQuery<T>();
		entityQuery.setEntityManager(getEntityManager());
		entityQuery.setEjbql(" FROM " + kClass.getSimpleName() + " k ");
		entityQuery.setRestrictionExpressionStrings(query);
		Orderby ordenacaoDesejada = kClass.getAnnotation(Orderby.class);
		if (ordenacaoDesejada != null && !CampoVazio.isVazio(ordenacaoDesejada.ordenacao())) {
			entityQuery.setOrder(ordenacaoDesejada.ordenacao());
		}
		List<T> list = entityQuery.getResultList();
		return list;
	}

	/**
	 * Metodo genérico responsável por consultar e listar todos os registros de
	 * acordo com a consulta informada, para todas entidades que extenda a
	 * classe EntidadeBase.
	 * 
	 * @param Class
	 *            Qualquer classe que extenda a EntidadeBas
	 * @param query
	 *            Lista contendo todos os parametros da consulta a ser realizada
	 * @param operadorLogico
	 *            Operador logico que é utilizado na consulta
	 * @return List com todos os registros que atenda a consulta.
	 * @author Thiago Nunes Vieira
	 **/
	public List<T> obtemLista(Class<? extends EntidadeBase> kClass, List<String> query, String operadorLogico) {
		EntityQuery<T> entityQuery = new EntityQuery<T>();
		entityQuery.setEntityManager(getEntityManager());
		entityQuery.setEjbql(" FROM " + kClass.getSimpleName());
		entityQuery.setRestrictionLogicOperator(operadorLogico);
		entityQuery.setRestrictionExpressionStrings(query);
		Orderby ordenacaoDesejada = kClass.getAnnotation(Orderby.class);
		if (ordenacaoDesejada != null && !CampoVazio.isVazio(ordenacaoDesejada.ordenacao())) {
			entityQuery.setOrder(ordenacaoDesejada.ordenacao());
		}
		List<T> list = entityQuery.getResultList();
		return list;
	}
}
