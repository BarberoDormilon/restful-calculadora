package com.restful.calculadora.restfulcalculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@GetMapping(path="/suma/{num1}/{num2}")
	public String Sumar(@PathVariable String num1, @PathVariable String num2) {
		return "La suma es: "+(Integer.parseInt(num1)+Integer.parseInt(num2));
	}
	
	@GetMapping(path="/resta/{num1}/{num2}")
	public String Resta(@PathVariable String num1, @PathVariable String num2) {
		return "La resta es: "+(Integer.parseInt(num1)-Integer.parseInt(num2));
	}

}
