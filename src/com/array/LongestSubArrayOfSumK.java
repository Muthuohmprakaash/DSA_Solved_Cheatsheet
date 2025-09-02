package com.array;

public class LongestSubArrayOfSumK {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 1, 1, 1 };
		int k = 3;
		System.out.println(findTheLengthOfLongestSubArrayOfSumK(arr, k));

	}

	private static int findTheLengthOfLongestSubArrayOfSumK(int[] arr, int k) {
		int left = 0;
		int right = 0;

		int length = 0;
		int sum = arr[0];

		while (right < arr.length) {
			while (left <= right && sum > k) {

				sum = sum - arr[left];
				left++;
			}
			if (sum == k) {
				if (right - left + 1 > length) {
					length = right - left + 1;
				}
			}
			right++;
			if (right < arr.length) {
				sum = sum + arr[right];
			}

		}
		return length + 1;

	}
}
