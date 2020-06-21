package com.freelance.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.freelance.backend.apirest.models.entity.Rango;

public interface IRangoDao extends CrudRepository<Rango, Long> {

}
