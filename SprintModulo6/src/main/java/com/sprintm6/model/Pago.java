package com.sprintm6.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Pagos")
public class Pago {
	
	@Override
	public String toString() {
		return "Pago [cliente_id=" + cliente_id + "]";
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name="cliente_id")
	private Usuario cliente_id;

	private Double monto;
	
	@DateTimeFormat(pattern = "dd-MMM-yyyy")
	private LocalDate fecha_pago;
	
	
	
	public Pago() {
	}



	public Pago(Integer id, Usuario cliente_id, Double monto, LocalDate fecha_pago) {
		this.id = id;
		this.cliente_id = cliente_id;
		this.monto = monto;
		this.fecha_pago = fecha_pago;
	}



	public Pago(Usuario cliente_id) {
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



	public Double getMonto() {
		return monto;
	}



	public void setMonto(Double monto) {
		this.monto = monto;
	}



	public LocalDate getFecha_pago() {
		return fecha_pago;
	}



	public void setFecha_pago(LocalDate fecha_pago) {
		this.fecha_pago = fecha_pago;
	}


	
	
}
