package br.com.fiap.book.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_AUTOR")
@SequenceGenerator(name="autor", sequenceName = "SQ_T_AUTOR", allocationSize = 1)
public class Autor {

	@Id
	@Column(name="id_autor")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autor")
	private Long id;
	
	@Column(name="ds_titulo", length = 100, nullable = false)
	private String titulo;
	
	// relacionamento livros
	
	// relacionamento contato

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

	public Autor(Long id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}
	
	public Autor() {}
}
