package com.example.index_contact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexAndContact {
	
	@GetMapping("/index")
	public String index() {
		return "This is the main page";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}
}
