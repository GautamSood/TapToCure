package com.springcore.springbasics.withoutxml;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.springbasics.withoutxml")
public class Javaconfig {
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean
	public Student getStudent() {
		Student st = new Student(12, "Nancy", getEmployee());
		return st;
	}
}
