package com.soloenbinario.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad para la tabla <code>roles</code>
 * 
 * @author Adrian Francisco Becerra Arias - lucka.dev@gmail.com
 */
@Entity
@Table(name = "roles")
public class Rol {
	@Id
	@Column(name = "id_rol")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nombre")
	private String rol;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
}
