package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "aspects", "controller", "repository", "service" })
@EntityScan({ "repository" })
@EnableJpaRepositories("repository")

public class CgWebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CgWebProjectApplication.class, args);
	}

}
