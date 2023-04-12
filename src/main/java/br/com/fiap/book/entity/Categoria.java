package br.com.fiap.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CATEGORIA")
@SequenceGenerator(name="categoria", sequenceName = "SQ_T_CATEGORIA", allocationSize = 1)
public class Categoria {

	@Id
	@Column(name="id_categoria")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria")
	private Long id;
	
	@Column(name="ds_titulo", length = 100, nullable = false)
	private String titulo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Categoria(Long id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}
	
	public Categoria() {}
}
