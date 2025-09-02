package com.linkedList;
public class Merge2SortedList {

	public static void main(String[] args) {
		int arr1[] = {2,5,7,8,9};
		int arr2[] = {1,3,4};
		
		Node27 head1=convertArrayToLL1(arr1);
		Node27 head2 =convertArrayToLL2(arr2);
		Node27 ans = mergeTwoLL(head1,head2);
		while(ans!= null) {
			System.out.print(ans.data);
			ans = ans.next;
		}


	}

	private static Node27 mergeTwoLL(Node27 head1, Node27 head2) {
		Node27 dummy = new Node27(-1);
		Node27 temp1 = head1;
		Node27 temp2 = head2;
		Node27 temp = dummy;
		
		while(temp1 != null && temp2 != null) {
			if(temp1.data<temp2.data) {
				temp.next = temp1;
				temp = temp1;
				temp1 = temp1.next;
			}else {
				temp.next = temp2;
				temp = temp2;
				temp2 = temp2.next;
			}
		}
		if(temp1 == null) {
			temp.next = temp2;
		}else if(temp2 == null) {
			temp.next = temp1;
		}
		return dummy.next;
		
	}

	private static Node27 convertArrayToLL2(int[] arr2) {
		Node27 head = new Node27(arr2[0]);
		Node27 mover = head;
		for(int i =1;i<arr2.length;i++) {
			Node27 temp = new Node27(arr2[i]);
			mover.next = temp;
			mover = temp;
		}
		
		
		return head;
		
		
	}

	private static Node27 convertArrayToLL1(int[] arr1) {
		Node27 head = new Node27(arr1[0]);
		Node27 mover = head;
		for(int i =1;i<arr1.length;i++) {
			Node27 temp = new Node27(arr1[i]);
			mover.next = temp;
			mover = temp;
		}
		
		
		return head;
		
	}

}
class Node27{
	int data;
	Node27 next;
	public Node27(int data, Node27 next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node27(int data) {
		super();
		this.data = data;

	}
	
	
}
