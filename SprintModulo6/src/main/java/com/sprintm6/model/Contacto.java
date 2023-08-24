package com.sprintm6.model;

public class Contacto {

	private String nombre;
	private String email;
	private String telefono;
	private String mensaje;
	
	public Contacto() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + ", mensaje=" + mensaje
				+ "]";
	}

	
	
	
}
