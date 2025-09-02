package com.linkedList;

public class FindIntersectionPoint {

	public static void main(String[] args) {
		
		Node19 ListNode1,ListNode2,ListNode3;
		ListNode3 = new Node19(4);
		ListNode3.next = new Node19(6);
		ListNode3.next.next = new Node19(2);
		
		ListNode1 = new Node19(3);
		ListNode1.next = new Node19(1);
		ListNode1.next.next = ListNode3;
		
		
		
		ListNode2 = new Node19(1);
		ListNode2.next = new Node19(2);
		ListNode2.next.next = new Node19(4);
		ListNode2.next.next.next = new Node19(5);
		ListNode2.next.next.next.next=ListNode3;
	
		
		while(ListNode1 != null) {
			System.out.print(ListNode1.data);
			ListNode1 = ListNode1.next;
		}
		System.out.println();
		while(ListNode2 != null) {
			System.out.print(ListNode2.data);
			ListNode2 = ListNode2.next;
		}
		
		
		System.out.println(findIntersection(ListNode1,ListNode2));
	}

	private static Node19 findIntersection(Node19 listNode1, Node19 listNode2) {
		Node19 temp1 = listNode1;
		Node19 temp2 = listNode2;
		
		while(temp1 != temp2) {
			temp1 = temp1.next;
			temp2 = temp2.next;
			if(temp1 == temp2 ) {
				return temp1;
			}
			if(temp1 == null) {
				temp1=listNode2;
			}if (temp2 == null) {
				temp2 = listNode1;
			}
			
		}
		return temp1;
		
	}

}
class Node19{
	int data;
	Node19 next;
	public Node19(int data, Node19 next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node19(int data) {
		super();
		this.data = data;
	}
	
	
}
