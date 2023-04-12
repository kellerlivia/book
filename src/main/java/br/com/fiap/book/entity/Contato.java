package br.com.fiap.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CONTATO")
@SequenceGenerator(name="contato", sequenceName = "SQ_T_CONTATO", allocationSize = 1)
public class Contato {

	@Id
	@Column(name="id_contato")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contato")
	private Long id;
	
	@Column(name="ds_email", length = 150, nullable = false)
	private String email;
	
	@Column(name="nr_telefone", precision = 11, nullable = false)
	private Integer telefone;
	
	// relacionamento autor

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Contato(Long id, String email, Integer telefone) {
		super();
		this.id = id;
		this.email = email;
		this.telefone = telefone;
	}

	public Contato() {}
}

