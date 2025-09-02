package com.array;

public class NoOfSubArrWithSumKBrute {

	public static void main(String[] args) {

		int arr[] = {3, 1, 2, 4};
		int k =6;
		System.out.println(findthecount(arr,k));

	}

	private static int findthecount(int[] arr,int k) {
		int count =0;
		for(int i =0;i<arr.length;i++) {
			int sum =0;
			for(int j = i;j<arr.length;j++) {
				
				sum = arr[j]+sum;
				if(sum == k) {
					count++;
				}
				
			}
		}
		return count;
	}

}
