package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.book.dao.AutorDao;
import br.com.fiap.book.dao.impl.AutorDaoImpl;
import br.com.fiap.book.entities.Autor;
import br.com.fiap.book.exceptions.CommitException;
import br.com.fiap.book.exceptions.IdNaoEncontradoException;
import br.com.fiap.book.singleton.EntityManagerFactorySingleton;

public class AutorView {
	
	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		AutorDao dao = new AutorDaoImpl(em);

		Autor autor = new Autor("Thiago");

		try {
			Autor autorCriado = dao.create(autor);
			dao.commit();
			System.out.println("Autor criado com ID: " + autorCriado.getId());
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}

		try {
			Autor autor2 = dao.findById(1L);
			System.out.println("Autor com ID 1: " + autor2.getNome());
		} catch (IdNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}

		try {
			dao.delete(1L);
			dao.commit();
			System.out.println("Autor removido");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
