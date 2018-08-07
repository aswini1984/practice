package com.practice.algorithm;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] intArray = {22, 36, -20, 7, 90, -2};
		
		for (int x = intArray.length - 1; x > 0; x--) {
			
			for(int i = 0; i < x; i++) {
				
				if(intArray[i] > intArray[i+1]) {
					int temp = intArray[i];
					intArray[i] = intArray[i+1];
					intArray[i+1] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < intArray.length ; i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
