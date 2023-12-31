package com.example.index_contact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("/hello")
	public String hello(@RequestParam String location, @RequestParam String name) {
		return "Welcome to the " + location +  " " + name + "!";
	}
}
