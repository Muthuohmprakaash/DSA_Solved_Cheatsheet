package com.binarySearch;

public class RowWithMax1sOptimal {

	public static void main(String[] args) {
		int arr[][] = {{0,1},{1,0}};
		System.out.println(findMax1s(arr));

	}

	private static int findMax1s(int[][] arr) {
		int ans = 0;
		int store = 0;
		for(int i =0;i<arr.length;i++) {
			
			
			int start = findStartingPoint(arr[i]);
			start = arr[i].length - start;
			
			if(start > store) {
				ans = i;
				store = start;
			}
			
		}
		return ans;
		
	}

	private static int findStartingPoint(int[] num) {
		
		int low = 0;
		int high = num.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(num[mid] != 1) {
				low = mid+1;
			}else {
				high = mid -1;
			}
			
		}
		return low;
		
	}

}
