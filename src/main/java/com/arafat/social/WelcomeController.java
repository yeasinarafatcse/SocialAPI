package com.arafat.social;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping(value="/welcome")
	public static String welcome() {
		return "Welcome to Spring Boot";
	}
	
}
