package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class DeleteCharacterstoMakeFancyString {

	public static void main(String[] args) {
		String s = "leeeetcode";
		System.out.println(makeFancyString(s));

	}

	// youtube approach
	public static String makeFancyString(String s) {
		StringBuilder ans = new StringBuilder();
		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
				count++;

			} else {
				count = 1;
			}
			if (count < 3) {
				ans = ans.append(s.charAt(i));
			}
		}
		return ans.toString();
	}

	// Time limit exceeded this approach my approach from scratch
	public String makeFancyString2(String s) {
		String ans = "";

		Map<Character, Integer> mpp = new HashMap<Character, Integer>();

		char check[] = new char[1];
		check[0] = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			mpp.put(s.charAt(i), mpp.getOrDefault(s.charAt(i), 0) + 1);

			if (s.charAt(i) != check[0]) {
				mpp.put(s.charAt(i - 1), 0);
			}
			if (mpp.get(s.charAt(i)) <= 2) {
				ans = ans + s.charAt(i);
			}
			check[0] = s.charAt(i);

		}
		return ans;
	}

}
