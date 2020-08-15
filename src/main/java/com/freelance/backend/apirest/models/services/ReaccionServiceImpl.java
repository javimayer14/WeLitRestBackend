package com.freelance.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelance.backend.apirest.models.dao.IReaccionDao;
import com.freelance.backend.apirest.models.entity.Reaccion;

@Service
public class ReaccionServiceImpl implements IReaccionService {
	
	@Autowired
	IReaccionDao reaccionDao;

	@Override
	public List<String> findAll() {
		return (List<String>) reaccionDao.findAllReactions();
	}

	@Override
	public void save(Reaccion reaccion) {
		reaccionDao.save(reaccion);
	}

	@Override
	public void delete(Long id) {
		reaccionDao.deleteById(id);

	}

	@Override
	public Reaccion findById(Long id) {
		return null;
	}

}
