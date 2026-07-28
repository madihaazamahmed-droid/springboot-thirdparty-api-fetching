package com.example.thirdpartyapi_fetch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ThirdpartyapiFetchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThirdpartyapiFetchApplication.class, args);
	}
@Bean
RestTemplate restTemplate() {
	return new RestTemplate();
}
}
