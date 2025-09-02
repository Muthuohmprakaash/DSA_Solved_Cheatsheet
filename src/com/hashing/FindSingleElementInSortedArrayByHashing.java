package com.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class FindSingleElementInSortedArrayByHashing {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,1,2,2,3,3,4,5,5);
		
		System.out.println(findTheNumber(arr));

	}

	private static int findTheNumber(List<Integer> arr) {
		
		 HashMap<Integer,Integer> mpp = new HashMap<>();
	        for(int i =0;i<arr.size();i++){
	            mpp.put(arr.get(i),mpp.getOrDefault(arr.get(i),0)+1);
	        }
	        for(Entry<Integer,Integer> entry : mpp.entrySet()) {
	        	if(entry.getValue() == 1) {
	        		return entry.getKey();
	        	}
	        }
	        return -1;
		
		
	
		
		
	}

}

