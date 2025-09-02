package com.linkedList;
public class InsertAtTailLL {

	public static void main(String[] args) {
		int arr[]= {3,7,1,5,2};
		int insertValue = 100;
		Node7 head = convertArrayToLL(arr);
		
		head = insertAtTailofLL(head,insertValue);
		while(head !=null) {
			System.out.print(head.data + " , ");
			head = head.next;
		}
		

	}

	private static Node7 insertAtTailofLL(Node7 head, int insertValue) {
		Node7 tail = new Node7(insertValue);
		Node7 temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = tail;
		return head;
	}

	private static Node7 convertArrayToLL(int[] arr) {
		Node7 head = new Node7(arr[0]);
		Node7 mover = head;
		for(int i =1;i<arr.length;i++) {
			Node7 temp = new Node7(arr[i]);
			mover.next=temp;
			mover = temp;
			
			
		}
		return head;
	}

}
class Node7 {
	int data;
	Node7 next;
	public Node7(int data, Node7 next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node7(int data) {
		super();
		this.data = data;
	}
	
}
