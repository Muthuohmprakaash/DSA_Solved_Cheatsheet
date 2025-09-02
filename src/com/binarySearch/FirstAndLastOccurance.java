package com.binarySearch;

import java.util.Arrays;
import java.util.List;

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(0, 1, 1, 1, 2, 2, 2, 2, 2);
		int n = arr.size();
		int k = 2;
		int ans[] = firstAndLastPosition(arr, n, k);
		
		
		
		
		// to find no of occurances

		if (ans[0] == -1) {
			System.out.println(0);
		}
		System.out.println((ans[1] - ans[0] + 1));
		
		
		// this will print first and last occurances
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] firstAndLastPosition(List<Integer> arr, int n, int k) {

		int first = findLB(arr, n, k);
		if (first == -1) {
			return new int[] { first, -1 };
		}
		int last = findUP(arr, n, k);
		return new int[] { first, last };
	}

	private static int findLB(List<Integer> arr, int n, int k) {

		int low = 0;
		int high = n - 1;
		int lb = -1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr.get(mid) >= k) {
				if (arr.get(mid) == k) {
					lb = mid;
				}

				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return lb;
	}

	private static int findUP(List<Integer> arr, int n, int k) {

		int low = 0;
		int high = n - 1;
		int lb = -1;
		boolean flag = false;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr.get(mid) > k) {
				lb = mid;
				high = mid - 1;
			} else if (arr.get(mid) == k) {
				flag = true;
				low = mid + 1;
			} else {
				low = mid + 1;
			}
		}
		if (flag == true && lb == -1) {
			return n - 1;
		}
		return lb - 1;
	}

}
