package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.example"})
@EnableMongoRepositories("com.example.dao")
public class MongobootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongobootApplication.class, args);
	}
}
