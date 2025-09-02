package com.Stack__Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class LargestRecHistogramUsingList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1 ,0 ,1 ,2 ,2 ,2 ,2 ,1 ,0, 2));
		System.out.println(findLargestRectangle(arr));

	}

	private static int findLargestRectangle(ArrayList<Integer> arr) {
		ArrayList<Integer> nse = nse(arr);
		ArrayList<Integer> pse = pse(arr);
		int max = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) * (nse.get(i) - pse.get(i) - 1) > max) {
				max = arr.get(i) * (nse.get(i) - pse.get(i) - 1);
			}
		}

		return max;
	}

	private static ArrayList<Integer> pse(ArrayList<Integer> arr) {
		Stack<Integer> st = new Stack<Integer>();

		ArrayList<Integer> pse = new ArrayList<>();
		for (int i = 0; i < arr.size(); i++) {

			while (!st.isEmpty() && arr.get(st.peek()) >= arr.get(i)) {
				st.pop();
			}
			if (st.isEmpty()) {
				pse.add(-1);

			} else {
				pse.add(st.peek());

			}
			st.push(i);
		}
		return pse;
	}

	private static ArrayList<Integer> nse(ArrayList<Integer> arr) {
		Stack<Integer> st = new Stack<Integer>();

		ArrayList<Integer> nse = new ArrayList<>();
		for (int i = arr.size()-1; i >=0; i--) {

			while (!st.isEmpty() && arr.get(st.peek()) >= arr.get(i)) {
				st.pop();
			}
			if (st.isEmpty()) {
				nse.add(arr.size());

			} else {
				nse.add(st.peek());

			}
			st.push(i);
		}
		Collections.reverse(nse);
		return nse;
	}

}