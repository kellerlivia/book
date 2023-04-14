package br.com.fiap.book.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	private static EntityManagerFactory unico;

	private EntityManagerFactorySingleton() {}

	public static EntityManagerFactory getInstance() {
		if (unico == null)
			unico = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		return unico;
	}

}