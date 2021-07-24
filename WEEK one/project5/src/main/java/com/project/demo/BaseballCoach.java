package com.project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class BaseballCoach implements Coach{

	
	private FortuneService service;
	public BaseballCoach(FortuneService theservice) {
		service=theservice;
	}
	
	public String workout( ) {
		return "workout for 30 minutes";

	}

	
	public String dailyfortune() {
	
		return service.fortuneservice();
	}
	

	}
