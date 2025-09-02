package com.array;

public class KthElemOfSortArr {

	public static void main(String[] args) {
		int a[] = {2, 3, 6, 7, 9};
		int b[] = {1, 4, 8, 10};
		int k = 5;
		
		System.out.println(findTheElement(a,b,k));

	}

	private static int findTheElement(int[] a, int[] b, int k) {
		 int [] c = new int[a.length + b.length];
	       int i =0;
	       int j =0;
	       int l =0;
	       while(i<a.length && j<b.length){
	           if(a[i]<=b[j]){
	               c[l] = a[i];
	               i++;
	               l++;
	           }else{
	               c[l] = b[j];
	               j++;
	               l++;
	           }
	       }
	       while(i<a.length) {
	    	   c[l]=a[i];
	    	   i++;
	    	   l++;
	       }
	       while(j<b.length) {
	    	   c[l]=b[j];
	    	   j++;
	    	   l++;
	       }
	       
	       return c[k-1];
		
	}

}
