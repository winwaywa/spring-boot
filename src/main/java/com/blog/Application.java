package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class }) // tắt yêu cầu authenticate
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}