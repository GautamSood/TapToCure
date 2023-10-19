package com.springcore.springbasics.withoutxml;

import org.springframework.stereotype.Component;

//@Component("stud")
public class Students {
	
	private int   roll ;
	private String name;
	private Employer employer;
	
	
	public Students(int roll, String name, Employer employer) {
		super();
		this.roll = roll;
		this.name = name;
		this.employer = employer;
	}

	

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Employer getEmployer() {
		return employer;
	}



	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	
	
	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", employer=" + employer + "]";
	}



	public void study() {
		employer.work();
		System.out.println("studying");
	}
}