package com.seleniumExpress.sortingPlayList;

import java.util.List;

public class CommonGenericsType {
	
	public static<T> void iterateList(List<T> l) {
		for(T x : l) {
			System.out.println(x);
		}
	}
}
