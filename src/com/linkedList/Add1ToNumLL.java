package com.linkedList;

public class Add1ToNumLL {

	public static void main(String[] args) {
		
		
		int arr[]= {1,9,6,9};
		
		Node16 head = convertArrayToLL(arr);
		
		head = addone(head);
		while(head!=null) {
			System.out.print(head.data+"-->");
			head = head.next;
		}

	}
	
	private static Node16 addone(Node16 head) {
		int remaining = 1;
		Node16 temp = head;
		
		Node16 newhead = reverse(temp);
		Node16 answer = newhead;
		int result = 0;
		
		while(newhead != null) {
			 result = newhead.data + remaining;
			 if(result < 10) {
				remaining = 0;
				newhead.data = result;
			 }else {
				 newhead.data = 0;
				 remaining = 1;
			 }
			 newhead = newhead.next;
		}
		Node16 dummy = reverse(answer);
		
		if(remaining > 0) {
			Node16 newheadLL = new Node16(remaining);
			newheadLL.next = dummy;
			return newheadLL;
			
		}else {
			return dummy;
	}
		
		
	}

	private static Node16 reverse(Node16 temp) {
		
		Node16 front = null;
		Node16 prev = null;
	
		while(temp != null) {
			
			front = temp.next;
			temp.next = prev;
			
			prev = temp;
			temp = front;
		}
		
		return prev;
	}

	private static Node16 convertArrayToLL(int[] arr) {
		
		Node16 head = new Node16(arr[0]);
		Node16 mover = head;
		for(int i =1;i<arr.length;i++) {
			Node16 temp = new Node16(arr[i]);
			mover.next=temp;
			mover = temp;
			
		}
		return head;
	}

}
class Node16{
	int data;
	Node16 next;
	public Node16(int data, Node16 next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node16(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
}