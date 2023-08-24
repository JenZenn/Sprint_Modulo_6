package com.sprintm6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sprintm6.model.Visita;
import com.sprintm6.service.IVisitaService;

@Controller
public class VisitaController {

	@Autowired
	private IVisitaService vitaService;
	
	@GetMapping("/visitas")
	public String listaVisita(Model model) {
		model.addAttribute("visitas",vitaService.buscarTodas());
		return "lista_visita";
	}

	@GetMapping("/visitas/new")
	public String crearVisitaForm(Model model) {
		Visita visita = new Visita();
		model.addAttribute("visita", visita);
		return "form_visita";
	}
	
	@PostMapping("/visitas")
	public String guardarVisita(@ModelAttribute("visita")Visita visita) {
		vitaService.guardarVisita(visita);
		return "redirect:/visitas";
	}
	
	
}
