package com.aspect.oriented.program;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"model", "service", "aspect"})
public class ProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgramApplication.class, args);
	}

}
