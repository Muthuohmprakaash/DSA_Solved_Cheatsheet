package com.array;


public class LongestSucessiveElement {

	public static void main(String[] args) {
		int a[] = {1,2,2,1};
		
		System.out.println(findtheLargest(a));

	}

	private static int findtheLargest(int[] a) {
		
		 	int largest = 1;
//	        int count = 1;
	  
	       
	        for(int i =0;i<a.length;i++){
	           int x = a[i];
	           int count =1;
	           while(linearSearch(a,x+1) == true) {
	        	   count++;
	        	   x+=1;
	        	   
	           }
	           largest = Math.max(largest, count);
	        }
	        return largest;
		
	}

	private static boolean linearSearch(int[] a, int x) {
		
		for(int i =0;i<a.length;i++) {
			if(a[i] == x) {
				return true;
			}
		}
		return false;
	}

}
