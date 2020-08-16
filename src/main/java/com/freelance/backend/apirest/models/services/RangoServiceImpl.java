package com.freelance.backend.apirest.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelance.backend.apirest.models.dao.IRangoDao;
import com.freelance.backend.apirest.models.entity.Rango;

@Service
public class RangoServiceImpl implements IRangoService{

	@Autowired
	private IRangoDao rangoDao;

	@Override
	public void save(Rango rango) {
		rangoDao.save(rango);
		
	}

	@Override
	public Rango findAll() {
		return (Rango) rangoDao.findAll();
	}
	
	
	
	
}
