package com.freelance.backend.apirest;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.freelance.backend.apirest.models.services.HistoriaServiceImpl;

@SpringBootApplication
public class WelitApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(WelitApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				try {
					HistoriaServiceImpl historiaService= new HistoriaServiceImpl();
					historiaService.findlala();

				} catch (Exception e) {
					System.out.println("Rompio" + e);
				}
			}
		}, 0, 8000);

	}

}
