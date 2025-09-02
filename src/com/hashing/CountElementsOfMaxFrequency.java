package com.hashing;

import java.util.Arrays;

public class CountElementsOfMaxFrequency {

	public static void main(String[] args) {
		int [] nums = {10,12,11,9,6,19,11};
		
		System.out.println(findthecount(nums));

	}

	private static int findthecount(int[] nums) {
		Arrays.sort(nums);
		 int hash[] = new int[nums[nums.length - 1] + 1];

	        for(int i =0;i<nums.length;i++){
	            hash[nums[i]]++;
	        }
	        int max = hash[1];
	        int ans =max;
	        for(int j =2;j<hash.length;j++){
	            if(max == hash[j] && hash[j] > max ) {
	            	ans = ans + hash[j]; 
	            }
	        }
	        return ans;
		
	}

}
