package com.matrix;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = {  { 1, 3, 7, 9 },
							{ 10, 11, 16, 20 },
							{ 23, 30, 34, 60 } 
							};

		int[] result = spiralMatrix(matrix);
		for(int i =0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

	private static int[] spiralMatrix(int[][] matrix) {

		int n = matrix.length;
		int m = matrix[0].length;
		int left = 0;
		int right = matrix[0].length - 1;
		int top = 0;
		int bottom = matrix.length - 1;
		int[] ans = new int[n * m];
		int k = 0;
		
		while(left<= right && top<=bottom) {
		for (int i = left; i <= right; i++) {
			ans[k] = matrix[top][i];
			k++;
		}
		top++;
		for (int j = top; j <= bottom; j++) {
			ans[k] = matrix[j][right];
			k++;

		}
		right--;
		if(top<=bottom) {
		for(int p = right;p>=left;p--) {
			ans[k] = matrix[bottom][p];
			k++;
		}
		}
		bottom--;
		if(left<= right) {
		for(int q = bottom;q>=top;q--) {
			ans[k] = matrix[q][left];
			k++;
		}
		}
		left++;
		}
		return ans;
	}

}
