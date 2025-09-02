package com.greedy;

import java.util.Arrays;

public class AssignCookies {

	public static void main(String[] args) {
		
		int g[] = {10,9,8,7};
		int s[] = {5,6,7,8};
		
		System.out.println(findContentChildren(g,s));
	}

	private static int  findContentChildren(int[] g, int[] s) {
		int count = 0;
		Arrays.sort(g);
		Arrays.sort(s);
		
		int left = 0;
		int right = 0;
		
		while(left<g.length && right<s.length) {
			if(s[right] >= g[left]) {
				count++;
				left++;
				right++;
			}else {
			right++;
			}
			
		}
		return count;
	}

}
