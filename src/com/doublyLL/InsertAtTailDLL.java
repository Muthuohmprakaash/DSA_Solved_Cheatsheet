package com.doublyLL;

public class InsertAtTailDLL {

	public static void main(String[] args) {
		
		int val = 10;
		int arr[] = {3,7,9,2};
		Node6 head = convertArrayToDLL(arr);
		
		head = insertAtTailOfDLL(head,val);
		while(head!= null) {
			System.out.println(head.data);
	
			head = head.next;
		}

	}

	private static Node6 insertAtTailOfDLL(Node6 head, int val) {
		Node6 tail = head;
		while(tail.next!=null) {
			tail = tail.next;
		}
		
		Node6 newtail = new Node6(val,null,tail);
		tail.next=newtail;
		return head;
	}

	private static Node6 convertArrayToDLL(int[] arr) {
		
		Node6 head = new Node6(arr[0]);
		Node6 prev = head;
		for(int i =1;i<arr.length;i++) {
			Node6 temp = new Node6(arr[i],null,prev);
			prev.next=temp;
			prev = temp;
		}
		return head;
		
	}

}
class Node6{
	int data;
	Node6 next;
	Node6 back;
	
	public Node6(int data, Node6 next, Node6 back) {
		super();
		this.data = data;
		this.next = next;
		this.back = back;
	}
	public Node6(int data) {
		super();
		this.data = data;
		this.next = null;
		this.back = null;
	}
	
	
}
