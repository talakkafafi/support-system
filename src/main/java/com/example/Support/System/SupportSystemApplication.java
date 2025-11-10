package com.example.Support.System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.Support.System.entity")
@EnableJpaRepositories("com.example.Support.System.entity.support")
public class SupportSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupportSystemApplication.class, args);
	}

}
