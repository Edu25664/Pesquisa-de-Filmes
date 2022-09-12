package com.pesquisa.Pesquisa.Services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesquisa.Pesquisa.DTO.GameDTO;
import com.pesquisa.Pesquisa.Repositories.GameRepository;
import com.pesquisa.Pesquisa.entities.Game;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public List<GameDTO> findAll(){
		List<Game> dto = gameRepository.findAll();
		return dto.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	    
	}
}
