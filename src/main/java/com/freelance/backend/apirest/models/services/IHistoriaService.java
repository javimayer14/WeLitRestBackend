package com.freelance.backend.apirest.models.services;

import java.util.List;
import com.freelance.backend.apirest.models.entity.Historia;

public interface IHistoriaService {

	public List<Historia> findAll();
	
	public void save (Historia historia);
	
	public void findBestComent(Long id);

	public List<Historia> findAllStoriesActives();

	List<Historia> findlala();

}
