package com.freelance.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.freelance.backend.apirest.models.dao.IComentarioDao;
import com.freelance.backend.apirest.models.entity.Comentario;

@Service
public class ComentarioServiceImpl implements IComentarioService {

	@Autowired
	IComentarioDao comentarioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Comentario> findAll() {
		return (List<Comentario>) comentarioDao.findAll();
	}

	public void save(Comentario comentario) {
		comentarioDao.save(comentario);

	}

	@Transactional
	public void delete(Long id) {
		comentarioDao.deleteById(id);
	}

	public Comentario findById(Long id) {
		return comentarioDao.findById(id).orElse(null);
	}

	@Override
	public Long findNumbersOfRecordsByStory(Long id) {
		List<Long> i = comentarioDao.findNumbersOfRecordsByStory(id);
		return (long) i.size();
	}

}
