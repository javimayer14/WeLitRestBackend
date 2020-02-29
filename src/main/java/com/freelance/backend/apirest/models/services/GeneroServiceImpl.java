package com.freelance.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.freelance.backend.apirest.models.dao.IGeneroDao;
import com.freelance.backend.apirest.models.entity.Genero;

@Service
public class GeneroServiceImpl implements IGeneroService {
	
	@Autowired
	IGeneroDao generoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Genero> findAll() {
		return (List<Genero>) generoDao.findAll();
	}

}
