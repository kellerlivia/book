package br.com.fiap.book.dao.impl;

import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;

import br.com.fiap.book.dao.GenericDao;
import br.com.fiap.book.exceptions.CommitException;
import br.com.fiap.book.exceptions.IdNaoEncontradoException;

public class GenericDaoImpl<T, K> implements GenericDao<T, K> {

    protected EntityManager em;
    
    private Class<T> entityClass;

    @SuppressWarnings("all")
    public GenericDaoImpl(EntityManager em) {
        this.em = em;
		this.entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public T create(T entity) {
    	return em.merge(entity);
    }

    public T findById(K id) throws IdNaoEncontradoException {
		T t = em.find(entityClass, id);
		if (t == null)
			throw new IdNaoEncontradoException("Entidade não encontrada");
		return t;
    }

    public void delete(K id) throws IdNaoEncontradoException {
    	T entity = findById(id);
		em.remove(entity);
    }

	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getStackTrace();
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}
	
}
