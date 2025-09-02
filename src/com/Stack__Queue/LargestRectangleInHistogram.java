package com.Stack__Queue;

import java.util.Stack;

public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		int [] arr = {2,1,5,6,2,3};
		
		System.out.println(findLargestRectangle(arr));

	}

	private static int findLargestRectangle(int[] arr) {
		int[] nse = nse(arr);
		int[] pse = pse(arr);
		int max = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] * (nse[i] - pse[i] -1) > max) {
				max = arr[i] * (nse[i] - pse[i] -1) ;
			}
		}
		
		return max;
	}

	private static int[] pse(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		int pse[] = new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			
			while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				pse[i] = -1;
				
			}else {
				pse[i] = st.peek();
				
			}
			st.push(i);
		}
		return pse;
	}

	private static int[] nse(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		int nse[] = new int[arr.length];
		for(int i =arr.length-1;i>=0;i--) {
			
			while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				nse[i] = arr.length;
				
			}else {
				nse[i] = st.peek();
				
			}
			st.push(i);
		}
		return nse;
	}

}
