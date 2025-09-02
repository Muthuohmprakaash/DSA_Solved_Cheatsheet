package com.Stack__Queue;

public class SumOfSubArrRanges_Brute {

	public static void main(String[] args) {
		int arr[] = {-32, 0, -2, 72};
		System.out.println(findTheRanges(arr));

	}

	private static int findTheRanges(int[] arr) {
		int ans = 0;
		for(int i =0;i<arr.length;i++) {
			int largest = arr[i];
			int smallest = arr[i];
			for(int j =i+1;j<arr.length;j++) {
				largest = Math.max(largest, arr[j]);
				smallest = Math.min(smallest,arr[j]);
				ans = ans + largest - smallest;
			}
		}
		return ans;
	}

}
