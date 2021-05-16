package com.vinay.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeAppApplication extends ServletContextApplicationContextInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeAppApplication.class, args);
	}
}
