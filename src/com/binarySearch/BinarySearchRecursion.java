package com.binarySearch;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		
		int arr[] = { 3, 4, 6, 7, 9 };
		int target = 9;
		int low = 0;
		int high = arr.length - 1;
		System.out.println(findTheIndex(arr, target, low, high));

	}

	private static int findTheIndex(int[] arr, int target, int low, int high) {
		if (high < low) {
			return -1;
		}

		int mid = (low + high) / 2;
		if (arr[mid] == target) {
			return mid;
		} else if (arr[mid] < target) {
			return findTheIndex(arr, target, mid + 1, high);
		}
		return findTheIndex(arr, target, low, mid - 1);

	}

}
