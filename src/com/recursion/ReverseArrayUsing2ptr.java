package com.recursion;

import java.util.Scanner;

public class ReverseArrayUsing2ptr {

	public static void main(String[] args) {
		int j =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		printReverseArrayRecursion(j,n, arr);
		
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		sc.close();
	}

	private static void printReverseArrayRecursion(int j, int n, int[] arr) {
		if(j>=n) {
			return;
		}
		int temp = arr[j];
		arr[j]=arr[n-1];
		arr[n-1]=temp;
		
		printReverseArrayRecursion(j+1,n-1,arr);
		
	}



}
