package com.springcore.springbasics.standalonecollection;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> course;
	private Map<String,String> courses;
	
	public Person(List<String> course, Map<String, String> courses) {
		super();
		this.course = course;
		this.courses = courses;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Person [course=" + course + ", courses=" + courses + "]";
	}
	
	
	
}
