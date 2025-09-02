package com.slidingWindow_twoPointer;

public class LongestSubstringWithoutRepeatingCharactersBrute {

	public static void main(String[] args) {

		String s = "cadbzabcd";

		System.out.println(findLongestSubStringLength(s));

	}

	private static int findLongestSubStringLength(String s) {

		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			int hash[] = new int[256];
			int max = 0;
			for (int j = i; j < s.length(); j++) {
				if (hash[s.charAt(j)] == 0) {
					hash[s.charAt(j)] = 1;
				} else {

					break;
				}
				max = Math.max(max, j - i + 1);
			}
			if (max > maxLength) {
				maxLength = max;
			}
		}
		return maxLength;
	}

}
