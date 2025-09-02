package com.rahul;

public class Student {
	
	
	public Student() 
	{
		System.out.println("Student CREATED");
	}
	
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setName called with value " + name);

		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("setAge called with value " + age);

		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		System.out.println("setRoll called with value " + roll);
		this.roll = roll;
	}


	private String name;
    private int age;
    private int roll;
    
    
}
