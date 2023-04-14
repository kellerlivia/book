package br.com.fiap.book.dao.impl;
import javax.persistence.EntityManager;

import br.com.fiap.book.dao.LivroDao;
import br.com.fiap.book.entities.Livro;

public class LivroDaoImpl extends GenericDaoImpl<Livro, Long> implements LivroDao {

    public LivroDaoImpl(EntityManager em) {
		super(em);
	}

}
