package com.binarySearch;

public class SmallestDivisorForGivThreshold {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 9};
		int threshold = 6;

     System.out.println(findSmallDivisor(arr, threshold));
		
		

	}

	private static int findSmallDivisor(int[] arr, int threshold) {

		int low = 1;
		int high = findMax(arr);

		while (low <= high) {
			int mid = (low + high) / 2;

			if (possible(arr, threshold, mid) == true) {
					high = mid -1;
			}else {
				low = mid+1;
			}
		}
		return low;
	}

	private static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}

	private static boolean possible(int[] arr, int threshold, int mid) {

	
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % mid == 0) {
				ans = ans + (arr[i]/mid);
			}else {
				ans = ans + (arr[i]/mid)+1;
			}
		}
		
		

		return ans <= threshold;

	}

}
