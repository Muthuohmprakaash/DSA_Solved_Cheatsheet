package com.bitManupulation;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int s = 11101;
//		System.out.println(Integer.parseInt(s,2));
		int power = 0;
		int ans = 0;
		int lastNum = 0;
		while(s > 0) {
			lastNum=s % 10;
			ans = (int) (ans + (lastNum * Math.pow(2,power)));
			power++;
			s = s/10;
		}
		System.out.println(ans);
	}

}
