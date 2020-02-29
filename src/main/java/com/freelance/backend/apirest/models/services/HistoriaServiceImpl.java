package com.freelance.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.freelance.backend.apirest.models.dao.IHistoriaDao;
import com.freelance.backend.apirest.models.entity.Historia;

@Service
public class HistoriaServiceImpl implements IHistoriaService {

	@Autowired
	IHistoriaDao historiaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Historia> findAll() {
		return (List<Historia>) historiaDao.findAll();
	}

	public void save(Historia historia) {
			 historiaDao.save(historia);
			 }

	@Override
	public void findBestComent(Long id) {
		 historiaDao.findBestComentFromHistory(id);
	}

	@Override
	public List<Historia> findAllStoriesActives() {
		return historiaDao.findAllStoriesActives();
	}

}
