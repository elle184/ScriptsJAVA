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
 * @author lucka
 *
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
