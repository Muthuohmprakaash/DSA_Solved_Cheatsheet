package com.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroMatrixBetter {

	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<>();
		
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
		
		for(List<Integer> x : matrix) {
			for(Integer y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		int n = matrix.size();
		int m = matrix.get(0).size();
		changeTheZeros(matrix,n,m);
		
		System.out.println("After replacing Zeros: ");
		for(List<Integer> a : matrix) {
			for(Integer b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}

	}

	private static List<List<Integer>> changeTheZeros(List<List<Integer>> matrix, int n, int m) {

		int row[] = new int[n];
		int col[] = new int[m];
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				if(matrix.get(i).get(j) == 0) {
					row[i]=1;
					col[j]=1;
				}
			}
		}
		for(int k = 0;k<n;k++) {
			for(int l =0;l<m;l++) {
				if(row[k] == 1 || col[l] == 1) {
					matrix.get(k).set(l, 0);
				}
			}
		}
		
		return matrix;
		
	}

}
