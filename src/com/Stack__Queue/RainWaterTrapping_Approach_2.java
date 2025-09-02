package com.Stack__Queue;

public class RainWaterTrapping_Approach_2 {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		System.out.println(findTheTrappedWater(arr));

	}

	private static int findTheTrappedWater(int[] arr) {
		int lmax =0,rmax =0;
		int total =0;
		int l =0, r=arr.length-1;
		
		while(l<=r) {
			if(arr[l] <= arr[r]) {
				if(arr[l] >= lmax) {
					lmax = arr[l];
					
				}else {
					total = total + (lmax - arr[l]);
				}
				l++;
			}else {
				if(arr[r] >= rmax) {
					rmax = arr[r];
				}else {
					total = total + (rmax - arr[r]);
				}
				r--;
				
			}
			
		}
		
		return total;
	}

}
