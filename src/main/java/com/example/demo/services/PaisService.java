package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.domain.Pais;
import com.example.demo.repository.PaisRepository;

@Service
public class PaisService {
	
	@Autowired
	private PaisRepository repo;
	
	public List<Pais> findAll(){
		return repo.findAll();
	}

}
