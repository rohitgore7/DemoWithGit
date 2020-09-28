package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/getHelloworld")
	public String sayHello() {
		return "Hello Rohit";
	}
}
