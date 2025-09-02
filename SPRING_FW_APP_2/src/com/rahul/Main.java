package com.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    
    	ApplicationContext container = 
    		    new FileSystemXmlApplicationContext("/spring.xml");
    	
    	
    	Object obj = container.getBean("student");
    	
    	Student std = (Student)obj;
    	
    	std.setName("Kumar");
    	
    	System.out.println("My name is :- " + std.getName());
    	
    	
//############################################################################################  
    	
Object obj2 = container.getBean("address");
    	
    	Address add = (Address)obj2;
    	
    	add.Setcity("Sasaram");
    	
    	System.out.println("My City is :- " + add.Getcity());
    
    	
    	
    	
    	
    	


  }
    }






