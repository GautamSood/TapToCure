package com.springcore.springbasics.referencetype;

public class Parent {
	
	private String name;
	private int age;
	private Child obj;
	
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
	public Child getObj() {
		return obj;
	}
	public void setObj(Child obj) {
		this.obj = obj;
	}
	public Parent(String name, int age, Child obj) {
		super();
		this.name = name;
		this.age = age;
		this.obj = obj;
	}
	public Parent() {
		super();
	}
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + ", obj=" + obj + "]";
	}
	
	

}
