package com.sprintm6.service;

import java.util.List;



import com.sprintm6.model.Usuario;

public interface IUsuarioService {

	List<Usuario> buscarTodas();
	
	void guardarUsuario(Usuario usuario);
	
	Usuario buscarPorId(Integer id);	
	
	void eliminarPorId(Integer id);
	
	
}
