package com.binarySearch;

public class RowWithMax1s {

	public static void main(String[] args) {
		int arr[][] = {{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
		
		System.out.println(findMax1(arr));

	}

	private static int findMax1(int[][] arr) {
		int ans = 0;
		int val = 0;
		for(int i =0;i<arr.length;i++) {
			int rowCount = 0;
			for(int j =0;j<arr[0].length;j++) {
				rowCount = rowCount + arr[i][j];
			}
			if(rowCount > ans) {
				ans = rowCount;
				val =  i;
			}
		}
		return val;
		
	}

}
