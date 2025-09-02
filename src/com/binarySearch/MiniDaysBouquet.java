package com.binarySearch;

public class MiniDaysBouquet {

	public static void main(String[] args) {
		int arr[] = { 7, 7, 7, 7, 13, 11, 12, 7 };
		int m = 2;
		int k = 3;
		int start = findmin(arr);
		int end = findmax(arr);
		
		System.out.println(BouquetsCreated(arr,start,end,m,k));
		

	}

	private static int BouquetsCreated(int[] arr, int start, int end, int m, int k) {
		
		for(int i = start;i<=end;i++) {
			if(findNoOfBouquets(arr,i,m,k) == true) {
				return i;
			}
		}
		return -1;
		
	}

	private static boolean findNoOfBouquets(int[] arr, int day,int m,int k) {
		
		int count = 0;
		int bouquet = 0;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i] <= day) {
				count++;
			}else {
				bouquet = bouquet +(count/k);
				count = 0;
			}
		}
		if(count > 0) {
			bouquet = bouquet + (count/k);
		}if(bouquet >= m) {
			return true;
		}
		
		
		return false;
	}

	private static int findmin(int arr[]) {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;

	}

	private static int findmax(int arr[]) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
