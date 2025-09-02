package com.doublyLL;

public class DeleteTailofDLL {

	public static void main(String[] args) {
		int arr[] = {2,3,4,1,5,6};
		Node2 head = convertArrayToDLL(arr);
		
		head = deleteTailOfDLL(head);
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		

	}

	private static Node2 deleteTailOfDLL(Node2 head) {
		
		if(head == null || head.next == null) {
			return null;
		}
		Node2 tail = head;
		while(tail.next!=null) {
			tail = tail.next;
		}
		Node2 newtail = tail.back;
		newtail.next=null;
//		tail.back=null;
	
		
		return head;
	}

	private static Node2 convertArrayToDLL(int[] arr) {
		
		Node2 head = new Node2(arr[0]);
		Node2 previous = head;
		for(int i =1;i<arr.length;i++) {
			Node2 temp = new Node2(arr[i],null,previous);
			previous.next=temp;
			previous = temp;
		}
		return head;
	}

}
class Node2{
	int data;
	Node2 next;
	Node2 back;
	public Node2(int data, Node2 next, Node2 back) {
		super();
		this.data = data;
		this.next = next;
		this.back = back;
	}
	public Node2(int data) {
		super();
		this.data = data;
		this.next = null;
		this.back = null;
	}
	
	
}
