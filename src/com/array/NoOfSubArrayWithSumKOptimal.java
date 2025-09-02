package com.array;

import java.util.HashMap;
import java.util.Map;

public class NoOfSubArrayWithSumKOptimal {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
		int k = 3;
		System.out.println(findTheCount(arr, k));

	}

	private static int findTheCount(int[] arr, int k) {
		Map<Integer, Integer> mpp = new HashMap<>();
		int prefixsum = 0;
		int count = 0;
		mpp.put(prefixsum, 1);
		for (int i = 0; i < arr.length; i++) {

			prefixsum = arr[i] + prefixsum;
			int remove = prefixsum - k;

			count = count + mpp.getOrDefault(remove, 0);

			mpp.put(prefixsum, mpp.getOrDefault(prefixsum, 0) + 1);

		}
		return count;

	}

}
