package com.practice.algorith.jan;

public class SelectionSort {

	public static void main(String[] args) {

		int[] intArray = { 20, -10, 60, 55, -50, 2};
	
		
		for (int lastUnSortedIndex = intArray.length - 1; lastUnSortedIndex > 0 ; lastUnSortedIndex--) {
			int largest = 0;
				
			for(int i = 1; i<= lastUnSortedIndex ; i++) {
				if(intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			
			swap(intArray, largest, lastUnSortedIndex);
			
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
