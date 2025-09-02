package com.array;

public class MedianOf2sortedArray {

	public static void main(String[] args) {
		
		int[] nums1 = {2,2,4,4};
		int[] nums2 = { 2,2,2,4,4};

		System.out.println(findtheMedian(nums1, nums2));

	}

	private static double findtheMedian(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;

		int answer[] = new int[n1 + n2];

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n1 && j < n2) {
			if (nums1[i] > nums2[j]) {
				answer[k] = nums2[j];
				k++;
				j++;
			}else if(nums1[i] == nums2[j]) {
				answer[k] = nums1[i];
				k++;
				answer[k] = nums2[j];
				k++;
				i++;
				j++;
			}
			else  {
				answer[k] = nums1[i];
				k++;
				i++;
			}
		}
		if (i == nums1.length) {
			while (j < nums2.length) {
				answer[k] = nums2[j];
				k++;
				j++;
			}
		} else {
			while (i < nums1.length) {
				answer[k] = nums1[i];
				k++;
				i++;
			}
		}
		if (answer.length % 2 == 0) {
			int find = answer.length / 2;
			double median = (double)(answer[find] + answer[find - 1]) /2;
			return median;
		} else {
			int find = answer.length / 2;
			double median = answer[find];
			return median;
		}

	}

}
