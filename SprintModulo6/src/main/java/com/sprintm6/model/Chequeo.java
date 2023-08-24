package com.sprintm6.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Chequeos")
public class Chequeo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne()
	@JoinColumn(name="visita_id")
	private Visita visita_id;
	
	private String detalle;
	
	private String estado;
	
	public Chequeo() {
	}

	public Chequeo(Integer id, Visita visita, String detalle, String estado) {
		this.id = id;
		this.visita_id = visita;
		this.detalle = detalle;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Visita getVisita() {
		return visita_id;
	}

	public void setVisita(Visita visita) {
		this.visita_id = visita;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	


	
	
}