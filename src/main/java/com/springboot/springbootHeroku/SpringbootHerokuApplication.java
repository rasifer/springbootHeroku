package com.springboot.springbootHeroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SpringbootHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHerokuApplication.class, args);
	}
	
	@RequestMapping("/home")
	public String index() {
		return "index";
	}

}
