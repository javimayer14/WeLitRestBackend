package com.freelance.backend.apirest.models.services;

import java.util.List;

import com.freelance.backend.apirest.models.entity.Reaccion;


public interface IReaccionService {
	public List<String> findAll();

	public void save(Reaccion reaccion);

	public void delete(Long id);

	public Reaccion findById(Long id);

}
