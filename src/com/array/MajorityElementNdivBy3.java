package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementNdivBy3 {

	public static void main(String[] args) {
		int[] v= {2,2,2,1,3,1,3,3};
		
		List<Integer> ans =findtheMajority(v);
		System.out.println(ans);

	}

	private static List<Integer> findtheMajority(int[] v) {
		 ArrayList<Integer> al = new ArrayList<>();
	        int n = v.length;
	        int maj = n/3;
	        Arrays.sort(v);
	        Map<Integer,Integer> mpp = new HashMap<>();
	   

	        for(int i =0;i<v.length;i++){
	            int value = mpp.getOrDefault(v[i],0);
	                mpp.put(v[i],value + 1);
	                if(mpp.get(v[i]) == maj+1) {
	                	al.add(v[i]);
	                }
	      
	        }
			return al;
		
	}

}
