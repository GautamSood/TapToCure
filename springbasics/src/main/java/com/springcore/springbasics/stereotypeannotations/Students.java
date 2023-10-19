package com.springcore.springbasics.stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stu")
@Scope("prototype")
public class Students {
	@Value("Disha")
	private String studentName;
	@Value("Gurgaon")
    private String city;
	
	@Value("#{sample}")   //spEL=spring expression lang
	private List<String> listNames;

	
	
	public Students(String studentName, String city, List<String> listNames) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.listNames = listNames;
	}

	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getListNames() {
		return listNames;
	}

	public void setListNames(List<String> listNames) {
		this.listNames = listNames;
	}



	@Override
	public String toString() {
		return "Students [studentName=" + studentName + ", city=" + city + ", listNames=" + listNames + "]";
	}
    
	
	
	
	
} 
