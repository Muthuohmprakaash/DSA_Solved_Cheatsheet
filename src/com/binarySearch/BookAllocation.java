package com.binarySearch;

public class BookAllocation {

	public static void main(String[] args) {
		
		int arr[] = {12,34,67,90};
		int k = 2;
		
		System.out.println(findTheAllocation(arr,k));

	}

	private static int findTheAllocation(int[] arr, int k) {
		
		if(arr.length<k) {
			return -1;
		}
		
		int low = max(arr);
		int high = sum(arr);


		while(low <= high) {
			int mid = (low+high)/2;
			
			if(check(arr,k,mid) == true) {
				 low = mid +1;
			}else {
				high = mid -1;
			}
		}
		return low;
		
	}

	private static boolean check(int[] arr, int students, int mid) {
		int sum = arr[0];
		int stud = 0;
		for(int i =1;i<arr.length;i++) {
			if(sum <= mid) {
				sum = sum+ arr[i];
				if(sum > mid) {
					stud++;
					sum = arr[i];
				}
			}
		}
		if(stud >= students) {
			return true;
		}
		return false;
	}

	private static int sum(int[] arr) {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	private static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}

}
