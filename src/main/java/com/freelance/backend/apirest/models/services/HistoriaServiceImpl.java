package com.freelance.backend.apirest.models.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.freelance.backend.apirest.models.dao.IComentarioDao;
import com.freelance.backend.apirest.models.dao.IHistoriaDao;
import com.freelance.backend.apirest.models.dao.IRangoDao;
import com.freelance.backend.apirest.models.dao.IUsuarioDao;
import com.freelance.backend.apirest.models.entity.Comentario;
import com.freelance.backend.apirest.models.entity.Historia;
import com.freelance.backend.apirest.models.entity.Rango;
import com.freelance.backend.apirest.models.entity.Usuario;

@Service
public class HistoriaServiceImpl implements IHistoriaService {

	public static final Integer ACTIVO = 1;
	public static final Integer INACTIVO = 0;
	public static final Integer COMENTARIOS_MINIMOS = 3;
	public static final Integer PTS_ORO = 100;
	public static final Integer PTS_PLATA = 40;
	public static final Integer PTS_BRONCE = 20;
	
	Logger logger;

	@Autowired
	IHistoriaDao historiaDao;
	@Autowired
	IUsuarioDao usuarioDao;
	@Autowired
	IComentarioDao comentarioDao;
	@Autowired
	IRangoDao rangoDao;

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

	@Override

	public List<Historia> findAllStoriesInActives() {
		return historiaDao.findAllStoriesInActives();
	}

	@Transactional
	@Scheduled(cron = "0 15 19 * * *", zone = "America/Buenos_Aires")
	public List<Historia> findlala() {

		System.out.println("Arranca");
		List<Historia> historiasActivas = historiaDao.findAllStoriesActives();
		for (Historia his : historiasActivas) {
			List<Comentario> comentarios = his.getComentarios();
			List<Comentario> comentariosParticipando = comentarios.stream()
					.filter(coment -> coment.getGanador().equals(INACTIVO) && coment.getParticipando().equals(ACTIVO))
					.collect(Collectors.toList());

			Comparator<Comentario> compareByMg = (Comentario o1, Comentario o2) -> {
				Integer reactionCount = o1.getReacciones().size();
				Integer reactionCount2 = o2.getReacciones().size(); 
				return reactionCount.compareTo(reactionCount2);
			};	
			Collections.sort(comentariosParticipando, compareByMg.reversed());
			System.out.println("Comentarios ordenados");

			try {
				if (comentariosParticipando.isEmpty()) {
					System.out.println("comentarios participando vaciio");

					break;
				}
				System.out.println("empezando a dar puntos a los usuarios");
				firstUser(comentariosParticipando);
				secondUser(comentariosParticipando);
				thirdUser(comentariosParticipando);

				for (Comentario com : comentariosParticipando) {
					com.setParticipando(INACTIVO);
				}
				System.out.println("Guardo comentarios");
				comentarioDao.saveAll(comentariosParticipando);

				if (his.getCapitulos().equals(comentariosParticipando.get(0).getCapitulo())) {
					his.setActivo(INACTIVO);
					historiaDao.save(his);
				}
				System.out.println("FIN");

			} catch (Exception e) {
				System.out.println("No se pudo setear las medallas a los ganadores");
			}

		}
		return historiasActivas;
	}

	private void firstUser(List<Comentario> comentariosParticipando) {
		Usuario usuarioGanador = comentariosParticipando.get(0).getUsuario();
		Integer medallaOro = usuarioGanador.getScore().getMedallaOro();
		usuarioGanador.getScore().setMedallaOro(medallaOro + 1);
		//puntation(usuarioGanador);
		comentariosParticipando.get(0).setGanador(1);
		usuarioDao.save(usuarioGanador);
	}

	private void secondUser(List<Comentario> comentariosParticipando) {
		if (comentariosParticipando.size() >= 2) {
			Usuario usuarioSegundo = comentariosParticipando.get(1).getUsuario();
			Integer medallaPlata = usuarioSegundo.getScore().getMedallaPlata();
			usuarioSegundo.getScore().setMedallaPlata(medallaPlata + 1);
			//puntation(usuarioSegundo);
			comentariosParticipando.get(0).setGanador(1);

			usuarioDao.save(usuarioSegundo);
		}
	}

	private void thirdUser(List<Comentario> comentariosParticipando) {
		if (comentariosParticipando.size() >= 3) {
			Usuario usuarioTercero = comentariosParticipando.get(2).getUsuario();
			Integer medallaBronce = usuarioTercero.getScore().getMedallaBronce();
			usuarioTercero.getScore().setMedallaBronce(medallaBronce + 1);
			//puntation(usuarioTercero);
			usuarioDao.save(usuarioTercero);
		}
	}

	private Usuario puntation(Usuario usuario) {
		Integer oro = usuario.getScore().getMedallaOro();
		Integer plata = usuario.getScore().getMedallaPlata();
		Integer bronce = usuario.getScore().getMedallaBronce();
		Integer puntuacion = ((oro * PTS_ORO) + (plata * PTS_PLATA) + (bronce * PTS_BRONCE));
//		List<Rango> rangos = (List<Rango>) rangoDao.findAll();
//		Rango rango = new Rango();
//		for (Rango r : rangos) {
//			if (puntuacion >= r.getPuntuacionMinima()) {
//				rango = r;
//			}
//		}
		usuario.getScore().setPuntuacion(puntuacion);
//		usuario.setRango(rango);
		return usuario;
	}

	@Override
	public List<Historia> findByName(String titulo) {
		return historiaDao.findByName(titulo);
	}

}
