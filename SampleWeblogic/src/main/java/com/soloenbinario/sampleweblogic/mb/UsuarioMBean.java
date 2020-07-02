/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloenbinario.sampleweblogic.mb;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author lucka
 */
@ManagedBean
@RequestScoped
public class UsuarioMBean implements Serializable {
    @ManagedProperty(value = "#{rolMBean}")
    private RolMBean rol;

    public RolMBean getRol() {
        return rol;
    }

    public void setRol(RolMBean rol) {
        this.rol = rol;
    }
}
