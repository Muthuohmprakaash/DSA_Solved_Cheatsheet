package com.array;

import java.util.ArrayList;

public class Intersection {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(2);
		arr1.add(3);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(2);
		arr2.add(3);
		arr2.add(3);
		arr2.add(5);
		arr2.add(6);
		arr2.add(6);
		arr2.add(7);
		
		
		System.out.println(findTheIntersection(arr1,arr2));
		
		

	}

	private static ArrayList<Integer> findTheIntersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		
		ArrayList<Integer> al = new ArrayList<>();
		int i =0;
		int j =0;
		
		while(i<arr1.size() && j<arr2.size()){
			if(arr1.get(i)<arr2.get(j)) {
				i++;
			}else if(arr1.get(i)>arr2.get(j)) {
				j++;
			}else {
				al.add(arr1.get(i));
				i++;
				j++;
			}
		}
		return al;
		
		
	}

}
 