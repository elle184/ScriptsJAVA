/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloenbinario.sampleweblogic.mb;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author lucka
 */
@ManagedBean(name = "rolMBean", eager = true)
@RequestScoped
public class RolMBean implements Serializable {
    private String nombre = "Administrador";
    
    @PostConstruct
    public void init() {
        System.out.println("Inicializando managed bean RolMBean");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
