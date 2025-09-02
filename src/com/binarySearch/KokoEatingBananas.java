package com.binarySearch;

import java.util.Arrays;

public class KokoEatingBananas {

	public static void main(String[] args) {

		int piles[] = { 4, 9, 4, 3, 1, 3 };
		int h = 66;

		System.out.println(findTheBananas(piles, h));

	}

	private static int findTheBananas(int[] piles, int h) {

		Arrays.sort(piles);
		int low = 1;
		int high = piles[piles.length - 1];

		while (low <= high) {
			int mid = (low + high) / 2;
			int ans = findMinBanans(mid, piles);

			if (ans <= h) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return low;
	}

	private static int findMinBanans(int mid, int[] piles) {
		int ans = 0;
		for (int i = 0; i < piles.length; i++) {
            ans += Math.ceil((double)(piles[i]) / (double)(mid));
        }
		return ans;
	}

}
