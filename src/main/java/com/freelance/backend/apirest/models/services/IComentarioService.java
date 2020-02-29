package com.freelance.backend.apirest.models.services;

import java.util.List;
import com.freelance.backend.apirest.models.entity.Comentario;

public interface IComentarioService {
	public List<Comentario> findAll();
	
	public void save(Comentario comentario);
}
