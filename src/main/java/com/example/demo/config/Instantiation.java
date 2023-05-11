package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domain.Pais;
import com.example.demo.repository.PaisRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private PaisRepository paisRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		paisRepository.deleteAll();
		
		Pais brasil = new Pais(null, "Brasil", "América do Sul", "10000");
		Pais chile = new Pais(null, "Chile", "América do Sul", "1500");
		Pais mexico = new Pais(null, "México", "América Central", "39123");
				
		paisRepository.saveAll(Arrays.asList(brasil, chile, mexico));
	}
}
