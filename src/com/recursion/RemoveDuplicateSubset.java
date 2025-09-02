package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateSubset {

	public static void main(String[] args) {
		
		int arr[]= {1,2,2,2,3,3};
		System.out.println(removeDuplicate(arr));

	}

	private static List<List<Integer>> removeDuplicate(int[] arr) {
		Arrays.sort(arr);
		List<List<Integer>> al = new ArrayList<>();
		findSubset(0,arr,new ArrayList<>(),al);
		return al;
		
	}

	private static void findSubset(int index, int[] arr, List<Integer> arrayList, List<List<Integer>> al) {
		al.add(new ArrayList<>(arrayList));
		for(int i=index ;i<arr.length;i++ ) {
			if(i!=index && arr[i]==arr[i-1]) 
				continue;
			arrayList.add(arr[i]);
			findSubset(i+1,arr,arrayList,al);
			arrayList.remove(arrayList.size()-1);
			
		}
		
	}

}
