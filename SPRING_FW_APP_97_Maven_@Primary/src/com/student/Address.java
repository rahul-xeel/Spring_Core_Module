package com.student;

import org.springframework.stereotype.Component;


public class Address {
	
	public Address(String city) 
	{
		this.city = city;
	}

	private String city;
	private int pincode;
	
	public Address() 
	{
		System.out.println();
		System.out.println("***********************************************************************************");
		System.out.println();
		System.out.println("Address Object Created");
	}
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	

	

	

}
