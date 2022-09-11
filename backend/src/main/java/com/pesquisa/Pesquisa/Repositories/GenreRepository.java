package com.pesquisa.Pesquisa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pesquisa.Pesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
