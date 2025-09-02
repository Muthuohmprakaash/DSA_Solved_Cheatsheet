package com.linkedList;
public class InsertAtMiddle {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		Node28 head = convertArrayToLL(arr);
		head = insertAtMiddle(head);
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	private static Node28 insertAtMiddle(Node28 head) {

		Node28 slow = head;
		Node28 fast = head;
		fast = fast.next.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node28 newNode = new Node28(5);
		Node28 nextNode = null;
		if (fast == null) {
			nextNode = slow.next;
			slow.next = newNode;
			newNode.next = nextNode;
		}
		else {
			nextNode = slow.next.next;
			slow.next.next = newNode;
			newNode.next = nextNode;
		}
		return head;

	}

	private static Node28 convertArrayToLL(int[] arr) {
		Node28 head = new Node28(arr[0]);
		Node28 mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node28 temp = new Node28(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}

}

class Node28 {
	int data;
	Node28 next;

	public Node28(int data, Node28 next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node28(int data) {
		super();
		this.data = data;

	}

}