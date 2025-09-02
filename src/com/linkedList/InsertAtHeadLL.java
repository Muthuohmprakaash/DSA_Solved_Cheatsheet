package com.linkedList;
public class InsertAtHeadLL {

	public static void main(String[] args) {
		int arr[]= {4,6,3,7,1};
		int insertValue=10;
		Node6 head = convertArrayToLL(arr);

		
		head = insertIntoHead(head,insertValue);
		while(head != null) {
		System.out.print(head.val);
		head = head.next;
	}

	}

	private static Node6 insertIntoHead(Node6 head, int insertValue) {
		Node6 temp = new Node6(insertValue,head);
		return temp;
	}

	private static Node6 convertArrayToLL(int[] arr) {
		Node6 head = new Node6(arr[0]);
		Node6 mover = head;
		for(int i =1;i<arr.length;i++) {
			Node6 temp = new Node6(arr[i]);
			mover.next=temp;
			mover = temp;
		}
		return head;
	}

}
class Node6{
	int val;
	Node6 next;
	public Node6(int val, Node6 next) {
		super();
		this.val = val;
		this.next = next;
	}
	public Node6(int val) {
		super();
		this.val = val;
	}
	
	
}