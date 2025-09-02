package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RemoveDupFromArray {

	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(removeDuplicates(nums));

	}
	 public static int removeDuplicates(int[] nums) {
	        Map<Integer,Integer> mpp = new HashMap<>();
	        int count = 0;
	        int ans[] = nums; 
	        int j =0;
	        for(int i =0;i<nums.length;i++){
	            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
	            if(mpp.get(nums[i]) == 1){
	                count++;
	                ans[j] = nums[i];
	                j++;
	            }
	        }
	        return count;
	    }

}
