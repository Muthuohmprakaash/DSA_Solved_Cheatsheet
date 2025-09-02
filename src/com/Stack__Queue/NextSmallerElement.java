package com.Stack__Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NextSmallerElement {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3));

		ArrayList<Integer> ans = findNSE(arr);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}

	}

	private static ArrayList<Integer> findNSE(ArrayList<Integer> arr) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<Integer> st = new Stack<Integer>();

//		for (int i = arr.size() - 1; i >= 0; i--) {
//			if (st.isEmpty()) {
//				st.push(arr.get(i));
//				res.add(-1);
//			} else {
//				if (arr.get(i) < st.peek()) {
//					res.add(st.peek());
//					st.push(arr.get(i));
//				} else {
//					while (!st.isEmpty() && st.peek() >= arr.get(i)) {
//						st.pop();
//					}
//					if (st.isEmpty()) {
//						res.add(-1);
//						st.push(arr.get(i));
//					} else {
//						res.add(st.peek());
//						st.push(arr.get(i));
//					}
//				}
//			}
//		}
//		Collections.reverse(res);
		
		
		
		
		
		
/*
* optimize the written code the above and below code written by me only just
* modified some changes and it went from beats 32% to beats 99.9%		 */
		
		
		for (int i = arr.size() - 1; i >= 0; i--) {
			while (!st.isEmpty() && st.peek() >= arr.get(i)) {
				st.pop();
			}
			if (st.isEmpty()) {
				res.add(-1);
			} else {
					res.add(st.peek());
			}
			st.push(arr.get(i));
		}
		Collections.reverse(res);
		return res;
	}

}
