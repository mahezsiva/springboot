package com.project.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//bean concept
//object factory
public class Springapp {

	public static void main(String[] args) {
      ClassPathXmlApplicationContext  context=new ClassPathXmlApplicationContext ("applicationContext.xml");
	  Coach thecoach=context.getBean("BaseballCoach",Coach.class);
	  System.out.println(thecoach.workout());
	  Coach theyCoach=context.getBean("BaseballCoach",Coach.class);
	  System.out.println(theyCoach.dailyfortune());
	  boolean result=(thecoach==theyCoach);
	  if(result==true) {
		  System.out.println("scope is singleton");
	  }
	  else {
		  System.out.println("scope is prototype");
	  }
	  context.close();
	}

}
