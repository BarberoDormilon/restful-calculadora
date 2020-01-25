package com.restful.calculadora.restfulcalculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	@GetMapping
	public String Sumar() {
		return "Opcion Sumar";
	}

}
