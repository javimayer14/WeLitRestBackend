package com.freelance.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.freelance.backend.apirest.models.entity.Comentario;

public interface IComentarioDao extends CrudRepository<Comentario, Long> {

}
