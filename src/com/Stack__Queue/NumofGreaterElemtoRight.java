package com.Stack__Queue;



public class NumofGreaterElemtoRight {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 10, 4 };
		int query = 2;
		int[] indices = {0, 1};

		int[] ans = findTheNGER(arr, query, indices);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static int[] findTheNGER(int[] arr, int query, int[] indices) {
		int res[] = new int[indices.length];

		for (int i = 0; i < indices.length; i++) {
			res[i] = findCount(arr[indices[i]], arr,indices[i]);
		}
		return res;
	}

	private static int findCount(int index, int[] arr,int indices) {
		int count = 0;
		for (int i = indices; i < arr.length; i++) {
			if (arr[i] > index) {
				count++;
			}
		}
		return count;

	}

}
