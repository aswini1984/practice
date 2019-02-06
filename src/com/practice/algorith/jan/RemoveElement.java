package com.practice.algorith.jan;

public class RemoveElement {

	public static void main(String[] args) {

		int[] myArray = {0,1,2,2,3,0,4,2};

		System.out.println(removeElement(myArray, 2));
		for(int i : myArray) {
			System.out.println(i);
		}
	}

	private static int removeElement(int[] myArray, int rem) {

		int count=0;
		int j = 0;

		for (int i =0; i< myArray.length; i++) {
			if(myArray[i] != rem) {
				count++;
				myArray[j++] = myArray[i] ;
			}
		}
		return count;
	}

}
