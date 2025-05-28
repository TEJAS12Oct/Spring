package com.example.demo.JavaBasedConfiguration;

import org.springframework.stereotype.Component;

@Component
class Airtel implements Sim {
	@Override
	public void calling() {
		System.out.println("Airtel Calling");
	}

	@Override
	public void data() {
		System.out.println("Airtel Data");
	}
}
