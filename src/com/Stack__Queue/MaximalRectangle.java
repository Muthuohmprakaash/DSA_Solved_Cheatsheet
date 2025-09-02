package com.Stack__Queue;

import java.util.Stack;

public class MaximalRectangle {

	public static void main(String[] args) {
		char[][] matrix = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };

		System.out.println(findAreaOfMaxRectangles(matrix));

	}

	private static int findAreaOfMaxRectangles(char[][] matrix) {
		int arr[][] = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == 0) {
					arr[i][j] = (int) matrix[i][j];
				} else if (matrix[i - 1][j] > 0 && matrix[i][j] > 0) {
					arr[i][j] = (int) (arr[i - 1][j] + matrix[i][j]);
				} else if (matrix[i][j] > 0) {
					arr[i][j] = matrix[i][j];
				}
			}
		}
		int max = 0;

		for (int k = 0; k < arr.length; k++) {
			int large = findLargestRectangleInHistogram(arr[k]);
			max = Math.max(max, large);
		}
		return max;
	}

	private static int findLargestRectangleInHistogram(int[] arr) {
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
		while (!st.isEmpty()) {
			int l = st.pop();
			if (st.isEmpty()) {
				pse = -1;
			} else {
				pse = st.peek();
			}
			l = arr[l] * (i - pse - 1);
			max = Math.max(max, l);
		}

		return max;

	}

}
