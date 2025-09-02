package com.linkedList;
public class DeleteTailLL {
	public static void main(String[] args) {
		int arr[] = {3,6,1,6,9};
		
		Node3 head = convertArrayTOLL(arr);
		
//		To print all elements in LL
//		while(head != null) {
//			System.out.println(head.val);
//			head = head.next;
//		}	
		
		// Delete Tail of LL
		
		head = deleteTailofLL(head);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}	
	}

	private static Node3 convertArrayTOLL(int[] arr) {
		Node3 headofLL = new Node3(arr[0]);
		Node3 mover = headofLL;
		for(int i =1;i<arr.length;i++) {
		Node3 temp = new Node3(arr[i]);
		mover.next=temp;
		mover = temp;
		}
		return headofLL;
	}
	public static Node3 deleteTailofLL(Node3 head1) {
		
		if(head1 == null || head1.next == null) {
			return null;
		}
		Node3 temp = head1;
		while(temp.next.next != null ) {
			temp = temp.next;
		}
		temp.next= null;
		return head1;
		
		
	
		
			
		
	}
}
class Node3{
	int val;
	Node3 next;
	public Node3(int val, Node3 next) {
	
		this.val = val;
		this.next = next;
	}
	public Node3(int val) {
		
		this.val = val;
	}
	
	
}
