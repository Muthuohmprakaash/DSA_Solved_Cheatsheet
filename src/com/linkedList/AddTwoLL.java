package com.linkedList;

public class AddTwoLL {
	public static void main(String[] args) {
		int arr1[]= {2,4,6};
		int arr2[]= {3,8,7};
		Node10 head1 = convertArraytoLL1(arr1);
		Node10 head2 = convertArraytoLL2(arr2);
		
		Node10 result = addTwoLL(head1,head2);
		
		while(result != null) {
			System.out.println(result.data);
			result = result.next;
		}
	}

	private static Node10 addTwoLL(Node10 head1, Node10 head2) {
		int remaining = 0;
		
		Node10 t1 = head1;
		Node10 t2 = head2;
		Node10 dummyNode = new Node10(0);
		Node10 mover = dummyNode;
		while(t1 != null || t2 !=null) {
			int sum = 0;
			if(t1!=null) {
				sum = sum+t1.data;
				t1 = t1.next;
			}if(t2 != null) {
				sum = sum+t2.data;
				t2 = t2.next;
			}
			sum = sum + remaining;
			int sumOfTwo = sum%10;
			remaining = sum/10;

			Node10 newnode = new Node10(sumOfTwo);
			
			mover.next = newnode;
			mover = newnode;
			
			
			
		}
		if(t1 == null && t2 == null && remaining>0) {
			Node10 tailNode = new Node10(remaining);
			mover.next = tailNode;
		}
		
		return dummyNode.next;
	}

	private static Node10 convertArraytoLL1(int[] arr1) {
		
		
		Node10 head = new Node10(arr1[0]);
		Node10 mover = head;
		for(int i =1;i<arr1.length;i++) {
			Node10 temp = new Node10(arr1[i]);
			mover.next=temp;
			mover = temp;
		}
		return head;
	}

	private static Node10 convertArraytoLL2(int[] arr2) {
		Node10 head = new Node10(arr2[0]);
		Node10 mover = head;
		for(int i =1;i<arr2.length;i++) {
			Node10 temp = new Node10(arr2[i]);
			mover.next=temp;
			mover = temp;
		}
		return head;
	}
}
class Node10{
	int data;
	Node10 next;
	public Node10(int data, Node10 next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node10(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
}
