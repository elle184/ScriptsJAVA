package com.soloenbinario.ws.client;

import com.soloenbinario.ws.impl.HelloWorldImplService;
import com.soloenbinario.ws.impl.IHelloWorld;

public class HelloWorldClient {
	public static void main(String[] args) {
		HelloWorldImplService service = new HelloWorldImplService();
		IHelloWorld hello = service.getHelloWorldImplPort();
		
		System.out.println(hello.getHelloWorld("Adrian"));
	}
}