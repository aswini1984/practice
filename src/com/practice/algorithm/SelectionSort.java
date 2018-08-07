package com.practice.algorithm;

public class SelectionSort {

	public static void main(String[] args) {

		int[] intArray = {20, 12, -30, 44, 7, -2};
		int largest = 0;

		for (int x = intArray.length-1 ; x > 0 ; x--) {
			largest = 0;
			for( int i = 0 ; i < x; i++) {
				if(intArray[i+1] > intArray[largest]) {
					largest = i+1;
				}
			}
			if( intArray[x] != intArray[largest]) {
				int temp = intArray[x];
				intArray[x] = intArray[largest];
				intArray[largest] = temp;
			}
		}
		for(int i = 0 ; i < intArray.length ; i++) {
			System.out.println(intArray[i]);
		}
	}
}
