package com.slidingWindow_twoPointer;

public class MaxConsecutiveOnesIIIOptimal {

	public static void main(String[] args) {
		
		int arr[] = {0,0,1,1};
		int k = 1;
		System.out.println(findMax(arr ,k));

	}

	private static int findMax(int[] arr,int k) {
		 
		int left = 0;
		int right =0;
		int maxLength = 0;
		int zeros =0;
		while(right <arr.length) {
			
			if(arr[right] == 0) {
				zeros++;
			}if(zeros <= k) {
				right++;
			}else if(zeros > k) {
				maxLength = Math.max(maxLength, right -left);
				while(arr[left] != 0) {
					left++;
				}
				zeros = zeros -2;
				if(arr[left] == 0) {
				left = left+1;
				}
			}
			
		}
		maxLength = Math.max(maxLength, right - left);
		return maxLength;
	}

}
