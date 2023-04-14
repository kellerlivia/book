package br.com.fiap.book.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.book.dao.AutorDao;
import br.com.fiap.book.entities.Autor;

public class AutorDaoImpl extends GenericDaoImpl<Autor, Long> implements AutorDao {

	public AutorDaoImpl(EntityManager em) {
		super(em);
	}

}
