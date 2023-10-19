package com.springcore.springbasics.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springbasics/collection/config.xml");
		Employee e1 = context.getBean("employee1", Employee.class);
		System.out.println(e1.getName());
		System.out.println(e1.getPhones());
		System.out.println(e1.getAddresses());
		System.out.println(e1.getCourses());
		System.out.println(e1.getDesignation());
		System.out.println(e1.getPhones().getClass().getName());

	}

}
