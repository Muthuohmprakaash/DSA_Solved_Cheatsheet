package com.Stack__Queue;

import java.util.Stack;

public class SumOfSubArrMin_optimal {

	public static void main(String[] args) {
		int arr[] = { 11,81,94,43,3 };

		System.out.println(findTheMinSum(arr));

	}

	private static int findTheMinSum(int[] arr) {
		int[] pse = findPSE(arr);
		int[] nse = findNSE(arr);
		long total = 0, mod = (int) 1e9 + 7;
		for (int i = 0; i < arr.length; i++) {
			int left = i - pse[i];
			int right = nse[i] - i;
			total = (total + (left * right  *arr[i]) % mod) % mod;
		}
		return (int)total;
	}

	private static int[] findNSE(int[] arr) {

		int res[] = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
				st.pop();
			}
			res[i] = st.isEmpty() ? arr.length : st.peek();
			st.push(i);
		}
		return res;
	}

	private static int[] findPSE(int[] arr) {
		int[] pse = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
				st.pop();
			}
			pse[i] = st.isEmpty() ? -1 : st.peek();
			st.push(i);

		}
		return pse;
	}

}
