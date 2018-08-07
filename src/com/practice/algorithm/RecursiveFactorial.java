package com.practice.algorithm;

public class RecursiveFactorial {

	public static void main(String[] args) {
		
		System.out.println(rec(4));
	}
	
	public static int rec(int num) {
		
		if(num == 0 ){
			return 1;
		}
		
		return num * rec(num -1);
		
	}
}
