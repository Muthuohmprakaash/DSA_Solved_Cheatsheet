package com.recursion;

import java.util.ArrayList;

public class FindSubsequences {

	public static void main(String[] args) {
		int arr[] = {3,2,1};
		int index = 0;
		ArrayList<Integer> al = new ArrayList<>();
		
		findsubsequences(index,arr,al);

	}

	private static void findsubsequences(int index, int[] arr, ArrayList<Integer> al) {
		
		if(index==arr.length) {
			System.out.println(al);
			return;
		}
		al.add(arr[index]);
		findsubsequences(index+1,arr,al);
		al.remove(al.size()-1);
		findsubsequences(index+1,arr,al);
		
		
	}



}
