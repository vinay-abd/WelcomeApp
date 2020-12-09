package com.vinay.jenkins;

import javax.servlet.ServletContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.ServletContextApplicationContextInitializer;

@SpringBootApplication
public class WelcomeAppApplication extends ServletContextApplicationContextInitializer{

	public WelcomeAppApplication(ServletContext servletContext) {
		super(servletContext);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SpringApplication.run(WelcomeAppApplication.class, args);
	}

}
