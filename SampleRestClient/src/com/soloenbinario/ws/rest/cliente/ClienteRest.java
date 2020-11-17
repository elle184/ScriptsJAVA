package com.soloenbinario.ws.rest.cliente;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.soloenbinario.jaxb.HolaMundo;

public class ClienteRest {
	Client cliente;

	public ClienteRest() {
		this.cliente = ClientBuilder.newClient();
	}

	public void bienvenidaXml() {
		try {
			String resultado = this.cliente.target("http://localhost:8080/SampleREST-0.0.1-SNAPSHOT/rest/rws/bienvenida/xml")
			.request(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).get(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void bienvenidaStr() {
		try {
			String resultado = this.cliente.target("http://localhost:8080/RestWebService/rest/rws/bienvenida")
					.request(MediaType.TEXT_PLAIN).accept(MediaType.TEXT_PLAIN).get(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void bienvenidaJson() {
		try {
			String resultado = this.cliente.target("http://localhost:8080/RestWebService/rest/rws/bienvenida/json")
					.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).get(String.class);

			System.out.println("Output from Server ....");
			System.out.println(resultado);
			System.out.println("\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void bienvenidaJsonPathParam() {
		try {
			String resultado = this.cliente.target("http://localhost:8080/RestWebService/rest/rws/bienvenida/json")
					.path("32").request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
					.get(String.class);

			System.out.println("Output from Server ....");
			System.out.println(resultado);
			System.out.println("\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void bienvenidaJsonQueryParam() {
		try {
			String resultado = this.cliente.target("http://localhost:8080/RestWebService/rest/rws/bienvenida/json_qp")
					.queryParam("p", 40).request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
					.get(String.class);

			System.out.println("Output from Server ....");
			System.out.println(resultado);
			System.out.println("\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void crearSaludo() {
		try {
			HolaMundo nuevoSaludo = new HolaMundo();
			nuevoSaludo.setSaludo("Saludo desde el cliente WS");

			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target("http://localhost:8080/RestWebService/rest/rws/post/")
					.path("crearBienvenida");

			Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
			Response response = invocationBuilder
					.post(Entity.entity(nuevoSaludo.toString(), MediaType.APPLICATION_JSON));

			System.out.println(response.getStatus());
			System.out.println(response.readEntity(String.class));
			System.out.println("\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
