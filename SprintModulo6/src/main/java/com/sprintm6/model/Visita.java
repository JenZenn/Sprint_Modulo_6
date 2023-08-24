package com.sprintm6.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Visitas")
public class Visita {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne()
	@JoinColumn(name="cliente_id")
	private Usuario cliente_id;
	
	@DateTimeFormat(pattern = "dd-MMM-yyyy")
	private LocalDate fecha_visita;
	
	private String detalle;
	
	@OneToMany(mappedBy = "visita_id")
	List<Chequeo> chequeos;
	
	public Visita() {
	}

	

	public Visita(List<Chequeo> chequeos) {
		this.chequeos = chequeos;
	}


	public Visita(Usuario cliente_id) {
		this.cliente_id = cliente_id;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Usuario getCliente_id() {
		return cliente_id;
	}



	public void setCliente_id(Usuario cliente_id) {
		this.cliente_id = cliente_id;
	}



	public LocalDate getFecha_visita() {
		return fecha_visita;
	}



	public void setFecha_visita(LocalDate fecha_visita) {
		this.fecha_visita = fecha_visita;
	}



	public String getDetalle() {
		return detalle;
	}



	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}



	public List<Chequeo> getChequeos() {
		return chequeos;
	}



	public void setChequeos(List<Chequeo> chequeos) {
		this.chequeos = chequeos;
	}



	public Visita(Integer id, Usuario cliente_id, LocalDate fecha_visita, String detalle, List<Chequeo> chequeos) {
		this.id = id;
		this.cliente_id = cliente_id;
		this.fecha_visita = fecha_visita;
		this.detalle = detalle;
		this.chequeos = chequeos;
	}



	@Override
	public String toString() {
		return "Visita [cliente_id=" + cliente_id + "]";
	}
	
	
	
}
