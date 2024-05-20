package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ RequestMapping("/ola-mundo")
public class HelloWorldController {
	
	@GetMapping
	public String ola() {
		return "Hello World!";
	}
	
	@GetMapping("bsm")
	public String comidasFavoritas() {
		return "BSM Generation - Competências comportamentais:\n"
				+ "1 - Comunicação\n"
				+ "2 - Proatividade\n"
				+ "3 - Orientação ao detalhe\n"
				+ "4 - Trabalho em equipe\n\n"
				+ "Mentalidades:\n"
				+ "1 - Responsabilidade Pessoal\n"
				+ "2 - Mentalidade de Crescimento\n"
				+ "3 - Orientação ao Futuro\n"
				+ "4 - Persistencia\n";
			
	}
	
	@GetMapping("objetivos")
	public String objetivos() {
		return "Objetivos de aprendizagem:\n"
				+ "1 - Melhorar a comunicação: atraves da proatividade participando mais ativamente das aulas.\n"
				+ "2 - Estudar mais afundo as documentações e realizar testes para melhorar a compreensão do conteúdo.\n";
			
	}
}
