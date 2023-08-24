package com.sprintm6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sprintm6.model.Perfil;
import com.sprintm6.repository.PerfilRepository;

@Service
public class PerfilServiceImpl implements IPerfilService {

	@Autowired
	private PerfilRepository perRepository;

	

	@Override
	public List<Perfil> buscarTodas() {
		return perRepository.findAll();
	}

	

}
