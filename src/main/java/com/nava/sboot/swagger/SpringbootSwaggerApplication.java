package com.nava.sboot.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSwaggerApplication.class, args);
	}

}
