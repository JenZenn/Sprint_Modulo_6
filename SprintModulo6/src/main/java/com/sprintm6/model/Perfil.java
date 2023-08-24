package com.sprintm6.model;







import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "Perfiles")
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String tipo;
	
	
	public Perfil() {
		
	}
	
	public Perfil(Integer id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}


	public Perfil(Integer id) {
		this.id = id;
	}

	public Perfil(String tipo) {
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return tipo;
	}

	

	
	
}
