package com.soloenbinario.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Entidad para la tabla <code>usuarios</code>
 * 
 * @author Adrian Francisco Becerra Arias - lucka.dev@gmail.com
 */
@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@Column(name = "id_usuario", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nombre",  nullable = false)
	private String usuario;
	
	@Column(name = "clave", nullable = false)
	private String clave;
	
	/**
	 * Relación muchos a muchos. El dueño de la cardinalidad es la entidad <code>Usuario</code>
	 */
	@ManyToMany
	@JoinTable(name = "roles_usuarios",
		joinColumns = @JoinColumn(name = "id_usuario"),
		inverseJoinColumns = @JoinColumn(name = "id_rol"))
	private List<Rol> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
}
