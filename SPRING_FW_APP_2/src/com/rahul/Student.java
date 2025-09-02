package com.rahul;

public class Student {
	
	
	public Student() 
	{
		System.out.println("Student CREATED");
	}
	
	
    private String name;
    private int age;
    private int roll;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return this.roll;
    }
}
