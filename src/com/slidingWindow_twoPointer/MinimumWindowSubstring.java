package com.slidingWindow_twoPointer;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		String s = "abcdebdde";
		String t = "bde";

		System.out.println(findMinBrute(s, t));
		System.out.println(findMinOptimal(s, t));

	}

	private static String findMinOptimal(String s, String t) {
		int left = 0;
		int right = 0;
		int count = 0;
		int startInd = -1;
		int minLength = Integer.MAX_VALUE;
		
		int hash[] = new int[256];
		
		for (int i = 0; i < t.length(); i++) {
			hash[t.charAt(i)]++;
		}

		while (right < s.length()) {
			
			if (hash[s.charAt(right)] > 0) {
				count++;
			}
			hash[s.charAt(right)]--;
			
			while (count == t.length()) {
				if(right - left + 1 < minLength) {
				
				minLength = Math.min(minLength, right - left + 1);
				startInd = left;
				
				}
				hash[s.charAt(left)]++;
				if (hash[s.charAt(left)] > 0) {
					count--;
					
				}
				left++;
			

			}
			right++;

		}
		return startInd == -1 ? "" : s.substring(startInd, startInd + minLength);
	}

	private static String findMinBrute(String s, String t) {
		if (t.length() > s.length()) {
			return "";
		}
		int startIndex = 0;
		int minLength = Integer.MAX_VALUE;

		for (int m = 0; m < s.length(); m++) {
			int count = 0;
			int[] hash = new int[256];
			for (int i = 0; i < t.length(); i++) {
				hash[t.charAt(i)]++;
			}

			for (int n = m; n < s.length(); n++) {

				if (hash[(s.charAt(n))] > 0) {
					count++;
					hash[(s.charAt(n))]--;

				}
				if (count == t.length()) {
					if (n - m + 1 < minLength) {
						minLength = n - m + 1;
						startIndex = m;
						break;
					}
				}

			}
		}

		return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLength);
	}
}
