package com.sam.db.springdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.sam.db.springdb.repository")
@SpringBootApplication
public class SpringDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDbApplication.class, args);
	}
}
