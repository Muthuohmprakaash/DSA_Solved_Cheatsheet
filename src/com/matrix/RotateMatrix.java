package com.matrix;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2 }, { 3, 4 } };

		int n = matrix.length;
		int m = matrix[0].length;

		int[][] answer =rotate90Degree(matrix, n, m);
		
		for(int i =0;i<answer.length;i++) {
			for(int j =0;j<answer[0].length;j++) {
				System.out.print(answer[i][j]);
				
			}
			System.out.println();
		}

	}

	private static int[][] rotate90Degree(int[][] matrix, int n, int m) {

		int[][] ans = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ans[j][(n-1)-i]=matrix[i][j];
			}
		}
		return ans;

	}

}
