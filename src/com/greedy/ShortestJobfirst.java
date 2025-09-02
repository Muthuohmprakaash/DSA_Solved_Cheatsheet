package com.greedy;

import java.util.Arrays;

public class ShortestJobfirst {

	public static void main(String[] args) {
		int bt[]= {4,3,7,1,2};
		System.out.println(findShortest(bt));

	}

	private static int findShortest(int[] bt) {
		Arrays.sort(bt);
	       int time =0;
	       int waitingTime =0;
	       for(int i =0;i<bt.length;i++){
	           
	           waitingTime = waitingTime + time;
	           time = time + bt[i];
	       }
	       
	       return waitingTime/bt.length;
	}

}
