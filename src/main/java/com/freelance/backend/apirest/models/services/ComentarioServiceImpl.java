package com.freelance.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.freelance.backend.apirest.models.dao.IComentarioDao;
import com.freelance.backend.apirest.models.entity.Comentario;

@Service
public class ComentarioServiceImpl implements IComentarioService{

	@Autowired
	IComentarioDao comentarioDao;
	@Override
	@Transactional(readOnly=true)
	public List<Comentario> findAll() {
		return (List<Comentario>) comentarioDao.findAll();
	}
	
	public void save(Comentario comentario) {
		comentarioDao.save(comentario);
		
	}

}
