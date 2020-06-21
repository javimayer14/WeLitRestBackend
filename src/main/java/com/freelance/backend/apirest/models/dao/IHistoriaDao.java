 package com.freelance.backend.apirest.models.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.freelance.backend.apirest.models.entity.Historia;

public interface IHistoriaDao  extends CrudRepository<Historia,Long>{
	
	@Modifying
	@Query(value = "call insertarComentarioGanador(:id)", nativeQuery = true)
	@Transactional
	public void findBestComentFromHistory(@Param("id") Long id);
	
	
	@Query(
			"					 FROM Historia his" + 
			"					 WHERE his.activo =1" )
	public List<Historia> findAllStoriesActives();

	@Query(
			"					 FROM Historia his" + 
			"					 WHERE his.activo =0" )
	public List<Historia> findAllStoriesInActives();

	@Query(
			"					 FROM Historia his" + 
			"					 WHERE his.activo =0" +
					"			AND his.titulo LIKE %:titulo% ")
	public List<Historia>  findByName(@Param("titulo") String titulo);
} 

