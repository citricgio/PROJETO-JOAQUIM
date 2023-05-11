package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domain.ContaBancaria;
import com.example.demo.domain.Pais;
import com.example.demo.repository.ContaBancariaRepository;
import com.example.demo.repository.PaisRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private PaisRepository paisRepository;
	
	@Autowired
	private ContaBancariaRepository contaRepository;
		
	@Override
	public void run(String... args) throws Exception {
		
		paisRepository.deleteAll();
		contaRepository.deleteAll();
		
		Pais brasil = new Pais(null, "Brasil", "América do Sul", "10000");
		Pais chile = new Pais(null, "Chile", "América do Sul", "1500");
		Pais mexico = new Pais(null, "México", "América Central", "39123");
			
		ContaBancaria conta1 = new ContaBancaria(null, "Agenor Vieira", "100.000", "101", brasil);
		ContaBancaria conta2 = new ContaBancaria(null, "Giovanna Micher", "100.000.000.000", "102", brasil);

		paisRepository.saveAll(Arrays.asList(brasil, chile, mexico));
		contaRepository.saveAll(Arrays.asList(conta1, conta2));

	}
}
