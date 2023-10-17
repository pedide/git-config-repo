package com.motika.SpringCloudMotokaClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class HelloController {
	
	@Value("${message: Bonjour}")
	private String message;
	
	@GetMapping("/msg")
	public String getWelcomeMessage() {
		return message;
	}
}
