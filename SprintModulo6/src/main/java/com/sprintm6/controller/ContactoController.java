package com.sprintm6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sprintm6.model.Contacto;

@Controller
public class ContactoController {

	@GetMapping("/contacto")
	public String conctacto() {
		return "contacto";
	}
	
	@PostMapping("/mensaje")
	public String mensaje(Contacto contacto, Model	model) {
		model.addAttribute("nombre", contacto.getNombre());
		model.addAttribute("email", contacto.getEmail());	
		model.addAttribute("telefono", contacto.getTelefono());   
		model.addAttribute("mensaje", contacto.getMensaje());
		System.out.println(model.toString());
		return "contacto";
		
	}
	
}