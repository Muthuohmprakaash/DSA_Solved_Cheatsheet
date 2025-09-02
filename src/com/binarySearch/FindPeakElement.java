package com.binarySearch;

public class FindPeakElement {

	public static void main(String[] args) {

		int[] arr = { 1, 8, 1, 5, 3 };

		System.out.println(findThePeak(arr));
		
	}

	private static int findThePeak(int[] arr) {

		if (arr.length == 1) {
			return 0;
		} else if (arr[0] > arr[1]) {
			return 0;
		} else if (arr[arr.length - 1] > arr[arr.length - 2]) {
			return arr.length - 1;
		}

		int low = 1;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]) {
				return mid;
			} else if (arr[mid - 1] < arr[mid] && arr[mid + 1] > arr[mid]) {
				low = mid + 1;
			} else if (arr[mid - 1] > arr[mid] && arr[mid + 1] < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;

	}

}
