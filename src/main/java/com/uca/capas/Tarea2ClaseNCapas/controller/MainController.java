package com.uca.capas.Tarea2ClaseNCapas.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/alumno")
	public @ResponseBody String alumno(HttpServletRequest request) {
		
		String Name = "Julio Edgardo";
		String LastName = "Flores Giron";
		String carnet = "00081817";
		String carrera = "Ing.Informatica";
		String annio = "Cuarto";
		
		String estudiante = 
				"Nombre: " + Name + 
				"<br>Apellido: " + LastName +
				"<br>Carnet: " + carnet +
				"<br>Carrera: " + carrera +
				"<br>Año de carrera: " + annio;
		
		return estudiante;
	}
}
