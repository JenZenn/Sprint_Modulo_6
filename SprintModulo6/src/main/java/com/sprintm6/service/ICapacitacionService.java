package com.sprintm6.service;

import java.util.List;

import com.sprintm6.model.Capacitacion;

public interface ICapacitacionService {

	List<Capacitacion> buscarTodas();
	
	void guardarCapacitacion(Capacitacion capacitacion);
	
	Capacitacion buscarPorId(Integer id);	
	

	void eliminarPorId(Integer id);
	
}
