package com.array;

import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
import java.util.List;

public class CountInversionOpt {

	public static void main(String[] args) {
		
		int arr[]= {5,3,2,4,1};

		
		int low = 0;
		int high = arr.length-1;
		System.out.println(mergeSort(arr,low,high));
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static int mergeSort(int[] arr,int low,int high) {
		int count  = 0;
		if(low >= high) {
			return count;
		}
		int mid = (low + high)/2;
		count += mergeSort(arr,low,mid);
		count += mergeSort(arr,mid+1,high);
		count += merge(arr,low,mid,high);
		
		return count;
		
		
	}

	private static int merge(int[] arr, int low,int mid, int high) {
		List<Integer> al = new ArrayList<Integer>();
		int left = low;
		int right = mid+1;
		int count = 0;
		
		 while (left <= mid && right <= high) {
	            if (arr[left] <= arr[right]) {
	                al.add(arr[left]);
	                left++;
	            } else {
	                al.add(arr[right]);
	                count += (mid - left + 1);
	                right++;
	            }
	        }
		while(left<=mid) {
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
		return count;
	}

}
