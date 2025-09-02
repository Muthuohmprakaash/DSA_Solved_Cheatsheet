package com.array;

public class LeftRotateonce {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		leftRotate(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

	private static int[] leftRotate(int[] arr) {

		int temp = arr[0];
        int i =0;
       for(i = 0;i<arr.length-1;i++){
           arr[i] = arr[i+1];
       }

       arr[i] = temp;
       return arr;
		
	}

}
