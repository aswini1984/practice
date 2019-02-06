package com.practice.algorith.jan;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = {2, 7, 11, 15};
		int[] result = twoSum(nums, 50);
		
		for(int s : result) {
			System.out.println(s);
		}
	}

	public static int[] twoSum(int[] nums, int target) {

		for(int i=0; i < nums.length; i++){
			for(int j=i+1; j < nums.length ; j++){
				if(nums[i] + nums[j] == target){
					int[] sum = {i , j};
					return sum;
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
