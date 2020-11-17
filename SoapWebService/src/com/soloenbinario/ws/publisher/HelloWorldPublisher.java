package com.soloenbinario.ws.publisher;

import javax.xml.ws.Endpoint;

import com.soloenbinario.ws.impl.HelloWorldImpl;

public class HelloWorldPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	}
}
