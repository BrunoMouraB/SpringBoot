package com.hardskill.habilidadesTecnicas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/HabTec")

public class HabilidadesSemanalController {

	@GetMapping
	
	public String HabTec ()
	{
		return "Nesta semana quero aprender ao máximo sobre back-and e poder praticar com as técnicas que irei executar";  
	}
}
