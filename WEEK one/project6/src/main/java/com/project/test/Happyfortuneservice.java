package com.project.test;

import org.springframework.stereotype.Component;

@Component
public class Happyfortuneservice implements FortuneService {


	public String fortunetell() {
		
		return "today is your day";
	}


}
