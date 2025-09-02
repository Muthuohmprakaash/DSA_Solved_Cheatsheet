package com.linkedList;
public class DeleteValueInLL {

	public static void main(String[] args) {
		int arr[] = {8,5,9,3,2,1};
		int element = 4;
		Node5 head = convertArraytoLL(arr);

		head = deleteValueInLL(head,element);
		while(head != null) {
		System.out.print(head.data);
		head=head.next;
	}

	}

	private static Node5 deleteValueInLL(Node5 head, int element) {
		if(head==null) {
			return head;
			
		}
		if(head.data==element) {
			head = head.next;
			return head;
		}
		Node5 temp = head;
		Node5 prev = null;
		while(temp !=null) {
			
			if(temp.data==element) {
				prev.next=prev.next.next;
			}
			prev = temp;
			temp = temp.next;
			
			
		}
		return head;
	}

	private static Node5 convertArraytoLL(int[] arr) {
		Node5 head = new Node5(arr[0]);
		Node5 mover = head;
		for(int i =1;i<arr.length;i++) {
			Node5 temp = new Node5(arr[i]);
			mover.next=temp;
			mover=temp;
		}
		return head;
	}

}
class Node5{

int data;
Node5 next;
public Node5(int data, Node5 next) {
	super();
	this.data = data;
	this.next = next;
}
public Node5(int data) {
	super();
	this.data = data;
}

}