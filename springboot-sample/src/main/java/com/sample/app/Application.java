package com.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	
	@RequestMapping("/test")
	public String test() {
		
		System.out.println("Testing rest service");
		
		return "success";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}
