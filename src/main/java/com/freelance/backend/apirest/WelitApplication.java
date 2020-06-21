package com.freelance.backend.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WelitApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelitApplication.class, args);

	}

}
