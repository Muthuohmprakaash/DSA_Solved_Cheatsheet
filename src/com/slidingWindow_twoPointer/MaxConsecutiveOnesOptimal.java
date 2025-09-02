package com.slidingWindow_twoPointer;

public class MaxConsecutiveOnesOptimal {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		System.out.println(findMax(arr));

	}

	private static int findMax(int[] arr) {

		int right = 0;
		int zeromax = 0;

		int onemax = 0;
		while (right < arr.length) {
			int zero = 0;
			while (right < arr.length && arr[right] == 0) {
				zero++;
				right++;
			}

			zeromax = Math.max(zeromax, zero);
			int one = 0;
			while (right < arr.length && arr[right] == 1) {
				one++;
				right++;
			}
			onemax = Math.max(onemax, one);

		}
		int maxLength = Math.max(zeromax, onemax);
		return maxLength;
	}

}
