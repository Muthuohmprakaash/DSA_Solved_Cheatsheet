package com.binarySearch;

public class SearchRotatedSortedArray {

	public static void main(String[] args) {
		
		int arr[] = {31 ,44 ,56 ,0 ,10, 13};
		int target = 47;

		System.out.println(findTheIndex(arr, target));

	}

	private static int findTheIndex(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] >= arr[low]) {
				if (target <= arr[mid] && target >= arr[low]) {
					high = mid -1;
				} else {
				
					low = mid + 1;
				}
			} else if (arr[mid] <= arr[high]) {
				if (target >= arr[mid] && target <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}

		}

		return -1;

	}

}
