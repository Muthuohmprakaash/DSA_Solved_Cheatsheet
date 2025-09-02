package com.array;

public class Merge2SortedArrayNoExtraSpaceOpti2 {

	public static void main(String[] args) {
		
		long[] a = { 1, 3};
		long[] b = { 0, 2};

		mergeArray(a, b);
		
	
	}

	private static void mergeArray(long[] a, long[] b) {
		int val = (a.length + b.length);
		int gap = val / 2;

		if (val % 2 != 0) {
			gap = gap + 1;
		}

		while (gap > 0) {
			int left = 0;
			int right = gap;
			while (right < val) {
				if (left < a.length && right >= a.length) {
					swapTheValues(a, b, left, right - a.length);
					left++;
					right++;

				} else if (left >= a.length && right > a.length) {
					swapTheValues(b, b, left-a.length, right - a.length);
					left++;
					right++;
					
				} else {
					swapTheValues(a, a, left, right);
					left++;
					right++;
					
				}
				

			}
		
			
			if(gap == 1) {
				break;
			}
			gap = gap/2 + gap%2;
		}
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int j = 0;j<b.length;j++) {
			System.out.print(b[j]+" ");
		}

	}

	private static void swapTheValues(long[] a, long[] b, int left, int right) {

		if (a[left] > b[right]) {
			long temp = a[left];
			a[left] = b[right];
			b[right] = temp;
		}

	}

}
