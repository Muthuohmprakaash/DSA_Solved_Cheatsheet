package com.binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {3,4,6,7,9,12,16,17};
		int target = 12;
		
		System.out.println(findTheIndex(arr,target));

	}
	//Done by me without strivers without watching strivers code.
	private static int findTheIndex(int[] arr, int target) {
		
		
		int low = 0;
		int high = arr.length-1;
		
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] > target) {
				high = mid-1;
			}else if(arr[mid]< target) {
				low = mid+1;
				
			}else {
				return mid;
			}
		}
		
		return -1;
		
		
	}

}
