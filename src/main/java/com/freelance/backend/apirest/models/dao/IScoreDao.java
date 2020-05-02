package com.freelance.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.freelance.backend.apirest.models.entity.Score;

public interface IScoreDao extends CrudRepository<Score, Long> {

}
