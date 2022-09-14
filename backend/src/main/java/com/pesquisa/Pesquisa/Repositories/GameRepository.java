package com.pesquisa.Pesquisa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pesquisa.Pesquisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

	

}
