package com.practice.algorith.jan;

public class StrSubstring {

	public static void main(String[] args) {

		System.out.println(strStr("mississippi" , "issipi"));

	}


	public static int strStr(String haystack, String needle) {

		if(needle.isEmpty()) {
			return 0;
		}

		if(needle.length() > haystack.length()) {
			return -1;
		}
		int j = 0;
		for(int i = 0 ; i< haystack.length() ; i++) {
			if(i > haystack.length() - needle.length()) {
				break;
			}
			if(haystack.charAt(i) == needle.charAt(0)) {
				for(j = 0 ; j < needle.length() ; j++) {
					if(haystack.charAt(i+j) != needle.charAt(j)) {
						break;
					}
				}
				if(j == needle.length()) {
					return i;
				}
			}
		}
		return -1;
	}
}
