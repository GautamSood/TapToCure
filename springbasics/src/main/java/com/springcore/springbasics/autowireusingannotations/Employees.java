package com.springcore.springbasics.autowireusingannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employees {
	
	
	private String name;
	@Autowired
	@Qualifier("address1")
	private Address add;
	
	public Employees(String name, Address add) {
		super();
		this.name = name;
		this.add = add;
	}
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", add=" + add + "]";
	}
	
	

	
	

	
}
