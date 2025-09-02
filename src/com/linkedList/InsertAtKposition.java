package com.linkedList;
public class InsertAtKposition {

	public static void main(String[] args) {
		int k = 1;
		int element = 24;
		int arr[] = {2,5,2,7,4};
		
		Node8 head = convertArrayToLL(arr);
		
		head = insertAtKposition(head,k,element);
		
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
		
		

	}

	private static Node8 insertAtKposition(Node8 head, int k, int element) {
		if(head==null) {
			if(k==1) {
				Node8 newnode = new Node8(element);
				return newnode;
			}
			return head;
			
		}
		if(k==1) {
			Node8 node = new Node8(element,head);
			return node;
		}
		Node8 temp = head;
		int count =0;
		while(temp.next != null) {
			count++;
			if(count == k-1) {
				Node8 insert = new Node8(element);
				insert.next= temp.next;
				temp.next=insert;
			}
			temp = temp.next;
			
		}
		return head;
	}

	private static Node8 convertArrayToLL(int[] arr) {
		Node8 head = new Node8(arr[0]);
		Node8 mover = head;
		for(int i =1;i<arr.length;i++) {
			Node8 temp = new Node8(arr[i]);
			mover.next=temp;
			mover = temp;
		}
		
		return head;
	}

}
class Node8 {
	int data;
	Node8 next;
	public Node8(int data, Node8 next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node8(int data) {
		super();
		this.data = data;
	}
	
	
}
