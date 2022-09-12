package com.pesquisa.Pesquisa.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pesquisa.Pesquisa.DTO.RecordDTO;
import com.pesquisa.Pesquisa.DTO.RecordInsertDTO;
import com.pesquisa.Pesquisa.Services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordControllers {

	@Autowired
	private RecordService service;
	
	@PostMapping
	public ResponseEntity<RecordDTO> insert( @RequestBody RecordInsertDTO dto){
		RecordDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
 
	}
}
