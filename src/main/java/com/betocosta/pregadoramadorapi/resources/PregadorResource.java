package com.betocosta.pregadoramadorapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.betocosta.pregadoramadorapi.domain.Pregador;
import com.betocosta.pregadoramadorapi.services.PregadorService;

@RestController
@RequestMapping(value = "/pregadores")
public class PregadorResource {
	
	
	
	@Autowired
	private PregadorService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Pregador obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);	        
		
	
		
	}

}
