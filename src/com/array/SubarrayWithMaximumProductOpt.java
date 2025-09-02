package com.array;

public class SubarrayWithMaximumProductOpt {

	public static void main(String[] args) {
		int arr[]={3,-1,4};
		
		System.out.println(findTheMaxProduct(arr));

	}

	private static int findTheMaxProduct(int[] arr) {
		
		int maxi = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int i =0;i<arr.length;i++){
            if(prefix == 0 ){
                prefix = 1;
            }if(suffix ==0){
                suffix =1;
            }
            prefix = prefix * arr[i];
            suffix = suffix * arr[arr.length-i-1];

            if(prefix > maxi){
                maxi = prefix;
            }if(suffix > maxi){
                maxi = suffix;
            }
        }
        return maxi;
		
	}

}
