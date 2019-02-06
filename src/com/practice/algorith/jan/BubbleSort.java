package com.practice.algorith.jan;

public class BubbleSort {

	public static void main(String[] args) {

		int[] intArray = { 20, -10, 60, 55, -50, 2};
		
		for(int lastSortedIndex = intArray.length-1 ; lastSortedIndex >0 ; lastSortedIndex-- ) {
			
			for(int i=1; i<=lastSortedIndex; i++) {
				if(intArray[i-1] > intArray[i]) {
					swap(intArray, i-1, i);
				}
			}
		}
		
		for(int i : intArray) {
			System.out.println(i);
		}
	}

	private static void swap(int[] intArray, int i, int i2) {

		int temp = intArray[i];
		intArray[i] = intArray[i2];
		intArray[i2] = temp;
	}

}
