package com.doublyLL;

public class ConvertArrayToDLL {

	public static void main(String[] args) {
		int arr[] = {5,2,9,1};
		
		Node head = convertArrayToDLL(arr);
		while(head != null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
		

	}

	private static Node convertArrayToDLL(int[] arr) {
		Node head = new Node(arr[0]);
		Node previous = head;
		for(int i =1;i<arr.length;i++) {
			Node temp = new Node(arr[i],null,previous);
			
			previous.next= temp;
//			temp.back=previous;
			previous = temp;
		}
		return head;
	}

}
class Node{
	int data;
	Node next;
	Node back;
	public Node(int data, Node next, Node back) {
		super();
		this.data = data;
		this.next = next;
		this.back = back;
	}
	public Node(int data) {
		super();
		this.data = data;
		this.next=null;
		this.back=null;
	}
	
}
