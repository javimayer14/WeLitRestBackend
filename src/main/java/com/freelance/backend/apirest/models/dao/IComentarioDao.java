package com.freelance.backend.apirest.models.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.freelance.backend.apirest.models.entity.Comentario;

public interface IComentarioDao extends CrudRepository<Comentario, Long> {

	@Query(value = ""
			+ " SELECT COUNT(u.id)"
			+ " FROM Comentario com"
			+ " INNER JOIN com.historia h"
			+ " INNER JOIN com.usuario u"
			+ " WHERE h.id = :idStory"
			+ " AND com.ganador = 1"
			+ " GROUP BY u.id")
	@Transactional
	public List<Long> findNumbersOfRecordsByStory(@Param("idStory") Long idStory);
	
	
}
