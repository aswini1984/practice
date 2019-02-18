package com.practice.algorith.jan;

public class SearchInsert {

	public static void main(String[] args) {

		int[] nums = {2,4,7,16};
		
		System.out.println(searchInsert(nums,1 ));
		
	}

	public static int searchInsert(int[] nums, int target) {

		int pos = 0;
		
		for(int i=0; i< nums.length; i++) {
			
			if( target > nums[i] ) {
				pos++;
			}else if( target == nums[i]) {
				return pos;
			}
			else if(target < nums[i]) {
				return pos;
			}
			
		}
		
		pos = nums.length;
		return pos;
	}
}
