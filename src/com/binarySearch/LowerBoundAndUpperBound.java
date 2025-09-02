package com.binarySearch;

public class LowerBoundAndUpperBound {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 2, 3 };
		int n = 2;
		System.out.println(findTheLB(arr, n));
		System.out.println(findTheUB(arr, n));
	}

	private static int findTheUB(int[] arr, int n) {
		
		int low = 0;
		int high = arr.length - 1;
		int lb = arr.length; // if no lowerBound fount return the length of array
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] > n) {

				lb = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return lb;

	}

	private static int findTheLB(int[] arr, int n) {

		int low = 0;
		int high = arr.length - 1;
		int lb = arr.length; // if no lowerBound fount return the length of array
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] >= n) {

				lb = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return lb;
	}

}
