package com.recursion;

public class Palindrome {

	public static void main(String[] args) {
		String s = "MADAMS";
		int i =0;
		System.out.println(find(i,s));

	}

	private static boolean find(int i, String s) {
		if(i>=s.length()/2) {
			return true;
		}
		
		if(s.charAt(i)!=s.charAt(s.length()-i-1)){
			return false;
		}
		return find(i+1,s);
		
		
		
	}

}
