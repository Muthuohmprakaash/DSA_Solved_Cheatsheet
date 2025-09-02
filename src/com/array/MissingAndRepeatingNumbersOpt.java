package com.array;

// import java.io.Writer;

public class MissingAndRepeatingNumbersOpt {

	public static void main(String[] args) {
		int[] a = {4,3,6,2,1,1};
		
		int [] c = findTheNumbers(a);
		for(int i =0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}

	}

	private static int[] findTheNumbers(int[] a) {
		
		 	long n = a.length;
	        long sumOfN = n*(n+1)/2;
	        long sumOf2N = n * (n+1) * (2*n +1)/6;
	        
	        long s1 = 0;
	        long s2 = 0;
	        for(int i = 0;i<n;i++){
	            s1 = s1 + a[i];
	            s2 = s2 + a[i] *a[i];
	        }
	        long val1 = s1 - sumOfN;
	        long val2 = s2 - sumOf2N;

	        val2 = val2/val1;

	        long x = (val2 - val1) / 2;
	        long y = val2 - x;

	        int[] arr = new int[2];
	        arr[0] = (int) y;
	        arr[1] = (int) x;

	        return  arr;
	        
	        
	
	}

}
