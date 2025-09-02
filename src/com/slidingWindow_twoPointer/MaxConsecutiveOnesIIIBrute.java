package com.slidingWindow_twoPointer;

public class MaxConsecutiveOnesIIIBrute {

	public static void main(String[] args) {
		int arr[] = {0,0,1,1};
		int k = 1;

		System.out.println(findMax(arr, k));

	}

	private static int findMax(int[] arr, int k) {
		if(arr.length == k) {
			return k;
		}
		int maxLength = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int zeros = 0;
			int max = 0;
			int j = i;
			for (j = i; j < arr.length; j++) {
				  if (arr[j] == 0) {
					zeros++;
				}if (zeros > k) {
					max = Math.max(max, j - i);
					break;
				}
			}
			
			maxLength = Math.max(j-i, maxLength);

		}
		

		return maxLength;
	}

}
