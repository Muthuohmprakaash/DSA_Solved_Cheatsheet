package com.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroMatrix {

	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
		matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
		matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

		int n = matrix.size();
		int m = matrix.get(0).size();
		
	    for(int i =0;i<matrix.size();i++) {
	    	for(int j =0;j<matrix.get(i).size();j++) {
	    		System.out.print(matrix.get(i).get(j)+ " ");
	    	}
	    	System.out.println();
	    }
		changeZeroRowsAndColumnToAllZero(matrix, n, m);
		 System.out.println("The Final matrix is: ");
	        for (List<Integer> row : matrix) {
	            for (Integer ele : row) {
	                System.out.print(ele + " ");
	            }
	            System.out.println();
	        }

	}

	private static List<List<Integer>> changeZeroRowsAndColumnToAllZero(List<List<Integer>> matrix, int n, int m) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix.get(i).get(j) == 0) {
					markrow(matrix, i, m, n);
					markcolumn(matrix, j, m, n);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix.get(i).get(j) == -1) {
					matrix.get(i).set(j, 0);
				}
			}
		}

		return matrix;

	}

	private static void markcolumn(List<List<Integer>> matrix, int j, int m, int n) {
		
		for (int i = 0; i < n; i++) {
			if (matrix.get(i).get(j) != 0) {
				matrix.get(i).set(j, -1);
			}
		}

	}

	private static void markrow(List<List<Integer>> matrix, int i, int m, int n) {
		for (int j = 0; j < m; j++) {
			if (matrix.get(i).get(j) != 0) {
				matrix.get(i).set(j, -1);
			}
		}

	}

}
