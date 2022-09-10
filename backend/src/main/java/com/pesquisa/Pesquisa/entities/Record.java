package com.pesquisa.Pesquisa.entities;

import java.util.Objects;

public class Record {

	private long id;
	private String nome;
	private Integer age;
	private String moment;
	
	public Record() {
		
	}

	public Record(long id, String nome, Integer age, String moment) {
		super();
		this.id = id;
		this.nome = nome;
		this.age = age;
		this.moment = moment;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMoment() {
		return moment;
	}

	public void setMoment(String moment) {
		this.moment = moment;
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
		Record other = (Record) obj;
		return id == other.id;
	}
	
	

}
