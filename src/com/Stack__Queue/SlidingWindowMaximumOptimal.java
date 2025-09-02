package com.Stack__Queue;

import java.util.ArrayDeque;
// import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMaximumOptimal {

	public static void main(String[] args) {

		int arr[] = {1,3,1,2,0,5};
		int k = 3;

		int[] ans = findMaxarr(arr, k);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static int[] findMaxarr(int[] arr, int k) {
		
		int[] ans = new int[arr.length - k + 1];
		Deque<Integer> dq = new ArrayDeque<Integer>();
		int i = 0;
		int j = 0;
		
		int window = k-1 ;
		for (i = 0; i < arr.length; i++) {

			if (!dq.isEmpty() && dq.peekFirst() == i - k) {
				dq.pollFirst();
			}
			while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
				dq.pollLast();
			}
			dq.offerLast(i);
			if (i >= window) {
				ans[j] = arr[dq.peekFirst()];
			
				window++;
				j++;
			}
			

		}


		return ans;
	}

}
