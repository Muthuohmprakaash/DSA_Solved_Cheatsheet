package com.doublyLL;

public class DeleteKthElementDLL {

	public static void main(String[] args) {
		
		int k = 3;
		int arr[] = {4,5,7,2,6};
		Node3 head = convertArrayToDLL(arr);
		head = deleteAtKthelement(head, k);
		while (head != null) {
			System.out.print(head.data);
			head = head.next;
		}

	}

	private static Node3 deleteAtKthelement(Node3 head, int k) {
		if (head == null) {
			return null;
		}
		Node3 temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			if (count == k) {
				break;
			}
			temp = temp.next;
		}
		Node3 previous = temp.back;
		Node3 front = temp.next;
		if(previous == null && front == null) {
			return null; 
		}
		else if(previous == null) {
			return deleteHeadofDLL(head);
		} else if (front == null) {
			return deleteTailOfDLL(head);
		}
		
		previous.next= temp.next;
		front.back=temp.back;
		temp.next=null;
		temp.back=null;
		
		return head;
	}

	private static Node3 deleteHeadofDLL(Node3 head) {
		if (head == null || head.next == null) {
			return null;
		} else {
			Node3 previous = head;
			head = head.next;
			head.back = null;
			previous.next = null;

		}
		return head;
	}

	private static Node3 deleteTailOfDLL(Node3 head) {
		

		if (head == null || head.next == null) {
			return null;
		}
		Node3 tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		Node3 newtail = tail.back;
		newtail.next = null;


		return head;
	}

	private static Node3 convertArrayToDLL(int[] arr) {
		Node3 head = new Node3(arr[0]);
		Node3 prev = head;
		for (int i = 1; i < arr.length; i++) {
			Node3 temp = new Node3(arr[i], null, prev);
			prev.next = temp;
			prev = temp;
		}
		return head;
	}

}

class Node3 {
	int data;
	Node3 next;
	Node3 back;

	public Node3(int data, Node3 next, Node3 back) {
		super();
		this.data = data;
		this.next = next;
		this.back = back;
	}

	public Node3(int data) {
		super();
		this.data = data;
		this.next = null;
		this.back = null;
	}

}
