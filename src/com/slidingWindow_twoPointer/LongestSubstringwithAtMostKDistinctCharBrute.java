package com.slidingWindow_twoPointer;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringwithAtMostKDistinctCharBrute {

	public static void main(String[] args) {
		String s = "aabaaab";
		int k =2;
		
		System.out.println(findLongest(s,k));

	}

	private static int findLongest(String s, int k) {
		int maxLength = 0;
		
		for(int i =0;i<s.length();i++) {
			Set<Character> st = new HashSet<Character>();
			int j = i;
			for(j = i;j<s.length();j++) {
				st.add(s.charAt(j));
				if(st.size() > k) {
					break;
				}
			}
			if(st.size() < k && i == 0 ) {
				return -1;
			}
			maxLength = Math.max(maxLength, j - i);
		}
		return maxLength;
	}

}
