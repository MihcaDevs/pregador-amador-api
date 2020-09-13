package com.betocosta.pregadoramadorapi.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.betocosta.pregadoramadorapi.domain.Pregador;

@RestController
@RequestMapping(value = "/categorias")
public class PregadorResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Pregador> listar() {
		
		Pregador preg1 = new Pregador(1, "Abilio Santana");
		Pregador preg2 = new Pregador(1, "Marco Feliciano");
		
		List<Pregador> lista = new ArrayList<>();
		lista.add(preg1);
		lista.add(preg2);
		
		return lista;
	}

}
