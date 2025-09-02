package com.Stack__Queue;

public class SumOfSubArrMaximum {

	public static void main(String[] args) {
		int arr[] = {100,200,300,400};
		int k = 2;
		System.out.println(maximumSumSubarray(arr,k));

	}
	 private static int maximumSumSubarray(int[] arr, int k) {
	        int total = 0;
	        
	        for(int i =0;i<arr.length;i++){
	            int ans = 0;
	            int ptr = 0;
	            for(int j = i;j<arr.length && ptr<k;j++){
	                    ans = ans + arr[j];
	                    ptr++;
	                   
	            }
	            if(ans > total){
	            total =  ans;
	            }
	        }
	        return total;
	    }

}
