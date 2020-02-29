package com.freelance.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.freelance.backend.apirest.models.entity.Genero;

public interface IGeneroDao  extends CrudRepository<Genero, Long>{

}
