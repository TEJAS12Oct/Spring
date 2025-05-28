package com.example.demo.AnnotationForDependancyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Autowired
	private Sim sim4;

	@Autowired
	private Sim sim5;

	public void useSim() {
		sim4.calling();
		sim4.data();

		sim5.calling();
		sim5.data();
	}

	// Main driver method
	public static void main(String[] args) {

		// Using ApplicationContext tom implement Spring IoC
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Mobile mobile = context.getBean(Mobile.class);
		mobile.useSim();
	}
}

/*
 * Note: When we run the above code, Spring will throw a
 * NoUniqueBeanDefinitionException 
 * because it finds two beans (Airtel and Jio)
 * of type Sim. To resolve this, we need to specify which bean to inject.
 */

// beans.xml present in src/main/resources
//In the beans.xml file, we have created beans. 
//So inside the id, we have to pass the unique id 
//and inside the class, we have to pass the Class name 
//for which you want to create the bean. 
//Later on, inside the main method, we can tweek it out that 
//will be described in the upcoming program.