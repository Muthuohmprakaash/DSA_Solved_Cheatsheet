package com.greedy;

public class JumpGame1 {

	public static void main(String[] args) {
		int arr[] = {2,3,1,1,4};
		System.out.println(canJump(arr));

	}

	private static boolean canJump(int[] arr) {
		
		int maxIndex = 0;
		
		for(int i =0;i<arr.length;i++) {
			if(i > maxIndex) {
				return false;
			}
			maxIndex = Math.max(maxIndex, i+arr[i]);
			
		}
		
		return true;
	}

}
