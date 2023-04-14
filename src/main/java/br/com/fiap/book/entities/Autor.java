package br.com.fiap.book.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_AUTOR")
@SequenceGenerator(name = "autor", sequenceName = "SQ_T_AUTOR", allocationSize = 1)
public class Autor {

	@Id
	@Column(name = "id_autor")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autor")
	private Long id;

	@Column(name = "ds_nome", length = 100, nullable = false)
	private String nome;

	// relacionamento livros

	// relacionamento contato

	public Autor(String nome) {
		this.nome = nome;
	}

	public Autor() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
