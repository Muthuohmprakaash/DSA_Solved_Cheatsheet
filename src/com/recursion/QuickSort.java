package com.recursion;

public class QuickSort {

	public static void main(String[] args) {
		
		int arr[] = { 4, 3, 1, 9, 5, 2, 1 };

		int low = 0;
		int high = arr.length - 1;

		quickSort(arr, low, high);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int partition = findPivot(arr, low, high);
			quickSort(arr, low, partition - 1);
			quickSort(arr, partition + 1, high);
		}
	}

	private static int findPivot(int[] arr, int low, int high) {
		int i = low;
		int j = high;

		int pivot = arr[low];

		while (i < j) {
			while (arr[i] <= pivot && i <= high - 1) {
				i++;
			}
			while (arr[j] > pivot && j >= low + 1) {
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}

//		swap(arr[low],arr[j]);

		int swap = arr[low];
		arr[low] = arr[j];
		arr[j] = swap;

		return j;
	}

}
