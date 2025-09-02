package com.array;

import java.util.Arrays;


public class TwoSum {

	public static void main(String[] args) {
		
		int book[] = {4, 1, 2, 3, 1};
		int target = 5;
		System.out.println(findthePage(book,target));
		
		 
		

	}

	private static String findthePage(int[] book, int target) {
		 Arrays.sort(book);

	      int left = 0;
	      int right = book.length-1;
	 
	      while(left<right){
	          if(book[left] + book[right] == target){
	              return "YES";
	          }
	          else if(book[left]+book[right] > target){
	             right--;
	          }
	          else{
	              left++;
	          }

	      }
	     return "NO";
		
	}

}
