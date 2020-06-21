package com.freelance.backend.apirest.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.freelance.backend.apirest.models.dao.IUsuarioDao;
import com.freelance.backend.apirest.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	public void save(Usuario usuario) {
		usuarioDao.save(usuario);		
	}

	@Override
	public Optional<Usuario> findById(String id) {
		return usuarioDao.findById(id);
	}

	@Override
	public Usuario findById2(String id) {
		return usuarioDao.findById2(id);
	}

}
