package com.map;



// import java.util.Iterator;
import java.util.Map;
// import java.util.Map.Entry;

public class How_To_Iterate_Map {

	public static void main(String[] args) {
		
		iterateMap();
		addIntoMap();

	}
	private static void iterateMap() {
		
		// Map<Integer, String> mpp = addIntoMap();
		
		// Iterator<Entry<Integer, String>> printTheMap = mpp.entrySet().iterator();
		
		/*
		 * using iterator getting key and value 
		 * 
		 * while(printTheMap.hasNext()) {
		 * 
		 * 		Map.Entry<Integer, String> entry = printTheMap.next();
		 * 
		 * 		System.out.println(entry.getKey() + "|" + entry.getValue());
		 *  }
		 */
		
		
		
		
		/*
		 * using forEach loop
		 * 
		 * for(Entry<Integer, String> entry :mpp.entrySet()) {
		 * System.out.println(entry.getKey() + "|" + entry.getValue()); }
		 */
		
		
		/*
		 * using forEach method java8
		 * 
		 * mpp.forEach((k,v) -> System.out.println(k+" | " + v));
		 * 
		 */
		
		/*
		 * if you print key and values separately
		 * 
		 * for(Integer printKeys :mpp.keySet()) { System.out.println(printKeys); }
		 * 
		 * for(String printValues : mpp.values()) { System.out.println(printValues); }
		 */
		
		
		
		
	}
	private static Map<Integer, String> addIntoMap() {
		
		return Map.of(1,"Java",
				2,"c++",
				3,"Hibernate",
				4,"spring Boot");
		
	}

}
