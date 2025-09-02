package com.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface implements Comparable<ComparableInterface> {
	
	String name;
	int age;
	
	public ComparableInterface(String n , int a) {
		this.age = a;
		this.name = n;
	}
	
	
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age ;
	}


	public static void main(String[] args) {
		
		List<ComparableInterface> al = new ArrayList<>();
		al.add(new ComparableInterface("muthu",25));
		al.add(new ComparableInterface("abi",26));
		al.add(new ComparableInterface("vanitha",24));
		
		Collections.sort(al);
		
		
		System.out.println(al);
		
		for(ComparableInterface x : al) {
			System.out.println(x);
		}
		

	}

// compare by integer
//	@Override
//	public int compareTo(ComparableInterface o) {
//		
//		return Integer.compare(this.age, o.age);
//	}
	
	// compare by integer
	@Override
	public int compareTo(ComparableInterface o) {
		
		return this.name.compareTo(o.name);
	}

}
