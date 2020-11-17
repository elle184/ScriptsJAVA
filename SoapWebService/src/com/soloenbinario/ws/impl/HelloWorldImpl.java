package com.soloenbinario.ws.impl;

import javax.jws.WebService;

import com.soloenbinario.ws.IHelloWorld;

@WebService(endpointInterface = "com.soloenbinario.ws.IHelloWorld")
public class HelloWorldImpl implements IHelloWorld {

	@Override
	public String getHelloWorld(String name) {
		return "Hello and welcome " + name;
	}

}
