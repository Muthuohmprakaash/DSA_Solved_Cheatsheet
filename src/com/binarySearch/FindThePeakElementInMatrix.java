package com.binarySearch;

public class FindThePeakElementInMatrix {

	public static void main(String[] args) {

		int[][] arr = { { 4, 2, 5, 1, 4, 5 }, { 2, 9, 3, 2, 3, 2 }, { 1, 7, 6, 0, 1, 3 }, { 3, 6, 2, 3, 7, 2 } };

		int[] ans =findThePeak(arr);
		for(int i =0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

	private static int[] findThePeak(int[][] arr) {
		int low = 0;
		int high = arr[0].length - 1;

		while (low <= high) {

			int mid = (low + high) / 2;

			int check = findGreaterIncol(mid, arr);

			int left = mid - 1 >= 0 ? arr[check][mid - 1] : -1;
			int right = mid + 1 < arr[0].length ? arr[check][mid + 1] : -1;

			if (arr[check][mid] > left && arr[check][mid] > right) {
				return new int[] { check, mid };
			} else if (arr[check][mid] < left) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return new int[] { -1 };
	}

	private static int findGreaterIncol(int mid, int[][] arr) {
		int ans = 0;
		int store = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][mid] > store) {
				store =arr[i][mid];
				ans = i;
			}
		}
		
		return ans;

	}

}
