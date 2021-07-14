package com.arafat.social;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"user"})
@ComponentScan(basePackages={"post"})
@ComponentScan(basePackages={"location"})
public class SocialApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialApiApplication.class, args);
	}

}
