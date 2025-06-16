package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/hello/{name}/{age}")
	public String hello(@PathVariable String name, @PathVariable int age) {
		return "Name: " + name + ", Age: " + age;
	}
}
