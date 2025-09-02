package com.seleniumExpress.sortingPlayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfValues {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(3,9,2,5,1);
		
		CommonGenericsType.iterateList(al);
		
		
		List<String> bl = new ArrayList<String>();
		bl.add("muthu");
		bl.add("ohm");
		bl.add("prakaash");
		
		CommonGenericsType.iterateList(bl);

	}

}
