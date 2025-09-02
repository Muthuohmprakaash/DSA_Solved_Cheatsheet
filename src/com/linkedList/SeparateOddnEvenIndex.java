package com.linkedList;
public class SeparateOddnEvenIndex {

	public static void main(String[] args) {
		
		
		int arr[] = {2,5,7,1,4,3};
		
		Node11 head = convertArrayToLL(arr);
		
		head = separteOddandEven(head);
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
			
		}

	}

	private static Node11 separteOddandEven(Node11 head) {
		Node11 odd = head;
		Node11 evenhead = head.next;
		Node11 even = evenhead;
		
		while(even != null && even.next != null) {
			odd.next = odd.next.next;
			even.next=even.next.next;
			
			odd = odd.next;
			even = even.next;
		}
		
		odd.next = evenhead;
		
		return head;
	}

	private static Node11 convertArrayToLL(int[] arr) {
		
		
		Node11 head = new Node11(arr[0]);
		Node11 mover = head;
		for(int i =1;i<arr.length;i++) {
			Node11 temp = new Node11(arr[i]);
			mover.next= temp;
			mover = temp;
		}
		return head;
	}

}
class Node11{
	int data;
	Node11 next;
	public Node11(int data, Node11 next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node11(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	
}