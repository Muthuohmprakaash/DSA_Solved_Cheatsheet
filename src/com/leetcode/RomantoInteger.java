package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomantoInteger {

	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(romanToInt(s));

	}

	private static int romanToInt(String s) {
		int ans = 0;
		Map<Character, Integer> mpp = new HashMap<>();
		mpp.put('I', 1);
		mpp.put('V', 5);
		mpp.put('X', 10);
		mpp.put('L', 50);
		mpp.put('C', 100);
		mpp.put('D', 500);
		mpp.put('M', 1000);

		Stack<Integer> st = new Stack<>();
		
		for(int i = 0;i<s.length();i++) {
			if(st.isEmpty()) {
				ans = ans + mpp.get(s.charAt(i));
				st.push(mpp.get(s.charAt(i)));
			}else if(st.peek() >= mpp.get(s.charAt(i))) {
				ans = ans + mpp.get(s.charAt(i));
				st.push(mpp.get(s.charAt(i)));
			}else {
				ans = ans - st.peek();
				ans = ans + (mpp.get(s.charAt(i)) - st.peek());
				st.pop();
			}
		}

		return ans;
	}

}
