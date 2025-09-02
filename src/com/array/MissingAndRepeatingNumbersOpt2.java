package com.array;

public class MissingAndRepeatingNumbersOpt2 {

	public static void main(String[] args) {
		
		int a[] = {4,3,6,2,1,1};
		
		findMissingNum(a);

	}

	private static void findMissingNum(int[] a) {
		
		// int n = a.length;
		
		// int x = 0;
		// int y = 0;
		int z = (4^3^6^2^1^1)^(1^2^3^4^5^6);
		System.out.println(z);
		for(int i =0;i<a.length;i++) {
			
		}
		
	}

}
