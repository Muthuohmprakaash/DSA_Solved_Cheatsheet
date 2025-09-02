package com.binarySearch;

public class SearchIn2DMatrix_2 {
	public static void main(String[] args) {
		int arr[][] = { 
				{ 2,3,5},
				{ 20,21,26}, 
				{ 32,42,43}, 
				};
		int target = 28;
		
		System.out.println(search(arr,target));
	}

	private static boolean search(int[][] arr, int target) {
		int row = 0;
		int col = arr[0].length-1;
		
		while(row <arr.length && col >=0) {
			if(arr[row][col] == target) {
				return true;
			}else if(arr[row][col] > target) {
				col--;
			}else {
				row++;
			}
		}
		return false;
	}
}
