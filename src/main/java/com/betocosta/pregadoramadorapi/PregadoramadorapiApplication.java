package com.betocosta.pregadoramadorapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.betocosta.pregadoramadorapi.domain.Pregador;
import com.betocosta.pregadoramadorapi.repositories.PregadorRepository;

@SpringBootApplication
public class PregadoramadorapiApplication implements CommandLineRunner {

	@Autowired
	private PregadorRepository pregadorRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PregadoramadorapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pregador preg1 = new Pregador(null, "Napoleão Falcão");
		Pregador preg2 = new Pregador(null, "Gilmas Santos");

		pregadorRepository.saveAll(Arrays.asList(preg1, preg2));
		
	}

}
