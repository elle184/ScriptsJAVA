package com.soloenbinario.samplerestclient;

import com.soloenbinario.ws.rest.cliente.ClienteRest;

public class SampleRestClient {
	public static void main(String[] args) {
		ClienteRest restClient = new ClienteRest();
		restClient.bienvenidaXml();
	}
}
