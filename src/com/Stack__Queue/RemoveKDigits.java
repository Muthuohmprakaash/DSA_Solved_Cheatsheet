package com.Stack__Queue;

import java.util.Stack;

public class RemoveKDigits {

	public static void main(String[] args) {
		String s = "1432219";
		int k = 3;

		System.out.println(findMiniValueByRemovingKDigits(s, k));

	}

	private static String findMiniValueByRemovingKDigits(String num, int k) {
		if(k==num.length()) {
			return "0";
		}
		Stack<Character> st = new Stack<Character>();
		String ans = "";
		for (int i = 0; i < num.length(); i++) {
			while (!st.isEmpty() && st.peek() > num.charAt(i) && k > 0) {
				st.pop();
				k--;
			}
			st.push(num.charAt(i));
		}
		while (!st.isEmpty() && k > 0) {
			st.pop();
			k--;
		}
		if (st.isEmpty()) {
			return "0";
		}
		while (!st.isEmpty()) {
			ans = ans + st.peek();
			st.pop();
		}

		String result = "";

		int j = ans.length() - 1;

		while (j >= 0 && ans.charAt(j) == 48) {
			j--;
		}
		if (j < 0) {
			return "0";
		}
		while (j >= 0) {
			result = result + ans.charAt(j);
			j--;
		}

		return result;
	}

}
