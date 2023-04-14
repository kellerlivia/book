package br.com.fiap.book.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_LIVRO")
@SequenceGenerator(name="livro", sequenceName = "SQ_T_LIVRO", allocationSize = 1)
public class Livro {

	@Id
	@Column(name="id_livro")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "livro")
	private Long id;
	
	@Column(name="qtd_pagina", nullable = false, precision = 9)
	private Integer quantidadePaginas;
	
	@Column(name="ds_titulo", length = 100, nullable = false)
	private String titulo;
    
	@Column(name="ds_avaliacao", precision = 1)
    private Integer avaliacao;
    
	@Column(name="ds_status", nullable = false, precision = 9, scale = 2)
    private Double status;
    
	@Column(name="pg_atual", precision = 9, nullable = false)
    private Integer paginaAtual;
	
	// relacionamento autor
	
	// relacionamento categoria

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(Integer quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Double getStatus() {
		return status;
	}

	public void setStatus(Double status) {
		this.status = status;
	}

	public Integer getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(Integer paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public Livro(Long id, Integer quantidadePaginas, String titulo, Integer avaliacao, Double status,
			Integer paginaAtual) {
		super();
		this.id = id;
		this.quantidadePaginas = quantidadePaginas;
		this.titulo = titulo;
		this.avaliacao = avaliacao;
		this.status = status;
		this.paginaAtual = paginaAtual;
	}
	
	public Livro() {}
}
