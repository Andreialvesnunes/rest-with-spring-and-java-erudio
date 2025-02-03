package com.example.erudio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/soma/{numeroUm}/{numeroDois}")
	public double soma(@PathVariable String numeroUm, @PathVariable String numeroDois) {
		return 1D;
	}
}
