package com.Stack__Queue;

public class SumOfSubArrMin_Brute {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 2, 4 };
		System.out.println(findTheMinSum(arr));

	}

	private static int findTheMinSum(int[] arr) {
		// In LeetCode it throws timelimit exceeded
		int sum = 0;
		int mod = (int)1e+7;
		for(int i =0;i<arr.length;i++) {
			int min = arr[i];
			for(int j =i;j<arr.length;j++) {
				min = Math.min(min, arr[j]);
				sum = (sum + min) % mod;
			}
		}
		return sum;
	}

}
