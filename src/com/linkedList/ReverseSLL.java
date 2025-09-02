package com.linkedList;
public class ReverseSLL {

	public static void main(String[] args) {
	
		
		int arr[] = {1,2,3,4};
		Node14 head = convertArrayToLL(arr);
		
		head = reverse(head);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		

	}
	private static Node14 reverse(Node14 head) {
		
		Node14 prev = null;
		
		Node14 temp = head;
		Node14 front = null;
		
		
		while(temp != null) {
			front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
			
			
		}
		
		return prev;
	}
	private static Node14 convertArrayToLL(int[] arr) {
		

		Node14 head = new Node14(arr[0]);
		Node14 mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node14 temp = new Node14(arr[i]);
			mover.next = temp;
			mover = temp;

		}
		return head;
	}


}
class Node14 {
	int data;
	Node14 next;

	public Node14(int data, Node14 next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node14(int data) {
		super();
		this.data = data;
		this.next = null;
	}

}