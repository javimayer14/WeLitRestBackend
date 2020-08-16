package com.freelance.backend.apirest.models.services;

import com.freelance.backend.apirest.models.entity.Rango;

public interface IRangoService {
	
	public void save (Rango rango);
	public Rango findAll();

}
