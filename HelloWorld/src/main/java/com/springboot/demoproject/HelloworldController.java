package com.springboot.demoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	@GetMapping("/hello")
	public String test() {
		return "Hello World!! Thanks for hitting the application!!";
	}
}

