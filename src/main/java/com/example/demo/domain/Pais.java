package com.example.demo.domain;

import java.io.Serializable;
import java.util.Objects;

public class Pais implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nome;
	private String continente;
	private long populacao;
	
	public Pais(long id, String nome, String continente, long populacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.continente = continente;
		this.populacao = populacao;
	}

	public Pais() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return id == other.id;
	}	
}
