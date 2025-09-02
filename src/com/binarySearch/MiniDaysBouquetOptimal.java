package com.binarySearch;

public class MiniDaysBouquetOptimal {

	public static void main(String[] args) {
		int arr[] = { 7, 7, 7, 7, 13, 11, 12, 7 };
		int m = 2;
		int k = 3;

		int start = findmin(arr);
		int end = findmax(arr);

		System.out.println(findBouquetCreated(arr, m, k, start, end));

	}

	private static int findBouquetCreated(int[] arr, int m, int k, int start, int end) {
		long val = (long) m * k;
		int n = arr.length;

		if (val > n) {
			return -1;
		}
		
		int low = start;
		int high = end;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (findNoOfBouquets(arr, mid, m, k) == true) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return low;

	}

	private static boolean findNoOfBouquets(int[] arr, int day, int m, int k) {

		int count = 0;
		int bouquet = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= day) {
				count++;
			} else {
				bouquet = bouquet + (count / k);
				count = 0;
			}
		}

		bouquet = bouquet + (count / k);

		return bouquet >= m;
	}

	private static int findmin(int arr[]) {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;

	}

	private static int findmax(int arr[]) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
