package com.pesquisa.Pesquisa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pesquisa.Pesquisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
