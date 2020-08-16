package com.freelance.backend.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.backend.apirest.models.entity.Rango;
import com.freelance.backend.apirest.models.services.IRangoService;

@RestController
@RequestMapping("/api")
public class RangoRestController {

	@Autowired
	IRangoService rangoService;

	@GetMapping("rangos")
	public Rango index() {
		return rangoService.findAll();

	}

	@PostMapping("rango")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Rango rango) {
		rangoService.save(rango);

	}
}
