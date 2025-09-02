package com.slidingWindow_twoPointer;

public class NumberofSubstringsContainingAll3CharactersOptimal {

	public static void main(String[] args) {

		String s = "abcabc";

		System.out.println(findThesubStr(s));

	}

	private static int findThesubStr(String s) {
		
		int count =0 ;
		int right =0;
		
	
		int hash[] = {-1,-1,-1};
		while(right < s.length()) {
			hash[s.charAt(right) - 97] = right;
			if(hash[0] >= 0 &&  hash[1] >= 0 && hash[2] >= 0) {
				int min = findMin(hash);
				count = count + (1 + min);
			}
			right++;
		}
		
		return count;
	}

	private static int findMin(int[] hash) {
		int min = Integer.MAX_VALUE;
		for(int i =0;i<hash.length;i++) {
			min = Math.min(min, hash[i]);
		}
		return min;
		
	}

}
