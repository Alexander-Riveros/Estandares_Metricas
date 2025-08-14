package co.edu.uniminuto.firstsservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstsServiceController {
	
	@GetMapping(value="saludar", produces = MediaType.APPLICATION_JSON_VALUE)
	public String saludo() {
		return "Hola Uniminuto";
	}
	@GetMapping(value="saludar-est/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getsaludarEstudiante(@PathVariable("name") String nombre) {
		return "Hola Estudiante "+nombre;
	}
	@GetMapping(value="sumar", produces = MediaType.APPLICATION_JSON_VALUE)
	public double getSuma(@RequestParam("numer1") double num1, @RequestParam("numer2") double num2) {
		return (num1+num2);
	}
}
