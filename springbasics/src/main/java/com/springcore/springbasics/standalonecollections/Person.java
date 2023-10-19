package com.springcore.springbasics.standalonecollections;

import java.util.List;
import java.util.Map;

public class Person {
	
	private List<String> name;
	private Map<String, Integer> courses;
	
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public Map<String, Integer> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}
	public Person(List<String> name, Map<String, Integer> courses) {
		super();
		this.name = name;
		this.courses = courses;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", courses=" + courses + "]";
	}
	
	

}
