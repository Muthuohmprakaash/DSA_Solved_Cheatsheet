package com.doublyLL;

public class RemoveDuplicatesOfSortedList {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,6,7,7,7,7};
		Node12 head = convertArrToDLL(arr);

		head = removeDuplicates(head);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	private static Node12 removeDuplicates(Node12 head) {
		Node12 temp = head;
		
		while (temp != null) {
			Node12 nextNode = temp.next;
			while(nextNode!=null && temp.data == nextNode.data) {
				nextNode = nextNode.next;
			}
			temp.next = nextNode;
			if(nextNode!=null) {
			nextNode.back = temp;
			}
			temp = nextNode;
//			temp = temp.next;
		}
		return head;
	}

	private static Node12 convertArrToDLL(int[] arr) {
		Node12 head = new Node12(arr[0]);
		Node12 previous = head;
		for (int i = 1; i < arr.length; i++) {
			Node12 temp = new Node12(arr[i], null, previous);
			previous.next = temp;
			previous = temp;
		}
		return head;

	}
}

class Node12 {
	int data;
	Node12 next;
	Node12 back;

	public Node12(int data, Node12 next, Node12 back) {
		super();
		this.data = data;
		this.next = next;
		this.back = back;
	}

	public Node12(int data) {
		super();
		this.data = data;
		this.next = null;
		this.back = null;
	}

}