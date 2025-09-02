package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumGoogle {

	public static void main(String[] args) {
		
		int arr[] = { -1, 0, 1, 2, -1, 4 };

		System.out.println(findThe3SumZero(arr));
	}

	private static List<List<Integer>> findThe3SumZero(int[] arr) {
		
		Set<List<Integer>> hash = new HashSet<>();
		

		for (int i = 0; i < arr.length; i++) {
			Set<Integer> zeroSum = new HashSet<>();
			for (int j = i + 1; j < arr.length; j++) {
				int k = -(arr[i] + arr[j]);
				boolean res = zeroSum.contains(k);
				if (res == true) {
					List<Integer> al = new ArrayList<Integer>();
					al.add(arr[i]);
					al.add(arr[j]);
					al.add(k);
					zeroSum.add(arr[j]);
					Collections.sort(al);
					hash.add(al);
					int p = 2;
					while(p<=0) {
						al.remove(p);
						p--;
					}
					
					

				} else {
					zeroSum.add(arr[j]);
				}
			}
		}
		
		List<List<Integer>> answer = new ArrayList<>(hash);
		
		return answer;

	}

}
