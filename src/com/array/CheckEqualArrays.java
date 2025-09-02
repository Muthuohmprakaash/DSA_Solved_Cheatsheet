package com.array;

public class CheckEqualArrays {

	public static void main(String[] args) {
	

		int arr1[] = { 1, 2, 5, 4, 0 };
		int arr2[] = { 2, 4, 5, 0, 1 };

		System.out.println(check(arr1, arr2));

	}

	public static boolean check(int[] arr1, int[] arr2) {
		// Your code here

		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				count++;
			}
		}
		if (count == arr1.length) {
			return true;
		}
		return false;
	}

}
