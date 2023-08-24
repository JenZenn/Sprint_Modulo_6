package com.sprintm6.service;

import java.util.List;

import com.sprintm6.model.Pago;

public interface IPagoService {

	List<Pago> buscarTodas();

	void guardarPago(Pago pago);
	
	void eliminarPorId(Integer id);

}
