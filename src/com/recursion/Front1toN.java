package com.recursion;

public class Front1toN {

	public static void main(String[] args) {
		int i =1;
		int n =5;
		
		printnumbers(i,n);

	}

	private static void printnumbers(int i, int n) {
		if(i>n) {
			return;
		}
		System.out.println(i);
		printnumbers(i+1,n);
		
	}

}
