package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_012 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(new Integer[] {0,1,2,0,2,2,1,1,1,0,0,0,}));
		
		
		int n = al.size();
		
		sortArray(al,n);
		
		System.out.println(al);
		

	}

	private static void sortArray(ArrayList<Integer> al, int n) {
		int low =0; 
		int mid = 0;
        int high = n - 1;

        while(mid <= high){
            if(al.get(mid) == 0){
                int temp = al.get(low);
                al.set(low, al.get(mid));
                al.set(mid, temp);
                low++;
                mid++;
            }else if(al.get(mid) == 1){
                mid++;
            }else{
                int temp1 = al.get(mid);
                al.set(mid, al.get(high));
                al.set(high, temp1);
                
                high--;

            }
        }
        
       

		
	}


	

}
