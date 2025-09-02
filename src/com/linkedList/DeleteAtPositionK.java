package com.linkedList;

public class DeleteAtPositionK {

	public static void main(String[] args) {
		int k = 5;
		int arr[] = {4,3,5,7,2,1};
		Node4 head = convertArrayToLL(arr);
//		
//		while(head != null) {
//			System.out.print(head.data);
//			head = head.next;
//		}
		
		head = deleteAtPositonK(head,k);
		while(head != null) {
			System.out.print(head.data);
			head = head.next;
		}
	}

	private static Node4 deleteAtPositonK(Node4 head, int k) {
		
		if(head == null) {
			return head;
		}
		if(k==1) {
			head = head.next;
			return head;
		}
		
		Node4 previous = null;
		int count = 0;
		Node4 temp = head;
		while(temp != null) {
			count++;
			if(count==k) {
				previous.next=previous.next.next;
				break;
			}
			previous = temp;
			temp = temp.next;
			
			
		}
		
		return head;
	}

	private static Node4 convertArrayToLL(int[] arr) {
		Node4 head1 = new Node4(arr[0]);
		Node4 mover =head1;
		for(int i =1;i<arr.length;i++) {
			Node4 temp = new Node4(arr[i]);
			mover.next=temp;
			mover = temp;
		}
		
		return head1;
	}

}
class Node4 {
	int data;
	Node4 next;
	public Node4(int data, Node4 next) {
	
		this.data = data;
		this.next = next;
	}
	public Node4(int data) {
	
		this.data = data;
	}
	
	
}
