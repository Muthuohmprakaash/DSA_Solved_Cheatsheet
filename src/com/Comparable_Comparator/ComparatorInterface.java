package com.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ComparatorInterface(String n, int a) {
		this.name = n;
		this.age = a;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}

	public static void main(String[] args) {
		List<ComparatorInterface> al = new ArrayList<>();
		
		al.add(new ComparatorInterface("mopy",25));
		al.add(new ComparatorInterface("abi",26));
		al.add(new ComparatorInterface("vani",24));
	
//		Comparator<ComparatorInterface> com = new Comparator<ComparatorInterface>() {
//			
//			@Override
//			public int compare(ComparatorInterface o1, ComparatorInterface o2) {
//				if(o1.age>o2.age) {
//					return 1;
//				}else {
//					return -1;
//				}
//				
//			}
//		};
		
		
		
		
		
		
/*		
 *  Comparator<ComparatorInterface> com =  (ComparatorInterface o1, ComparatorInterface o2) -> {
			 
			return o1.age>o2.age?1:-1;
			
		};
		
		Collections.sort(al,com);
		
		*/
		
		
		
		
		
		Collections.sort(al,( i , j) ->  i.age>j.age?1:-1);
		
		
		System.out.println(al);
	}

}
