package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.book.dao.LivroDao;
import br.com.fiap.book.dao.impl.LivroDaoImpl;
import br.com.fiap.book.entities.Livro;
import br.com.fiap.book.exceptions.CommitException;
import br.com.fiap.book.exceptions.IdNaoEncontradoException;
import br.com.fiap.book.singleton.EntityManagerFactorySingleton;

public class LivroView {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		LivroDao dao = new LivroDaoImpl(em);

		Livro livro = new Livro(260, "Domain Driven Design", 5, 130);

		try {
			Livro livroCriado = dao.create(livro);
			dao.commit();
			System.out.println("Livro criado com ID: " + livroCriado.getId());
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Livro livro2 = dao.findById(3L);
			System.out.println("Livro com ID 3: " + livro2.getTitulo());
			System.out.println("Status: " + livro2.getStatus());
		} catch (IdNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}

		try {
			dao.delete(1L);
			dao.commit();
			System.out.println("Livro removido");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
