package com.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    
    	ApplicationContext container = 
    		    new FileSystemXmlApplicationContext("/spring.xml");    	   	


    	Object rahul = container.getBean("student");
    	
    	Student std = (Student)rahul;
    	      	
    	System.out.println("My name is :- " + std.getName());
    	
    	System.out.println(std.getName());
    	
    	
  }
    }






