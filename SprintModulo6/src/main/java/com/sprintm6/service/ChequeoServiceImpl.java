package com.sprintm6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprintm6.model.Chequeo;
import com.sprintm6.repository.ChequeoRepository;

@Service
public class ChequeoServiceImpl implements IChequeoService{

	@Autowired
	private ChequeoRepository chequeoRepository;
	
	@Override
	public List<Chequeo> buscarTodas() {
		return chequeoRepository.findAll();
	}

}
