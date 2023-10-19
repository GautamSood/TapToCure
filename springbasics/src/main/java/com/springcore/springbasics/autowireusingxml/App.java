package com.springcore.springbasics.autowireusingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springbasics/autowireusingxml/config.xml");
		Employee e1 = context.getBean("emp1", Employee.class);
		System.out.println(e1);
}
}
