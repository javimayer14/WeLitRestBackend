package com.freelance.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.freelance.backend.apirest.models.entity.Reaccion;

public interface IReaccionDao extends CrudRepository<Reaccion, Long> {

	@Query("SELECT re.usuario.id FROM Reaccion re")
	public List<String> findAllReactions();
	

}
