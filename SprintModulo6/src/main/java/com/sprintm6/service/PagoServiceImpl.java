package com.sprintm6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprintm6.model.Pago;
import com.sprintm6.repository.PagoRepository;

@Service
public class PagoServiceImpl implements IPagoService {

	@Autowired
	private PagoRepository pagoRepository;
	
	
	@Override
	public List<Pago> buscarTodas() {
		return pagoRepository.findAll();
	}

	@Override
	public void guardarPago(Pago pago) {
		pagoRepository.save(pago);
		
	}

	@Override
	public void eliminarPorId(Integer id) {
		pagoRepository.deleteById(id);
		
	}

}
