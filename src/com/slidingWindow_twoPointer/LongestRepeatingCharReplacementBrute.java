package com.slidingWindow_twoPointer;

public class LongestRepeatingCharReplacementBrute {

	public static void main(String[] args) {
		String s = "ABAA";
		int k = 0;
		
		System.out.println(findLongest(s,k));

	}

	private static int findLongest(String s, int k) {
		int maxLength = 0;
		
		for(int i =0;i<s.length();i++) {
			int hash[] = new int[26];
			for(int j =i;j<s.length();j++) {
				hash[s.charAt(j) - 'A']++;
				int diff = (j - i +1) - findMax(hash);
				if(diff <= k) {
					maxLength = Math.max(maxLength, j - i+1);
				}else {
					break;
				}
			}
		}
		return maxLength;
	}

	private static int findMax(int[] hash) {
		int max = 0;
		for(int i =0;i<hash.length;i++) {
			max = Math.max(max, hash[i]);
		}
		return max;
	}

}
