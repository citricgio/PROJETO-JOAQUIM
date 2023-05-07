package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Pais;
import com.example.demo.repository.PaisRepository;
import com.example.demo.services.exception.ObjectNotFoundException;

@Service
public class PaisService {
	
	@Autowired
	private PaisRepository repo;
	
	public List<Pais> findAll(){
		return repo.findAll();
	}
	
	public Optional<Pais> findById(String id) {
		Optional<Pais> pais = repo.findById(id);
		return Optional.ofNullable(pais.orElseThrow(() -> new ObjectNotFoundException("País não encontrado")));
	}

}
