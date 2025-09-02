package com.recursion;

import java.util.Scanner;

public class PrintnamesNtimes {

	public static void main(String[] args) {
		int i =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times name should be printed");
		int n = sc.nextInt();
		
		printnameNtimes(i,n);
		sc.close();

	}

	private static void printnameNtimes(int i, int n) {
		if(i>n) {
			return;
		}
		System.out.println("mop");
		printnameNtimes(i+1, n);
		
	}





}
