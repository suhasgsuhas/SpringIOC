


package com.ioc.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class custAddMain {

	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("mysore.xml");
		
		Customer c1= (Customer)context.getBean("virat");
		
		
		System.out.println(c1);

	}

}
