package com.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {

	public static void main(String[] args) {
		
		int arr[] = {3,1,2};
		int index =0;
		int sum =0;
		ArrayList<Integer> al = new ArrayList<>();
		
		findSum(index,arr,al,sum);
		Collections.sort(al);
		System.out.println(al);
	}

	private static void findSum(int index, int[] arr, ArrayList<Integer> al, int sum) {
		if(index==arr.length) {
			al.add(sum);
			return;
		}
		sum = sum + arr[index];
		findSum(index+1,arr,al,sum);
		sum = sum - arr[index];
		findSum(index+1,arr,al,sum);
		
	}


}
