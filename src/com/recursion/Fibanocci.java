package com.recursion;

public class Fibanocci {

	public static void main(String[] args) {
		int n =5;
		System.out.println(findthenum(n));

	}

	private static int findthenum(int n) {
		if(n<=1) {
			return n;
		}
		int lastnum = findthenum(n-1);
		int secondLastNum = findthenum(n-2);
		
		return lastnum + secondLastNum;
	}

}
