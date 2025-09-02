package com.binarySearch;

import java.util.Arrays;

public class AggressiveCows {

	public static void main(String[] args) {
		int[] stalls = { 1, 2, 4, 8, 9 };
		int k = 3;

		System.out.println(findTheStallsforCows(stalls, k));

	}

	private static int findTheStallsforCows(int[] stalls, int k) {

		Arrays.sort(stalls);

		int low = 1;
		int high = stalls[stalls.length - 1];

		while (low <= high) {
			int mid = (low + high) / 2;

			if (check(stalls, mid, k) == true) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}

		}
		return high;
	}

	private static boolean check(int[] stalls, int mid, int cows) {
		
		int c = 1;
		int last = stalls[0];
		for (int i = 1; i < stalls.length; i++) {
			if(stalls[i] - last >= mid) {
				c++;
				last = stalls[i];
			}
			
		}
		if (c >= cows) {
			return true;
		}
		return false;

	}

}
