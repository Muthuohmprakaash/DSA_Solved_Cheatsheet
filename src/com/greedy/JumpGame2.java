package com.greedy;

public class JumpGame2 {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 1, 2, 3, 1, 1, 2 };
		System.out.println(howManyJumps(arr));
	}

	private static int howManyJumps(int[] arr) {
		int left = 0;
		int right = 0;
		int jump = 0;

		while (right < arr.length - 1) {

			int maxJump = 0;

			for (int i = left; i <= right; i++) {
				maxJump = Math.max(maxJump, i + arr[i]);
			}
			left = right + 1;
			right = maxJump;
			jump++;

		}
		return jump;
	}

}
