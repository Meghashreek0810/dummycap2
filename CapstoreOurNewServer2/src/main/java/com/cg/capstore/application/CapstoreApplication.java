package com.cg.capstore.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.cg.capstore.repo")
@ComponentScan("com.cg.capstore")
@EntityScan("com.cg.capstore.beans")
@SpringBootApplication
public class CapstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoreApplication.class, args);
	}
}
