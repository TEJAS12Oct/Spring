package com.example.demo.NoUniqueBeanDefinitionException;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
//1. Use @Primary Annotation
@Component
@Primary
class Airtel implements Sim {
	@Override
	public void calling() {
		System.out.println("Airtel Calling");
	}

	@Override
	public void data() {
		System.out.println("Airtel Data");
	}
} */

// 3. Explicit Bean Names
@Component("airtelBean")
public class Airtel implements Sim {
	@Override
	public void calling() {
		System.out.println("Airtel Calling");
	}

	@Override
	public void data() {
		System.out.println("Airtel Data");
	}
}
