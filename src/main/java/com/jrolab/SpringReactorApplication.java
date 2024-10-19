package com.jrolab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.jrolab")
public class SpringReactorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactorApplication.class, args);
	}

}
