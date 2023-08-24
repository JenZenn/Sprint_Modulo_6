package com.sprintm6.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sprintm6.service.IChequeoService;

@Controller
public class ChequeoController {

	@Autowired
	private IChequeoService cheqService;
	
	@GetMapping("/chequeos")
	public String listaChequeos(Model model) {
		model.addAttribute("chequeos",cheqService.buscarTodas());
		return "lista_chequeo";
		
	}
	
}
