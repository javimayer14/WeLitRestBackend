package com.freelance.backend.apirest.models.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.freelance.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, String> {

	@Query(value = ""
			+ " FROM Usuario u"
			+ " WHERE u.id = :id")
	@Transactional
	Usuario findById2(@Param("id") String id);

}
