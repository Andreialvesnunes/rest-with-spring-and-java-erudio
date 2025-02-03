package com.example.erudio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erudio.exceptions.UnsupportedMathOperationException;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/soma/{numeroUm}/{numeroDois}")
	public double soma(@PathVariable String numeroUm, @PathVariable String numeroDois) throws Exception{
		
		if(!isNumeric(numeroUm) || !isNumeric(numeroDois)) {
			throw new UnsupportedMathOperationException("Por favor, coloque um número");
		}
		
		return convertToDouble(numeroUm) + convertToDouble(numeroDois);
	}

	private double convertToDouble(String strNumero) {
		if(strNumero == null) return 0D;
		String numero = strNumero.replace(",",".");
		if(isNumeric(numero)) return Double.parseDouble(numero);
		return 0D;
		
	}

	private boolean isNumeric(String strNumero) {
		if(strNumero == null) return false;
		String numero = strNumero.replace(",", ".");
		return numero.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
