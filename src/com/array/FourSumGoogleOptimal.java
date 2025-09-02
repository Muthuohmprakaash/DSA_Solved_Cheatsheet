package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumGoogleOptimal {

	public static void main(String[] args) {
	
		int arr[] = {1,1,1,2,2,2,3,3,3,4,4,4,5,5};
		int target = 8;
		System.out.println(findTheSumOf4(arr,target));

	}

	private static List<List<Integer>> findTheSumOf4(int[] arr,int target) {
		
		List<List<Integer>> answer = new ArrayList<>();
		
		Arrays.sort(arr);
		
		for(int i = 0;i<arr.length;i++) {
			if(i>0 && arr[i]== arr[i-1]) {
				continue;
			}
			for(int j =i+1;j<arr.length;j++) {
				if(j>i+1 && arr[j] == arr[j-1]) {
					continue;
				}
				int k = j+1;
				int l = arr.length-1;
				while(k<l) {
					int sum = arr[i]+arr[j]+arr[k]+arr[l];
					
					if(sum > target) {
						l--;
					}
					else if(sum < target) {
						k++;
					}
					else {
						List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
						answer.add(temp);
						k++;
						l--;
						
						while(k<l && arr[k] == arr[k-1]) {
							k++;
						}
						while(k<l && arr[l] == arr[l+1]) {
							l--;
						}
						
					}
				}
			}
		}
		return answer;
		
	}

}
