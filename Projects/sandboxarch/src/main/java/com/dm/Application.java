package com.dm;

import com.dm.Sandbox.Sand;
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


		Sand s = new Sand();
		s.doStuff();


	}
}
