package com.binarySearch;

public class FloorAndCeil {

	public static void main(String[] args) {
		int a[] = {3,4,7,8,8,10};
		int n = a.length;
		int x = 5;
		int ans[] = new int[2];
		
		int ceil = findCeil(a, n, x);
		int floor = findFloor(a, n, x);

		ans[0] = floor;
		ans[1] = ceil;

		for(int i =0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

	private static int findCeil(int[] arr, int n, int x) {

		int low = 0;
		int high = arr.length - 1;
		int lb = -1; // if no lowerBound fount return the length of array
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] >= x) {

				lb = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		if (lb == -1) {
			return lb;
		}
		return arr[lb];
	}

	private static int findFloor(int[] arr, int n, int x) {

		int low = 0;
		int high = arr.length - 1;
		int lb = -1; // if no lowerBound fount return the length of array
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] <= x) {

				lb = mid;
				low = mid + 1;
			} else {

				high = mid - 1;
			}

		}
		if (lb == -1) {
			return lb;
		}
		return arr[lb];
	}

}
