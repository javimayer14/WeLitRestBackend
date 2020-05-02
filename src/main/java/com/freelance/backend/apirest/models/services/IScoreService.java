package com.freelance.backend.apirest.models.services;

import java.util.List;
import com.freelance.backend.apirest.models.entity.Score;

public interface IScoreService {

	public List<Score> findAll();

	public void save(Score score);

	public void delete(Long id);

	public Score findById(Long id);

}
