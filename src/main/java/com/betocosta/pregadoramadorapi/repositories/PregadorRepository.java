package com.betocosta.pregadoramadorapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betocosta.pregadoramadorapi.domain.Pregador;

@Repository
public interface PregadorRepository extends JpaRepository<Pregador, Integer>{

}
