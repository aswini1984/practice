package com.practice.algorith.jan;

import java.util.HashMap;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Aswini Kumar";
		String temp = "";
		
		for(int i = str.length()-1 ; i>= 0; i--) {
			
			temp = temp + str.charAt(i)+"";
			
		}
		
		System.out.println(temp);
	}

}
