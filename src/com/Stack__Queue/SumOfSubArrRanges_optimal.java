package com.Stack__Queue;

import java.util.Stack;

public class SumOfSubArrRanges_optimal {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		System.out.println(findTheRanges(arr));

	}

	private static long findTheRanges(int[] arr) {
		long smallest = SumOfSubArrayMin(arr);
		long largest = SumOfSubArrayMax(arr);
		long ans = largest - smallest;
		return ans;
	}

	private static long SumOfSubArrayMax(int[] arr) {
		long[] nge = findNge(arr);
		long[] pge = findPge(arr);
		long ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans + ((nge[i] - i) * (i - pge[i]) * arr[i]);
		}
		return ans;
	}

	private static long[] findPge(int[] arr) {
		long[] pge = new long[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				pge[i] = -1;
			} else {
				pge[i] = st.peek();
			}
			st.push(i);

		}

		return pge;
	}

	private static long[] findNge(int[] arr) {
		long[] nge = new long[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				nge[i] = arr.length;
			} else {
				nge[i] = st.peek();
			}
			st.push(i);
		}

		return nge;
	}

	private static long[] findPse(int[] arr) {
		long[] pse = new long[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				pse[i] = -1;
			} else {
				pse[i] = st.peek();
			}
			st.push(i);

		}

		return pse;

	}

	private static long[] findNse(int[] arr) {
		long[] nse = new long[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				nse[i] = arr.length;
			} else {
				nse[i] = st.peek();
			}
			st.push(i);
		}

		return nse;
	}

	private static long SumOfSubArrayMin(int[] arr) {
		long[] nse = findNse(arr);
		long[] pse = findPse(arr);
		long ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans + ((nse[i] - i) * (i - pse[i]) * arr[i]);
		}
		return ans;

	}

}
