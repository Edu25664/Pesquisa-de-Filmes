package com.pesquisa.Pesquisa.Services;
 

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pesquisa.Pesquisa.DTO.RecordDTO;
import com.pesquisa.Pesquisa.DTO.RecordInsertDTO;
import com.pesquisa.Pesquisa.Repositories.GameRepository;
import com.pesquisa.Pesquisa.Repositories.RecordRepository;
import com.pesquisa.Pesquisa.entities.Game;
import com.pesquisa.Pesquisa.entities.Record;

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
		
		@SuppressWarnings("deprecation")
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		 entity = recordRepository.save(entity);
		 return new RecordDTO(entity);
	    
	}

	@Transactional
	public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
	
		return recordRepository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
	}

} 
