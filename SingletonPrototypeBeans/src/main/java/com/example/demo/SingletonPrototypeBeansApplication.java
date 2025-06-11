package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SingletonPrototypeBeansApplication {

	public static void main(String[] args) {
		// Load the Spring XML configuration
		// file into IoC container
		ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");

		// Get the "HelloWorld" bean object
		// and call getName() method
		// HelloWorld Geeks1 = (HelloWorld) ap.getBean("hw");
		HelloWorld Geeks1 = (HelloWorld) ap.getBean("hw1");

		// Set the name
		Geeks1.setName("Geeks1");
		System.out.println("Hello object (hello1)" + " Your name is: " + Geeks1.getName());

		// Get another "HelloWorld" bean object
		// and call getName() method
		//	HelloWorld Geeks2 = (HelloWorld) ap.getBean("hw");
		HelloWorld Geeks2 = (HelloWorld) ap.getBean("hw1");

		System.out.println("Hello object (hello2)" + " Your name is: " + Geeks2.getName());

		// Now compare the references to see
		// whether they are pointing to the
		// same object or different object
		System.out.println("'Geeks1' and 'Geeks2'" + " are referring" + "to the same object: " + (Geeks1 == Geeks2));

		// Print the address of both
		// object Geeks1 and Geeks2
		System.out.println("Address of object Geeks1: " + Geeks1);
		System.out.println("Address of object Geeks2: " + Geeks2);
	}

}
