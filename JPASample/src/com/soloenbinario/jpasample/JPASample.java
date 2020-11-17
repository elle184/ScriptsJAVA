package com.soloenbinario.jpasample;

import com.soloenbinario.dao.UsuarioDAO;

public class JPASample {
	public static void main(String args[]) {
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.findAll();
	}
}
