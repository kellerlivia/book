package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.book.dao.ContatoDao;
import br.com.fiap.book.dao.impl.ContatoDaoImpl;
import br.com.fiap.book.entities.Contato;
import br.com.fiap.book.exceptions.CommitException;
import br.com.fiap.book.exceptions.IdNaoEncontradoException;
import br.com.fiap.book.singleton.EntityManagerFactorySingleton;

public class ContatoView {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		ContatoDao dao = new ContatoDaoImpl(em);

		Contato contato = new Contato("thiago@email.com", "yamamotoouu");

		try {
			Contato contatoCriado = dao.create(contato);
			dao.commit();
			System.out.println("Contato criado com ID: " + contatoCriado.getId());
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}

		try {
			Contato contato2 = dao.findById(1L);
			System.out.println("Contato com ID 1: " + contato2.getEmail());
		} catch (IdNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}

		try {
			dao.delete(1L);
			dao.commit();
			System.out.println("Contato removido");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
