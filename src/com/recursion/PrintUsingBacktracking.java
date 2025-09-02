package com.recursion;

public class PrintUsingBacktracking {

	public static void main(String[] args) {
		int n =3;
		backtrack(n,n);

	}

	private static void backtrack(int i, int n) {
		if(i<1 || i==0) {
			return;
		}
		backtrack(i-1,n);
		System.out.println(i);
		
	}

}
