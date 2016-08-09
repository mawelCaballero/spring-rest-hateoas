package com.opencredo.demo.hateoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// System.setProperty("spring.devtools.restart.enabled", "false");
		final ApplicationContext context = SpringApplication.run(Application.class, args);
	}

}
