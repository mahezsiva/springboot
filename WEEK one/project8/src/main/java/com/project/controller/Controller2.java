package com.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
	
	@RequestMapping("/user")
	public String demo() {
		return "hello";
	}
	

}
