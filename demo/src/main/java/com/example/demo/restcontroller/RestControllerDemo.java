package com.example.demo.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

	@GetMapping("/login")
	String findAll() {
		return "OK!!";
	}

}
