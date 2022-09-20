package com.quintrix.dev.psn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PsnApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsnApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){ return new RestTemplate(); }
}
