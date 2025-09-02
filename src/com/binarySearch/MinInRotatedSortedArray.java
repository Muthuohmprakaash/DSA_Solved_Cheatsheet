package com.binarySearch;

public class MinInRotatedSortedArray {

	public static void main(String[] args) {
		
		int arr[] = { 22, 29, 32, 35, 37, 40, 42, 43, 44, 50, 2, 7 ,10, 13};
		System.out.println(findMin(arr));

	}

	private static int findMin(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int min = Integer.MAX_VALUE;
		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] >= arr[low]) {
				if (arr[low] < min) {
					min = arr[low];
				}
				low = mid+1;
			} else if (arr[mid] <= arr[high]) {
				if (arr[mid] < min) {
					min = arr[mid];
				}
				high = mid -1;
			}
		}
		
		return min;

	}

}
