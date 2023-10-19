package com.springcore.springbasics.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
		Student s1 = context.getBean("getStudent", Student.class);
		s1.study();
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());
		//s1.getEmployee().work();
	}

}
