package com.project.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.test.FortuneService;


@Component("thatcoach")
public class Baseball implements Coach {
	@Autowired
	private FortuneService service;
	public Baseball(FortuneService theservice) {
		service=theservice;
	}
	
	public String workout() {
		return "Run for 10km";
	}

	public String fortunemethod() {
		return service.fortunetell();
		
		
	}

	

}
