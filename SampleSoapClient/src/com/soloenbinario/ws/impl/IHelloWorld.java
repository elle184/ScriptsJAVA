package com.soloenbinario.ws.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IHelloWorld", targetNamespace = "http://ws.soloenbinario.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IHelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getHelloWorld(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}