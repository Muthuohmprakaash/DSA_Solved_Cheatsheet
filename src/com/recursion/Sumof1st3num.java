package com.recursion;

public class Sumof1st3num {

	public static void main(String[] args) {
		int sum =0;
		int i =3;
		sum(i,sum);

	}

	private static void sum(int i, int sum) {
		if(i==0) {
			System.out.println(sum);
			return;
		}
		sum(i-1,i+sum);
	
	}

}
