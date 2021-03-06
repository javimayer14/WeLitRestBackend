package com.freelance.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.backend.apirest.models.entity.Comentario;
import com.freelance.backend.apirest.models.services.IComentarioService;

@RestController
@RequestMapping("/api")
public class ComentarioRestController {

	@Autowired
	IComentarioService comentarioService;

	@GetMapping("/comentarios")
	public List<Comentario> index() {
		return comentarioService.findAll();
	}

	@GetMapping("comentarios/comentariosPorHistoria/{id}")
	public Long findNumbersOfRecordsByStory(@PathVariable Long id) {
		return comentarioService.findNumbersOfRecordsByStory(id);
	}

	@PostMapping("/comentarios")
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody Comentario comentario) {
		comentarioService.save(comentario);
	}

	@DeleteMapping("comentarios/{id}")
	public void delete(@PathVariable Long id) {
		comentarioService.delete(id);
	}

	@PutMapping("comentarios/{id}")
	public void update(@RequestBody Comentario comentario, @PathVariable Long id) {
		Comentario comentarioActual = comentarioService.findById(id);

		comentarioActual.setMg(comentarioActual.getMg() + 1);
		comentarioActual.setCreateAt(comentario.getCreateAt());
		comentarioService.save(comentarioActual);

	}

}
