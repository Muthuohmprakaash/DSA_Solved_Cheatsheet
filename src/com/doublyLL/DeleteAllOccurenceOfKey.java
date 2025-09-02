package com.doublyLL;

public class DeleteAllOccurenceOfKey {

	public static void main(String[] args) {
		int arr[] = { 10, 4, 10, 10, 6, 10 };
		int key = 10;
		Node10 head = convertArrayToDLL(arr);
		head = afterDeletionDLL(head, key);

		Node10 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	private static Node10 afterDeletionDLL(Node10 head, int key) {
		Node10 temp = head;

		while (temp != null) {
			if (temp.data == key) {
				if (temp == head) {
					head = temp.next;
				}
				Node10 nextNode = temp.next;
				Node10 previousNode = temp.back;

				if (nextNode != null) {
					nextNode.back = previousNode;
				}
				if (previousNode != null) {
					previousNode.next = nextNode;
				}
				temp = nextNode;
			} else {
				temp = temp.next;
			}

		}

		return head;
	}

	private static Node10 convertArrayToDLL(int[] arr) {
		Node10 head = new Node10(arr[0]);
		Node10 previous = head;
		for (int i = 1; i < arr.length; i++) {
			Node10 temp = new Node10(arr[i], null, previous);
			previous.next = temp;
			previous = temp;

		}
		return head;

	}

}

class Node10 {
	int data;
	Node10 next;
	Node10 back;

	public Node10(int data, Node10 next, Node10 back) {
		super();
		this.data = data;
		this.next = next;
		this.back = back;
	}

	public Node10(int data) {
		super();
		this.data = data;
		this.next = null;
		this.back = null;
	}

}
