package com.Stack__Queue;

public class StackUsingArray {

	public static void main(String[] args) {
		StackArray s = new StackArray();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(1);
		System.out.println(s.pop());
		System.out.println(s.top());
		System.out.println(s.size());

	}

}

class StackArray {

	int st[] = new int[4];
	int top = -1;

	public void push(int x) {
		top++;
		st[top] = x;
	}

	public int pop() {

		top--;

		return st[top + 1];

	}

	public int top() {
		
		return st[top];
	}
	
	public int size() {
		
		return top+1;
	}
}
