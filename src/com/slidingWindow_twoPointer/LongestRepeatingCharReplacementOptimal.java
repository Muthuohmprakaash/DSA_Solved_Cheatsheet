package com.slidingWindow_twoPointer;

public class LongestRepeatingCharReplacementOptimal {

	public static void main(String[] args) {
		String s = "ACAABABBA";
		int k = 2;

		System.out.println(findLongest(s, k));

	}

	private static int findLongest(String s, int k) {
		int left = 0;
		int right = 0;
		int hash[] = new int[26];
		int maxLength = 0;
		while (right < s.length()) {
			hash[s.charAt(right) - 'A']++;
			int changes = (right - left + 1) - findMax(hash);
			if (changes <= k) {
				maxLength = Math.max(maxLength, right - left + 1);
			}
			while (changes > k) {
				hash[s.charAt(left) - 'A']--;
				left++;
				changes = (right - left + 1) - findMax(hash);
				if (changes <= k) {
					maxLength = Math.max(maxLength, right - left + 1);
				}
				
			}
			right++;
		}
		return maxLength;
	}

	private static int findMax(int[] hash) {
		int max = 0;
		for (int i = 0; i < hash.length; i++) {
			max = Math.max(max, hash[i]);
		}
		return max;
	}

}
