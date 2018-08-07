package com.practice.algorithm;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(factorial(4));
	}
	
	public static int factorial(int num) {
		
		int fact = 1;
		
		if(num == 0) {
			return 1;
		}

		for(int i = num ; i > 0 ; i--) {
			fact *= i;
		}
		return fact;
	}
}
