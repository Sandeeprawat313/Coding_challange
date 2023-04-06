package com.masi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.masai.core.CorsFilter;

@SpringBootApplication
public class CodingChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingChallengeApplication.class, args);
	}

	@Bean
	public CorsFilter corsFilter() {
		CorsFilter filter = new CorsFilter();
		return filter;
	}

}
