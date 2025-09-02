package com.recursion;

import java.util.ArrayList;

public class FindSubsequenceSumofK {

	public static void main(String[] args) {
		
		int arr[] = {1,2,1};
		int k = 2;
		int sum =0;
		int index =0;
		ArrayList<Integer> al = new ArrayList<>();
		
		
		findK(index,arr,k,sum,al);

	}

	private static void findK(int index, int[] arr, int k, int sum, ArrayList<Integer> al) {
		if(index == arr.length) {
			if(sum==k) {
				System.out.println(al);
			}
			return;
		}
		al.add(arr[index]);
		sum = sum + arr[index];
		findK(index+1,arr,k,sum,al);
		al.remove(al.size()-1);
		sum = sum - arr[index];
		findK(index+1,arr,k,sum,al);
		
		
	}



}
