package br.com.fiap.book.dao;

import br.com.fiap.book.entity.Autor;

public class AutorDAO extends GenericDAO<Autor, Long> {
    
    public AutorDAO() {
        super(Autor.class);
    }
    
}
