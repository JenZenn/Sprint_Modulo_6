package com.sprintm6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprintm6.model.Visita;
import com.sprintm6.repository.VisitaRepository;

@Service
public class VisitaServiceImpl implements IVisitaService {

	@Autowired
	private VisitaRepository visitaRepository;
	
	@Override
	public List<Visita> buscarTodas() {
		return visitaRepository.findAll();
	}

	@Override
	public void guardarVisita(Visita visita) {
		visitaRepository.save(visita);
		
	}

	@Override
	public void eliminarPorId(Integer id) {
		visitaRepository.deleteById(id);
		
	}

}
