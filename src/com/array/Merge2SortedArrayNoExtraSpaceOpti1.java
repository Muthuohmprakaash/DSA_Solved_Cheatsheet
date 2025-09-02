package com.array;

import java.util.Arrays;

public class Merge2SortedArrayNoExtraSpaceOpti1 {

	public static void main(String[] args) {
		
		long [] a = {1,3,5,7};
		long [] b = {0,2,6,8,9};
		
		mergeArray(a,b);
	}

	private static void mergeArray(long[] a, long[] b) {
		
		int first = a.length-1;
		int sec = 0;
		
		while(a[first] > b[sec]) {
			
			long temp = a[first];
			a[first] = b[sec];
			b[sec] = temp;
			
			first--;
			sec++;
			
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int j =0;j<b.length;j++) {
			System.out.print(b[j]+" ");
		}
		
	}

}
