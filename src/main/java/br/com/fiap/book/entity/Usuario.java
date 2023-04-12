package br.com.fiap.book.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_USUARIO")
@SequenceGenerator(name="usuario", sequenceName = "SQ_T_USUARIO", allocationSize = 1)
public class Usuario {

	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
	private Long id;
	
	@Column(name="nm_usuario", length = 100, nullable = false)
	private String nome;
	
	@Column(name="ds_email", length = 150, nullable = false)
	private String email;
	
	@Column(name="ds_senha", length = 100, nullable = false)
	private String senha;
	
	@Column(name="nr_meta", precision = 9)
	private Integer meta;
	
	@Column(name="dt_cadastro")
	private LocalDate dataCadastro;
	
	// relacionamento livros

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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Integer getMeta() {
		return meta;
	}
	public void setMeta(Integer meta) {
		this.meta = meta;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Usuario(Long id, String nome, String email, String senha, Integer meta, LocalDate dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.meta = meta;
		this.dataCadastro = dataCadastro;
	}
	public Usuario() {}
}

