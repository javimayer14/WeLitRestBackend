package com.freelance.backend.apirest.models.services;

import java.util.List;

import com.freelance.backend.apirest.models.entity.Comentario;

public interface IComentarioService {
	public List<Comentario> findAll();

	public void save(Comentario comentario);

	public void delete(Long id);

	public Comentario findById(Long id);

	public Long findNumbersOfRecordsByStory(Long id);
}
