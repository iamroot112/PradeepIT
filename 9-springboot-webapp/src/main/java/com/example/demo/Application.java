package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class Application {
 
	public static void main(String[] args) {
		//ConfigurableApplicationContext Context=
		SpringApplication.run(Application.class, args);
		//System.out.println(Context.getClass().getName());
	}
	

}
