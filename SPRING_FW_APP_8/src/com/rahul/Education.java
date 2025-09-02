package com.rahul;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Education {

	public Education()
	{
		System.out.println("Education object is created");
	}
	
	

	private String enter_marks;
	
	private String matric_marks;
	
	private String graduation_marks;
	
	
	private Address address;
	
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEnter_marks() {
		return enter_marks;
	}

	public void setEnter_marks(String enter_marks) {
		this.enter_marks = enter_marks;
	}

	public String getMatric_marks() {
		return matric_marks;
	}

	public void setMatric_marks(String matric_marks) {
		this.matric_marks = matric_marks;
	}

	public String getGraduation_marks() {
		return graduation_marks;
	}

	public void setGraduation_marks(String graduation_marks) {
		this.graduation_marks = graduation_marks;
	}
	
	
	
}
