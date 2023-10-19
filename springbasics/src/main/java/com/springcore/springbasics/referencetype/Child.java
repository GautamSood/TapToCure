package com.springcore.springbasics.referencetype;

public class Child {
	private String firstName;
	private int birth;
	public Child(String firstName, int birth) {
		super();
		this.firstName = firstName;
		this.birth = birth;
	}
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "Child [firstName=" + firstName + ", birth=" + birth + "]";
	}

	
}
