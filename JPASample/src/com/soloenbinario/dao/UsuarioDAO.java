package com.soloenbinario.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.soloenbinario.entity.Usuario;

public class UsuarioDAO {
	private EntityManager em = Persistence.createEntityManagerFactory("JpaSampleUnit").createEntityManager();
	
	public List<Usuario> findAll() {
		String namedQuery = "SELECT u FROM Usuario u";
		TypedQuery<Usuario> query = this.em.createQuery(namedQuery, Usuario.class);
		List<Usuario> list = query.getResultList();
		
		return list;
	}
}
