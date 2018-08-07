package com.practice.algorithm;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] intArray = {20, 12, -30, 44, 7, -2};
		
		for(int i = 1 ; i < intArray.length; i++) {
			int current = intArray[i];
			int j = i;
			while(j>0 && intArray[j-1] > current) {
				intArray[j] = intArray[j-1];
				j--;
			}
			intArray[j] = current;
			
		}
		
		for(int i = 0 ; i < intArray.length ; i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
