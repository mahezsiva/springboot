package com.project.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  context=new ClassPathXmlApplicationContext ("com/project/collections/collectionconfig.xml");
        Emp  ref=(Emp)context.getBean("ref");
        System.out.println(ref.getPhone());
        System.out.println(ref.getName());
        
	}

}
