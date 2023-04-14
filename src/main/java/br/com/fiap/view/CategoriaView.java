package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.book.dao.CategoriaDao;
import br.com.fiap.book.dao.impl.CategoriaDaoImpl;
import br.com.fiap.book.entities.Categoria;
import br.com.fiap.book.exceptions.CommitException;
import br.com.fiap.book.exceptions.IdNaoEncontradoException;
import br.com.fiap.book.singleton.EntityManagerFactorySingleton;

public class CategoriaView {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		CategoriaDao dao = new CategoriaDaoImpl(em);

		Categoria categoria = new Categoria("Programação");

		try {
			Categoria categoriaCriado = dao.create(categoria);
			dao.commit();
			System.out.println("Categoria criada com ID: " + categoriaCriado.getId());
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}

		try {
			Categoria categoria2 = dao.findById(1L);
			System.out.println("Categoria com ID 1: " + categoria2.getTitulo());
		} catch (IdNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}

		try {
			dao.delete(1L);
			dao.commit();
			System.out.println("Categoria removida");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}

}
