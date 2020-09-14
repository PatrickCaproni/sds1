package com.patrickcaproni.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickcaproni.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
