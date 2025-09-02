package com.recursion;

public class PrintReverse {

	public static void main(String[] args) {
		int n =5;
		int i =n;
		reverse(i,n);

	}

	private static void reverse(int i, int n) {
		if(i==0) {
			return;
		}
		System.out.println(i);
		reverse(i-1,n);
	}

}
