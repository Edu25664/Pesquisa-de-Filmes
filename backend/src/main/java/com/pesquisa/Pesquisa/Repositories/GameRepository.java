package com.pesquisa.Pesquisa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pesquisa.Pesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
