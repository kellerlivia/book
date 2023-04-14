package br.com.fiap.view;
import java.time.LocalDate;

import javax.persistence.EntityManager;

import br.com.fiap.book.dao.UsuarioDao;
import br.com.fiap.book.dao.impl.UsuarioDaoImpl;
import br.com.fiap.book.entities.Usuario;
import br.com.fiap.book.exceptions.CommitException;
import br.com.fiap.book.exceptions.IdNaoEncontradoException;
import br.com.fiap.book.singleton.EntityManagerFactorySingleton;

public class UsuarioView {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		UsuarioDao dao = new UsuarioDaoImpl(em);

		Usuario usuario = new Usuario("Jo�o Carlos", "joaocarlos@email.com", "senha123", 25, LocalDate.now());

		try {
			Usuario usuarioCriado = dao.create(usuario);
			dao.commit();
			System.out.println("Usu�rio criado com ID: " + usuarioCriado.getId());
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}

		try {
			Usuario usuario2 = dao.findById(1L);
			System.out.println("Usu�rio com ID 1: " + usuario2.getNome());
		} catch (IdNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}

		try {
			dao.delete(1L);
			dao.commit();
			System.out.println("Usu�rio removido");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
