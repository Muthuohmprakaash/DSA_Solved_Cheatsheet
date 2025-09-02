package com.recursion;

public class ReverseBacktrackingprintnum {

	public static void main(String[] args) {
		int n =3;
		reversenuminBT(1,n);

	}

	private static void reversenuminBT(int i, int n) {
		if(i>n) {
			return;
		}
		reversenuminBT(i+1,n);
		System.out.println(i);
		
	}

}
