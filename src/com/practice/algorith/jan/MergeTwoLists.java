package com.practice.algorith.jan;

public class MergeTwoLists {

	public static void main(String[] args) {

		int[] one = {2,6,10,70};
		int[] two = {4,9,20,40};
		
		int[] output = merge(one, two);
		
		for(int i : output) {
		System.out.println(i);
		}
		
	}
	
	public static int[] merge(int[] one, int[] two) {
		
		int[] output = new int[one.length+two.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while( i< one.length && j < two.length) {
			
			output[k++] = one[i]< two[j] ? one[i++] : two[j++];
		}
		
		if(i < one.length ) {
			System.arraycopy(one, i, output, k, one.length - i);
		}
		
		if(j < two.length ) {
			System.arraycopy(two, j, output, k, two.length - j);
		}
		
		
		return output;
	}

}
