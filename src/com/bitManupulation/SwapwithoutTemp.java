package com.bitManupulation;

public class SwapwithoutTemp {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;

//		int temp = a;
//		a = b;
//		b= temp;

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println(a + " " + b);

	}

}
