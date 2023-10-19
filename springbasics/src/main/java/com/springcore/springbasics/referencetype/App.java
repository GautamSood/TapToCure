package com.springcore.springbasics.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springbasics.collection.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springbasics/referencetype/config.xml");
		Parent parent = context.getBean("parent1", Parent.class);
		System.out.println(parent);
		System.out.println(parent.getName());
		System.out.println(parent.getAge());
		System.out.println(parent.getObj());
		System.out.println(parent.getObj().getName());
		System.out.println(parent.getObj().getAge());
		Parent parentobj = context.getBean("parent2", Parent.class);
		System.out.println(parentobj);
		Parent parentobj1 = context.getBean("parent3", Parent.class);
		System.out.println(parentobj1);
	}

}
