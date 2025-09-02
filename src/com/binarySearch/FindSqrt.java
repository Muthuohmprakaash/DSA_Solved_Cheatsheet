package com.binarySearch;

public class FindSqrt {

	public static void main(String[] args) {
		
		System.out.println(findSquarRoot(28));

	}

	private static int findSquarRoot(int i) {
		
		int low = 1;
		int high = i;
		int ans = 1;
		while(low <= high) {
			int mid = (low + high)/2;
			
			if(mid * mid <= i) {
				ans = mid;
				low = mid +1;
			}else {
				high = mid -1;
			}
		}
		
		return ans;
	}

}
