package com.springcore.springbasics.referencetype;

public class Child {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Child(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Child() {
		super();
	}
	@Override
	public String toString() {
		return "Child [name=" + name + ", age=" + age + "]";
	}
	
	

}
