package com.rahul;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Address {

	public Address()
	{
		System.out.println("Adress object is created");
	}
	

	private String city;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	private String state;
	
	private String post;

	
	
	
}
