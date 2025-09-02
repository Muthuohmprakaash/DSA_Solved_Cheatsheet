package com.doublyLL;

public class DeleteHeadOfDLL {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,1};
		Node1 head = convertArrayTODLL(arr);

		head = deleteHeadofDLL(head);
		while(head!=null) {
		System.out.println(head.data);
		head = head.next;
	}

	}

	private static Node1 deleteHeadofDLL(Node1 head) {
		if(head == null || head.next==null) {
			return null;
		}
		else {
			Node1 previous = head;
			head = head.next;
			head.back=null;
			previous.next=null;
			
		}
		return head;
	}

	private static Node1 convertArrayTODLL(int[] arr) {
		Node1 head = new Node1(arr[0]);
		Node1 previous = head;
		
		for(int i =1;i<arr.length;i++) {
			Node1 temp = new Node1(arr[i],null,previous);
			previous.next=temp;
			previous= temp;
		}
		return head;
	}

}
class Node1{
	int data;
	Node1 next;
	Node1 back;
	public Node1(int data, Node1 next, Node1 back) {
		super();
		this.data = data;
		this.next = next;
		this.back = back;
	}
	public Node1(int data) {
		super();
		this.data = data;
		this.next = null;
		this.back = null;
	}
	
}
