package br.com.fiap.book.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.fiap.book.entity.Contato;

public class ContatoDao extends GenericDao<Contato> {

	public ContatoDao(EntityManager em) {
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
