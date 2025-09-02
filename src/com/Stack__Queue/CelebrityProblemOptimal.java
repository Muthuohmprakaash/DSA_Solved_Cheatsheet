package com.Stack__Queue;

public class CelebrityProblemOptimal {

	public static void main(String[] args) {
		
		int arr[][] = {{1,1,0},{0,1,0},{0,1,1}};
		
		System.out.println(findCelebrity(arr));

	}

	private static int findCelebrity(int[][] arr) {
		int top =0;
		int bottom = arr.length-1;
		
		while(top < bottom) {
			if(arr[top][bottom] == 1) {
				top++;
			}else if(arr[bottom][top] == 1){
				bottom--;
			}else {
				top++;
				bottom--;
				
			}
		}
		if(top>bottom) {
			return -1;
		}
		for(int i =0;i<arr[0].length;i++) {
			if(i == top) {
				continue;
			}
			if(arr[top][i] == 0 && arr[i][top] == 1 ) {
				
			}else {
				return -1;
			}
		}
		return top;
	}

}
