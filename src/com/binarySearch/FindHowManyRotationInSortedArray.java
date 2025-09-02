package com.binarySearch;

public class FindHowManyRotationInSortedArray {

	public static void main(String[] args) {
		
		int arr[] = {9,10,1,3,4};
		
		System.out.println(findMin(arr));
		

	}
	private static int findMin(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int min = Integer.MAX_VALUE;
		int index = -1;
		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] >= arr[low]) {
				if (arr[low] < min) {
					min = arr[low];
					index = low;
				}
				low = mid+1;
			} else if (arr[mid] <= arr[high]) {
				if (arr[mid] < min) {
					min = arr[mid];
					index = mid;
				}
				high = mid -1;
			}
		}
		
		return index;

	}

}
