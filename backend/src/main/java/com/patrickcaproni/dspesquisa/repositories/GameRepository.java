package com.patrickcaproni.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickcaproni.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
