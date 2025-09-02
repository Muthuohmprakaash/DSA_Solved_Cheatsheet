package com.bitManupulation;

public class DecimalToBinary {

	public static void main(String[] args) {

//		System.out.println(Integer.toBinaryString(7));

		int n = 13;

		String remainder = "";

		while (n > 0) {
			remainder = remainder + n % 2;
			n = n / 2;	
		}

		for (int i = remainder.length() - 1; i >= 0; i--) {
			System.out.print(remainder.charAt(i));
		}

	}

}
