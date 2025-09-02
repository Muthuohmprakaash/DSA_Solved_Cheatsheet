package com.linkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class dummy {

	

	public static void main(String... args) {
		printListOfList();
	}

	private static void printListOfList() {
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();

		ArrayList<Integer> bl = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1));
		ArrayList<Integer> cl = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1));

		al.add(bl);
		al.add(cl);
		
		
		// using normal loop
		for (int i = 0; i < al.size(); i++) {
			for (int j = 0; j < al.get(i).size(); j++) {
				System.out.print(al.get(i).get(j) + " ");
			}
			System.out.println();
		}
		
		//using for each loop
		for(ArrayList<Integer> x : al) {
			for(int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}