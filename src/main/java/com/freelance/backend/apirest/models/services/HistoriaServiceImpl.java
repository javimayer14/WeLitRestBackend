package com.freelance.backend.apirest.models.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.freelance.backend.apirest.models.dao.IComentarioDao;
import com.freelance.backend.apirest.models.dao.IHistoriaDao;
import com.freelance.backend.apirest.models.dao.IUsuarioDao;
import com.freelance.backend.apirest.models.entity.Comentario;
import com.freelance.backend.apirest.models.entity.Historia;
import com.freelance.backend.apirest.models.entity.Usuario;

@Service
public class HistoriaServiceImpl implements IHistoriaService {

	@Autowired
	IHistoriaDao historiaDao;
	@Autowired
	IUsuarioDao usuarioDao;
	@Autowired
	IComentarioDao comentarioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Historia> findAll() {
		return (List<Historia>) historiaDao.findAll();
	}

	public void save(Historia historia) {
		historiaDao.save(historia);
	}

	@Override
	public void findBestComent(Long id) {
		historiaDao.findBestComentFromHistory(id);
	}

	@Override
	public List<Historia> findAllStoriesActives() {
		return historiaDao.findAllStoriesActives();
	}

	public List<Historia> findlala() {
		List<Historia> historiasActivas = historiaDao.findAllStoriesActives();
		for (Historia his : historiasActivas) {
			List<Comentario> comentarios = his.getComentarios();
			List<Comentario> comentariosParticipando = comentarios.stream().filter(coment -> coment.getGanador() == 0)
					.collect(Collectors.toList());

			Comparator<Comentario> compareByMg = (Comentario o1, Comentario o2) -> o1.getMg().compareTo(o2.getMg());
			Collections.sort(comentariosParticipando, compareByMg.reversed());

			try {
				if (comentariosParticipando.size() >= 3) {
					
					Usuario usuarioGanador = comentariosParticipando.get(0).getUsuario();
					Integer medallaOro = usuarioGanador.getScore().getMedallaOro();
					usuarioGanador.getScore().setMedallaOro(medallaOro + 1);
					comentariosParticipando.get(0).setGanador(1);
					comentarioDao.save(comentariosParticipando.get(0));
					usuarioDao.save(usuarioGanador);


					Usuario usuarioSegundo = comentariosParticipando.get(1).getUsuario();
					Integer medallaPlata = usuarioSegundo.getScore().getMedallaPlata();
					usuarioSegundo.getScore().setMedallaPlata(medallaPlata + 1);
					comentariosParticipando.get(1).setGanador(1);
					comentarioDao.save(comentariosParticipando.get(1));
					usuarioDao.save(usuarioSegundo);


					Usuario usuarioTercero = comentariosParticipando.get(2).getUsuario();
					Integer medallaBronce = usuarioTercero.getScore().getMedallaPlata();
					usuarioTercero.getScore().setMedallaBronce(medallaBronce + 1);
					comentariosParticipando.get(2).setGanador(1);
					comentarioDao.save(comentariosParticipando.get(2));
					usuarioDao.save(usuarioTercero);


				}


			} catch (Exception e) {
				System.out.println("ERROR:" + e);
			}

			his.setComentarios(comentariosParticipando);

		}
		return historiasActivas;
	}

}
