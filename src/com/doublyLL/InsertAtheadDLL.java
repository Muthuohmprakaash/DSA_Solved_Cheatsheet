package com.doublyLL;

public class InsertAtheadDLL {

	public static void main(String[] args) {
		
		int val = 10;
		int arr[] = {3,7,9,2};
		Node5 head = convertArrayToDLL(arr);
		
		head = insertAtheadOfDLL(head,val);
		while(head!= null) {
			System.out.println(head.data);
	
			head = head.next;
		}
	}

	private static Node5 insertAtheadOfDLL(Node5 head, int val) {
		
		Node5 newhead = new Node5(val,head,null);
		head.back=newhead;
		
		return newhead;
	}

	private static Node5 convertArrayToDLL(int[] arr) {
		
		Node5 head = new Node5(arr[0]);
		Node5 prev = head;
		for(int i =1;i<arr.length;i++) {
			Node5 temp = new Node5(arr[i],null,prev);
			prev.next=temp;
			prev = temp;
		}
		return head;
	}

}
class Node5{
	int data;
	Node5 next;
	Node5 back;
	
	public Node5(int data, Node5 next, Node5 back) {
		super();
		this.data = data;
		this.next = next;
		this.back = back;
	}
	public Node5(int data) {
		super();
		this.data = data;
		this.next = null;
		this.back = null;
	}
	
	
}
