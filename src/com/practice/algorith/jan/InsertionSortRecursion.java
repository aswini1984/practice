package com.practice.algorith.jan;

public class InsertionSortRecursion {

	public static void main(String[] args) {

		int[] intArray = { 20, -10, 60, 55, -50, 2};
		
		recSort(intArray, intArray.length);
		
		for(int i : intArray) {
			System.out.println(i);
		}
		
	}

	private static void recSort(int[] input, int length) {
		
		if(length < 2) {
			return;
		}
		
		recSort(input, length -1);
		
		int newElement = input[length -1];
		
		int i;
		
		for(i = length -1 ; i > 0 && input[i-1] > newElement ; i-- ) {
			
			input[i] = input[i-1];
		}
		
		input[i] = newElement;
	}

}
