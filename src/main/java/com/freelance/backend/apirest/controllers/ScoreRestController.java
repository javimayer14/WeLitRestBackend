package com.freelance.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.freelance.backend.apirest.models.entity.Score;
import com.freelance.backend.apirest.models.services.IScoreService;

@RestController
@RequestMapping("/api")
public class ScoreRestController {

	@Autowired
	IScoreService scoreService;

	@GetMapping("scores")
	public List<Score> index() {
		return scoreService.findAll();

	}

	@PostMapping("/scores")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Score score) {
		scoreService.save(score);
	}

}
