package com.linkedList;
public class Palindrome {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,3,2,1,2};
		Node15 head = convertArrayToLL(arr);
		
		boolean answer = checkPalindrome(head);
		
	
			System.out.println(answer);

		

	}

	private static boolean checkPalindrome(Node15 head) {
		
		
		Node15 slow = head;
		Node15 fast = head;
		while(fast.next != null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		
		}
		Node15 newhead = reverse(slow.next);
		
		Node15 first = head;
		Node15 second = newhead;
		
		while(second != null) {
			if(first.data == second.data) {
				first  = first.next;
				second = second.next;
			}else{
				reverse(newhead);
				return false;
			}
		}
		
		
		return true;
	}


	private static Node15 reverse(Node15 slowNext) {
		
		Node15 prev = null;
		Node15 front = null;
		Node15 temp = slowNext;
		
		while(temp != null) {
			front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
			
		}
		
		return prev;
	}

	private static Node15 convertArrayToLL(int[] arr) {
		
		Node15 head = new Node15(arr[0]);
		Node15 mover = head;
		for(int i =1;i<arr.length;i++) {
			Node15 temp = new Node15(arr[i]);
			mover.next=temp;
			mover = temp;
		}
		return head;
	}

}
class Node15{
	int data;
	Node15 next;
	public Node15(int data, Node15 next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node15(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
}
