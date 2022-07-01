package com.springAppdockerjenkins.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringAppDockerJenkinsApplication {
	
	@GetMapping("/message")
	public String hello() {
		return "Hello Suresh Welcome to jenkins with Docker..";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAppDockerJenkinsApplication.class, args);
	}

}
