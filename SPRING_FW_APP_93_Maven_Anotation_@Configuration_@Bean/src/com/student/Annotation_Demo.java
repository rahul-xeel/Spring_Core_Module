package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Annotation_Demo {

public static void main(String[] args) {
	
	
//	ApplicationContext container = new FileSystemXmlApplicationContext()

	
	ApplicationContext container = new AnnotationConfigApplicationContext(SpringBeanCOnfiguration.class);
	
	
	
	
	Mystudent  mystudent = (Mystudent)container.getBean("student1");
	
	 //	getting first bean
			
		System.out.println();
		System.out.println("***********************************************************************************");
		System.out.println();
		System.out.println("BEAN ID student1");
		System.out.println();
		System.out.println(mystudent);
		mystudent.setName("RAHUL");
		System.out.println(mystudent.getName());
		
		
	
	
	
	
	
    //	getting second bean
		
	COllege  college = (COllege)container.getBean("College1");
	
	System.out.println();
	System.out.println("***********************************************************************************");
	System.out.println();
	System.out.println("BEAN ID college1");
	System.out.println();
	System.out.println(college);
	System.out.println(college.getMystudent());
	System.out.println(college.getMystudent().getName());
	System.out.println();
	System.out.println("***********************************************************************************");
	System.out.println();
	


	
    //	getting third bean with some  default value
		
	COllege  college2 = (COllege)container.getBean("College2");
	
	System.out.println();
	System.out.println("***********************************************************************************");
	System.out.println();
	System.out.println("BEAN ID college2");
	System.out.println();
	System.out.println(college2.getName());
	System.out.println();
	System.out.println("***********************************************************************************");
	System.out.println();
	

	
	
    //	getting third bean with some  default value
	
	COllege  college3 = (COllege)container.getBean("getCOllege3");
	
	System.out.println();
	System.out.println("***********************************************************************************");
	System.out.println();
	System.out.println("BEAN ID college3");
	System.out.println();
	System.out.println(college3);
	System.out.println();
	System.out.println("***********************************************************************************");
	System.out.println();
	

	
}
	
	
}
