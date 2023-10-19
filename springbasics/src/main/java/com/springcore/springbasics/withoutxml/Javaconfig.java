package com.springcore.springbasics.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackages="com.springcore.springbasics.withoutxml")
public class Javaconfig {
	
	@Bean
	public Employer getEmployer() {
		return new Employer();
	}
	@Bean
	public Students getStudents() {
		Students st=new Students(2,"Prats",getEmployer());
		return st;
	}


}
