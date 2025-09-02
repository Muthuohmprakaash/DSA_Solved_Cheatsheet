package com.slidingWindow_twoPointer;

public class Maxconsecutiveone {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 1, 1, 1, 1, 0, 0, 0 };

		System.out.println(findmax(arr));

	}

	private static int findmax(int[] arr) {
		int zeros = 0;
		int ones = 0;

		for (int i = 0; i < arr.length; i++) {

			int j = i;
			for (j = i; j < arr.length; j++) {
				if (arr[j] != 0) {
					break;
				}
			}
			zeros = Math.max(zeros, j - i);
		}

		for (int k = 0; k < arr.length; k++) {

			int l = k;
			for (l = k; l < arr.length; l++) {
				if (arr[l] != 1) {
					break;
				}
			}
			ones = Math.max(ones, l - k);
		}

		int maxLength = Math.max(zeros, ones);

		return maxLength;
	}

}
