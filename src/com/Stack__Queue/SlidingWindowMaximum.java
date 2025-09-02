package com.Stack__Queue;


public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int arr[] = {1,-1};
		int k =1;
		int ans[] =findMax(arr,k);
		for(int i =0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

	private static int[] findMax(int[] arr,int k) {
		
		
		int ans[] = new int[arr.length-k+1];
		int i = 0;
		while(i<=arr.length-k) {
			int max =Integer.MIN_VALUE;
			for(int j =i;j<i+k;j++) {
				max = Math.max(max, arr[j]);
			}
			ans[i] = max;
			i++;
			
		}
		return ans;
		
	}

}
