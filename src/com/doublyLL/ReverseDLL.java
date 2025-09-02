package com.doublyLL;

public class ReverseDLL {

	public static void main(String[] args) {
		int arr[] = { 6, 3, 1, 9, 2 };

		Node8 head = convertArrayToDLL(arr);
		head = reverseDLL(head);
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}

	private static Node8 reverseDLL(Node8 head) {
		Node8 current = head;
		Node8 last = null;

		while (current != null) {

			last = current.back;
			current.back = current.next;
			current.next = last;

			current = current.back;

		}

		return last.back;
	}

	private static Node8 convertArrayToDLL(int[] arr) {
		

		Node8 head = new Node8(arr[0]);
		Node8 prev = head;
		for (int i = 1; i < arr.length; i++) {
			Node8 temp = new Node8(arr[i], null, prev);
			prev.next = temp;
			prev = temp;
		}
		return head;
	}

}

class Node8 {
	int data;
	Node8 next;
	Node8 back;

	public Node8(int data, Node8 next, Node8 back) {
		super();
		this.data = data;
		this.next = next;
		this.back = back;
	}

	public Node8(int data) {
		super();
		this.data = data;
		this.next = null;
		this.back = null;
	}

}
