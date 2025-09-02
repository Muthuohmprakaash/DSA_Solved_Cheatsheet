package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumGoogleOptimal {

	public static void main(String[] args) {
		
		int arr[] = { -2,0,1,1,2};

		// -2,0,1,1,2

		System.out.println(findthe3Sum(arr));

	}

	private static List<List<Integer>> findthe3Sum(int[] arr) {

		List<List<Integer>> answer = new ArrayList<>();

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int k = arr.length - 1;
			int j = i + 1;

			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			while (j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum > 0) {
					k--;
				} else if (sum < 0) {
					j++;
				} else {
					List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);

					answer.add(temp);
					j++;
					k--;

					while (j < k && arr[j] == arr[j - 1]) {
						j++;
					}
					while (j < k && arr[k] == arr[k + 1]) {
						k--;
					}
				}
			}

		}

		return answer;

	}

}
