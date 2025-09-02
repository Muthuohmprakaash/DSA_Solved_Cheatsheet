package com.slidingWindow_twoPointer;

import java.util.HashMap;
import java.util.Map;

public class FruitsInBasketOptimal {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
		System.out.println(findMax(arr));

	}

	private static int findMax(int[] arr) {

		int left = 0;
		int right = 0;
		int maxLength = 0;
		Map<Integer, Integer> mpp = new HashMap<Integer, Integer>();

		while (right < arr.length) {

			mpp.put(arr[right], mpp.getOrDefault(arr[right], 0) + 1);
			if (mpp.size() <= 2) {
				maxLength = Math.max(maxLength, right - left + 1);
			}

			while (mpp.size() > 2 && mpp.containsKey(arr[left])) {

				mpp.put(arr[left], mpp.getOrDefault(arr[left], 0) - 1);
				int saved = mpp.get(arr[left]);
				if (saved == 0) {
					mpp.remove(arr[left]);
				}
				left++;

			}
			right++;
		}
		return maxLength;
	}

}
