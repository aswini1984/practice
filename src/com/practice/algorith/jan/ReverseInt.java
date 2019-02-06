package com.practice.algorith.jan;

public class ReverseInt {

	public static void main(String[] args) {

		//		System.out.println((reverse(121)));

		System.out.println(isPalindrome(121));

		//		System.out.println(Integer.MAX_VALUE/10);
	}

	public static int reverse(int x) {

		int rev = 0;

		while(x!=0){

			int pop = x % 10;
			x /= 10;

			if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
			if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;

			rev = rev * 10 + pop;
		}
		return rev;
	}

	public static boolean isPalindrome(int x) {

		int rev = 0;
		int input = x;

		while(x != 0 ){

			int pop = x % 10;
			x /= 10;

			if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return false;
			if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return false;

			rev = rev * 10 + pop;
		}
		System.out.println(rev);
		if(rev == input){
			return true;
		} else return false;
	}


}
