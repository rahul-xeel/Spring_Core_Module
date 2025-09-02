package com.rahul;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Address {

	
	
	private List<String> city;
	
	private Set<String> books;
	
	private Map<String, Integer> hobbies;

	
	
	
	
	
	
	
	
	public Map<String, Integer> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Map<String, Integer> hobbies) {
		this.hobbies = hobbies;
		
	
	}
	
	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	public Set<String> getBooks() {
		return books;
	}

	public void setBooks(Set<String> books) {
		this.books = books;
	}
    
	
	
	
	
	
}
