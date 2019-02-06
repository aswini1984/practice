package com.practice.algorith.jan;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] myArray = {0,0,1,1,1,2,2};
		
		System.out.println(removeDuplicates(myArray));
		for(int i : myArray) {
			System.out.println(i);
		}
		
	}
	
	
	public static int removeDuplicates(int[] myArray) {
		
		int length = 1;
		int j = 1;
		
		for(int i=1 ; i< myArray.length; i++) {
			
			if(myArray[i-1] != myArray[i]) {
				length++;
				myArray[j++] = myArray[i];
			}
		}
		
		
		
		return length;
	}

}
