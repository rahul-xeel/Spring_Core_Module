package com.hospital;

public class Patient {
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}



	private int id;
	private String name;
	private long mobile;
	

	public Patient() {
		
		System.out.println("Patient bean created, using default constructure");
		
	}
	
	
	public Patient(int id) {
		
		System.out.println("Patient bean created, using 1 arg");
		this.id = id;
		System.out.println("Id :- "+ id + " Name :- " +  name + " Mobile no :- "+ mobile);
		
	}

	
	
	public Patient(int id, String name, long mobile) {
		
		System.out.println("Patient bean created, using 3 args");
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		
		System.out.println("Id :- "+ id + " Name :- " +  name + " Mobile no :- "+ mobile);
		
	}
	
	
	
	

	

	
}

