package com.slidingWindow_twoPointer;

public class MaximumPointsYouCanObtainFromCards {

	public static void main(String[] args) {
		int arr[] = { 9, 7, 7, 9, 7, 7, 9 };
		int k = 7;

		System.out.println(findMax(arr, k));
	}

	private static int findMax(int[] arr, int k) {

		int leftSum = 0;
		int rightSum = 0;
		int max = 0;

		for (int i = 0; i < k; i++) {
			leftSum = leftSum + arr[i];
		}

		max = leftSum;
		int last = arr.length - 1;
		while (k > 0) {
			leftSum = leftSum - arr[k - 1];
			rightSum = rightSum + arr[last];
			if (leftSum + rightSum > max) {
				max = leftSum + rightSum;
			}
			last--;
			k = k - 1;
		}

		return max;
	}

}
