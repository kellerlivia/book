package br.com.fiap.book.dao;

import br.com.fiap.book.entity.Categoria;

public class CategoriaDAO extends GenericDAO<Categoria, Long> {
    
    public CategoriaDAO() {
        super(Categoria.class);
    }
    
}
