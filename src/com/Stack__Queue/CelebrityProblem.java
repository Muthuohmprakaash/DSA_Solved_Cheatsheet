package com.Stack__Queue;

public class CelebrityProblem {

	public static void main(String[] args) {
		int arr[][] = {{1,1,0},{0,1,0},{0,1,1}};
		
		System.out.println(findTheCelebrity(arr));

	}

	private static int findTheCelebrity(int[][] arr) {
		int knewme[] =new int[arr.length];
		int Iknew[] = new int[arr[0].length];
		
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				if(arr[i][j] == 1 && i!=j) {
					Iknew[i]++;
					knewme[j]++;
				}
			}
		}
		
		for(int i =0;i<knewme.length;i++) {
			if(knewme[i] == arr.length-1 && Iknew[i] == 0) {
				return i;
				
			}
		}
	
		return -1;
		
	}

}
