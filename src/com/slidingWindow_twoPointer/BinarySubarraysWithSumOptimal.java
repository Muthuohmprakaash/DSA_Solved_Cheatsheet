package com.slidingWindow_twoPointer;

public class BinarySubarraysWithSumOptimal {

	public static void main(String[] args) {
		int arr[] = {1,0,0,1,1,0};
		int goal = 2;

		System.out.println(findTheCount(arr, goal)  - findTheCount(arr,goal -1));


	}

	private static int findTheCount(int[] arr, int goal) {
		int left =0;
		int right =0;
		
		int subarrcount = 0;
		int count =0;
		while(right < arr.length) {
			if(goal < 0) {
				return 0;
			}
			subarrcount = subarrcount + arr[right];
			while(subarrcount > goal) {
				subarrcount = subarrcount - arr[left];
				left++;
			}
			count = count + right - left + 1;
			right++;
			
		}
		
		return count;
	}

}
