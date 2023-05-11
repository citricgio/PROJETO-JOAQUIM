package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.ContaBancaria;
import com.example.demo.services.ContaBancariaService;

@RestController
@RequestMapping(value="/contas")
public class ContaBancariaController {
	
	@Autowired
	private ContaBancariaService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<ContaBancaria> findById(@PathVariable String id){
		ContaBancaria conta = service.findById(id);
		return ResponseEntity.ok().body(conta);
	}
	
}
