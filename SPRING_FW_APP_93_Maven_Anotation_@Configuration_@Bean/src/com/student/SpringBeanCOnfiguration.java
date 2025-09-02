package com.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;





@Configuration
public class SpringBeanCOnfiguration {
	
	
	@Bean("student1")
	public Mystudent getMystudent() 
	{
		return new Mystudent();
	}
	
	
	@Bean("College1")   // passing one object to another object
	public COllege getCOllege() 
	{
		
		COllege clg = new COllege();
		
		Mystudent mst = new Mystudent();
		mst.setName("Rahul Kumar");
		
		clg.setMystudent(mst);
		
		return clg;

	}
	
	
	
	
	@Bean("College2")   // used to provide some default values
	public COllege getCOllege2() 
	{
		COllege clg = new COllege();
		clg.setName("Miet Group Of Institution");
		
		return clg;
	}
	
		
	@Bean   // you can cath the bean by using method name of the bean class whose bean id id not mentioned
	public COllege getCOllege3() 
	{
		
		return new COllege();
	}
	
	

}
