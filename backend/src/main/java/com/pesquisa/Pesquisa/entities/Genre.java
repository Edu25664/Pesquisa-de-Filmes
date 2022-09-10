package com.pesquisa.Pesquisa.entities;

import java.io.Serializable;
import java.util.Objects;

public class Genre implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String Nome;

	public Genre() {

	}

	public Genre(long id, String nome) {
		super();
		this.id = id;
		Nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
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
		Genre other = (Genre) obj;
		return id == other.id;
	}

}
