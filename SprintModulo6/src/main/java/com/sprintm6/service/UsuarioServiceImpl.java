package com.sprintm6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sprintm6.model.Usuario;
import com.sprintm6.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private UsuarioRepository usuRepository;
	
	@Override
	public List<Usuario> buscarTodas() {
		return usuRepository.findAll();
	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		usuRepository.save(usuario);
	}

	@Override
	public Usuario buscarPorId(Integer id) {
		return usuRepository.findById(id).get();
	}

	@Override
	public void eliminarPorId(Integer id) {
		usuRepository.deleteById(id);
	}


}
