package com.hospital;

import java.util.List;

public class Patient {
	


	private int id;
	private String name;
	private long mobile;
	
	private List<String> medicine;
	
	
	
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



	public List<String> getMedicine() {
		return medicine;
	}



	public void setMedicine(List<String> medicine) {
		this.medicine = medicine;
	}



	public Patient(int id, String name, long mobile, List<String> medicine)
 {
		
		System.out.println("Patient bean created, using 4 args");
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.medicine = medicine;
		
		System.out.println("Id :- "+ id + " Name :- " +  name + " Mobile no :- "+ mobile);
		
	}
	
	

	public Patient(List<String> medicine)
 {
		
		System.out.println("Patient bean created, using 1 args");
		
		this.medicine = medicine;		
	}
	
	
	


	public Patient(String name)
 {
		
		System.out.println("Patient bean created, using 1 args");
		
		this.name = name;		
	}
	
	

	

	
}

