package com.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@ComponentScan("com.studen2")
//@ComponentScan("com.student")
//@ComponentScan("com.*")
//@ComponentScan("org.*")

@Configuration
@ComponentScan(basePackages = {"com.*","rahul.*"})

public class SpringBeanCOnfiguration {
	
	


}
