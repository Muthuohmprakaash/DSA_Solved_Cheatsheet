package com.Stack__Queue;

import java.util.Stack;

public class LargestRectangleInHistogramOptimal {

	public static void main(String[] args) {
		int arr[] = { 60,20,50,40,10,50,60};

		System.out.println(findLargestRec(arr));

	}

	private static int findLargestRec(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		int max = 0;
		int pse = 0;
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if (st.isEmpty()) {
				st.push(i);
			} else {
				while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
					int l = st.pop();
					if (st.isEmpty()) {
						pse = -1;
					} else {
						pse = st.peek();
					}

					l = arr[l] * (i - pse - 1);
					max = Math.max(max, l);
				}
				st.push(i);

			}
		}
		while(!st.isEmpty()) {
			int l = st.pop();
			if(st.isEmpty()) {
				pse = -1;
			}else {
				pse = st.peek();
			}
			l = arr[l] * (i - pse - 1);
			max = Math.max(max, l);
		}

		return max;
	}

}
