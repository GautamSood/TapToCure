package com.springcore.springbasics;

public class Student {
	
	private int StudentId;
	private String StudentName; 
	private String StudentAddress;
	

	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setter Id is called");
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setter Name is called");
		StudentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setter Address is called");
		StudentAddress = studentAddress;
	}
	public Student(int StudentId, String StudentName, String StudentAddress) {
		super();
		System.out.println("Constructor is called");
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.StudentAddress = StudentAddress;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}

}
