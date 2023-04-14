package br.com.fiap.book.dao.impl;
import javax.persistence.EntityManager;

import br.com.fiap.book.dao.UsuarioDao;
import br.com.fiap.book.entities.Usuario;

public class UsuarioDaoImpl extends GenericDaoImpl<Usuario, Long> implements UsuarioDao {

    public UsuarioDaoImpl(EntityManager em) {
		super(em);
	}
    
}
