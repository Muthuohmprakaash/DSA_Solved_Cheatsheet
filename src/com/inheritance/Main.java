package com.inheritance;

public class Main {

	public static void main(String[] args) {
		
//		Parent p = new Parent();
//		p.sum(10, 20);
//		Child c = new Child();
//		c.sum(10, 20);
		
		String s = "123";
		int i =Integer.parseInt(s);
		System.out.println(i);
		

	}

}
class Parent {

	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	
}
class Child extends Parent {
	
	public void sum(int a,int b) {
		System.out.println(a*b);
	}
}
