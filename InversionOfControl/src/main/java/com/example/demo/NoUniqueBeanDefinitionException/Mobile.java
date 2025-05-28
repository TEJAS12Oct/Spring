package com.example.demo.NoUniqueBeanDefinitionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Autowired
	@Qualifier("airtelBean") // 3. Explicit Bean Names
	private Sim sim6;

	@Autowired
//	@Qualifier("jio") // 2. Use @Qualifier Annotation
	@Qualifier("jioBean") // 3. Explicit Bean Names
	private Sim sim7;

	public void useSim() {
		sim6.calling();
		sim6.data();

		sim7.calling();
		sim7.data();
	}

	// Main driver method
	public static void main(String[] args) {

		// Using ApplicationContext tom implement Spring IoC
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Mobile mobile = context.getBean(Mobile.class);
		mobile.useSim();
	}
}

//No Need to write entry in beans.xml