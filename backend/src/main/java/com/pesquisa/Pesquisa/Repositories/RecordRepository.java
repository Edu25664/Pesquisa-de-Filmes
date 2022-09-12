package com.pesquisa.Pesquisa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pesquisa.Pesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}
