package com.rahul;

public class Student {

	
    public String getName() {
		return name;
	}
	public void setName(String name) {

		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {

		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}


	private String name;
    private int age;
    private int roll;
    
    
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", roll=" + roll + "]";
	}
    


    
    
}
