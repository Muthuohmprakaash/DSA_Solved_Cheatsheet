package com.linkedList;
public class RotateLL {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int k = 19;
		Node26 head = convertArrayToLL(arr);
		head = rotateKtimes(head, k);
		Node26 temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	private static Node26 rotateKtimes(Node26 head, int k) {
		Node26 tail = head;
		int length = 1;
		while (tail.next != null) {
			length++;
			tail = tail.next;
		}
		int newTail = k % length;
		newTail = length - newTail;
		newTail = newTail - 1;
		Node26 temp = head;

		while (newTail != 0) {
			temp = temp.next;
			newTail--;
		}
		tail.next = head;
		head = temp.next;
		temp.next = null;

		return head;
	}

	private static Node26 convertArrayToLL(int[] arr) {
		Node26 head = new Node26(arr[0]);
		Node26 mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node26 temp = new Node26(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}

}

class Node26 {
	int data;
	Node26 next;

	public Node26(int data, Node26 next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node26(int data) {
		super();
		this.data = data;

	}

}