package com.freelance.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelance.backend.apirest.models.dao.IScoreDao;
import com.freelance.backend.apirest.models.entity.Score;

@Service
public class ScoreServiceImpl implements IScoreService {

	@Autowired
	IScoreDao scoreDao;

	@Override
	public List<Score> findAll() {
		return (List<Score>) scoreDao.findAll();
	}

	@Override
	public void save(Score score) {
		scoreDao.save(score);
	}

	@Override
	public void delete(Long id) {
		scoreDao.deleteById(id);
	}

	@Override
	public Score findById(Long id) {
		// TODO Auto-generated method stub
		return scoreDao.findById(id).orElse(null);
	}

}
