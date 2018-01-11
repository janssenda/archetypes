package com.dm.jdbcboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(ImpulseReactorApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
