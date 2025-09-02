package com.recursion;
//this is the right way of coding
public class Sum1st3NumUsingFunctionalRecursion {

	public static void main(String[] args) {
		int n =3;
		System.out.println(sum(n));

	}

	private static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n + sum(n-1);
		
	}


}
