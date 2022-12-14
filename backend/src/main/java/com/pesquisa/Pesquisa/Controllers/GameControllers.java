package com.pesquisa.Pesquisa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pesquisa.Pesquisa.DTO.GameDTO;
import com.pesquisa.Pesquisa.Services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameControllers {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll() {
		
		List<GameDTO> list = gameService.findAll();
		
		return ResponseEntity.ok().body(list);
 
	}
}
