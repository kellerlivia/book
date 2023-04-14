package br.com.fiap.book.dao;

import br.com.fiap.book.exceptions.CommitException;
import br.com.fiap.book.exceptions.IdNaoEncontradoException;

public interface GenericDao<T, K> {
	
	T create(T entity);

	void delete(K id) throws IdNaoEncontradoException;
	
	T findById(K id) throws IdNaoEncontradoException;
	
	void commit() throws CommitException;
	
}
