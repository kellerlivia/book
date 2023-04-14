package br.com.fiap.book.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.book.dao.CategoriaDao;
import br.com.fiap.book.entities.Categoria;

public class CategoriaDaoImpl extends GenericDaoImpl<Categoria, Long> implements CategoriaDao {

	public CategoriaDaoImpl(EntityManager em) {
		super(em);
	}

}
