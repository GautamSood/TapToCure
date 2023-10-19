package com.springcore.springbasics.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springbasics/standalonecollections/config.xml");
		Person p1 = context.getBean("person1", Person.class);
		Person p2 = context.getBean("person2", Person.class);
		System.out.println(p1.getName());
		System.out.println(p1.getCourses());
		System.out.println(p1.getName().getClass().getName());
		System.out.println(p2.getName());
		System.out.println(p2.getCourses());
		System.out.println(p2.getCourses().getClass().getName());
	}

}
