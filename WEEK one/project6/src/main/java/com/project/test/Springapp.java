package com.project.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//bean concept
//object factory
public class Springapp {

	public static void main(String[] args) {
    ClassPathXmlApplicationContext  context=new ClassPathXmlApplicationContext ("applicationContext.xml");
	  Coach thecoach=context.getBean("thatcoach",Coach.class);
	  System.out.println(thecoach.workout());
	  System.out.println(thecoach.fortunemethod());
	  context.close();
	  
	 
	 
	}

}