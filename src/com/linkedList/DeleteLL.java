package com.linkedList;

public class DeleteLL {

	public static void main(String[] args) {
		int arr[] = {7,4,5,2,3};
		
		Node head = convertArrayToLL(arr);
		// print all data
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
		
		//delete head
		head = deleteHeadInLL(head);
		System.out.println(head.data);
		
		System.out.println();
		
		Node temp2 = head;
		while(temp2 != null) {
			System.out.print(temp2.data);
			temp2 = temp2.next;
		}
		
		
		

	}
	public static Node convertArrayToLL(int arr[]) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i = 1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		
		return head;
		
	}
	public static Node deleteHeadInLL(Node head) {
		if(head == null) return head;
		head = head.next;
		return head;
	}

}
class Node{
	int data;
	Node next;
	
	public Node(int data, Node next) {
	
		this.data = data;
		this.next = next;
	}
	
	public Node(int data) {
		
		this.data = data;
		
	}
	
	
}