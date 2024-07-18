package com.example.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}

	@GetMapping("/allow1")
	public String getAllowFirst() {
		return "allow1";
	}
}
