package com.sonata.mvc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class OrderController {
	
	@RequestMapping("/")
	public String sayHi() {
		return "This is a spring controller";
	}

}
