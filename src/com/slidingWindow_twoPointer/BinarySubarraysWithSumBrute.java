package com.slidingWindow_twoPointer;

public class BinarySubarraysWithSumBrute {

	public static void main(String[] args) {
		int arr[] = {1,0,0,1,1,0};
		int goal = 2;

		System.out.println(findTheCount(arr, goal));

	}

	private static int findTheCount(int[] arr, int goal) {
		int count =0;
		for(int i =0;i<arr.length;i++) {
			int summa = 0;
			for(int j = i;j<arr.length;j++) {
				summa = summa + arr[j];
				if(summa == goal) {
					count ++;
				}
			}
		}
		return count;
	}

}
