package com.sprintm6.service;

import java.util.List;

import com.sprintm6.model.Visita;


public interface IVisitaService {

	List<Visita> buscarTodas();

	void guardarVisita(Visita visita);
	
	void eliminarPorId(Integer id);
}
