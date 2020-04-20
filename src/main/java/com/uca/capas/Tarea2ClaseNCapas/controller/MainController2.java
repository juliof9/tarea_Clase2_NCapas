package com.uca.capas.Tarea2ClaseNCapas.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//
//http://localhost:8081/date?dia=20&mes=4&annio=2020

@Controller
public class MainController2 {
	
	@RequestMapping("/date")
	
	public @ResponseBody String date(HttpServletRequest request) {
		
		Integer day = Integer.parseInt(request.getParameter("dia"));
		Integer month = Integer.parseInt(request.getParameter("mes"));
		Integer year = Integer.parseInt(request.getParameter("annio"));
		
		LocalDate fechalocal = LocalDate.of(year, month, day);
		
		String dia;
		switch (fechalocal.getDayOfWeek().getValue()) {
			case 1: dia = "Lunes";
			break;
			case 2: dia = "Martes";
			break;
			case 3: dia = "Miercoles";
			break;
			case 4: dia = "Jueves";
			break;
			case 5: dia = "Viernes";
			break;
			case 6: dia = "Sabado";
			break;
			case 7: dia = "Domingo";
			break;
			default: dia = "Ningun dia seleccionado";
			break;
		}
		return "Dia de la semana enviado: " + dia;
	}

}
