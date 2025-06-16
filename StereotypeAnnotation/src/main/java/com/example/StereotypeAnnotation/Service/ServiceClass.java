package com.example.StereotypeAnnotation.Service;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {

	public int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}
}
