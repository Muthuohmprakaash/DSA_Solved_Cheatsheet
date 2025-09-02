package com.slidingWindow_twoPointer;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharactersOptimal {

	public static void main(String[] args) {
		
		String s = "abcabcbb";
		
		System.out.println(findMaxLength(s));

	}

	private static int findMaxLength(String s) {
		int left = 0;
		int right =0;
		Map<Character, Integer> mpp = new HashMap<Character, Integer>();
		int max =0;
		while(right <s.length()) {
			int val = mpp.getOrDefault(s.charAt(right), -1);
			if(val != -1 && left <= val) {	
				max = Math.max(max, right - left);
				left = val +1;
			}
			mpp.put(s.charAt(right), right);
			
			right++;
			
		}
		max = Math.max(max, right - left);
		
		return max;
	}

}
