package com.sprintm6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintm6.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

	
}
