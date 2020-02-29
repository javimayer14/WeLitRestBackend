package com.freelance.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.freelance.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario,String> {
}
