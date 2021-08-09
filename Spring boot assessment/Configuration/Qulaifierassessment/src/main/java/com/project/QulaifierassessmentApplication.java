package com.project;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.Student.HelloWorld;
import com.project.Student.HelloWorldConfig;



@SpringBootApplication
public class QulaifierassessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(QulaifierassessmentApplication.class, args);
		
		AnnotationConfigApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		   
		      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		      helloWorld.setMessage("hello everyone");
		      helloWorld.getMessage();
	
}
}