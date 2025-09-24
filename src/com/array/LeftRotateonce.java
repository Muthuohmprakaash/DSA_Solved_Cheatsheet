package com.array;

import java.util.Arrays;

public class LeftRotateonce {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(leftRotate(arr)));

	}

	private static int[] leftRotate(int[] nums) {

		int temp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			nums[i - 1] = nums[i];
		}
		nums[nums.length - 1] = temp;
		return nums;
	}

}
