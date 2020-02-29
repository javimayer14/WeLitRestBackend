package com.freelance.backend.apirest.models.services;

import java.util.List;

import com.freelance.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();
	
	public void save(Usuario usuario);
	

	
}
