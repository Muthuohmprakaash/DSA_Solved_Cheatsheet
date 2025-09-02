package com.slidingWindow_twoPointer;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithAtMostKDistinctCharOptimal {

	public static void main(String[] args) {
		String s = "aabacbebebe";
		int k = 3;
		System.out.println(findLongest(s, k));

	}

	private static int findLongest(String s, int k) {

		int left = 0;
		int right = 0;
		Map<Character, Integer> mpp = new HashMap<Character, Integer>();
		int maxLength = 0;
		while (right < s.length()) {

			mpp.put(s.charAt(right), mpp.getOrDefault(s.charAt(right), 0) + 1);

			if (mpp.size() > k) {
				maxLength = Math.max(maxLength, right - left);
				mpp.put(s.charAt(left), mpp.getOrDefault(s.charAt(left), 0) - 1);
				if (mpp.get(s.charAt(left)) == 0) {
					mpp.remove(s.charAt(left));
				}
				left++;
			}
			right++;
		}
		if (mpp.size() < k) {
			return -1;
		}
		maxLength = Math.max(maxLength, right - left);

		return maxLength;
	}

}
