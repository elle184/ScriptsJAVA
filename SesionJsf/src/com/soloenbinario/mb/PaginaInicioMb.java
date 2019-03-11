/**
 * 
 */
package com.soloenbinario.mb;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.soloenbinario.sistema.Sesion;

/**
 * Managed bean al cual es redirigido el usuario cuando inicia su sesión.
 * 
 * @author Adrian Francisco Becerra Arias - lucka.dev@gmail.com
 */
@ManagedBean
@ViewScoped
public class PaginaInicioMb {
	public String nomUsuario;
	
	@PostConstruct
	public void init() {
		Sesion.iniciarSesion(FacesContext.getCurrentInstance());
		
		this.nomUsuario = (String) Sesion.getDatosSesion("nomUsuario");
	}
	
	public String getNomUsuario() { return this.nomUsuario; }
}
