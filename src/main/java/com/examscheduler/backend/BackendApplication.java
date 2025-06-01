package com.examscheduler.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.examscheduler.backend", "com.examscheduler.backend.security"})
public class BackendApplication {

	public static void main(String[] args) {
		String port = System.getenv("PORT");
		if (port != null) {
			System.getProperties().put("server.port", port);
		}
		SpringApplication.run(BackendApplication.class, args);


	}
}