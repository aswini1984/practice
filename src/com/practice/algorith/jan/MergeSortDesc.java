package com.practice.algorith.jan;

public class MergeSortDesc {

	public static void main(String[] args) {

		int[] intArray = { 20, -10, 60, 55, -50, 2};

		mergeSort(intArray, 0, intArray.length);

		for(int i : intArray) {
			System.out.println(i);
		}

	}

	private static void mergeSort(int[] input, int start, int end) {
		
		if(end - start < 2) {
			return;
		}

		int mid = (end + start)/2;
		
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		
		merge(input, start, mid, end);
		
	}
	
	private static void merge (int[] input, int start, int mid, int end) {
		
		int i = start;
		int j = mid;
		
		int tempIndex = 0;
		
		if(input[mid - 1] >= input[mid] ) {
			
			return;
		}
		
		int[] temp = new int[end - start];
		
		while( i < mid && j < end) {
			
			temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
			
		}
		
		System.arraycopy(input, i, input, start+tempIndex, mid-i);
		System.arraycopy(temp, 0, input, start, tempIndex);
		
	}
	

}
