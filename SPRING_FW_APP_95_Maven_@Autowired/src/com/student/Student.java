package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
	
	
	
	
	public Student() 
	{
		System.out.println();
		System.out.println("***********************************************************************************");
		System.out.println();
		System.out.println("Student Object Created");
	}
	
	
	
	private String name;
	
	
	public Address getAddress() {
		return address;
	}



	@Autowired
	private Address address;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

	

}
