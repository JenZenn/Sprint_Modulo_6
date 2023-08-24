package com.sprintm6.model;


import java.util.HashSet;
import java.util.List;
import java.util.Set;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	
	private String username;
	
	private String password;
	
	private String email;	
	
	private Integer estado;
	
	@OneToMany(mappedBy="cliente_id")
	private List<Pago> pagos;
	
	@OneToMany(mappedBy="cliente_id")
	private List<Visita> visitas;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="usuario_perfil", joinColumns = @JoinColumn(name="usuario_id"),
				inverseJoinColumns = @JoinColumn(name="perfil_id"))
	private Set<Perfil> perfiles = new HashSet<>();
	
	
	public Usuario() {
	}
	
	

	public Usuario(Integer id) {
		this.id = id;
	}



	public Usuario(Integer id, String nombre, String username, String password, String email, Integer estado,
			List<Pago> pagos, List<Visita> visitas, Set<Perfil> perfiles) {
		this.id = id;
		this.nombre = nombre;
		this.username = username;
		this.password = password;
		this.email = email;
		this.estado = estado;
		this.pagos = pagos;
		this.visitas = visitas;
		this.perfiles = perfiles;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Pago> getPagos() {
		return pagos;
	}

	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}

	public List<Visita> getVisitas() {
		return visitas;
	}

	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}

	
	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Set<Perfil> getPerfiles() {
		return perfiles;
	}


	public void setPerfiles(Set<Perfil> perfiles) {
		this.perfiles = perfiles;
	}



	@Override
	public String toString() {
		return "id=" + id;
	}






	
	
	
}
