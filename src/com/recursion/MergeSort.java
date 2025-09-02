package com.recursion;

import java.util.ArrayList;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {4,1,9,3,2};  
		int low = 0;
		int high = arr.length-1;
	
		sortarray(arr,low,high);
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void sortarray(int[] arr, int low, int high) {
		if(low == high) {
			return;
		}
		int middle = (low+high)/2;
		sortarray(arr,low,middle);
		sortarray(arr,middle+1,high);
		mergearray(arr,low,middle,high);
		
		
	}

	private static void mergearray(int[] arr, int low, int middle, int high) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int left = low;
		int right = middle+1;
			
		while(left<=middle && right <= high) {
			if(arr[left]<=arr[right]) {
				al.add(arr[left]);
				left++;
			}else if(arr[left]>=arr[right]) {
				al.add(arr[right]);
				right++;
			}
		}
		
		while(left<=middle) {
			al.add(arr[left]);
			left++;
		}
		while(right<=high) {
			al.add(arr[right]);
			right++;
		}
		for(int i = low;i<=high;i++) {
			arr[i] = al.get(i-low);
		}
		
		
	}





}
