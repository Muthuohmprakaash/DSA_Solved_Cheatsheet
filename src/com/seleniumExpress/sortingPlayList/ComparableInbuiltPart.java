package com.seleniumExpress.sortingPlayList;

public class ComparableInbuiltPart {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		isHuman(new Doctor());
		isHuman(new Human());
		
		
//		isHuman(new Dog());
//		isHuman(new Bird());
		
		
		System.out.println("a".compareTo("c"));
		
		System.out.println("z".compareTo("b"));
		
		System.out.println("a".compareTo("a"));
		
		System.out.println(new Integer(10).compareTo(12));
		
		
	}
	
	public static<T extends Human> void isHuman(T anyobj) {
		System.out.println("Human category");
	}

}
class Human{
	
}
class Doctor extends Human{
	
}
class Animal{
	
}
class Dog extends Animal{
	
}
class Bird{
	
}
