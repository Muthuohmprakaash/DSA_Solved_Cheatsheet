package com.slidingWindow_twoPointer;

import java.util.HashSet;
import java.util.Set;

public class FruitsInBasketBrute {

	public static void main(String[] args) {
		int arr[] = {1,2,1};
		
		System.out.println(findFruits(arr));

	}

	private static int findFruits(int[] arr) {
		
		int maxLength =0;
		int i =0;
		int j =i;
		for( i =0;i<arr.length;i++) {
			
			Set<Integer> st = new HashSet<Integer>();
			for(j =i;j<arr.length;j++) {
				st.add(arr[j]);
				if(st.size()>2) {
				
					break;
				}
			}
			maxLength = Math.max(maxLength, j - i);
			
		}
		
		
		return maxLength;
	}

}
