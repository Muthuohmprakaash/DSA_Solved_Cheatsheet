package com.Stack__Queue;

public class QueueUsingArray {

	public static void main(String[] args) {

		QueueArray q = new QueueArray();
		q.push(5);
		

		System.out.println(q.pop());
		q.push(4);
		q.push(3);
		q.push(1);
		q.push(7);
		System.out.println(q.pop());
	
		System.out.println(q.size());

	}

}

class QueueArray {

	private int start, end, currentSize;
	// private int maxSize;
	private int[] arr;
	
	// public QueueArray(int maxSize) {
	// 	this.maxSize = maxSize;
	// 	arr = new int[maxSize];
	// 	start = -1;
	// 	end = -1;
	// 	currentSize = 0;
	// }

	public QueueArray() {
		arr = new int[4];
		start = -1;
		end = -1;
		currentSize = 0;
	}
	
	public void push(int x) {
		if(start < 0) {
			start++;
		}
		end++;
		if(end >= arr.length && start>0) {
			end = end % arr.length;
		}
		arr[end]= x;
		currentSize ++;
		
	}
	public int pop() {
		int x = arr[start];
		start++;
		currentSize--;
		return x;
	}
	public int size() {
		return currentSize;
	}
}