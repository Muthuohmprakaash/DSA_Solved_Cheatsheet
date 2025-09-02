package com.Stack__Queue;

import java.util.Stack;

public class BalencedParenthesis {

	public static void main(String[] args) {
		String s = "()[{}()]";
		System.out.println(checkValidorNot(s));

	}

	private static boolean checkValidorNot(String s) {
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			} else {
				if(st.isEmpty()) {
					return false;
				}
				char check = st.pop();
				if (ch == ')' && check == '(' || ch == ']' && check == '[' || ch == '}' && check == '{') {
					continue;
				}else {
					return false;
				}
			}

		}
		return st.isEmpty();

	}
}