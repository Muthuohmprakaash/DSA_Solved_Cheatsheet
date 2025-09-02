package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNum {

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};

		System.out.println(findDisappearedNum(nums));

	}

	private static List<Integer> findDisappearedNum(int[] nums) {
		List<Integer> al = new ArrayList<>();
		Arrays.sort(nums);
		
		int i =0;
        while(i<nums.length){
      
        if(nums[i] != i+1 ){
            al.add(i+1);
            i++;
        }else{
            i++;
        }
    }
		return al;

	}

}
