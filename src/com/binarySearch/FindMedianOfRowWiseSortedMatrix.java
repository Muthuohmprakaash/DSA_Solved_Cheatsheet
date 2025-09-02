package com.binarySearch;

public class FindMedianOfRowWiseSortedMatrix {

	public static void main(String[] args) {
		int arr[][] = { { 31, 41, 62 }, { 0, 79, 80 }, { 14, 15, 40 } };

		System.out.println(findMedian(arr));

	}

	private static int findMedian(int[][] arr) {

		int n = (arr.length * arr[0].length / 2) ;

		int low = findLow(arr);
		int high = findHigh(arr);

		while (low <= high) {
			int mid = (low + high) / 2;

			int count = findThevalues(mid, arr);
			if (count <= n) {

				low = mid + 1;
			} else {
				high = mid - 1;

			}
		}
		return low;
	}

	private static int findThevalues(int mid, int[][] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int low = 0;
			int high = arr[0].length - 1;

			while (low <= high) {
				int middle = (low + high) / 2;

				if (arr[i][middle] <= mid) {
					low = middle + 1;
				} else {
					high = middle - 1;
				}

			}
			count = count + low;
		}
		return count;
	}

	private static int findHigh(int[][] arr) {
		int ans = arr[0][arr[0].length - 1];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i][arr[0].length - 1] > ans) {
				ans = arr[i][arr[0].length - 1];
			}
		}

		return ans;

	}

	private static int findLow(int[][] arr) {

		int ans = arr[0][0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i][0] < ans) {
				ans = arr[i][0];
			}
		}

		return ans;
	}

}
