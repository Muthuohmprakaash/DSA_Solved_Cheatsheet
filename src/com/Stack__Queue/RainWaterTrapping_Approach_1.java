package com.Stack__Queue;

public class RainWaterTrapping_Approach_1 {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		System.out.println(findTheTrappedWater(arr));

	}

	private static int findTheTrappedWater(int[] arr) {
		int total = 0;
		int[] leftMax = prefixMax(arr);
		int[] rightMax = suffixMax(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < leftMax[i] && arr[i] < rightMax[i]) {
				total = total + (Math.min(leftMax[i], rightMax[i]) - arr[i]);
			}
		}
		return total;
	}

	private static int[] suffixMax(int[] arr) {
		int[] suffMax = new int[arr.length];
		suffMax[arr.length - 1] = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			suffMax[i] = Math.max(suffMax[i + 1], arr[i]);
		}

		return suffMax;

	}

	private static int[] prefixMax(int[] arr) {
		int[] preMax = new int[arr.length];
		preMax[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			preMax[i] = Math.max(preMax[i - 1], arr[i]);
		}

		return preMax;

	}

}
