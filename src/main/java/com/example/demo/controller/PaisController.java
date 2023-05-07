package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Pais;

@RestController
@RequestMapping(value="/paises")
public class PaisController {
	
	@GetMapping("/paises")
	public ResponseEntity<List<Pais>> findAll(){
		Pais brasil = new Pais(1, "Brasil", "América do Sul", 10000);
		List<Pais> list = new ArrayList<>();
		list.addAll(Arrays.asList(brasil));
		return ResponseEntity.ok().body(list);
	}
}
