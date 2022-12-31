


package com.ioc.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class custAddMain {

	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("bangalore.xml");
		
		Customer c1= (Customer)context.getBean("virat");
		Address a=(Address)context.getBean("xyz");
		
//		System.out.println(a);
		
		
		System.out.println(c1.getHome());
		System.out.println(c1);

	}

}
