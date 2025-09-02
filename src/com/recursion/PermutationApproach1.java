package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationApproach1 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		
		System.out.println(find(arr));
		
	}

	private static List<List<Integer>> find(int[] arr) {
		
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		boolean flag[] = new boolean[arr.length];
		findPermutations(0,arr,ds,ans,flag);
		
		return ans;
		
		
	}

	private static void findPermutations(int index, int[] arr, List<Integer> ds, List<List<Integer>> ans, boolean[] flag) {
		if(ds.size()==arr.length) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		for(int i =0;i<arr.length;i++) {
			if(flag[i]==false) {
				ds.add(arr[i]);
				flag[i]=true;
				findPermutations(index+1,arr,ds,ans,flag);
				ds.remove(ds.size()-1);
				flag[i]=false;
			}
		}
		
	}



}
