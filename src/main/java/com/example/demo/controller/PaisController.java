package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Pais;
import com.example.demo.services.PaisService;

@RestController
@RequestMapping(value="/paises")
public class PaisController {
	
	
	@Autowired
	private PaisService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Pais>> findAll(){
		List<Pais> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}
