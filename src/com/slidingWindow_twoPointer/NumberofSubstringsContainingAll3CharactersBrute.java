package com.slidingWindow_twoPointer;

public class NumberofSubstringsContainingAll3CharactersBrute {

	public static void main(String[] args) {
		
		String s = "abcabc";
		
		System.out.println(findThesubStr(s));

	}

	private static int findThesubStr(String s) {
		int count =0;
		for(int i =0;i<s.length();i++) {
			int hash[] = {-1,-1,-1};
			for(int j =i;j<s.length();j++) {
				hash[s.charAt(j) - 97] = 1;
				if(hash[0] + hash[1] + hash[2] == 3) {
					count = count + s.length() - j;
					break;
				}
			}
		}
		return count;
	}

}
