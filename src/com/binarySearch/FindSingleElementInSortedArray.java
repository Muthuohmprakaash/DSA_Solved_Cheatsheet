package com.binarySearch;

import java.util.Arrays;

import java.util.List;


public class FindSingleElementInSortedArray {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,1,2,3,3,4,4,5,5);
		
		
		System.out.println(findTheNumber(arr));

	}

	private static int findTheNumber(List<Integer> arr) {
		
		int low = 1;
		int high = arr.size()-2;
		if(arr.size()==1) {
			return arr.get(0);
		}if(arr.get(0) != arr.get(1)) {
			return arr.get(0);
		}if(arr.get(arr.size()-1) != arr.get(arr.size()-2)) {
			return arr.get(arr.size()-1);
		}
		
		
		while(low<=high) {
			int mid =(low+high)/2;
			if(arr.get(mid)!= arr.get(mid-1)  && arr.get(mid) != arr.get(mid +1)) {
				return arr.get(mid);
			}else if((mid % 2 == 0 && arr.get(mid) == arr.get(mid +1)) 
					|| (mid % 2 == 1 && arr.get(mid) == arr.get(mid-1))) {
				low = mid+1;
			}
			else{
				high = mid -1;
			}
			
		}
		
		return -1;
		
	}

}
