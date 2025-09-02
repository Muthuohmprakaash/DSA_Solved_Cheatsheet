package com.array;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrXorKOptimal {

	public static void main(String[] args) {
	
		int arr[] = { 4, 2, 2, 6, 4 };
		int k = 6;

		System.out.println(findTheCount(arr, k));

	}

	private static int findTheCount(int[] arr, int k) {
		Map<Integer, Integer> mpp = new HashMap<>();
		int xor = 0;
		int count = 0;
		mpp.put(xor, 1);
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
			int x = xor ^ k;
			if (mpp.containsKey(x)) {
				count = count + mpp.get(x);
			}
			if (mpp.containsKey(xor)) {
				mpp.put(xor, mpp.get(xor) + 1);
			} else {
				mpp.put(xor, 1);
			}

		}
		return count;
	}

}
