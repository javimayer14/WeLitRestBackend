package com.freelance.backend.apirest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.backend.apirest.models.entity.Usuario;
import com.freelance.backend.apirest.models.services.IUsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

	@Autowired
	IUsuarioService usuarioService;

	@GetMapping("usuarios")
	public List<Usuario> index() {
		return usuarioService.findAll();
	}

	@GetMapping("usuario/{id}")
	public Optional<Usuario> usuario(@PathVariable String id) {
		return usuarioService.findById(id);

	}

	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Usuario usuario) {
		usuarioService.save(usuario);
	}

	@PutMapping("usuario/{id}")
	public void update(@RequestBody Usuario usuario, @PathVariable String id) {
		Usuario usuarioActual = usuarioService.findById2(id);
		if (usuario.getNombre() != null) {
			usuarioActual.setNombre(usuario.getNombre());
		}
		if (usuario.getEmail() != null) {
			usuarioActual.setEmail(usuario.getEmail());
		}
		usuarioService.save(usuarioActual);

	}
}
