package com.freelance.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/historia/{titulo}")
	private List<Historia>  findByName(@PathVariable String titulo) {
		return historiaService.findByName(titulo);
	}
	
	@GetMapping("/historiasActivas")
	private List<Historia> historiasActivas() {
		return historiaService.findAllStoriesActives();
	}
	@GetMapping("/historiasInactivas")
	private List<Historia> historiasInactivas() {
		return historiaService.findAllStoriesInActives();
	}
	
	@GetMapping("/historiasPrueba")
	private List<Historia> prueba() {
		return historiaService.findlala();
	}

	@PostMapping("/historias")
	@ResponseStatus(HttpStatus.CREATED)
	private void create(@RequestBody Historia historia) {
		historiaService.save(historia);
	}
}
