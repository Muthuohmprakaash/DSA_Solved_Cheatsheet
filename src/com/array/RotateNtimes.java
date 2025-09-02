package com.array;

import java.util.ArrayList;
// import java.util.Arrays;

public class RotateNtimes {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k = 2;
		System.out.println(rotateKtimes(arr, k));
		

	}

	private static ArrayList<Integer> rotateKtimes(ArrayList<Integer> arr, int k) {
		
		ArrayList<Integer> al = new ArrayList<>();
		Object[] converted =arr.toArray();
		reverse(converted,0,k);
		reverse(converted,k,converted.length);
		reverse(converted,0,converted.length);
		
		for(int i =0;i<converted.length;i++) {
			al.add((Integer) converted[i]);
		}
		
		return al;
		
		

	}

	private static Object[] reverse(Object[] converted,int start, int k) {
		
		for(int i = start;i<k;i++) {
			Object temp = converted[i];
			converted[i] = converted[k-1];
			converted[k-1] = temp;
			k--;
		}
		return converted;
		
	}

}