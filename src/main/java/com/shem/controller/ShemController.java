package com.shem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShemController {
	
	@GetMapping("/")
	public String businesslogic() {
		return "<h1 style='color:blue'><marquee behavior=alternate> Welcome to the world of Spring Boot Applications </marquee></h1>";
	}
	
	
	
}
