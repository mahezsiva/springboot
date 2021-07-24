package com.project.demo;

import org.springframework.stereotype.Component;


public class Happyfortuneservice implements FortuneService {
	

	@Override
	public String fortuneservice() {
		
		return "today is your lucky day";
	}
	public void test() {
		System.out.println("bean initialized");
	}
	public void demo() {
		System.out.println("bean destroyed");
	}


}
