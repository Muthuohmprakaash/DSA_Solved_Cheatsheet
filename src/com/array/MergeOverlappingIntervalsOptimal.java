package com.array;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervalsOptimal {

	public static void main(String[] args) {

		int[][] arr = { { 1, 4 }, { 3, 3 }, { 3, 3 }, { 3, 3 }, { 3, 4 }, { 4, 4 }, { 5, 5 }, { 5, 5 }, { 5, 6 } };

		List<List<Integer>> ans = findtheMergeOverlapping(arr);

		System.out.println(ans);
	}

	private static List<List<Integer>> findtheMergeOverlapping(int[][] arr) {
		List<List<Integer>> ls = new ArrayList<>();

//		Arrays.sort(arr,(o1, o2) ->  o1[0] - o2[0]);

		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[0] != b[0]) {
					return a[0] - b[0];
				} else {
					return a[1] - b[1];
				}
			}
		});

		int start = arr[0][0];
		int end = arr[0][1];

		for (int j = 1; j < arr.length; j++) {
			if ( arr[j][1] > end && arr[j][0] <= end ) {
				end = arr[j][1];
				
				if(j == arr.length -1) {
					ls.add(Arrays.asList(start,end));
				}
			} else if(arr[j][0] > end) {
				ls.add(Arrays.asList(start, end));

				start = arr[j][0];
				end = arr[j][1];
				if(j== arr.length-1 && end > arr[j-1][1]) {
					ls.add(Arrays.asList(start,end));
				}

			}
		}
		if(ls.isEmpty()) {
			ls.add(Arrays.asList(start, end));
		}

		return ls;
//		for (int i = 0; i < arr.length; i++) {
//			// if the current interval does not
//			// lie in the last interval:
//			if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
//				ans.add(Arrays.asList(arr[i][0], arr[i][1]));
//			}
//			// if the current interval
//			// lies in the last interval:
//			else {
//				ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
//			}
//		}
//		return ans;

//		for(int[] x: arr) {
//			for(int y:x) {
//				System.out.print(y+" ");
//			}
//			System.out.println();
//		}

	}

}
