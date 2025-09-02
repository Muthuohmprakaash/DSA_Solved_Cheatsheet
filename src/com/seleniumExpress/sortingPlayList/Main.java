package com.seleniumExpress.sortingPlayList;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Song> fav = new ArrayList<>();
		
		fav.add(new Song(3,"anirudh","Kanave kanavae"));
		fav.add(new Song(4,"yuvan","venmegam"));
		fav.add(new Song(1,"santhosh","Kaadhal kappal"));
		fav.add(new Song(2,"harris","kadhal oru butterfly"));
		
		CommonGenericsType.iterateList(fav);
		
		Collections.sort(fav);
		
		
		System.out.println("----------------");
		
		CommonGenericsType.iterateList(fav);
		
	}

}
