package com.greedy;

public class LemonadeChange {

	public static void main(String[] args) {
		
		int arr[] = {5,5,5,10,5,5,10,20,20,20};
		
		System.out.println(GiveChange(arr));

	}

	private static boolean GiveChange(int[] arr) {
		int five = 0;
		int ten = 0;

		for(int i =0;i<arr.length;i++){
			if(arr[i] == 5) {
				five = five + 1;
			}else if(arr[i] == 10) {
				ten = ten +1;
				if(five > 0) {
					five = five - 1;
				}else {
					return false;
				}
			}else {
				if(five > 0 && ten > 0) {
					five = five -1;
					ten = ten -1;
					
				}else if(five >= 3 ) {
					five = five -3;	
				}
				else {
					return false;
				}
			}
			
		}
		return true;
	}

}
