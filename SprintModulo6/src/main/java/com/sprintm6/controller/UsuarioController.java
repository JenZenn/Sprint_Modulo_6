package com.sprintm6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sprintm6.model.Perfil;
import com.sprintm6.model.Usuario;
import com.sprintm6.service.IPerfilService;
import com.sprintm6.service.IUsuarioService;


@Controller
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IPerfilService perfilService;
	

	
	@GetMapping("/usuarios")
	public String listaUsuario(Model model) {
		List<Usuario> listaUsuarios = usuarioService.buscarTodas();
		List<Perfil> perfiles = perfilService.buscarTodas();
		model.addAttribute("usuarios", listaUsuarios);
		model.addAttribute("perfiles", perfiles);
		return "lista_usuario";
	}
	
	@GetMapping("/signup")
	public String crearUsuarioForm(Model model) {
		List<Perfil> perfiles = perfilService.buscarTodas();
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		model.addAttribute("perfiles", perfiles);
		return "form_usuario";
		
	}
	
	@PostMapping("/usuarios")
	public String guardarUsuario(@ModelAttribute("usuario")Usuario usuario) {
		usuario.setEstado(1);
		usuarioService.guardarUsuario(usuario);
		return "redirect:/";
	}
	
	@GetMapping("/usuarios/edit/{id}")
	public String editarUsuarioForm(@PathVariable(value ="id") Integer id, Model model) {
		Usuario usuario = usuarioService.buscarPorId(id);
		List<Perfil> perfiles = perfilService.buscarTodas(); 
		model.addAttribute("usuario",usuario);
		model.addAttribute("perfiles", perfiles);
		return "form_editar_usuario";
	}

	
	/*Eliminar
	 * @GetMapping("/usuarios/{id}")
	public String borrarUsuario(@PathVariable (value ="id") Integer id) {
		usuarioService.eliminarPorId(id);
		perfilService.eliminarPorId(id);
		visitaService.eliminarPorId(id);
		pagoService.eliminarPorId(id);
		return "redirect:/usuarios";
	}	*/
}
