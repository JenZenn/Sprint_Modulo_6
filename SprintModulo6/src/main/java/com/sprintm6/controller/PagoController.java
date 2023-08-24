package com.sprintm6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sprintm6.model.Pago;
import com.sprintm6.service.IPagoService;


@Controller
public class PagoController {
	
	@Autowired
	private IPagoService pagService;
	
	@GetMapping("/pagos")
	public String listaPago(Model model) {
		model.addAttribute("pagos",pagService.buscarTodas());
		return "lista_pago";
	}

	@GetMapping("/pagos/new")
	public String crearPagoForm(Model model) {
		Pago pago = new Pago();
		model.addAttribute("pago", pago);
		return "form_pago";
		
	}
	
	@PostMapping("/pagos")
	public String guardarCapacitacion(@ModelAttribute("pago")Pago pago) {
		pagService.guardarPago(pago);
		return "redirect:/pagos";
	}

}
