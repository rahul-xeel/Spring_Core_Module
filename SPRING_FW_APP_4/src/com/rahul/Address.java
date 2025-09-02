package com.rahul;

public class Address {
	
	
	public Address() 
	{
		System.out.println("ADDRESS CREATED");
	}
	
	
    public String getCity() {
    	
		return city;
	}
	public void setCity(String city) {
		System.out.println("setCity called with value " + city);
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		System.out.println("setPincode called with value " + pincode);

		this.pincode = pincode;
	}


	private String city;
    private int pincode;

}
