package com.soloenbinario.richapplication.mb;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * 
 */

/**
 * @author lucka
 *
 */
@Named
@ConversationScoped
public class InicioMb implements Serializable {
	private static final long serialVersionUID = -7946698066973039883L;
	
	@Inject
	private Conversation conversation;
	
	private String saludo = "Hola Mundo!";
	private String saludoDesdeElPanel;
	private String textoDetalleRespuesta;
	private Boolean sePuedeMostrarPanel;
	
	@PostConstruct
	public void init() {
		this.conversation.begin();
	}
	
	@PreDestroy
	public void doBeforeEnd() {
		
	}

	public void convertirSaludo() {
		this.saludo = "Buenas tardes, Adrian";
	}
	
	public void mostrarPanel() {
		this.sePuedeMostrarPanel = true;
		this.saludoDesdeElPanel = "Se activó el panel";
	}
	
	public void cargarDetalleRespuesta() {
		this.textoDetalleRespuesta = "El detalle de la respuesta.";
	}
	
	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public String getSaludoDesdeElPanel() {
		return saludoDesdeElPanel;
	}

	public void setSaludoDesdeElPanel(String saludoDesdeElPanel) {
		this.saludoDesdeElPanel = saludoDesdeElPanel;
	}

	public Boolean getSePuedeMostrarPanel() {
		return sePuedeMostrarPanel;
	}

	public void setSePuedeMostrarPanel(Boolean sePuedeMostrarPanel) {
		this.sePuedeMostrarPanel = sePuedeMostrarPanel;
	}

	public String getTextoDetalleRespuesta() {
		return textoDetalleRespuesta;
	}

	public void setTextoDetalleRespuesta(String textoDetalleRespuesta) {
		this.textoDetalleRespuesta = textoDetalleRespuesta;
	}
}
