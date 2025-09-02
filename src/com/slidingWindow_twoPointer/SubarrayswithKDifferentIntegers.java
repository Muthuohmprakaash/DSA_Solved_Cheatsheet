package com.slidingWindow_twoPointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubarrayswithKDifferentIntegers {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 2, 3 };
		int k = 2;

		System.out.println(findBrute(arr, k));
		System.out.println(findOptimal(arr, k) - findOptimal(arr,k -1));

	}

	private static int findOptimal(int[] arr, int k) {
		
		int left = 0;
		int right =0;
		
		int count =0;
		Map<Integer, Integer> mpp = new HashMap<Integer, Integer>();
		while(right < arr.length) {
			mpp.put(arr[right], mpp.getOrDefault(arr[right], 0)+1);
			while(mpp.size() >k) {
				int insert = mpp.get(arr[left]);
				mpp.put(arr[left], insert -1);
				if(insert -1 <=0) {
					mpp.remove(arr[left]);
					
				}
				left++;
				
			}
			count = count + (right - left +1);
			right++;
		}
		
		return count;
	}

	private static int findBrute(int[] arr, int k) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			Set<Integer> st = new HashSet<Integer>();
			for (int j = i; j < arr.length; j++) {
				st.add(arr[j]);
				if (st.size() == k) {
					count++;
				} else if (st.size() > k) {
					break;
				}
			}
		}

		return count;
	}

}
