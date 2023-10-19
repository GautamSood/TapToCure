package com.springcore.springbasics.stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springbasics/stereotypeannotations/config.xml");
		Student s1 = context.getBean("stud", Student.class);
		Student s2= context.getBean("stud", Student.class);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
