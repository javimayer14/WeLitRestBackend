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

import com.freelance.backend.apirest.models.entity.Reaccion;
import com.freelance.backend.apirest.models.services.IReaccionService;

@RestController
@RequestMapping("/api")
public class ReaccionRestController {
	@Autowired
	IReaccionService reaccionService;

	@GetMapping("reacciones")
	public List<String> index() {
		return reaccionService.findAll();

	}

	@PostMapping("reacciones")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Reaccion reaccion) {
		reaccionService.save(reaccion);

	}
}
