package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDisappearedNum {

	public static void main(String[] args) {
		int nums[] = {1,1};
		
		System.out.println(findTheNumbers(nums));

	}

	private static List<Integer> findTheNumbers(int[] nums) {
		
		List<Integer> al = new ArrayList<>();
	    Arrays.sort(nums);
	    int hash[] = new int[nums.length+1];

	    for(int i =0;i<nums.length;i++){
	        hash[nums[i]]++;
	    }
	    for(int j = 1;j<hash.length;j++){
	        if(hash[j] == 0){
	            al.add(j);
	        }
	    }
	    return al;
		
	}

}
