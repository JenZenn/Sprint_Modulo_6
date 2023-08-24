package com.sprintm6.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprintm6.model.Capacitacion;
import com.sprintm6.repository.CapacitacionRepository;

@Service
public class CapacitacionServiceImpl implements ICapacitacionService {

	@Autowired
	private CapacitacionRepository capRepository;
	
	
	@Override
	public List<Capacitacion> buscarTodas() {
		return capRepository.findAll();
	}


	@Override
	public void guardarCapacitacion(Capacitacion capacitacion) {
		capRepository.save(capacitacion);
	}


	@Override
	public Capacitacion buscarPorId(Integer id) {
		return capRepository.findById(id).get();
	}


	@Override
	public void eliminarPorId(Integer id) {
		capRepository.deleteById(id);
	}





}
