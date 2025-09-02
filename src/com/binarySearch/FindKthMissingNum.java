package com.binarySearch;

public class FindKthMissingNum {

	public static void main(String[] args) {
		int arr[] = {7,13,21,25,29,32,38,45};
		int k = 4;

		System.out.println(findTheNum(arr, k));

	}

	private static int findTheNum(int[] arr, int k) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int missingNum = arr[mid] - (mid + 1);

			if (missingNum < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		if(high < 0) {
			return k;
		}
		int ans = arr[high] - (high + 1);
		ans = arr[high] + (k-ans);
		return ans;

	}



}