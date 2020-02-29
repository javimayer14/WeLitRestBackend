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

import com.freelance.backend.apirest.models.entity.Historia;
import com.freelance.backend.apirest.models.services.IHistoriaService;

@RestController
@RequestMapping("/api")
public class HistoriaRestController {

	@Autowired
	IHistoriaService historiaService;

	@GetMapping("/historias")
	private List<Historia> index() {
		return historiaService.findAll();
	}
	
	@GetMapping("/historiasPrueba")
	private void prueba() {
		 historiaService.findBestComent(2L);
	}

	@PostMapping("/historias")
	@ResponseStatus(HttpStatus.CREATED)
	private void create(@RequestBody Historia historia) {
		historiaService.save(historia);
	}
}
