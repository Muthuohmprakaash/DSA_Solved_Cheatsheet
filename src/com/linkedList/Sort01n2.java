package com.linkedList;
public class Sort01n2 {

	public static void main(String[] args) {
		
		int arr[] = { 1, 0, 0, 1, 1, 2, 2, 0 };

		Node12 head = convertArrayToLL(arr);

		head = sort012(head);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}

	private static Node12 sort012(Node12 head) {
		
		Node12 zerohead = new Node12(-1);
		Node12 zero = zerohead;
		Node12 onehead = new Node12(-1);
		Node12 one = onehead;
		Node12 twohead = new Node12(-1);
		Node12 two = twohead;
		
		Node12 temp = head;
		while(temp != null) {
			if(temp.data == 0) {
				zero.next = temp;
				zero = zero.next;
			}else if(temp.data ==1) {
				one.next = temp;
				one = one.next;
			}else if(temp.data ==2) {
				two.next = temp;
				two = two.next;
			}
			temp = temp.next;
		}
		
		
		zero.next = onehead.next;
		one.next=twohead.next;
		two.next = null;
		Node12 newhead = zerohead.next;
		
		return newhead;
	}

	private static Node12 convertArrayToLL(int[] arr) {
		

		Node12 head = new Node12(arr[0]);
		Node12 mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node12 temp = new Node12(arr[i]);
			mover.next = temp;
			mover = temp;

		}
		return head;
	}

}

class Node12 {
	int data;
	Node12 next;

	public Node12(int data, Node12 next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node12(int data) {
		super();
		this.data = data;
		this.next = null;
	}

}