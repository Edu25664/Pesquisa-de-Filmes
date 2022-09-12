package com.pesquisa.Pesquisa.Services;
 

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pesquisa.Pesquisa.entities.Game;
import com.pesquisa.Pesquisa.entities.Record;
import com.pesquisa.Pesquisa.DTO.RecordDTO;
import com.pesquisa.Pesquisa.DTO.RecordInsertDTO;
import com.pesquisa.Pesquisa.Repositories.GameRepository;
import com.pesquisa.Pesquisa.Repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto){
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		 entity = recordRepository.save(entity);
		 return new RecordDTO(entity);
		
	    
	}

} 
