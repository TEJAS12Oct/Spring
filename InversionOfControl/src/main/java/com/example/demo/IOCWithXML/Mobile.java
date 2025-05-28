package com.example.demo.IOCWithXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Java Program to Illustrate Mobile Class
public class Mobile {

	// Main driver method
	public static void main(String[] args) {

		// Using ApplicationContext tom implement Spring IoC
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		// Get the bean
		Sim sim = applicationContext.getBean("sim", Sim.class);

		// Calling the methods
		sim.calling();
		sim.data();

		Sim sim1 = applicationContext.getBean("sim1", Sim.class);

		// Calling the methods
		sim1.calling();
		sim1.data();
	}
}

// beans.xml present in src/main/resources
//In the beans.xml file, we have created beans. 
//So inside the id, we have to pass the unique id 
//and inside the class, we have to pass the Class name 
//for which you want to create the bean. 
//Later on, inside the main method, we can tweek it out that 
//will be described in the upcoming program.