package com.binarySearch;

public class SearchIn2DMatrix {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 1 } };
		int target = 0;

		System.out.println(searchTheElement(matrix, target));

	}

	private static boolean searchTheElement(int[][] matrix, int target) {

		int low = 0;
		int high = (matrix.length * matrix[0].length) - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			int row = mid / matrix[0].length;
			int col = mid % matrix[0].length;

			if (matrix[row][col] < target) {
				low = mid + 1;
			} else if (matrix[row][col] > target) {
				high = mid - 1;
			} else {
				return true;
			}

		}

		return false;
	}

}
