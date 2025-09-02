package com.matrix;

public class RotateMatrixOptimal {

	public static void main(String[] args) {
		int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		int n = mat.length;
		int m = mat[0].length;
		
		TransposeMatrix(mat,n,m);
		
		for(int[] a : mat) {
			for(int b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}

	}

	private static int[][]TransposeMatrix(int[][] mat, int n, int m) {
		
		for(int i = 0 ;i<n-1;i++) {
			for(int j = i+1;j<m;j++) {
				swap(mat,i,j);
			}
		}
		
		for(int k =0;k<n;k++) {
			for(int l = 0;l<m/2;l++) {
				int temp = mat[k][l];
				mat[k][l] = mat[k][m-1-l];
				mat[k][m-1-l]= temp;
			}
		}
		
		return mat;
		
		
		
	}

	private static void swap(int[][] mat, int i, int j) {
		int temp = mat[i][j];
		mat[i][j] = mat[j][i];
		mat[j][i] = temp;
		
	}

}
