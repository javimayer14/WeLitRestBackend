package com.freelance.backend.apirest;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.freelance.backend.apirest.models.dao.IHistoriaDao;
import com.freelance.backend.apirest.models.entity.Historia;
import com.freelance.backend.apirest.models.services.HistoriaServiceImpl;
import com.freelance.backend.apirest.models.services.IHistoriaService;

@SpringBootApplication
public class WelitApplication implements CommandLineRunner {

	@Autowired
	IHistoriaService historiaService;

	public static void main(String[] args) {
		SpringApplication.run(WelitApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				try {
					List<Historia> historiasActivas = historiaService.findAllStoriesActives();
					for(Historia his : historiasActivas) {
						historiaService.findBestComent(his.getId());
						System.out.println("Agrego mejor comentario a historia:" +his.getId()+ " fecha: " + new java.util.Date());
					}
									
				} catch (Exception e) {
					System.out.println("Rompio" + e);
				}
			}
		}, 0, 8000);

	}

}
