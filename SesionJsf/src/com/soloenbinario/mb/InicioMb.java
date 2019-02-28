package com.soloenbinario.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.soloenbinario.sistema.Sesion;

/**
 * Managed bean para el inicio y cierre de sesión.
 * 
 * @author Adrian Francisco Becerra Arias - lucka.dev@gmail.com
 */
@ManagedBean
@ViewScoped
public class InicioMb implements Serializable {
	private static final long serialVersionUID = 1L;

	private String titulo = "Gestión de sesiones con JSF";
	private String nomUsuario;
	private String claveUsuario;

	/**
	 * Método encargado de iniciar la sesión de un usuario.
	 * 
	 * @return String: La página a redireccionar al usuario cuando se 
	 * termine el inicio de sesión.
	 */
	public String iniciarSesion() {
		Sesion.iniciarSesion(FacesContext.getCurrentInstance());
		Sesion.setDatosSesion("nomUsuario", this.nomUsuario);
		
		return "pagina_inicio?faces-redirect=true";
	}
	
	/**
	 * Método encargado de cerrar la sesión de usuario.
	 * 
	 * @return String: La página a redireccionar al usuario cuando se cierre 
	 * la sesión.
	 */
	public String cerrarSesion() {
		try {
			Sesion.iniciarSesion(FacesContext.getCurrentInstance());
			Sesion.cerrarSesion();
			
			return "index?faces-redirect=true";
		} catch (Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}
}