package com.soloenbinario.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.soloenbinario.jaxb.HolaMundo;

@Path("/rws")
public class RestWebService {
	@GET
	@Path("/bienvenida")
	@Produces(MediaType.TEXT_PLAIN)
	public String bienvenida() {
		return "Hola Mundo!";
	}
	
	@GET
	@Path("/bienvenida/xml")
	@Produces({MediaType.APPLICATION_XML})
	public HolaMundo saludoXml() {
		HolaMundo hm = new HolaMundo();
		hm.setSaludo("Hola XML!");
		
		return hm;
	}
	
	@GET
	@Path("/bienvenida/json")
	@Produces({MediaType.APPLICATION_JSON})
	public HolaMundo saludoJson() {
		HolaMundo hm = new HolaMundo();
		hm.setSaludo("Hola JSON!");
		
		return hm;
	}
	
	@GET
	@Path("/bienvenida/json/{p}")
	@Produces({MediaType.APPLICATION_JSON})
	public HolaMundo saludoJsonP(@PathParam("p") String id) {
		HolaMundo hm = new HolaMundo();
		hm.setSaludo("Hola JSON: " + id);
		
		return hm;
	}
	
	@GET
	@Path("/bienvenida/json_qp")
	@Produces({MediaType.APPLICATION_JSON})
	public HolaMundo saludoJsonQp(@QueryParam("p") String id) {
		HolaMundo hm = new HolaMundo();
		hm.setSaludo("Hola JSON: " + id);
		
		return hm;
	}
	
	@POST
	@Path("/post/crearBienvenida")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response crearBienvenida(HolaMundo obj) {
		HolaMundo resultado = new HolaMundo();
		resultado.setSaludo(obj.getSaludo());
		
		return Response.status(201).entity(resultado).build();
	}
}
