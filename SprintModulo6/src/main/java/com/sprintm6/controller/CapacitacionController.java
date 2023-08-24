package com.sprintm6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sprintm6.model.Capacitacion;
import com.sprintm6.service.ICapacitacionService;

@Controller
public class CapacitacionController {
	
	@Autowired
	private ICapacitacionService capService;
	
	
	@GetMapping("/capacitaciones")
	public String listaCapacitacion(Model model) {
		model.addAttribute("capacitaciones",capService.buscarTodas());
		return "lista_capacitacion";
	}

	@GetMapping("/capacitaciones/new")
	public String crearCapacitacionForm(Model model) {
		Capacitacion cap = new Capacitacion();
		model.addAttribute("capacitacion", cap);
		return "form_capacitacion";
		
	}
	
	@PostMapping("/capacitaciones")
	public String guardarCapacitacion(@ModelAttribute("capacitacion")Capacitacion cap) {
		capService.guardarCapacitacion(cap);
		return "redirect:/capacitaciones";
	}
	
	@GetMapping("/capacitaciones/edit/{id}")
	public String editarCapacitacionForm(@PathVariable(value ="id") Integer id, Model model) {
		Capacitacion capacitacion = capService.buscarPorId(id);
		model.addAttribute("capacitacion",capacitacion);
		return "form_editar_capacitacion";
	}

	
	@GetMapping("/capacitaciones/{id}")
	public String borrarCapacitación(@PathVariable (value ="id") Integer id) {
		capService.eliminarPorId(id);
		return "redirect:/capacitaciones";
	}	
	
}

