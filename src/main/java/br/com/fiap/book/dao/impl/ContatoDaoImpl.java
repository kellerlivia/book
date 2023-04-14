package br.com.fiap.book.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.fiap.book.dao.ContatoDao;
import br.com.fiap.book.entities.Contato;

public class ContatoDaoImpl extends GenericDaoImpl<Contato, Long> implements ContatoDao {

	public ContatoDaoImpl(EntityManager em) {
		super(em);
	}

	public Contato buscarPorEmail(String email) {
		TypedQuery<Contato> query = em.createQuery("SELECT c FROM Contato c WHERE c.email = :email", Contato.class);
		query.setParameter("email", email);
		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
