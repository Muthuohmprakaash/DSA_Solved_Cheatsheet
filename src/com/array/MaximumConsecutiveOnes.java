package com.array;

public class MaximumConsecutiveOnes {

	public static void main(String[] args) {
		int [] arr = {1, 0, 1 ,0 ,1 ,1 ,1 ,0};
		int n = arr.length;
		int i =0;
		int max = 0;
		int count = 0;
		while(i<n){
			if(count > max  && arr[i] == 0 || i == n){
				max = count;
				count = 0;

				i++;
			}
			else if(i<n && arr[i] == 1){
				count++;
				i++;
			}
			
			else {
			i++;
			count = 0;
			}
		}
		if(count>max) {
			max = count;
		}
		System.out.println(max);

	}

}
