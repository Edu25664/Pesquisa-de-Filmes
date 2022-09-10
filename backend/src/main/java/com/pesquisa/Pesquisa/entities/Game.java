package com.pesquisa.Pesquisa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Game implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String title;
	private Platform platform;
	
	private Genre genre;
	
	private List<Record> records = new ArrayList<>();
	

	public Game() {
		
	}

	public Game(long id, String title, Platform platform) {
		super();
		this.id = id;
		this.title = title;
		this.platform = platform;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public List<Record> getRecords() {
		return records;
	}

}
