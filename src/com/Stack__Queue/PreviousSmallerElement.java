package com.Stack__Queue;

import java.util.Stack;

public class PreviousSmallerElement {

	public static void main(String[] args) {
		int arr[] = { 1,2,3};

		int[] ans = findThePrevSmaller(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static int[] findThePrevSmaller(int[] arr) {
		int[] pse = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();

//		for (int i = 0; i < arr.length; i++) {
//			if (st.isEmpty()) {
//				pse[i] = -1;
//				st.push(arr[i]);
//			} else if (st.peek() < arr[i]) {
//				pse[i] = st.peek();
//				st.push(arr[i]);
//			} else {
//
//				while (!st.isEmpty() && st.peek() > arr[i]) {
//					st.pop();
//
//				}
//				if (st.isEmpty()) {
//					pse[i] = -1;
//					st.push(arr[i]);
//				} else {
//					pse[i] = st.peek();
//					st.push(arr[i]);
//				}
//			}
//
//		}

		
			for (int i = 0; i < arr.length; i++) {
				while (!st.isEmpty() && st.peek() > arr[i]) {
					st.pop();
				}
				if (st.isEmpty()) {
					pse[i] = -1;
				} else if (st.peek() < arr[i]) {
					pse[i] = st.peek();
				} else {
					pse[i] = st.peek();
				}
				st.push(arr[i]);
	
			}
	
			return pse;

	}

}
