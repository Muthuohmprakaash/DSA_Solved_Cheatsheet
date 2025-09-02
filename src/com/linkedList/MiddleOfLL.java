package com.linkedList;
public class MiddleOfLL {

	public static void main(String[] args) {
		
		int arr[] = { 2, 3, 4, 5, 6, 7 };

		Node20 head = convertArrayToLL(arr);

		System.out.println(findTheMiddleofLL(head));

		while (head != null) {
			System.out.print(head.data + "->");
			if (head.next == null) {
				System.out.print("null");
			}
			head = head.next;
		}
	}

	private static int findTheMiddleofLL(Node20 head) {
		Node20 slow = head;
		Node20 fast = head;

		while (fast != null &&  fast.next != null ) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;

	}

	private static Node20 convertArrayToLL(int[] arr) {
		Node20 head = new Node20(arr[0]);
		Node20 mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node20 temp = new Node20(arr[i]);
			mover.next = temp;
			mover = temp;

		}
		return head;

	}

}

class Node20 {
	int data;
	Node20 next;

	public Node20(int data, Node20 next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node20(int data) {
		super();
		this.data = data;
	}

}
