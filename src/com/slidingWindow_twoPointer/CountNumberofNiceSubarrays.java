package com.slidingWindow_twoPointer;

public class CountNumberofNiceSubarrays {

	public static void main(String[] args) {
		int arr[] = { 1,1,2,1,1 };
		int k = 3;

		System.out.println(findCountBrute(arr, k));
		System.out.println(findCountOptimal(arr, k) - findCountOptimal(arr,k-1));

	}

	private static int findCountOptimal(int[] arr, int k) {
		int left = 0;
		int right = 0;
		int sum =0;
		int count =0;
		while (right < arr.length) {
			sum = sum + arr[right] % 2;
			while(sum > k) {
				sum = sum - arr[left] %2;
				left++;
			}
			count = count + right - left + 1;
			right++;
		}
		return count;
	}

	private static int findCountBrute(int[] arr, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j] % 2;

				if (sum == k) {
					count++;
				} else if (sum > k) {
					break;
				}
			}
		}

		return count;
	}

}
